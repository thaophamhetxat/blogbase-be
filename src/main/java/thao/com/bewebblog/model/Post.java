package thao.com.bewebblog.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPost;
    String content;
    String description;
    Date created;
    String image;
    @ManyToOne
    Users users;
    @ManyToOne
    PostCategory postCategory;
    @ManyToOne
    See see;

    public Post() {
    }

    public Post(int idPost, String content,String image, String description, Date created, Users users, PostCategory postCategory, See see) {
        this.idPost = idPost;
        this.content = content;
        this.description = description;
        this.image = image;
        this.created = created;
        this.users = users;
        this.postCategory = postCategory;
        this.see = see;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
