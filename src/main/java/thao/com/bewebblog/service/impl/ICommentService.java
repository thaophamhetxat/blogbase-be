package thao.com.bewebblog.service.impl;



import thao.com.bewebblog.model.Comment;

import java.util.Optional;

public interface ICommentService {
    Iterable<Comment> findAllComment();

    Optional<Comment> findByIdComment(int idComment);

    public Comment addComment(Comment comment);

    public Comment updateComment(Comment comment);

    void removeComment(int idComment);
}
