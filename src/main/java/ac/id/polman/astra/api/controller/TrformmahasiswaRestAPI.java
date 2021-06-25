package ac.id.polman.astra.api.controller;

import ac.id.polman.astra.api.service.TrformmahasiswaService;
import ac.id.polman.astra.api.vo.Model;
import ac.id.polman.astra.api.vo.Abs_trformmahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrformmahasiswaRestAPI {

    @Autowired
    TrformmahasiswaService trformmahasiswaService;

    @GetMapping("/listTrformmahasiswa")
    public List<Abs_trformmahasiswa> getTrformmahasiswas(){
        List<Abs_trformmahasiswa> trformmahasiswaList = trformmahasiswaService.getAllTrformmahasiswas();
        return trformmahasiswaList;
    }

    @GetMapping("/listTrformmahasiswaByMhsId")
    public Model<Abs_trformmahasiswa> getTrformmahasiswas(
            @RequestParam(value = "mhs_id") String mhs_id
    ){
        List<Abs_trformmahasiswa> trformmahasiswaList = trformmahasiswaService.getAllTrformmahasiswas(mhs_id);
        Model<Abs_trformmahasiswa> data = new Model<Abs_trformmahasiswa>(trformmahasiswaList);
        return data;
    }
}
