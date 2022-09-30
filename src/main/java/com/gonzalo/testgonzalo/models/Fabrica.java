package com.gonzalo.testgonzalo.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Document("fabrica")
public class Fabrica {
    @Id
    private String id;
    private String nombre;
    private List<Maquina> maquinas;
}
