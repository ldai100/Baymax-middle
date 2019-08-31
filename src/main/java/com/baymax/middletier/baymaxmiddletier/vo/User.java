package com.baymax.middletier.baymaxmiddletier.vo;


import lombok.*;

@Data
@NoArgsConstructor
public class User {
    @NonNull
    private String userID;
    @NonNull
    private String name;
    private String location;
    private String verification;

    @Override
    public String toString() {
        return "User{" +
                "UserID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", Location='" + location + '\'' +
                ", Verification='" + verification + '\'' +
                '}';
    }
}
