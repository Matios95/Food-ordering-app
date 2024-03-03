package matek.pl.domain;

import lombok.*;

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
    Owner owner;
    Address address;
    Set<Product> products;
}
