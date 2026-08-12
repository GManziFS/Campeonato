package dev.campeonato.campeonato;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping

public class Controller {
    @GetMapping("Rota")
    public String Rota() {
        return new String("Primeira rota teste");
    }
}
