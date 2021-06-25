package ac.id.polman.astra.api.service;

import ac.id.polman.astra.api.repository.MspertanyaanRepository;
import ac.id.polman.astra.api.vo.Abs_mspertanyaan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MspertanyaanService {
    @Autowired
    MspertanyaanRepository mspertanyaanRepository;

    public List<Abs_mspertanyaan> getAllMspertanyaan(){
        List<Abs_mspertanyaan> mspertanyaanList = (List<Abs_mspertanyaan>) mspertanyaanRepository.findAll();
        return mspertanyaanList;
    }
}
