package model.tienda;

import lombok.Getter;
import lombok.Setter;
import model.mediosDePago.MedioDePago;
import model.publicacion.Publicacion;
import model.ventas.Venta;
import persistencia.Persistente;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "tienda")
public class Tienda extends Persistente {

    @Column(name = "razon_social")
    private String razonSocial;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "tienda")
    private List<Venta> ventas;

    @OneToMany(mappedBy = "tienda",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Publicacion> publicaciones;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private List<MedioDePago> mediosDePago;

    public Tienda(){
        this.publicaciones = new ArrayList<>();
        this.mediosDePago = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion){
        this.publicaciones.add(publicacion);
    }


}
