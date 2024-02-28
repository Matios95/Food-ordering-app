package matek.pl.infrastructure.database.repository.jpa;

import matek.pl.infrastructure.database.entity.FoodOrderingRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderingRequesJpaRepository extends JpaRepository<FoodOrderingRequestEntity, Integer> {
}
