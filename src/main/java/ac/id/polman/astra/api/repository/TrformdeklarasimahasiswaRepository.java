package ac.id.polman.astra.api.repository;

import ac.id.polman.astra.api.vo.Abs_trformdeklarasimahasiswa;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrformdeklarasimahasiswaRepository extends CrudRepository<Abs_trformdeklarasimahasiswa, Integer> {

    @Query("select * from abs_trformdeklarasimahasiswa where fma_id=:fma_id")
    public List<Abs_trformdeklarasimahasiswa> findAllByFma_id(@Param("fma_id") String fma_id);
}
