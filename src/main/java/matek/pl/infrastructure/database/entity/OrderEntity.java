package matek.pl.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "orderaId")
@ToString(of = {"orderaId", "orderaCode", "productId", "datetime"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ordera")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ordera_id")
    private Integer orderaId;

    @Column(name = "ordera_code", unique = true)
    private Integer orderaCode;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "datetime")
    private LocalDateTime datetime;

}
