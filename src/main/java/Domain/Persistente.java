package Domain;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.criteria.CriteriaBuilder;

@MappedSuperclass
@Getter
public abstract class Persistente {

    @Id
    @GeneratedValue
    private Integer id;
}
