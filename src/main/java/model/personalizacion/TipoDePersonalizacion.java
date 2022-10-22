package model.personalizacion;


import persistencia.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "tipo_de_personalizacion")
public class TipoDePersonalizacion extends Persistente {

    @Column(name = "nombre")
    private String nombre;


}
