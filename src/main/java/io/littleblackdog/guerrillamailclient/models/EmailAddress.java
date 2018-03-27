package io.littleblackdog.guerrillamailclient.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailAddress {

    private String email_addr;
    private Long timestamp;
    private String alias;
    private String sid_token;

    /**
     * @param email_addr the email_addr to set
     */
    public void setEmail_addr(String email_addr) {
        this.email_addr = email_addr;
    }

    /**
     * @return the email_addr
     */
    public String getEmail_addr() {
        return email_addr;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param sid_token the sid_token to set
     */
    public void setSid_token(String sid_token) {
        this.sid_token = sid_token;
    }

    /**
     * @return the sid_token
     */
    public String getSid_token() {
        return sid_token;
    }

}
