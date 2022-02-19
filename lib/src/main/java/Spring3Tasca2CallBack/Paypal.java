package Spring3Tasca2CallBack;

import java.util.Scanner;

public class Paypal extends FormaPagament{
	
	@Override
	public void pagament(Passarella passarella) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom d'usuari?");
		String nomUsuari= sc.nextLine();
		System.out.println("Password?");
		String password= sc.nextLine();
		System.out.println("Conecto amb Paypal y paso un cobro: \nUsuari:   "+nomUsuari+"\nPassword: "+password);
		passarella.pagat();
	}
}
