package matek.pl.business.dao;

import matek.pl.domain.Place;

import java.util.List;

public interface PlaceDAO {
    List<Place> findAvailable();
}
