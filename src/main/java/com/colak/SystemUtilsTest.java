package com.colak;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.SystemUtils;

@Slf4j
class SystemUtilsTest {

    public static void main(String[] args) {
        // Get the Java version  
        String javaVersion = SystemUtils.JAVA_VERSION;
        log.info("Java Version: {}", javaVersion);

        // Check if the OS is Windows  
        boolean isWindows = SystemUtils.IS_OS_WINDOWS;
        log.info("Is Windows: {}", isWindows);

    }
}
