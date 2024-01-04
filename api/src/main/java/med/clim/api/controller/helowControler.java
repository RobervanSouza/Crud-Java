package med.clim.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helowControler {
   @GetMapping
    public String olaMundo() {
        return "ola mundo estou aqui!!!";
    }
}
