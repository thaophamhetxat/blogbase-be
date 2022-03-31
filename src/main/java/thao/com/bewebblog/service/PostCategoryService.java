package thao.com.bewebblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thao.com.bewebblog.model.PostCategory;
import thao.com.bewebblog.repository.IPostCategoryRepository;
import thao.com.bewebblog.service.impl.IPostCategoryService;

import java.util.Optional;
@Service
public class PostCategoryService implements IPostCategoryService {
    @Autowired
    IPostCategoryRepository iPostCategoryRepository;

    @Override
    public Iterable<PostCategory> findAllPostCategory() {
        return iPostCategoryRepository.findAll();
    }

    @Override
    public Optional<PostCategory> findByIdPostCategory(int idPostCategory) {
        return iPostCategoryRepository.findById(idPostCategory);
    }

    @Override
    public PostCategory savePostCategory(PostCategory postCategory) {
        return iPostCategoryRepository.save(postCategory);
    }

    @Override
    public void removePostCategory(int idPostCategory) {
        iPostCategoryRepository.deleteById(idPostCategory);
    }
}
