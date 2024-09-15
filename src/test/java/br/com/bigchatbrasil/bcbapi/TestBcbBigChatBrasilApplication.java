package br.com.bigchatbrasil.bcbapi;

import org.springframework.boot.SpringApplication;

public class TestBcbBigChatBrasilApplication {

    public static void main(String[] args) {
        SpringApplication.from(BcbBigChatBrasilApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
