package com.msadovskiy.command;

import org.springframework.core.io.ClassPathResource;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Component
public class DbCommand implements CommandMarker {

    @CliCommand(value = "db", help = "Set the bike data file name. Use filename as a parameter.")
    public String db(
            @CliOption(mandatory = true, help = "Enter file name", key = {"file"})
                    String fileName) {
        String data = null;
        try {

            File resource = new ClassPathResource(fileName).getFile();

            //TODO: delete after test
            data = new String(Files.readAllBytes(resource.toPath()));
            System.out.println(data);

        } catch (IOException e) {
            System.out.println("File not found. Try again");
        }
        return data;
    }
}
