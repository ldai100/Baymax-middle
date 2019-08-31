package com.baymax.middletier.baymaxmiddletier.vo;
import lombok.*;

import java.util.Calendar;

@Data
public class Sitter extends User{
    private double rating;
    private String description;
    private Calendar availability;
    private double pricePerHour;

    @Override
    public String toString() {
        return "Sitter{" +
                "rating=" + rating +
                ", description='" + description + '\'' +
                ", availability=" + availability +
                ", pricePerHour=" + pricePerHour +
                '}';
    }
}
