package rh.model;

import java.math.BigDecimal;

public interface Validacao {
    void validar(BigDecimal aumento, Funcionario funcionario);
}
