package com.template.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ChargingPlugDataAnalyzerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ChargingPlugDataAnalyzerApplication.class, args);
  }
}
