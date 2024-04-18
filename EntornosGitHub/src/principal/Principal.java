package principal;

public class Principal {

	public static void main(String[] args) {
		Hola h = new Hola ();
		Mundo m = new Mundo ();
		Luego l = new Luego ();
		Hasta h1 = new Hasta ();
		
		System.out.println(h.toString() + m.toString());
		
		System.out.println(h1.toString() + l.toString());
	}

}
