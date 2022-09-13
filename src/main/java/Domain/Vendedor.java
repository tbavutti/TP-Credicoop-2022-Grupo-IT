package Domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vendedor {

    private String nombre;
    //TODO publicaciones o productos
    private Tienda tienda;
    //TODO mediosDePago
}
