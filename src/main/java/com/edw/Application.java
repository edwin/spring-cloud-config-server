package com.edw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <pre>
 *     com.edw.Application
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 11 Mar 2022 15:22
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
