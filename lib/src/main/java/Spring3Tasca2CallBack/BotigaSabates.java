package Spring3Tasca2CallBack;

import java.util.Scanner;

public class BotigaSabates {

	public static void main(String[] args) {

		PassarellaPagament passarella = new PassarellaPagament();

		boolean sortir = false;

		do{
			switch(menu()){
			case 1: DeuteEnCompte targeta = new DeuteEnCompte();
					targeta.pagament(passarella);
			break;
			case 2: Paypal paypal = new Paypal();
					paypal.pagament(passarella);
			break;
			case 3: Targeta compteCorrent=new Targeta();
					compteCorrent.pagament(passarella);
			break;
			case 0: System.out.println("Gr�cies per utilitzar l'aplicaci�");
					sortir = true;
			break;
			}
		}while(!sortir); 

	}
	public static byte menu(){
		Scanner entrada = new Scanner(System.in);
		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 3;

		do{
			System.out.println("\nMEN� PRINCIPAL");
			System.out.println("1. Pagament amb Targeta");
			System.out.println("2. Pagament amb PayPal");
			System.out.println("3. Deute en Compte");
			System.out.println("0. Sortir de l'aplicaci�.\n");
			opcio = entrada.nextByte();
			if(opcio < MINIMO || opcio > MAXIMO){
				System.out.println("Escull una opci� v�lida");
			}
		}while(opcio < MINIMO || opcio > MAXIMO);
		return opcio;
	}

}
