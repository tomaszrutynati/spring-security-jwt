package pl.sda.securityjwt.api.car;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarEndpoint {

    @GetMapping
    public String getCarInfo() {
        return "This car info is secured";
    }

}
