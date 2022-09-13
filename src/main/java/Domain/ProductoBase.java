package Domain;




import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class ProductoBase {
    private String nombre;
    private Integer precioBase;
    private String descripcion;
    private Integer tiempoDeFabricacion;
    private List<AreaDePersonalizacion> areasDePersonalizacion;

    public ProductoBase(){
        this.areasDePersonalizacion = new ArrayList<>();
    }

    public void agregarAreaDePersonalizacion(AreaDePersonalizacion areaDePersonalizacion){
        this.areasDePersonalizacion.add(areaDePersonalizacion);
    }

    public Integer calcularPrecio(){
        //TODO
        return null;
    }
}
