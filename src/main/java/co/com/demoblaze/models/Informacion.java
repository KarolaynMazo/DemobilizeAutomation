package co.com.demoblaze.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Informacion {

    private String categoria;
    private String producto;
    private String precio;
    private String descripcion;
}
