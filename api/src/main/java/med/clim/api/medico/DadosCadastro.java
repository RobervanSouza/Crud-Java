package med.clim.api.medico;

import med.clim.api.endereco.DadosEndereco;

public record DadosCadastro(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
