package model.producto;

import persistencia.Persistente;
import model.personalizacion.Personalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "producto_personalizado")
public class ProductoPersonalizado extends Persistente {

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private ProductoBase producto;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "personalizacion_id", referencedColumnName = "id")
    private Personalizacion personalizacion;


    public  Double obtenerPrecio(){
        return producto.getPrecioBase() + personalizacion.getPrecioPersonalizacion();
    }
}
