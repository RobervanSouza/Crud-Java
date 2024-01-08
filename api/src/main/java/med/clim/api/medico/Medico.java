package med.clim.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.clim.api.endereco.Endereco;

@Table(name= "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String email;
    private String crm;
    private String telefone;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastro dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.crm = dados.crm();
        this.email = dados.email();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
        this.telefone = dados.telefone();

    }

    private Boolean ativo;
    public void atualizarInformacoes(DadosAtualizar dados) {
        if(dados.nome() != null){
        this.nome = dados.nome();
        }
        if(dados.teleforne() != null){
            this.telefone = dados.teleforne();
        }
        if(dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }

    }

    public void excluir() {
        this.ativo = false;
    }
}
