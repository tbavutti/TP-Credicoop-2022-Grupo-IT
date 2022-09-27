package Domain.estado;

import Domain.Publicacion;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Estado {
    private Boolean esActivo;
    private TipoDeEstado estado;
    private LocalDate fecha;
    private Publicacion publicacion;

    public Estado(){}

    public Estado(TipoDeEstado tipoDeEstado, Publicacion publicacion){
        this.esActivo = true;
        this.estado = tipoDeEstado;
        this.fecha = LocalDate.now();
        this.publicacion = publicacion;
    }
}
