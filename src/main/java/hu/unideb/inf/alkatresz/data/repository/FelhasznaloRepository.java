package hu.unideb.inf.alkatresz.data.repository;

import hu.unideb.inf.alkatresz.data.entity.FelhasznaloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FelhasznaloRepository
        extends JpaRepository<FelhasznaloEntity, Long> {

    FelhasznaloEntity findByFelhasznalonev(String felhasznalonev);
}
