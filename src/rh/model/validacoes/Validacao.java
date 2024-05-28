package rh.model.validacoes;

import java.math.BigDecimal;
import rh.model.Funcionario;

public interface Validacao {
    void validar(BigDecimal aumento, Funcionario funcionario);
}
