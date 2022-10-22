package model.producto.estado;

import model.publicacion.Publicacion;
import lombok.Getter;
import lombok.Setter;
import persistencia.Persistente;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "estado")
public class Estado extends Persistente {
    @Column(name = "es_activo")
    private Boolean esActivo;

    @Enumerated(value = EnumType.STRING)
    private TipoDeEstado estado;

    @Column(columnDefinition = "DATE")
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_publicacion")
    private Publicacion publicacion;

    public Estado(){}

    public Estado(TipoDeEstado tipoDeEstado, Publicacion publicacion){
        this.esActivo = true;
        this.estado = tipoDeEstado;
        this.fecha = LocalDate.now();
        this.publicacion = publicacion;
    }
}
