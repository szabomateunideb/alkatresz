package hu.unideb.inf.alkatresz.controller;

import hu.unideb.inf.alkatresz.service.AlkatreszCardService;
import hu.unideb.inf.alkatresz.service.dto.AlkatreszCardDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/alkatresz")
public class AlkatreszCardController {

    final AlkatreszCardService service;

    public AlkatreszCardController(AlkatreszCardService service){
        this.service = service;
    }

    @PostMapping("/save")
    public AlkatreszCardDto save(@RequestBody AlkatreszCardDto dto){
        return service.save(dto);
    }

    @GetMapping("/byId")
    public AlkatreszCardDto getById(@RequestParam Long id){
        return service.getById(id);
    }

    @GetMapping("/byNev/{nev}")
    public AlkatreszCardDto getByNev(@PathVariable String nev){
        return service.getByNev(nev);
    }
}
