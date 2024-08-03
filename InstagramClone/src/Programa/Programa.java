package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Comentario;
import Entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem!!");
		Comentario c2 = new Comentario("Nossa!!! Que incrível!!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia"
				,"Estou indo visitar esse pais maravilhoso!!",12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario("Que a força esteja com você");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite pessoal"
				,"Vejo vocês amanha no proximo post",5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		leitor.close();

	}

}
