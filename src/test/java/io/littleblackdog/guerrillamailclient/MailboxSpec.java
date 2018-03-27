package io.littleblackdog.guerrillamailclient;

import static com.greghaskins.spectrum.dsl.specification.Specification.context;
import static com.greghaskins.spectrum.dsl.specification.Specification.describe;
import static com.greghaskins.spectrum.dsl.specification.Specification.it;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.greghaskins.spectrum.Spectrum;

import org.junit.runner.RunWith;

import io.littleblackdog.guerrillamailclient.models.Mail;

/**
 * Unit test for Mailbox.
 */
@RunWith(Spectrum.class)
public class MailboxSpec {
    {

        describe("new", () -> {

            final Mailbox mailbox = new Mailbox();

            it("should set the email address", () -> {
                assertThat(mailbox.getAddress()).isNotNull();
            });

        });

        describe("check_email", () -> {

            context("new mailbox", () -> {

                final Mailbox mailbox = new Mailbox();

                it("should have the welcome mail when checked the first time", () -> {
                    List<Mail> mail = mailbox.checkEmail();
                    assertThat(mail.size()).isEqualTo(1);
                    assertThat(mail.get(0).getMail_from()).isEqualTo("no-reply@guerrillamail.com");
                });

                it("should return an empty list when checked the second time", () -> {
                    List<Mail> mail = mailbox.checkEmail();
                    assertThat(mail).isEmpty();
                });

            });

            context("message sent to the mailbox", () -> {

                final Mailbox mailbox = new Mailbox();

                GmailSender gmailSender = new GmailSender();
                final String SUBJECT = "Test subject";
                final String BODY = "Test body.";
                gmailSender.sendMail(mailbox.getAddress(), SUBJECT, BODY);

                it("should have received the email", () -> {
                    Thread.sleep(20000);
                    List<Mail> mail = mailbox.checkEmail();
                    System.out.println(mail);
                    assertThat(mail.size()).isEqualTo(2);
                    assertThat(mail.get(0).getMail_from()).isEqualTo(gmailSender.getFrom());
                    assertThat(mail.get(0).getMail_subject()).isEqualTo(SUBJECT);
                });
            });
        });

    }
}
