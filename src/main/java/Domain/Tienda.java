package Domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Tienda {
    private List<Publicacion> publicaciones;

    public Tienda(){
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion){
        this.publicaciones.add(publicacion);
    }
}
