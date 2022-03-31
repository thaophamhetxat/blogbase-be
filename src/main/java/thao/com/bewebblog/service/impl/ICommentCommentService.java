package thao.com.bewebblog.service.impl;



import thao.com.bewebblog.model.Comment_Comment;

import java.util.Optional;

public interface ICommentCommentService {
    Iterable<Comment_Comment> findAllComment_Comment();

    Optional<Comment_Comment> findByIdComment_Comment(int idComment_Comment);

    Comment_Comment saveComment_Comment(Comment_Comment comment_comment);

    void removeComment_Comment(int idComment_Comment);
}
