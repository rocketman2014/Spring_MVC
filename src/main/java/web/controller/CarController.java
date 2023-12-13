package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import web.service.CarService;


@Controller
@RequestMapping("/cars")
@EnableWebMvc
public class CarController {
    private final CarService carService;

    @Autowired
    private CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCar(Model model, @RequestParam(required = false) Integer count) {
        model.addAttribute("car", carService.getCar(count));
        return "/cars";
    }
}
