package hu.unideb.inf.alkatresz.service;

import hu.unideb.inf.alkatresz.service.dto.BejelentkezesDto;
import hu.unideb.inf.alkatresz.service.dto.RegisztracioDto;

public interface AuthService {

    public void regisztracio(RegisztracioDto dto);
    public String bejelentkezes(BejelentkezesDto dto);
}
