package Domain.ventaDelProducto;

import Domain.ventaDelProducto.MedioDePago;
import Domain.ventaDelProducto.Publicacion;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Tienda {

    private List<Publicacion> publicaciones;
    private List<MedioDePago> mediosDePago;



    public Tienda(){
        this.publicaciones = new ArrayList<>();
        this.mediosDePago = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion){
        this.publicaciones.add(publicacion);
    }


}
