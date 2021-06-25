package ac.id.polman.astra.api.service;

import ac.id.polman.astra.api.repository.TrformmahasiswaRepository;
import ac.id.polman.astra.api.vo.Abs_trformmahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrformmahasiswaService {
    @Autowired
    TrformmahasiswaRepository trformmahasiswaRepository;

    public List<Abs_trformmahasiswa> getAllTrformmahasiswas(){
        List<Abs_trformmahasiswa> abs_trformmahasiswaList = (List<Abs_trformmahasiswa>) trformmahasiswaRepository.findAll();
        return abs_trformmahasiswaList;
    }

    public List<Abs_trformmahasiswa> getAllTrformmahasiswas(String mhs_id){
        List<Abs_trformmahasiswa> abs_trformmahasiswaList = (List<Abs_trformmahasiswa>) trformmahasiswaRepository.findAllByMhs_id(mhs_id);
        return abs_trformmahasiswaList;
    }
}
