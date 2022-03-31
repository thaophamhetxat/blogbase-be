package thao.com.bewebblog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thao.com.bewebblog.model.Comment_Comment;



public interface ICommentCommentRepository extends PagingAndSortingRepository<Comment_Comment,Integer> {
}
