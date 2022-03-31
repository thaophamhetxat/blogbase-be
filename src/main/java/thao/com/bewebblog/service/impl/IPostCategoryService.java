package thao.com.bewebblog.service.impl;



import thao.com.bewebblog.model.PostCategory;

import java.util.Optional;

public interface IPostCategoryService {
    Iterable<PostCategory> findAllPostCategory();

    Optional<PostCategory> findByIdPostCategory(int idPostCategory);

    PostCategory savePostCategory(PostCategory postCategory);

    void removePostCategory(int idPostCategory);
}
