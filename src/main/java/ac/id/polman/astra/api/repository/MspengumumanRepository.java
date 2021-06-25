package ac.id.polman.astra.api.repository;

import ac.id.polman.astra.api.vo.Abs_mspengumuman;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MspengumumanRepository extends CrudRepository<Abs_mspengumuman, Integer> {
    public List<Abs_mspengumuman> findAll();

    @Query("select * from abs_mspengumuman order by pen_created_date desc")
    public List<Abs_mspengumuman> findAllByPen_created_dateDesc();

    @Query("select * from abs_mspengumuman where pen_id =:pen_id")
    public Abs_mspengumuman findByPen_id(@Param("pen_id") int pen_id);
}
