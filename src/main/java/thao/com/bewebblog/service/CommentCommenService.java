package thao.com.bewebblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import thao.com.bewebblog.model.Comment_Comment;
import thao.com.bewebblog.repository.ICommentCommentRepository;
import thao.com.bewebblog.service.impl.ICommentCommentService;

import java.util.Optional;

public class CommentCommenService implements ICommentCommentService {
    @Autowired
    ICommentCommentRepository iCommentCommentRepository;

    @Override
    public Iterable<Comment_Comment> findAllComment_Comment() {
        return iCommentCommentRepository.findAll();
    }

    @Override
    public Optional<Comment_Comment> findByIdComment_Comment(int idComment_Comment) {
        return iCommentCommentRepository.findById(idComment_Comment);
    }

    @Override
    public Comment_Comment saveComment_Comment(Comment_Comment comment_comment) {
        return iCommentCommentRepository.save(comment_comment);
    }

    @Override
    public void removeComment_Comment(int idComment_Comment) {
        iCommentCommentRepository.deleteById(idComment_Comment);
    }
}
