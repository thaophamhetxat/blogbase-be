package thao.com.bewebblog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thao.com.bewebblog.model.See;


public interface ISeeRepository extends PagingAndSortingRepository<See,Integer> {
}
