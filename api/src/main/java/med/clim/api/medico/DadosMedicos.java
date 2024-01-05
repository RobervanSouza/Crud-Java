package med.clim.api.medico;

public record DadosMedicos(String nome, String email, String crm, Especialidade especialidade) {
    public DadosMedicos(Medico medico){
        this(medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade());
    }
}
