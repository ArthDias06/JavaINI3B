package rh.model.validacoes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import rh.ValidacaoException;
import rh.model.Funcionario;

public class ValidacaoPeriodicaEntreReajustes implements Validacao {
    @Override
    public void validar(BigDecimal aumento, Funcionario funcionario) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between( dataUltimoReajuste, dataAtual);
        if(mesesDesdeUltimoReajuste < 6){
            throw new ValidacaoException("Intervalo entre reajustes deve ser no mínimo 6 meses!");
        }
    }
    
}
