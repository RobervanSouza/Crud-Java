package med.clim.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.clim.api.endereco.DadosEndereco;


public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
