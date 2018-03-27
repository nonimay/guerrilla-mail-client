package io.littleblackdog.guerrillamailclient.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mail {

    private Long mail_id;
    private String mail_from;
    private String mail_subject;
    private String mail_body;
    private Long mail_timestamp;
    private int mail_read;

    /**
     * @return the mail_body
     */
    public String getMail_body() {
        return mail_body;
    }

    /**
     * @param mail_body the mail_body to set
     */
    public void setMail_body(String mail_body) {
        this.mail_body = mail_body;
    }

    /**
     * @return the mail_from
     */
    public String getMail_from() {
        return mail_from;
    }

    /**
     * @param mail_from the mail_from to set
     */
    public void setMail_from(String mail_from) {
        this.mail_from = mail_from;
    }

    /**
     * @return the mail_id
     */
    public Long getMail_id() {
        return mail_id;
    }

    /**
     * @param mail_id the mail_id to set
     */
    public void setMail_id(Long mail_id) {
        this.mail_id = mail_id;
    }

    /**
     * @return the mail_subject
     */
    public String getMail_subject() {
        return mail_subject;
    }

    /**
     * @param mail_subject the mail_subject to set
     */
    public void setMail_subject(String mail_subject) {
        this.mail_subject = mail_subject;
    }

    /**
     * @return the mail_timestamp
     */
    public Long getMail_timestamp() {
        return mail_timestamp;
    }

    /**
     * @param mail_timestamp the mail_timestamp to set
     */
    public void setMail_timestamp(Long mail_timestamp) {
        this.mail_timestamp = mail_timestamp;
    }

    /**
     * @return the mail_read
     */
    public int getMail_read() {
        return mail_read;
    }

    /**
     * @param mail_read the mail_read to set
     */
    public void setMail_read(int mail_read) {
        this.mail_read = mail_read;
    }

    @Override
    public String toString() {
        return "( FROM: " + mail_from + " | SUBJECT: " + mail_subject + " )";
    }
}