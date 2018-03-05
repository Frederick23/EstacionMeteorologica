package Climatologica;
public class PruebaTempdia {

	public static void main(String[] args) {

		Tempdia a = new Tempdia(new Fecha(1, 1, 1981), 27, 25);

		System.out.println(a.toString());

		TempHumDia b = new TempHumDia(new Fecha(2,2,2007), 30,21, 100,200);
		System.out.println(b.toString());
	}

}