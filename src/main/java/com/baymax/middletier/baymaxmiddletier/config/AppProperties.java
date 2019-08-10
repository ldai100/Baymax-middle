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
}
