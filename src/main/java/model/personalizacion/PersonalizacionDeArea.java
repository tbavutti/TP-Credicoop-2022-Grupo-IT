package model.personalizacion;


import lombok.Getter;
import lombok.Setter;
import persistencia.Persistente;

import javax.persistence.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "personalizacion_de_area")
public class PersonalizacionDeArea extends Persistente {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_area_de_personalizacion",referencedColumnName = "id")
    private AreaDePersonalizacion areaDePersonalizacion;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "id_personalizacion_de_area",referencedColumnName = "id")
    private List<PersonalizacionDeTipo> personalizacionDeTipos;

    public PersonalizacionDeArea(){
        this.personalizacionDeTipos = new ArrayList<>();
    }

}
