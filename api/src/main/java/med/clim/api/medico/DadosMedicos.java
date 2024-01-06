package med.clim.api.medico;

public record DadosMedicos(Long id,String nome, String email, String crm, Especialidade especialidade) {
    public DadosMedicos(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade());
    }
}
