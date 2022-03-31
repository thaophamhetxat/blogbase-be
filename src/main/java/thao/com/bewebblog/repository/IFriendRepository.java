package thao.com.bewebblog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thao.com.bewebblog.model.Friends;



public interface IFriendRepository extends PagingAndSortingRepository<Friends,Integer> {
}
