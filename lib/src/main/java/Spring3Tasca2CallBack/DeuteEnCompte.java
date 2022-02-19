package Spring3Tasca2CallBack;

import java.util.Scanner;

public class DeuteEnCompte  extends FormaPagament{
	
	@Override
	public void pagament(Passarella passarella) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de compte?");
		String numeroCompte = sc.nextLine();
		System.out.println("Paso un cobro: \nNumero de compte: "+numeroCompte );
		passarella.pagat();
	}

}
