package ac.id.polman.astra.api.service;

import ac.id.polman.astra.api.repository.TrformdeklarasimahasiswaRepository;
import ac.id.polman.astra.api.vo.Abs_trformdeklarasimahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrformdeklarasimahasiswaService {
    @Autowired
    TrformdeklarasimahasiswaRepository trformdeklarasimahasiswaRepository;

    public List<Abs_trformdeklarasimahasiswa> getAllTrforndeklarasimahasiswas(){
        List<Abs_trformdeklarasimahasiswa> trformdeklarasimahasiswaList = (List<Abs_trformdeklarasimahasiswa>) trformdeklarasimahasiswaRepository.findAll();
        return trformdeklarasimahasiswaList;
    }

    public List<Abs_trformdeklarasimahasiswa> getAllTrforndeklarasimahasiswas(String fma_id){
        List<Abs_trformdeklarasimahasiswa> trformdeklarasimahasiswaList = trformdeklarasimahasiswaRepository.findAllByFma_id(fma_id);
        return trformdeklarasimahasiswaList;
    }
}
