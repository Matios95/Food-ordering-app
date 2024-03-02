package matek.pl.api.dto.mapper;

import matek.pl.api.dto.PlaceDTO;
import matek.pl.domain.Place;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlaceMapper {
    @Mapping(target = "addressPlace", ignore = true)
    PlaceDTO map(final Place place);
}
