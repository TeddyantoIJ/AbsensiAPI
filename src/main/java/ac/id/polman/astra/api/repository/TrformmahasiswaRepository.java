package ac.id.polman.astra.api.repository;

import ac.id.polman.astra.api.vo.Abs_trformmahasiswa;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrformmahasiswaRepository extends CrudRepository<Abs_trformmahasiswa, Integer> {

    @Query("select * from abs_trformmahasiswa where mhs_id=:mhs_id")
    public List<Abs_trformmahasiswa> findAllByMhs_id(@Param("mhs_id") String mhs_id);
}
