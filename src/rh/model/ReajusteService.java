package rh.model;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {
    private List<Validacao> validacoes;
    
    public ReajusteService(List<Validacao> validacoes){
        this.validacoes = validacoes;
    }
    
    public void reajustarSalarioDoFuncionario(Funcionario f, BigDecimal salario){
        this.validacoes.forEach(v -> v.validar(salario, f));
        BigDecimal salarioReajustado = f.getSalario().add(salario);
        f.atualizarSalario(salarioReajustado);
    }
}
