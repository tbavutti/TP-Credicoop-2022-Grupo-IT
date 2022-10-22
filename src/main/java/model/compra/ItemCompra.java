package model.compra;

import lombok.Getter;
import lombok.Setter;
import model.publicacion.Publicacion;
import persistencia.Persistente;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "item_compra")
public class ItemCompra extends Persistente {

    @ManyToOne
    @JoinColumn(name = "publicacion_id",referencedColumnName = "id")
    private Publicacion publicacion;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_compra",referencedColumnName = "id")
    private Compra compra;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio_unitario_producto")
    private Double precio_unitario;
}
