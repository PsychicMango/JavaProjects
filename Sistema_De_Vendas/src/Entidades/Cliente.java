package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private String nomeCliente;
	private String emailCliente;
	private Date dataNascimento;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cliente() {
		
	}
	
	public Cliente(String nomeCliente, String emailCliente, Date dataNascimento) {
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.dataNascimento = dataNascimento;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return nomeCliente + " (" + sdf.format(dataNascimento) + ") " + emailCliente;
	}
}
