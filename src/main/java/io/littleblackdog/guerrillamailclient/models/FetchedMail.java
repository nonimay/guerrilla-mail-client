package io.littleblackdog.guerrillamailclient.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FetchedMail {

    private List<Mail> list;

    /**
     * @return the list
     */
    public List<Mail> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<Mail> list) {
        this.list = list;
    }

}