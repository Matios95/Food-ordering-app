package matek.pl.business;

import lombok.AllArgsConstructor;
import matek.pl.business.dao.PlaceDAO;
import matek.pl.domain.Place;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class PlaceService {

    private final PlaceDAO placeDAO;

    @Transactional
    public List<Place> findAvailablePlaces() {
        List<Place> availablePlaces = placeDAO.findAvailable();
        //TODO logi
        return availablePlaces;
    }
}
