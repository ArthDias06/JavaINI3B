package rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
            this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
            this.dataUltimoReajuste = LocalDate.now();
	}
        
        public void atualizarSalario(BigDecimal novoSalario) {
            this.dadosPessoais.setSalario(novoSalario);
            this.dataUltimoReajuste = LocalDate.now();
	}
        
        public void promover(Cargo novoCargo){
            this.dadosPessoais.setCargo(novoCargo);
        }
        
	public String getNome() {
            return this.dadosPessoais.getNome();
	}

	public String getCpf() {
            return this.dadosPessoais.getCpf();
	}

	public Cargo getCargo() {
            return this.dadosPessoais.getCargo();
	}

	public BigDecimal getSalario() {
            return this.dadosPessoais.getSalario();
	}

	public LocalDate getDataUltimoReajuste() {
            return dataUltimoReajuste;
	}

}
