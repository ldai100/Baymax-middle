package com.baymax.middletier.baymaxmiddletier.service;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String UserID;
    private String name;
    private String Location;
    private String Verification;


    @Override
    public String toString() {
        return "User{" +
                "UserID='" + UserID + '\'' +
                ", name='" + name + '\'' +
                ", Location='" + Location + '\'' +
                ", Verification='" + Verification + '\'' +
                '}';
    }
}
