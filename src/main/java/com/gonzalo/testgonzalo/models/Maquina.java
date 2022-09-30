package com.gonzalo.testgonzalo.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Maquina {
    @Id
    private String id;
    private String nombre;
    private List<Componente> componentes;
}
