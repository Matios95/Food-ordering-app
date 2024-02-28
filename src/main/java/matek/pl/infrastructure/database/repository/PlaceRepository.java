package matek.pl.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import matek.pl.business.dao.PlaceDAO;
import matek.pl.domain.Place;
import matek.pl.infrastructure.database.repository.jpa.PlaceJpaRepository;
import matek.pl.infrastructure.database.repository.mapper.PlaceEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class PlaceRepository implements PlaceDAO {

    private final PlaceJpaRepository placeJpaRepository;
    private final PlaceEntityMapper placeEntityMapper;

    @Override
    public List<Place> findAvailable() {
        return placeJpaRepository.findAll().stream()
                .map(placeEntityMapper::mapFromEntity)
                .toList();
    }
}
