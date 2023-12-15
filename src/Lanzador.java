import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lanzador {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			int numInstancias = Integer.parseInt(br.readLine().trim());
			int numCadenasGenerar = Integer.parseInt(br.readLine().trim());
			if(numInstancias<=10 & numCadenasGenerar<=10) {
				for(int i=0; i<numInstancias;i++) {
					System.out.println("Instancia " + (i+1));
					for(int j=0;j<numCadenasGenerar;j++) {
						System.out.println("Lanzando generador");	
						// Lanza al generador
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}