package io.github.alangaraujo.secretmanager.domain.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class Secret {

    private final String key;
    private final String value;

}
