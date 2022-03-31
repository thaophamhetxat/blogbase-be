package thao.com.bewebblog.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPost;
    String content;
    Date created;
    int idUser;
    int idPostCategory;
    int idSee;
    @ManyToOne
    Users users;
    @ManyToOne
    PostCategory postCategory;
    @ManyToOne
  See see;

    public Post() {
    }

    public Post(int idPost, String content, Date created, int idUser, int idPostCategory, int idSee, Users users,PostCategory postCategory, See see) {
        this.idPost = idPost;
        this.content = content;
        this.created = created;
        this.idUser = idUser;
        this.idPostCategory = idPostCategory;
        this.idSee = idSee;
        this.users = users;
        this.postCategory = postCategory;
        this.see = see;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int id) {
        this.idPost = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdPostCategory() {
        return idPostCategory;
    }

    public void setIdPostCategory(int idPostCategory) {
        this.idPostCategory = idPostCategory;
    }

    public int getIdSee() {
        return idSee;
    }

    public void setIdSee(int idSee) {
        this.idSee = idSee;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public PostCategory getPostCategory() {
        return postCategory;
    }

    public void setPostCategory(PostCategory postCategory) {
        this.postCategory = postCategory;
    }

    public See getSee() {
        return see;
    }

    public void setSee(See see) {
        this.see = see;
    }
}
