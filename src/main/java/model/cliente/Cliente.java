package model.cliente;

import lombok.Getter;
import lombok.Setter;
import persistencia.Persistente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente extends Persistente {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "DNI")
    private Integer dni;

}
