public class Generador {
	public static void main(String[] args) {
		String abecedario = "abcdefghijklmnopqrstuvwxyz"; // letras para generar la palabra
		String cadenaGenerada = ""; // cadena vacia
		for(int i=0; i<10; i++) {
			int letraAleatorio = (int) (Math.random() * abecedario.length());
			cadenaGenerada += abecedario.substring(letraAleatorio, letraAleatorio+1);
		}
		System.out.println(cadenaGenerada);
	}
}