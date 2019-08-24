package com.baymax.middletier.baymaxmiddletier.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "baymax")
public class AppProperties {


    private String googleRequestUrl;
    private String googleClientToken;
    private String googleClientSecret;
    private String googleGrantType;
    private String dbUrl;
    private String dbDriver;
    private String dbUsername;
    private String dbPassword;

    public String getGoogleRequestUrl() {
        return googleRequestUrl;
    }

    public void setGoogleRequestUrl(String googleRequestUrl) {
        this.googleRequestUrl = googleRequestUrl;
    }

    public String getGoogleClientToken() {
        return googleClientToken;
    }

    public void setGoogleClientToken(String googleClientToken) {
        this.googleClientToken = googleClientToken;
    }

    public String getGoogleClientSecret() {
        return googleClientSecret;
    }

    public void setGoogleClientSecret(String googleClientSecret) {
        this.googleClientSecret = googleClientSecret;
    }

    public String getGoogleGrantType() {
        return googleGrantType;
    }

    public void setGoogleGrantType(String googleGrantType) {
        this.googleGrantType = googleGrantType;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
}
