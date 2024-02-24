package matek.pl.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "placeId")
@ToString(of = {"placeId", "phone", "name", "ownerId", "addressId", "productId"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "place")
public class PlaceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private Integer placeId;

    @Column(name = "phone", unique = true)
    private String phone;

    @Column(name = "name")
    private String name;

    @Column(name = "owner_id")
    private Integer ownerId;

    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "product_id")
    private Integer productId;
}
