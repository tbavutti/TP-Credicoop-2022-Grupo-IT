package Domain.producto;


import Domain.Persistente;
import Domain.personalizacion.AreaDePersonalizacion;
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

    @Column
    private String nombre;
    @Column
    private Double precioBase;
    @Column
    private String descripcion;
    @Column(columnDefinition= "DATE")
    private LocalTime tiempoDeFabricacion;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name="producto_id", referencedColumnName = "id")
    private List<AreaDePersonalizacion> areasDePersonalizacion;

    public ProductoBase(){
        this.areasDePersonalizacion = new ArrayList<>();
    }

    public void agregarAreaDePersonalizacion(AreaDePersonalizacion areaDePersonalizacion) {
        this.areasDePersonalizacion.add(areaDePersonalizacion);
    }
}
