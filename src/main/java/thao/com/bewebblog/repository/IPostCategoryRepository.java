package thao.com.bewebblog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thao.com.bewebblog.model.PostCategory;



public interface IPostCategoryRepository extends PagingAndSortingRepository<PostCategory,Integer> {
}
