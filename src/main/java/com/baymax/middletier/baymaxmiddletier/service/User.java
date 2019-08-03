package com.baymax.middletier.baymaxmiddletier.service;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NonNull
    private String UserID;
    @NonNull
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
