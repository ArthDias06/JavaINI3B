package rh.model;

import java.math.BigDecimal;

public interface Validacao {
    public void validarReajuste(BigDecimal aumento, Funcionario f);
}
