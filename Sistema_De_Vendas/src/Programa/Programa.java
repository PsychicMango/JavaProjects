package Programa;

import java.util.Date;

import Entidades.Pedido;
import Entidades.enums.EstatusPedido;

public class Programa {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(180, new Date(), EstatusPedido.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);
		
		EstatusPedido ep1 = EstatusPedido.ENTREGUE;
		EstatusPedido ep2 = EstatusPedido.valueOf("ENTREGUE");
		
		System.out.println(ep1);
		System.out.println(ep2);
		

	}

}
