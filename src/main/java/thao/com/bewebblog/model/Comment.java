package thao.com.bewebblog.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idComment;
    String content;
    Date created;
    int UserId;
    int postId;
    @ManyToOne
    Users users;
    @ManyToOne
    Post post;

    public Comment(int idComment, String content, Date created, int userId, int postId, Users users, Post post) {
        this.idComment = idComment;
        this.content = content;
        this.created = created;
        UserId = userId;
        this.postId = postId;
        this.users = users;
        this.post = post;
    }

    public Comment() {
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int id) {
        this.idComment = id;
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

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
