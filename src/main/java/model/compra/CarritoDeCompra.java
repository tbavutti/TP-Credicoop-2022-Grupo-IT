package model.compra;

import lombok.Getter;
import lombok.Setter;
import model.publicacion.Publicacion;

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
