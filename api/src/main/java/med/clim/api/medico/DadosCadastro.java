package med.clim.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.clim.api.endereco.DadosEndereco;

public record DadosCadastro(

        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{4,12}")
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull
        @Valid
        DadosEndereco endereco) {
}
