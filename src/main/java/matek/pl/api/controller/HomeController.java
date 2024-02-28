package matek.pl.api.controller;

import jakarta.persistence.Access;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@AllArgsConstructor
public class HomeController {

    static final String HOME = "/";
    static final String OWNER = "/owner";
    static final String CUSTOMER = "/customer";

    @RequestMapping(value = HOME, method = RequestMethod.GET)
    public String homePage(){
        return "home";
    }

    @GetMapping(value = OWNER)
    public String owner(){
        return "owner";
    }

    @GetMapping(value = CUSTOMER)
    public String customer(){
        return "customer";
    }
}
