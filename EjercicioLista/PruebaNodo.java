
package nodo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PruebaNodo {
    public static void main (String args [])throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader Teclado = new BufferedReader(r);
		String Tex=" ";
		String resp = " ";
		Nodo1 Inicial = null;
		Nodo1 SigNod = null;
		Nodo1 Actual = null;		
                System.out.println("BIENVENIDO GUARDEMOS 10 PALABRAS");
		do{
			System.out.println("ingresa una palabra");
			Tex=Teclado.readLine();
			if(Inicial == null) {
				Inicial = new Nodo1(null,Tex);
				Actual = Inicial;
			}else {
				SigNod = new Nodo1(null, Tex);
				Actual.Siguiente = SigNod;
				Actual = SigNod;
			}
                        System.out.println("//-- SI=S --//-- NO=N --//");
			System.out.println("¿Deseas continuar? S/N");
			resp = Teclado.readLine();
		}while(resp.compareToIgnoreCase("S")==0);
		Nodo1 ref = new Nodo1(null, Tex);
		ref = Inicial;
		while(ref != null) {
			System.out.println("Valor " + ref);
			ref = ref.Siguiente;
		}
	}
}
