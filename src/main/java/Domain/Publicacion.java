package Domain;

import Domain.producto.ProductoBase;
import Domain.producto.ProductoPersonalizado;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Publicacion {
    private ProductoPersonalizado producto;
    private Double precioFinal;
}
