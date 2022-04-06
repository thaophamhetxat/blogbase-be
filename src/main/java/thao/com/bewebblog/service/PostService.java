package thao.com.bewebblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thao.com.bewebblog.model.Post;
import thao.com.bewebblog.repository.IPostCategoryRepository;
import thao.com.bewebblog.repository.IPostRepository;
import thao.com.bewebblog.service.impl.IPostService;

import java.util.Date;
import java.util.Optional;

@Service
public class PostService implements IPostService {
    @Autowired
    IPostRepository iPostRepository;

    @Override
    public Iterable<Post> findAllPost() {
        return iPostRepository.findAll();
    }

    @Override
    public Optional<Post> findByIdPost(int idPost) {
        return iPostRepository.findById(idPost);
    }

    @Override
    public Post savePost(Post post) {
        return iPostRepository.save(post);
    }

//    @Override
//    public void createPost(String content, Date created, String description, Integer users, Integer postCategory, Integer see) {
//        iPostRepository.createPost(content,created,description,users,postCategory,see);
//    }


    @Override
    public void removePost(int idPost) {
        iPostRepository.deleteById(idPost);
    }
}
