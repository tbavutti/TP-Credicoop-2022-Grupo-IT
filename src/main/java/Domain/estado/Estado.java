package Domain.estado;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Estado {
    private Boolean esActivo;
    private TipoDeEstado estado;
    private LocalDate fecha;

}
