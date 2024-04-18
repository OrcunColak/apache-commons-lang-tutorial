package com.colak;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;

@Slf4j
class NumberUtilsTest {

    public static void main(String[] args) {
        // Convert a String to an int, with a default value if the conversion fails  
        int num = NumberUtils.toInt("100", 0);
        log.info("Number: " + num);

        // Check if a number is within a specified range (inclusive)  
        boolean isCreatable = NumberUtils.isCreatable("5");
        log.info("is Creatable: " + isCreatable);
    }
}
