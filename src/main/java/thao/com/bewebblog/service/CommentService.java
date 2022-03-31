package thao.com.bewebblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thao.com.bewebblog.model.Comment;
import thao.com.bewebblog.repository.ICommentRepository;
import thao.com.bewebblog.service.impl.ICommentService;

import java.util.Optional;
@Service
public class CommentService implements ICommentService {
    @Autowired
    ICommentRepository iCommentRepository;

    @Override
    public Iterable<Comment> findAllComment() {
        return iCommentRepository.findAll();
    }

    @Override
    public Optional<Comment> findByIdComment(int idComment) {
        return iCommentRepository.findById(idComment);
    }

    @Override
    public Comment addComment(Comment comment) {
        return iCommentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Comment comment) {
        return iCommentRepository.save(comment);
    }


    @Override
    public void removeComment(int idComment) {
        iCommentRepository.deleteById(idComment);
    }
}
