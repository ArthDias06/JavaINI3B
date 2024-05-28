package rh.model.validacoes;
import java.math.BigDecimal;
import java.math.RoundingMode;
import rh.ValidacaoException;
import rh.model.Funcionario;

public class ValidacaoPercentualReajuste implements Validacao{
    @Override
    public void validar(BigDecimal aumento, Funcionario funcionario) {
	BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
	if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
		throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
	}
    }
}