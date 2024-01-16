package med.clim.api.medico;

import med.clim.api.endereco.Endereco;

public record DetalhesMedico(Long id, String nome, String email, String crm,String telefone, Especialidade especialidade, Endereco endereco) {
    public DetalhesMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
