package Entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entidades.enums.NivelCargo;

public class Funcionario {
	private String nome;
	private NivelCargo cargo;
	private Double salarioBase;
	
	
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, NivelCargo cargo, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelCargo getCargo() {
		return cargo;
	}

	public void setCargo(NivelCargo cargo) {
		this.cargo = cargo;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}
	
	public void adicionarContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar calendario = Calendar.getInstance();
		for(ContratoHora c : contratos) {
			calendario.setTime(c.getData());
			int c_ano = calendario.get(Calendar.YEAR);
			int c_mes = calendario.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
	
}
