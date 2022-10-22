package model.compra;

import lombok.Getter;
import lombok.Setter;
import model.cliente.Cliente;
import model.compra.estado.EstadoCompra;
import model.mediosDePago.MedioDePago;
import model.producto.estado.Estado;
import model.tienda.Tienda;
import persistencia.Persistente;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "compra")
public class Compra extends Persistente {

    @Column(columnDefinition = "DATE")
    private LocalDate fecha;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "compra")
    private List<ItemCompra> itemCompra;

    @Column(name = "precio_total")
    private Double precioTotal;

    @Column(name = "factura")
    private String pathFactura;

    @ManyToOne
    @JoinColumn(name = "id_medio_de_pago",referencedColumnName = "id")
    private MedioDePago medioDePago;

    @ManyToOne
    @JoinColumn(name = "id_cliente",referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_tienda",referencedColumnName = "id")
    private Tienda tienda;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "compra")
    private List<EstadoCompra> estadoCompras;

}
