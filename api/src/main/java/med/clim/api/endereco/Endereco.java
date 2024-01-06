package med.clim.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String uf;
    private String complemento;
    private String cidade;

    public Endereco(DadosEndereco dados) {
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
        this.numero = dados.numero();
        this.logradouro = dados.logradouro();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.bairro() != null){
            this.bairro = dados.bairro();
        }if (dados.cep() != null){
            this.cep = dados.cep();
        }if (dados.uf() != null){
            this.uf = dados.uf();
        }if (dados.cidade() != null){
            this.cidade = dados.cidade();
        }if (dados.complemento() != null){
            this.complemento = dados.complemento();
        }if (dados.numero() != null){
            this.numero = dados.numero();
        }if (dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }

    }
}

