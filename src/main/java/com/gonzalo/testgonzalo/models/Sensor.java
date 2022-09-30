package com.gonzalo.testgonzalo.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Sensor {
    @Id
    private String id;
    private String nombre;
    private String tipo;
    private String estado;
    private List<Dato> datos;
}
