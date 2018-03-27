package io.littleblackdog.guerrillamailclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import io.littleblackdog.guerrillamailclient.models.*;;

public class Mailbox {

    private EmailAddress address;
    private final String baseUrl = "http://api.guerrillamail.com/ajax.php";
    private RestTemplate rt = new RestTemplate();
    private HttpHeaders headers;

    public Mailbox() {        
        headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "");
        HttpEntity<String> entity = new HttpEntity<String>("", headers);
        address = rt.exchange(baseUrl + "?f=get_email_address", HttpMethod.GET, entity, EmailAddress.class).getBody();
    }

    public String getAddress() {
        return address.getEmail_addr();
    }

    public List<Mail> checkEmail() {
        headers.add("Cookie", "PHPSESSID=" + address.getSid_token());
        HttpEntity<String> entity = new HttpEntity<String>("", headers);
        FetchedMail fetched = rt.exchange(baseUrl + "?f=check_email&seq=0", HttpMethod.GET, entity, FetchedMail.class).getBody();
        return fetched.getList();
    }

}
