package com.colak;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.Executor;
import org.apache.commons.exec.PumpStreamHandler;

import java.io.File;
import java.io.IOException;

@Slf4j
public class DefaultExecutorTest {

    public static void main(String[] args) {
        // Define the command and its arguments
        CommandLine commandLine = new CommandLine("ls");
        commandLine.addArgument("-l");
        commandLine.addArgument("/");

        // Create an instance of Executor using ExecutorBuilder
        Executor executor = DefaultExecutor.builder()
                .setWorkingDirectory(new File("/path/to/directory"))
                .setExecuteStreamHandler(new PumpStreamHandler(System.out, System.err))
                .get();

        try {
            // Execute the command
            int exitValue = executor.execute(commandLine);
            log.info("Command executed with exit code: {}", exitValue);
        } catch (ExecuteException e) {
            log.error("Command execution failed: ", e);
        } catch (IOException e) {
            log.error("I/O error occurred: ", e);
        }
    }
}
