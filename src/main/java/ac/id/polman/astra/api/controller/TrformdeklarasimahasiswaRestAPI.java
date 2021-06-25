package ac.id.polman.astra.api.controller;

import ac.id.polman.astra.api.service.TrformdeklarasimahasiswaService;
import ac.id.polman.astra.api.vo.Abs_trformdeklarasimahasiswa;
import ac.id.polman.astra.api.vo.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrformdeklarasimahasiswaRestAPI {
    @Autowired
    TrformdeklarasimahasiswaService trformdeklarasimahasiswaService;

    @GetMapping("/listTrforndeklarasimahasiswa")
    public List<Abs_trformdeklarasimahasiswa> getTrforndeklarasimahasiswas(){
        List<Abs_trformdeklarasimahasiswa> trforndeklarasimahasiswaList = trformdeklarasimahasiswaService.getAllTrforndeklarasimahasiswas();
        return trforndeklarasimahasiswaList;
    }

    @GetMapping("/listTrforndeklarasimahasiswaByFmaId")
    public Model<Abs_trformdeklarasimahasiswa> getTrforndeklarasimahasiswas(
            @RequestParam(value = "fma_id") String fma_id
    ){
        List<Abs_trformdeklarasimahasiswa> trforndeklarasimahasiswaList = trformdeklarasimahasiswaService.getAllTrforndeklarasimahasiswas(fma_id);
        Model<Abs_trformdeklarasimahasiswa> data = new Model<Abs_trformdeklarasimahasiswa>(trforndeklarasimahasiswaList);
        return data;
    }
}
