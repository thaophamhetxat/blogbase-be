package thao.com.bewebblog.repository;

import org.springframework.data.repository.CrudRepository;
import thao.com.bewebblog.model.Post;

public interface IPostRepository extends CrudRepository<Post,Integer> {
}
