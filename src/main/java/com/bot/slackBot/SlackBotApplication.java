package com.bot.slackBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"me.ramswaroop.jbot", "com.bot.slackBot"})
public class SlackBotApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
		SpringApplication.run(SlackBotApplication.class, args);
	}

}
