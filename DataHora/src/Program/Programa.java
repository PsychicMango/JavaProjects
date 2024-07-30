package Program;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Programa {

	public static void main(String[] args) {
		
		//DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		LocalDate data =  LocalDate.now();
		LocalDateTime data2 =  LocalDateTime.now();
		Instant data3 = Instant.now();
		
		LocalDate data4 = LocalDate.parse("2024-07-22");
		LocalDateTime data5 = LocalDateTime.parse("2022-07-23T15:28:34");
		Instant data6 = Instant.parse("2022-07-23T15:28:34Z");
		//LocalDate data5 = LocalDate.parse("22/07/2022",fmt1);
		System.out.println(data);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	//	System.out.println(data5);
		
		//Formatando data hora para um formato customizado
		/*
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("data formatada = " + data4.format(fmt1));
		System.out.println("data formatada = " + fmt1.format(data4));
		System.out.println("data formatada = " + data4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
*/
		
		
		//Convertendo hora global para local
		/*
		LocalDate r1 = LocalDate.ofInstant(data6, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(data6, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(data6, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(data6, ZoneId.of("Portugal"));
		System.out.println("R1 = " + r1);
		System.out.println("R2 = " + r2);
		System.out.println("R3 = " + r3);
		System.out.println("R4 = " + r4);
		
		System.out.println("d4 dia = " + data4.getDayOfMonth());
		System.out.println("d4 mes = " + data4.getMonthValue());
		System.out.println("d4 ano = " + data4.getYear());
		
		System.out.println("d5 hora = " + data5.getHour());
		*/
		
		//Calculo com data
		LocalDate semanaPassada = data4.minusDays(7);
		LocalDate semanaQueVem = data4.plusDays(7);
		
		
		System.out.println("Semana passada " + semanaPassada);
		System.out.println("Semana Que vem " + semanaQueVem);
		
		LocalDateTime semanaPassada2 = data5.minusDays(7);
		LocalDateTime semanaQueVem2 = data5.plusDays(7);
		
		System.out.println("Semana passada " + semanaPassada2);
		System.out.println("Semana Que vem " + semanaQueVem2);
		
		Instant semanaPassada3 = data6.minus(7, ChronoUnit.DAYS);
		Instant semanaQueVem3 = data6.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana passada " + semanaPassada3);
		System.out.println("Semana Que vem " + semanaQueVem3);
		
		Duration t2 = Duration.between(semanaPassada.atTime(0,0), data4.atStartOfDay());
		Duration t1 = Duration.between(semanaPassada2, data5);
		Duration t3 = Duration.between(semanaPassada3, data6);
		
		
		System.out.println("Duracao em dias " + t1.toDays());
		System.out.println("Duracao em dias " + t2.toDays());
		System.out.println("Duracao em dias " + t3.toDays());
		}

}
