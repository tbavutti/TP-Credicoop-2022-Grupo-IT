package model.personalizacion;

import lombok.Getter;
import lombok.Setter;
import persistencia.Persistente;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "personalizacion_de_tipo")
public class PersonalizacionDeTipo extends Persistente {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_de_personalizacion",referencedColumnName = "id")
    private TipoDePersonalizacion tipoDePersonalizacion;

    @Column(name = "detalle")
    private String detalle;
}
