package ac.id.polman.astra.api.service;

import ac.id.polman.astra.api.repository.TrformabsensimahasiswaRepository;
import ac.id.polman.astra.api.vo.Abs_trformabsensimahasiswa;
import ac.id.polman.astra.api.vo.Abs_trformmahasiswa;
import ac.id.polman.astra.api.vo.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class TrformmahasiswaabsensiService {
    @Autowired
    TrformabsensimahasiswaRepository trformabsensimahasiswaRepository;


    public List<Abs_trformabsensimahasiswa> getAllTrformabsensimahasiswas() {
        List<Abs_trformabsensimahasiswa> trformabsensimahasiswaList = (List<Abs_trformabsensimahasiswa>) trformabsensimahasiswaRepository.findAll();
        return trformabsensimahasiswaList;
    }

    public List<Abs_trformabsensimahasiswa> getAllTrformabsensimahasiswas(String fma_id) {
        List<Abs_trformabsensimahasiswa> trformabsensimahasiswaList = trformabsensimahasiswaRepository.findAllByFma_id(fma_id);
        return trformabsensimahasiswaList;
    }
}
