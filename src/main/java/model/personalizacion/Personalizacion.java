package model.personalizacion;


import lombok.Getter;
import lombok.Setter;
import persistencia.Persistente;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "personalizacion")
public class Personalizacion extends Persistente {
    @Column(name = "nombre")
    private String nombre;

    @OneToMany
    @JoinColumn(name = "id_personalizacion",referencedColumnName = "id")
    private List<PersonalizacionDeArea> personalizacionesDeLasAreas;

    @Column(name = "precio_personalizacion")
    private Double precioPersonalizacion;

    public Personalizacion(){
        this.personalizacionesDeLasAreas = new ArrayList<>();
    }

    public void agregarPersonalizacionDeArea(PersonalizacionDeArea personalizacionDeArea){
        this.personalizacionesDeLasAreas.add(personalizacionDeArea);
    }

}
