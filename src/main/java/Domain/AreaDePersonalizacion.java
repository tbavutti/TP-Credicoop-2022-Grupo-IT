package Domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class AreaDePersonalizacion {
    private String nombre;
    private Integer precio;
    private List<TipoDePersonalizacion> tiposDePersonalizacion;

    public AreaDePersonalizacion(){
        this.tiposDePersonalizacion = new ArrayList<>();
    }

    public void agregarTipoDePersonalizacion(TipoDePersonalizacion tipoDePersonalizacion){
        this.tiposDePersonalizacion.add(tipoDePersonalizacion);
    }
}
