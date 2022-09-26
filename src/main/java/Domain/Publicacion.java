package Domain;

import Domain.estado.Estado;
import Domain.producto.ProductoBase;
import Domain.producto.ProductoPersonalizado;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Publicacion {

    private ProductoPersonalizado producto;
    private Tienda tienda;
    private List<Estado> estados;
    private Estado estadoActual;
    private Double precioFinal;
    private CarritoDeCompra carritoDeCompra;

    public Publicacion(){
        this.estados = new ArrayList<>();
    }

    /*
    public void setEstadoActual(){
        Estado estado = estados.get(estados.size() - 1);
        this.estadoActual = estado;
    }
    */

    public void agregarCarrito(Publicacion publicacion){
        this.carritoDeCompra.agregarProducto(publicacion);
    }

}
