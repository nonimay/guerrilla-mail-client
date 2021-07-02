package io.littleblackdog.guerrillamailclient;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import io.littleblackdog.guerrillamailclient.models.*;;

public class Mailbox {

    private EmailAddress address;
    private final String baseUrl = "https://www.guerrillamail.com/ajax.php";
    private RestTemplate rt = new RestTemplate();

    public Mailbox() {
        address = rt.getForObject(baseUrl + "?f=get_email_address", EmailAddress.class);
    }

    public String getAddress() {
        return address.getEmail_addr();
    }

    public List<Mail> checkEmail() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cookie", "PHPSESSID=" + address.getSid_token());
        HttpEntity<String> entity = new HttpEntity<String>("", headers);
        FetchedMail fetched = rt.exchange(baseUrl + "?f=check_email&seq=0", HttpMethod.GET, entity, FetchedMail.class).getBody();
        return fetched.getList();
    }

}