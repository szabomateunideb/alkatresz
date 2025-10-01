package hu.unideb.inf.alkatresz.controller;

import hu.unideb.inf.alkatresz.data.entity.FelhasznaloEntity;
import hu.unideb.inf.alkatresz.data.repository.FelhasznaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/felhasznalo")
public class FelhasznaloController {

    final FelhasznaloRepository repo;

    public FelhasznaloController(FelhasznaloRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/init")
    public FelhasznaloEntity saveMock(){
        FelhasznaloEntity f = new FelhasznaloEntity();
        f.setNev("xy");
        f.setEmail("xy@mail.com");
        f.setFelhasznalonev("xy");
        f.setJelszo("poijuhz");
        //f = repo.save(f);
        return repo.save(f);
    }
}
