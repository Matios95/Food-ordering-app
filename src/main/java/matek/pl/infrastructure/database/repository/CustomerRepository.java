package matek.pl.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import matek.pl.business.dao.CustomerDAO;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CustomerRepository implements CustomerDAO {
}
