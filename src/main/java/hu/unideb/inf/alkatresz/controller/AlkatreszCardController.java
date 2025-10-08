package hu.unideb.inf.alkatresz.controller;

import hu.unideb.inf.alkatresz.service.AlkatreszCardService;
import hu.unideb.inf.alkatresz.service.dto.AlkatreszCardDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
