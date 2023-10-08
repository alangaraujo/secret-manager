package io.github.alangaraujo.secretmanager;

import io.github.alangaraujo.secretmanager.domain.model.Secret;
import io.github.alangaraujo.secretmanager.domain.usecase.CreateSecretUseCase;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class Main {

    public static void main(String[] args) {
        var context = new SpringApplicationBuilder(SecretmanagerApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        var createUseCase = context.getBean(CreateSecretUseCase.class);
        createUseCase.create(Secret.builder()
                .key("secondSecret")
                .value("second value")
                .build());
    }
}
