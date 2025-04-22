package study.santolilver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.santolilver.model.Country;

@RestController
public class CountryController {

    @GetMapping("/france")
    public Country france() {
        Country c = Country.of("France", 67);
        return c;
    }

}
