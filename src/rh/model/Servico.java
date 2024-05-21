package rh.model;
import java.math.BigDecimal;
import java.math.RoundingMode;
import rh.ValidacaoException;

public class Servico implements Validacao{
    @Override
    public void validar(BigDecimal aumento, Funcionario f) {
	BigDecimal percentualReajuste = aumento.divide(f.getSalario(), RoundingMode.HALF_UP);
	if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
		throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
	}
    }
}