package hu.unideb.inf.alkatresz.service;

import hu.unideb.inf.alkatresz.service.dto.AlkatreszCardDto;

import java.util.List;

public interface AlkatreszCardService {
    AlkatreszCardDto getById(Long id);
    AlkatreszCardDto getByNev(String nev);
    List<AlkatreszCardDto> getAll();
    void deleteById(Long id);
    AlkatreszCardDto save(AlkatreszCardDto dto);
}
