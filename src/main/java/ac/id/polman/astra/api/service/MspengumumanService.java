package ac.id.polman.astra.api.service;

import ac.id.polman.astra.api.repository.MspengumumanRepository;
import ac.id.polman.astra.api.vo.Abs_mspengumuman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MspengumumanService {
    @Autowired
    MspengumumanRepository mspengumumanRepository;

    public List<Abs_mspengumuman> getAll(){
        List<Abs_mspengumuman> absMspengumumanList = mspengumumanRepository.findAllByPen_created_dateDesc();
        return absMspengumumanList;
    }

    public Abs_mspengumuman getPengumuman(int pen_id){
        Abs_mspengumuman abs_mspengumuman = mspengumumanRepository.findByPen_id(pen_id);
        return abs_mspengumuman;
    }
}
