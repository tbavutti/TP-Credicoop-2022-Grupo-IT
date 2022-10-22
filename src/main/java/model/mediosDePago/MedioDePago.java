package model.mediosDePago;

import persistencia.Persistente;

import javax.persistence.*;

@Entity
@Table(name = "medios_de_pago")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value = "tipo_medio_pago")
public abstract class MedioDePago extends Persistente {

    @Embedded
    @Column(name = "tipo_de_medio_de_pago")
    private TipoDeMedioDePago tipo;

    public  abstract void pagar();
}
