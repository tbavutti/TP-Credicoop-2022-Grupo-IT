package Domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class CarritoDeCompra {

    private List<Publicacion> productos;

    public CarritoDeCompra(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Publicacion producto){
        this.productos.add(producto);
    }

}
