package Domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Publicacion {
    private ProductoBase productoBase;
    //TODO estado
    private Integer precio;
    //TODO areadePersonalizacion??
}
