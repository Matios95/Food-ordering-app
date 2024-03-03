package matek.pl.infrastructure.database.repository.jpa;

import matek.pl.infrastructure.database.entity.PlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceJpaRepository extends JpaRepository<PlaceEntity, Integer> {

}
