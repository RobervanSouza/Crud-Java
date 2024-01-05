package med.clim.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.clim.api.medico.DadosCadastro;
import med.clim.api.medico.DadosMedicos;
import med.clim.api.medico.Medico;
import med.clim.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class medicoController {
    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastro dados){

        repository.save(new Medico(dados));
    }
    @GetMapping
    public Page<DadosMedicos> listar(@PageableDefault(size = 10, sort= {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosMedicos::new);
    }
}

