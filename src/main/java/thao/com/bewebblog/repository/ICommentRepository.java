package thao.com.bewebblog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thao.com.bewebblog.model.Comment;


public interface ICommentRepository extends PagingAndSortingRepository<Comment,Integer> {
}
