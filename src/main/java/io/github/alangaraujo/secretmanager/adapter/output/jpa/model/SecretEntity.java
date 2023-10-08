package io.github.alangaraujo.secretmanager.adapter.output.jpa.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "secret")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SecretEntity {

    @Id
    private String key;
    private String value;

}
