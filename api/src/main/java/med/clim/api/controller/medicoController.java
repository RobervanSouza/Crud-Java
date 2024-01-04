package med.clim.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.clim.api.medico.DadosCadastro;
import med.clim.api.medico.Medico;
import med.clim.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class medicoController {
    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastro dados){
    repository.save(new Medico(dados));
}}

