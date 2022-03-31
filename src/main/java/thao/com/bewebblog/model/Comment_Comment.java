package thao.com.bewebblog.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Comment_Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String content;
    Date created;
    int Userid;
    int postId;
    int postIdComment;

    @ManyToOne
    Users users;
    @ManyToOne
    Post post;
    @ManyToOne
    Comment comment;

    public Comment_Comment() {
    }

    public Comment_Comment(int id, String content, Date created, int userid, int postId, int postIdComment, Users users, Post post, Comment comment) {
        this.id = id;
        this.content = content;
        this.created = created;
        Userid = userid;
        this.postId = postId;
        this.postIdComment = postIdComment;
        this.users = users;
        this.post = post;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPostIdComment() {
        return postIdComment;
    }

    public void setPostIdComment(int postIdComment) {
        this.postIdComment = postIdComment;
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

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
