package hu.unideb.inf.alkatresz.data.repository;

import hu.unideb.inf.alkatresz.data.entity.AlkatreszEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlkatreszRepository
        extends JpaRepository<AlkatreszEntity, Long> {
}
