package matek.pl.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlaceDTO {

    private String phone;
    private String name;
    private AddressDTO address;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AddressDTO {
        private Integer addressId;
        private String country;
        private String postcode;
        private String street;
        private Integer streetNumber;
    }
}
