package model.compra.estado;

import lombok.Getter;
import lombok.Setter;
import model.compra.Compra;
import model.producto.estado.TipoDeEstado;
import model.publicacion.Publicacion;
import persistencia.Persistente;

import javax.persistence.*;
import java.time.LocalDate;

import model.publicacion.Publicacion;
import lombok.Getter;
import lombok.Setter;
import persistencia.Persistente;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@Entity
@Table(name = "estado_compra")
public class EstadoCompra extends Persistente {
    @Column(name = "es_activo")
    private Boolean esActivo;

    @Enumerated(value = EnumType.STRING)
    private TipoDeEstadoCompra estado;

    @Column(columnDefinition = "DATE")
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_compra")
    private Compra compra;

    @Column(name = "detalle")
    private String detalle;

    public EstadoCompra(){}

    public EstadoCompra(TipoDeEstadoCompra tipoDeEstado,Compra compra){
        this.esActivo = true;
        this.estado = tipoDeEstado;
        this.fecha = LocalDate.now();
        this.compra = compra;
    }
}
