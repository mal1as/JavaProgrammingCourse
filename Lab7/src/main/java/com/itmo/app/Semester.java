package com.itmo.app;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

/**
 * текущий семестр для учебной группы
 */
@Getter
@AllArgsConstructor
public enum Semester implements Serializable {
    THIRD("THIRD", 3),
    FOURTH("FOURTH", 4),
    FIFTH("FIFTH", 5),
    SIXTH("SIXTH", 6),
    EIGHTH("EIGHTH", 8);

    private String english;
    private int number;

    public static Semester getValueByNumber(String number, String messageIfNull) {
        try {
            int numb = Integer.parseInt(number);
            return Arrays.stream(Semester.values()).filter(f -> f.number == numb).findAny().orElse(null);
        } catch (NumberFormatException e) {
            System.out.println(messageIfNull);
            return null;
        }
    }
}
