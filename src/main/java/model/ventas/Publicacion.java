package model.ventas;

import model.producto.estado.Estado;
import model.producto.estado.TipoDeEstado;
import model.producto.ProductoPersonalizado;
import lombok.Getter;
import lombok.Setter;
import persistencia.Persistente;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "publicacion")
public class Publicacion extends Persistente {

    private ProductoPersonalizado producto;

    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tienda")
    private Tienda tienda;

    @Column(columnDefinition = "DATE")
    private LocalDate fechaDeAlta;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST,mappedBy = "publicacion")
    private List<Estado> estados;

    @Column(name = "precio")
    private Double precioFinal;


    public Publicacion(){
        this.estados = new ArrayList<>();
        estados.add(new Estado(TipoDeEstado.EN_CURSO,this));
    }


    public void cambiarEstado(Estado estado){
        estados.forEach(e -> e.setEsActivo(false));
        estados.add(estado);
    }

}
