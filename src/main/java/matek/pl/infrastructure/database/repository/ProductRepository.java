package matek.pl.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import matek.pl.business.dao.ProductDAO;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ProductRepository implements ProductDAO {
}
