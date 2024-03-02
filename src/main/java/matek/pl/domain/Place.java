package matek.pl.domain;

import lombok.*;
import matek.pl.infrastructure.database.entity.AddressEntity;
import matek.pl.infrastructure.database.entity.OwnerEntity;
import matek.pl.infrastructure.database.entity.ProductEntity;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "phone")
@ToString(of = {"placeId", "phone", "name"})
public class Place {

    Integer placeId;
    String phone;
    String name;
    Address addressPlace;
}
