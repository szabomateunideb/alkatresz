package hu.unideb.inf.alkatresz.service.impl;

import hu.unideb.inf.alkatresz.data.entity.AlkatreszEntity;
import hu.unideb.inf.alkatresz.data.repository.AlkatreszRepository;
import hu.unideb.inf.alkatresz.service.AlkatreszCardService;
import hu.unideb.inf.alkatresz.service.dto.AlkatreszCardDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlkatreszCardServiceImpl
        implements AlkatreszCardService {

    final AlkatreszRepository repo;
    final ModelMapper mapper;
    private final ModelMapper modelMapper;

    AlkatreszCardServiceImpl(AlkatreszRepository repo
            , ModelMapper mapper, ModelMapper modelMapper) {
        this.repo = repo;
        this.mapper = mapper;
        this.modelMapper = modelMapper;
    }

    @Override
    public AlkatreszCardDto save(AlkatreszCardDto dto) {
        AlkatreszEntity entity  = modelMapper
                .map(dto, AlkatreszEntity.class);

        entity = repo.save(entity);

        dto = mapper.map(entity, AlkatreszCardDto.class);

        return dto;
    }

    @Override
    public AlkatreszCardDto getById(Long id) {
        AlkatreszEntity entity = repo.getReferenceById(id);
        AlkatreszCardDto dto = mapper.map(entity, AlkatreszCardDto.class);
        return dto;
    }

    @Override
    public AlkatreszCardDto getByNev(String nev) {
        //AlkatreszEntity entity = repo.getByNev(nev);
        //return modelMapper.map(entity, AlkatreszCardDto.class);

        List<AlkatreszEntity> alkatreszek = repo.findAll();
        for (AlkatreszEntity entity : alkatreszek) {
            if (entity.getNev().equals(nev)) {
                return mapper.map(entity, AlkatreszCardDto.class);
            }
        }
        return null;
    }

    @Override
    public List<AlkatreszCardDto> getAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }


}
