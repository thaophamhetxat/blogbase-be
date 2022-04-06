package thao.com.bewebblog.service.impl;



import thao.com.bewebblog.model.Post;

import java.util.Date;
import java.util.Optional;

public interface IPostService {
    Iterable<Post> findAllPost();

    Optional<Post> findByIdPost(int idPost);

    Post savePost(Post post);

//    void createPost(String content, Date created, String description,
//                    Integer users, Integer postCategory, Integer see);

    void removePost(int idPost);
}
