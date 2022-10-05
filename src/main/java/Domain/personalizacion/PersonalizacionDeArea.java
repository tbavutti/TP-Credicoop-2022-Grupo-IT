package Domain.personalizacion;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PersonalizacionDeArea {

    private AreaDePersonalizacion areaDePersonalizacion;
    private List<PersonalizacionDeTipo> personalizacionDeTipos;

    public PersonalizacionDeArea(){
        this.personalizacionDeTipos = new ArrayList<>();
    }

}
