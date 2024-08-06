package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva;
import model.exceptions.ExceptionDomain;

public class Program {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Numero do quarto: ");
			int numeroQuarto = leitor.nextInt();
			System.out.print("Data de Check-in (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(leitor.next());
			System.out.print("Data de Check-out (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(leitor.next());
	
			Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			System.out.println();
			System.out.println("Informe a data para atualizar a reserva: ");
			System.out.print("Data de Check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(leitor.next());
			System.out.print("Data de Check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(leitor.next());
	
			reserva.atualizaData(checkIn, checkOut);
	
			System.out.println("Reserva: " + reserva);
		}
		catch(ParseException e){
			System.out.println("Data invalida!");
			
		}catch(ExceptionDomain e) {
			System.out.println("Erro na reserva" + e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		leitor.close();

	}

}
