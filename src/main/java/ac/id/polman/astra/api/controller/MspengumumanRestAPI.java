package ac.id.polman.astra.api.controller;

import ac.id.polman.astra.api.service.MspengumumanService;
import ac.id.polman.astra.api.vo.Abs_mspengumuman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MspengumumanRestAPI {
    @Autowired
    MspengumumanService mspengumumanService;

    @GetMapping("/listMspengumuman")
    public List<Abs_mspengumuman> getMspengumuman(){
        List<Abs_mspengumuman> absMspengumumanList = mspengumumanService.getAll();
        return absMspengumumanList;
    }

    @GetMapping("/get-pengumuman")
    public Abs_mspengumuman getPengumuman(
            @RequestParam("id") int id
    ){
        Abs_mspengumuman abs_mspengumuman = mspengumumanService.getPengumuman(id);
        return abs_mspengumuman;
    }
}
