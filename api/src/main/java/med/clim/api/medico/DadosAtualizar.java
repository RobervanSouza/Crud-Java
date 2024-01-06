package med.clim.api.medico;

import jakarta.validation.constraints.NotNull;
import med.clim.api.endereco.DadosEndereco;

public record DadosAtualizar(
        @NotNull
        Long id,
        String teleforne,
        String nome,
        DadosEndereco endereco) {
}
