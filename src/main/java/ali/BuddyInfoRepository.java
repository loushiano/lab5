package ali;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface BuddyInfoRepository  extends PagingAndSortingRepository<BuddyInfo, Long> {

    List<BuddyInfo> findByAddress(@Param("address") String address);


}