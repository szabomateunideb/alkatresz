package hu.unideb.inf.alkatresz.service.impl;

import hu.unideb.inf.alkatresz.data.entity.FelhasznaloEntity;
import hu.unideb.inf.alkatresz.data.entity.JogosultsagEntity;
import hu.unideb.inf.alkatresz.data.repository.FelhasznaloRepository;
import hu.unideb.inf.alkatresz.data.repository.JogosultsagRepository;
import hu.unideb.inf.alkatresz.service.AuthService;
import hu.unideb.inf.alkatresz.service.dto.BejelentkezesDto;
import hu.unideb.inf.alkatresz.service.dto.RegisztracioDto;
import hu.unideb.inf.alkatresz.service.mapper.FelhasznaloMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {
    private final FelhasznaloRepository felhRepo;
    private final JogosultsagRepository jogRepo;
    private final FelhasznaloMapper felhMapper;

    public AuthServiceImpl(FelhasznaloRepository felhRepo, JogosultsagRepository jogRepo, FelhasznaloMapper felhMapper) {
        this.felhRepo = felhRepo;
        this.jogRepo = jogRepo;
        this.felhMapper = felhMapper;
    }

    @Override
    public void regisztracio(RegisztracioDto dto) {
        FelhasznaloEntity e = felhMapper.registrationToEntity(dto);

        JogosultsagEntity jog = jogRepo.findByNev("FELHASZNALO");
        if(jog != null){
            e.setJogosultsagok(List.of(jog));
        } else {
            jog = new JogosultsagEntity();
            jog.setNev("FELHASZNALO");
            jog = jogRepo.save(jog);

            e.setJogosultsagok(List.of(jog));
        }
        e = felhRepo.save(e);
    }

    @Override
    public void bejelentkezes(BejelentkezesDto dto) {

    }
}
