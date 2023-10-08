package io.github.alangaraujo.secretmanager.adapter.input.api.dto;

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
