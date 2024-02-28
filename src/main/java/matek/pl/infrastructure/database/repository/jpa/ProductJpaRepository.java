package matek.pl.infrastructure.database.repository.jpa;

import matek.pl.infrastructure.database.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductJpaRepository extends JpaRepository<ProductEntity, Integer> {
}
