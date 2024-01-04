package med.clim.api.controller;

import med.clim.api.medico.DadosCadastro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class medicoController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastro dados){
        System.out.println(dados);
    }
}
