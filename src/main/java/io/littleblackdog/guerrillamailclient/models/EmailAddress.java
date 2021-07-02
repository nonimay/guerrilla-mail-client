package io.littleblackdog.guerrillamailclient.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailAddress {

    private String email_addr;
    private Long email_timestamp;
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

    public Long getEmail_timestamp() {
        return email_timestamp;
    }

    public void setEmail_timestamp(Long email_timestamp) {
        this.email_timestamp = email_timestamp;
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
