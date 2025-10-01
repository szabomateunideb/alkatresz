package hu.unideb.inf.alkatresz.data.repository;

import hu.unideb.inf.alkatresz.data.entity.MentesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentesRepository
        extends JpaRepository<MentesEntity, Long> {
}
