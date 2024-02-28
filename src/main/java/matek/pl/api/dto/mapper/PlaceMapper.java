package matek.pl.api.dto.mapper;

import matek.pl.api.dto.PlaceDTO;
import matek.pl.domain.Place;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlaceMapper {
    PlaceDTO map(final Place place);
}
