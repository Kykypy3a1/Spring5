package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping()
    public String getCars(@RequestParam(value = "count", required = false) Integer count,ModelMap model) {
        if (count == null) {
            model.addAttribute("cars", carService.getCars());
            return "cars";
        } else {
            model.addAttribute("cars", carService.getSomeCars(count));
            return "cars";
        }


    }

}
