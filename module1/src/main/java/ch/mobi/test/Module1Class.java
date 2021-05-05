package ch.mobi.test;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class Module1Class {
    private final Module2Class child;

    public static void main(String[] args) {
        SpringApplication.run(Module1Class.class);
    }}
