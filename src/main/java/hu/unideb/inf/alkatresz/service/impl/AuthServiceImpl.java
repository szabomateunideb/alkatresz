package hu.unideb.inf.alkatresz.service.impl;

import hu.unideb.inf.alkatresz.data.entity.FelhasznaloEntity;
import hu.unideb.inf.alkatresz.data.entity.JogosultsagEntity;
import hu.unideb.inf.alkatresz.data.repository.FelhasznaloRepository;
import hu.unideb.inf.alkatresz.data.repository.JogosultsagRepository;
import hu.unideb.inf.alkatresz.service.AuthService;
import hu.unideb.inf.alkatresz.service.dto.BejelentkezesDto;
import hu.unideb.inf.alkatresz.service.dto.RegisztracioDto;
import hu.unideb.inf.alkatresz.service.mapper.FelhasznaloMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final FelhasznaloRepository felhRepo;
    private final JogosultsagRepository jogRepo;
    private final FelhasznaloMapper felhMapper;
    private final AuthenticationManager authManager;
    private final PasswordEncoder passwordEncoder;


    @Override
    public void regisztracio(RegisztracioDto dto) {
        FelhasznaloEntity e = felhMapper.registrationToEntity(dto);
        e.setJelszo(passwordEncoder.encode(e.getJelszo()));
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
        SecurityContext context =
                SecurityContextHolder.createEmptyContext();
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        dto.getFelhasznalonev(),
                        dto.getJelszo()
                )
        );
        context.setAuthentication(auth);
        SecurityContextHolder.setContext(context);

    }
}
