package ac.id.polman.astra.api.repository;

import ac.id.polman.astra.api.vo.Abs_trformabsensimahasiswa;
import ac.id.polman.astra.api.vo.Abs_trformmahasiswa;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrformabsensimahasiswaRepository extends CrudRepository<Abs_trformabsensimahasiswa, Integer> {

    @Query("select * from abs_trformabsensimahasiswa where fma_id=:fma_id")
    public List<Abs_trformabsensimahasiswa> findAllByFma_id(@Param("fma_id") String fma_id);
}
