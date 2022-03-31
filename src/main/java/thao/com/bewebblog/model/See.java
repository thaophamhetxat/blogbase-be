package thao.com.bewebblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class See {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idSee;
    String name;

    public See() {
    }

    public See(int idSee, String name) {
        this.idSee = idSee;
        this.name = name;
    }

    public int getIdSee() {
        return idSee;
    }

    public void setIdSee(int id) {
        this.idSee = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
