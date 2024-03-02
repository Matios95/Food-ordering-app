package matek.pl.domain;

import jakarta.persistence.Column;
import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "phone")
@ToString(of = {"addressId", "country", "postcode","street","streetNumber"})
public class Address {

   Integer addressId;
   String country;
   String postcode;
   String street;
   Integer streetNumber;
}
