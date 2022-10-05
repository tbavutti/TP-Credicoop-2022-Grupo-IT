package Domain.personalizacion;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Personalizacion {
    private String nombre;
    private List<PersonalizacionDeArea> personalizacionesDeLasAreas;
    private Double precioPersonalizacion;

    public Personalizacion(){
        this.personalizacionesDeLasAreas = new ArrayList<>();
    }

    public void agregarPersonalizacionDeArea(PersonalizacionDeArea personalizacionDeArea){
        this.personalizacionesDeLasAreas.add(personalizacionDeArea);
    }

}
