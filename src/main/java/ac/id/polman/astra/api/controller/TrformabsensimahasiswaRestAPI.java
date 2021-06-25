package ac.id.polman.astra.api.controller;


import ac.id.polman.astra.api.service.TrformmahasiswaabsensiService;
import ac.id.polman.astra.api.vo.Abs_trformabsensimahasiswa;
import ac.id.polman.astra.api.vo.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrformabsensimahasiswaRestAPI {

    @Autowired
    TrformmahasiswaabsensiService trformmahasiswaabsensiService;

    @GetMapping("/listTrformabsensimahasiswa")
    public List<Abs_trformabsensimahasiswa> getTrformmahasiswas(){
        List<Abs_trformabsensimahasiswa> trformabsensimahasiswaList = (List<Abs_trformabsensimahasiswa>) trformmahasiswaabsensiService.getAllTrformabsensimahasiswas();
        return trformabsensimahasiswaList;
    }

    @GetMapping("/listTrformabsensimahasiswaByFmaId")
    public Model<Abs_trformabsensimahasiswa> getTrformmahasiswas(
            @RequestParam(value = "fma_id") String fma_id
    ){
        List<Abs_trformabsensimahasiswa> trformabsensimahasiswaList = trformmahasiswaabsensiService.getAllTrformabsensimahasiswas(fma_id);
        Model<Abs_trformabsensimahasiswa> data = new Model<Abs_trformabsensimahasiswa>(trformabsensimahasiswaList);
        return data;
    }
}
