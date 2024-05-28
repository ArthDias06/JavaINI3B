package rh.model.service;

import rh.model.validacoes.Validacao;
import java.math.BigDecimal;
import java.util.List;
import rh.model.Funcionario;

public class ReajusteService {
    private List<Validacao> validacoes;
    
    public ReajusteService(List<Validacao> validacoes){
        this.validacoes = validacoes;
    }
    
    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(v -> v.validar(aumento, funcionario));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
