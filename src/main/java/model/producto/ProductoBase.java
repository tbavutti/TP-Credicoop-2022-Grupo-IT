package model.producto;


import persistencia.Persistente;
import model.personalizacion.AreaDePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "producto")
public class ProductoBase extends Persistente {

    @Column(name = "nombre")
    private String nombre;
    @Column(name= "precio_base")
    private Double precioBase;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name="tiempo_de_fabricacion")
    private Integer tiempoDeFabricacion;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="producto_id", referencedColumnName = "id")
    private List<AreaDePersonalizacion> areasDePersonalizacion;

    public ProductoBase(){
        this.areasDePersonalizacion = new ArrayList<>();
    }

    public void agregarAreaDePersonalizacion(AreaDePersonalizacion areaDePersonalizacion) {
        this.areasDePersonalizacion.add(areaDePersonalizacion);
    }
}
