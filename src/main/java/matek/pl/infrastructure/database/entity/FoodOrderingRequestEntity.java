package matek.pl.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "foodOrderingRequestId")
@ToString(of = {"foodOrderingRequestId", "foodOrderingRequestCode", "datetime", "customerId", "orderaId"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "food_ordering_request")
public class FoodOrderingRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_ordering_request_id")
    private Integer foodOrderingRequestId;

    @Column(name = "food_ordering_request_code", unique = true)
    private Integer foodOrderingRequestCode;

    @Column(name = "datetime")
    private LocalDateTime datetime;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "ordera_id")
    private Integer orderaId;
}
