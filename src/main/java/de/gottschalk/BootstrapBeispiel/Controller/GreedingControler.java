package de.gottschalk.BootstrapBeispiel.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreedingControler {

    @RequestMapping(value="/index")
    public String hallo(){
        return "index";

    }
}
