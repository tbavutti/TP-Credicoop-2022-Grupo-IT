package Domain.producto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class AreaDePersonalizacion {
    private String nombre;
    private List<TipoDePersonalizacion> tiposDePersonalizacion;

    public AreaDePersonalizacion(){
        this.tiposDePersonalizacion = new ArrayList<>();
    }

    public void agregarTipoDePersonalizacion(TipoDePersonalizacion tipoDePersonalizacion){
        this.tiposDePersonalizacion.add(tipoDePersonalizacion);
    }

    public void eliminarTipoDePersonalizacion(TipoDePersonalizacion tipoDePersonalizacion){
        this.tiposDePersonalizacion.remove(tipoDePersonalizacion);
    }
}
