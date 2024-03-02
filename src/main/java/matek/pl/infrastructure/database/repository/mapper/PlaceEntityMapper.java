package matek.pl.infrastructure.database.repository.mapper;

import matek.pl.domain.Place;
import matek.pl.infrastructure.database.entity.PlaceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlaceEntityMapper {

//    @Mapping(target = "productEntities", ignore = true)
    Place mapFromEntity(PlaceEntity entity);
}
