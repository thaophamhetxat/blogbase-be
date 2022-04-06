package thao.com.bewebblog.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import thao.com.bewebblog.model.Post;

import java.util.Date;

public interface IPostRepository extends CrudRepository<Post,Integer> {
//    @Modifying
//    @Query(value = "insert into post(content,created,description,idUsers,idPostCategory,idSee) values (?1,?2,?3,?4,?5,?6)", nativeQuery = true)
//    void createPost(String content, Date created, String description,
//                    Integer users, Integer postCategory, Integer see);
}
