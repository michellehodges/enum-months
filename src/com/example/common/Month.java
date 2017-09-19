package com.example.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Month {
    //MONTH (englishName)
    JANUARY ("January"),
    FEBRUARY ("February"),
    MARCH ("March"),
    APRIL ("April"),
    MAY ("May"),
    JUNE ("June"),
    JULY ("July"),
    AUGUST ("August"),
    SEPTEMBER ("September"),
    OCTOBER ("October"),
    NOVEMBER ("November"),
    DECEMBER ("December");

    Month(String englishName) {
        this.englishName = englishName;
    }

    @JsonValue
    public String getEnglishName() {
        return englishName;
    }

    private String englishName;
}
