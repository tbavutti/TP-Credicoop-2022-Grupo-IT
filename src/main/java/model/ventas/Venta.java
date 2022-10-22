package model.ventas;

import lombok.Getter;
import lombok.Setter;
import model.cliente.Cliente;
import model.compra.Compra;
import model.tienda.Tienda;
import persistencia.Persistente;

import javax.persistence.*;
import java.awt.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "venta")
public class Venta extends Persistente {

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "tienda_id",referencedColumnName = "id")
    private Tienda tienda;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_compra",referencedColumnName = "id")
    private Compra compra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente",referencedColumnName = "id")
    private Cliente cliente;

    @Column(name = "monto")
    private Double monto;

    @Column(name = "fecha",columnDefinition = "DATE")
    private LocalDate fecha;

}
