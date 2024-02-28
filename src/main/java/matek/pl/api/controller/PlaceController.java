package matek.pl.api.controller;

import lombok.AllArgsConstructor;
import matek.pl.api.dto.PlaceDTO;
import matek.pl.api.dto.mapper.PlaceMapper;
import matek.pl.business.PlaceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class PlaceController {

    private static final String PLACE_LIST = "/places";
    private static final String PLACE_ADD = "/place/add";
    private static final String PLACE_ADD_PLACEID = "/place/add/{PlaceId}";

    private final PlaceService placeService;
    private final PlaceMapper placeMapper;

    @GetMapping(value = PLACE_LIST)
    public String placesList(Model model) {
        var availablePlaces = placeService.findAvailablePlaces().stream()
                .map(placeMapper::map)
                .toList();

        model.addAttribute("availablePlaceDTOs", availablePlaces);
        return "places";
    }

    @GetMapping(value = PLACE_ADD)
    public String placeAdd() {
        return "placeAdd";
    }

    @PostMapping(value = PLACE_ADD_PLACEID)
    public String placeCreate(
            @ModelAttribute("PlaceDTO") PlaceDTO placeDTO
    ) {
        //utworzyc dto
        //mappowanie na zwykly place
        return "home";
    }
}
