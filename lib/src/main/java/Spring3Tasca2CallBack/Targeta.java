package Spring3Tasca2CallBack;

import java.util.Scanner;

public class Targeta  extends FormaPagament{

	@Override
	public void pagament(Passarella passarella) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero Targeta?");
		String numeroTargeta= sc.nextLine();
		System.out.println("Data caducitat?");
		String data= sc.nextLine();
		System.out.println("Numero Secret?");
		String secret= sc.nextLine();
		System.out.println("Paso un cobro: \nTargeta:        "+numeroTargeta+"\nData caducitat: "+data+"\nnºsecret:       " +secret);
		passarella.pagat();
	}

}
