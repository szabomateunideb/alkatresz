package hu.unideb.inf.alkatresz.data.repository;

import hu.unideb.inf.alkatresz.data.entity.KonfiguracioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface KonfiguracioRepository
        extends JpaRepository<KonfiguracioEntity, Long> {
}
