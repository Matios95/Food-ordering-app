package matek.pl.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "addressId")
@ToString(of = {"addressId", "country", "postcode", "street", "streetNumber"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private Integer addressId;

    @Column(name="country")
    private String country;

    @Column(name="postcode")
    private String postcode;

    @Column(name="street")
    private String street;

    @Column(name="street_number")
    private Integer streetNumber;
}
