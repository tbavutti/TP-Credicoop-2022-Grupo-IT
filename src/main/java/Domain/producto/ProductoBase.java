package Domain.producto;


import Domain.producto.AreaDePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class ProductoBase {
    private String nombre;
    private Double precioBase;
    private String descripcion;
    private LocalTime tiempoDeFabricacion;
    private List<AreaDePersonalizacion> areasDePersonalizacion;

    public ProductoBase(){
        this.areasDePersonalizacion = new ArrayList<>();
    }

    public void agregarAreaDePersonalizacion(AreaDePersonalizacion areaDePersonalizacion) {
        this.areasDePersonalizacion.add(areaDePersonalizacion);
    }
}
