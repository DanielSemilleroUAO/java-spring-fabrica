package com.gonzalo.testgonzalo.models;

import lombok.*;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Dato {
    @Id
    private String id;
    private Double valor;
    private String unidades;
    private String fecha;
}
