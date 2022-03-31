package thao.com.bewebblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PostCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPostCategory;
    String name;

    public PostCategory(int idPostCategory, String name) {
        this.idPostCategory = idPostCategory;
        this.name = name;
    }

    public PostCategory() {
    }

    public int getIdPostCategory() {
        return idPostCategory;
    }

    public void setIdPostCategory(int idPostCategory) {
        this.idPostCategory = idPostCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
