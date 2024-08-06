package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.ExceptionDomain;

public class Reserva {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	public Reserva(Integer numeroQuarto, Date checkin, Date checkout) throws ExceptionDomain  {
		if (!checkOut.after(checkIn)){
			throw new ExceptionDomain("Erro na reserva: Data de Check-Out precisa ser informada depois da data de Check-In");
		}
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}

	public long duracao() {
		long diferenca = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	
	public void atualizaData(Date checkIn, Date checkOut)  throws ExceptionDomain{
		
		Date hoje = new Date();
		if (checkIn.before(hoje) || checkOut.before(hoje)) {
			throw new ExceptionDomain("Erro na reserva: As datas de reserva para serem atualizadas necessitam que sejma datas futuras");
		} else if (!checkOut.after(checkIn)) {
			throw new ExceptionDomain("Erro na reserva: Data de Check-Out precisa ser informada depois da data de Check-In");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Quarto " + numeroQuarto + ", checkin: " + sdf.format(checkIn) + ", checkout: "
				+ sdf.format(checkOut) + ", " + duracao() + " noites";
	}

	
}
