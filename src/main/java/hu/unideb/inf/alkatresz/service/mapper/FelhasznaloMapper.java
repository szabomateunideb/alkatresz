package hu.unideb.inf.alkatresz.service.mapper;

import hu.unideb.inf.alkatresz.data.entity.FelhasznaloEntity;
import hu.unideb.inf.alkatresz.service.dto.RegisztracioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FelhasznaloMapper {

    @Mapping(target = "mentesek", ignore = true)
    @Mapping(target = "jogosultsagok", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "authorities", ignore = true)
    FelhasznaloEntity registrationToEntity(RegisztracioDto dto);
}
