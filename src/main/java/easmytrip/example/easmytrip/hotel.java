package easmytrip.example.easmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {
    @GetMapping("/hotel")
    public String getData() {return  "Please book your hotel in shimla at 25% discount" ; }
}
