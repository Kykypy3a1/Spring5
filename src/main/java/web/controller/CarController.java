package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarServiceImpl;


@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping()
    public String getCars(ModelMap model) {
        model.addAttribute("cars", carService.getCars());
        return "cars/getCars";
    }

    @GetMapping("?count={number}")
    public String getSomeCars (@PathVariable("number") int number, ModelMap model) {
        model.addAttribute("cars", carService.getSomeCars(number));
        return  "cars/getSomeCars";
    }
}
