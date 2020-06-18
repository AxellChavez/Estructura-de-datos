package colas;

public class PruebaColaINT {
	public static void main(String[]args) {
		int num=0;
		ColaEntero Cl=new ColaEntero(6);
		try {
			//System.out.println("agregamos 58");
		    Cl.encolar(58);
		    //System.out.println("agregamos 60");
		    Cl.encolar(60);
		    System.out.println("AGREGAMOS  40");
		    Cl.encolar(40);
		    //Sacar numero
		    num=Cl.sacar();
		    System.out.println("SACAMOS "+num);
		    num=Cl.sacar();
		    System.out.println("SACAMOS "+num);
		    System.out.println("AGREGAMOS 64");
		    Cl.encolar(64);
		}catch(ExcepcionColaLLena Err) {
			System.out.println(Err.getMessage());
		}catch(ExcepcionColaVacia Err) {
			System.out.println(Err.getMessage());
		}
	}
}
