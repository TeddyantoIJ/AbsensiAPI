package ac.id.polman.astra.api.repository;

import ac.id.polman.astra.api.vo.Abs_mspertanyaan;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface MspertanyaanRepository extends CrudRepository<Abs_mspertanyaan, Integer> {
}
