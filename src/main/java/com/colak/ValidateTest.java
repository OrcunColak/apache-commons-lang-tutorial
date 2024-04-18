package com.colak;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.Validate;

@Slf4j
class ValidateTest {

    public static void main(String[] args) {
        try {
            // Validate that the argument is not null
            Validate.notNull(null, "The input must not be null");
        } catch (IllegalArgumentException exception) {
            log.error(exception.getMessage());
        }
    }
}
