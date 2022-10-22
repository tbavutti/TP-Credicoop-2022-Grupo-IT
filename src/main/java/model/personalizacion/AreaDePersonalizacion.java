package model.personalizacion;

import persistencia.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "area_de_personalizacion")
public class AreaDePersonalizacion extends Persistente {

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "area_de_personalizacion_id", referencedColumnName = "id")
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
