import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frecuencia {
	public static void main(String[] args) {
		int numA = 0;
		int numE = 0;
		int numO = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String linea = null;
		try {
			while((linea = br.readLine()) != null) {
			char[] letras = linea.toLowerCase().toCharArray();

			for(int i=0; i<letras.length; i++) {
				switch(letras[i]) {
				case 'a':
					numA++;
					break;
				case 'e':
					numE++;
					break;
				case 'o':
					numO++;
					break;
				}
			}
			System.out.println(linea);
			System.out.println(" A | E | O");
			System.out.println(" "+ numA +" | "+ numE + " | " + numO);
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
}