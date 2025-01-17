package school.hei.haapi.repository;

import java.util.List;
import javax.persistence.OrderBy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.haapi.model.DelayPenalty;

@Repository
public interface DelayPenaltyRepository extends JpaRepository<DelayPenalty, String> {
  @Override
  @OrderBy(value = "creationDatetime DESC ")
  List<DelayPenalty> findAll();
}
