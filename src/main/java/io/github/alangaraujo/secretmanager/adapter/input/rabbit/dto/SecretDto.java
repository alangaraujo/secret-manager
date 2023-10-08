package io.github.alangaraujo.secretmanager.adapter.input.rabbit.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SecretDto {

    private String key;
    private String value;

}
