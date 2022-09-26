package Domain;

import Domain.estado.Estado;
import Domain.estado.TipoDeEstado;
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

    public void publicar(Publicacion publicacion){
        //TODO publicacion.setEstadoActual(TipoDeEstado.EN_CURSO);
    }

    public void pausar(){
        //TODO
    }

    public void cancelar(){
        //TODO
    }
}
