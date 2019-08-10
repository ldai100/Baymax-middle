package com.baymax.middletier.baymaxmiddletier.service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Sitter extends User{
    private double Rating;
   private String Description;
   private Calendar Availability;
   private double PricePerHour;

    @Override
    public String toString() {
        return "Sitter{" +
                "Rating=" + Rating +
                ", Description='" + Description + '\'' +
                ", Availability=" + Availability +
                ", PricePerHour=" + PricePerHour +
                '}';
    }
}
