package ac.id.polman.astra.api.controller;

import ac.id.polman.astra.api.service.MspertanyaanService;
import ac.id.polman.astra.api.vo.Abs_mspertanyaan;
import ac.id.polman.astra.api.vo.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MspertanyaanRestAPI {

    @Autowired
    MspertanyaanService mspertanyaanService;

    @GetMapping("/listMspertanyaan")
    public Model<Abs_mspertanyaan> getMspertanyaan(){
        List<Abs_mspertanyaan> mspertanyaanList = mspertanyaanService.getAllMspertanyaan();
        Model<Abs_mspertanyaan> data = new Model<Abs_mspertanyaan>(mspertanyaanList);
        return data;
    }
}
