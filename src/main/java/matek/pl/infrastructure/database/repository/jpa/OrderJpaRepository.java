package matek.pl.infrastructure.database.repository.jpa;

import matek.pl.infrastructure.database.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaRepository extends JpaRepository<OrderEntity, Integer> {
}
