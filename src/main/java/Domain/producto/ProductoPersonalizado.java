package Domain.producto;

import lombok.Getter;
import lombok.Setter;
import retrofit2.http.GET;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

@Setter
@Getter
public class ProductoPersonalizado {
    private ProductoBase producto;
    private Personalizacion personalizacion;


    public  Double obtenerPrecio(){
        return producto.getPrecioBase() + personalizacion.getPrecioPersonalizacion();
    }
}
