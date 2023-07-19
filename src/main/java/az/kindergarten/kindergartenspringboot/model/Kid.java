package az.kindergarten.kindergartenspringboot.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Kid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long kidId;
    private  String firstName;
    private  String lastName;
    private Long kidAge;

}
