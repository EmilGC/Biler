package Controller;

import Model.Car;
import Repository.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;


import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class CarController {

    CarRepository carRepository;

    public CarController(CarRepository carRepository) {this.carRepository =carRepository;}

    @GetMapping("/")
    public String index(){
        Optional<Car> x = carRepository.findById((long) 1);
        System.out.println(x.get().getDescription());

        for (Car c : carRepository.findAll()) {
            System.out.println(c.getDescription());
        }

        Optional<Car> y = carRepository.findByHorsePower(300);
        System.out.println(y.get().getDescription());

        Optional<Car> b = carRepository.findByType("type");
        System.out.println(b.get().getType());

        return "index";
    }


    @GetMapping("/create-car")
        public String createCar(Model model){
        Car car = new Car();
        model.addAttribute("newCar", car);
        return "create-car";
    }

    @PostMapping("/create-car")
        public String createdCar(@ModelAttribute Car newCar) {
            carRepository.create(newCar);
        return"index";
}

}
