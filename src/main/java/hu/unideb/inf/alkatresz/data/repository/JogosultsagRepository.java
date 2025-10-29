package hu.unideb.inf.alkatresz.data.repository;

import hu.unideb.inf.alkatresz.data.entity.JogosultsagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogosultsagRepository
        extends JpaRepository<JogosultsagEntity,Long> {

    JogosultsagEntity findByNev(String nev);
}
