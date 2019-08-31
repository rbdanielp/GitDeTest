import java.util.Scanner;

public class Test {


	
	public static String palabras[];

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hola");
		
		System.out.println(sb.reverse());
		
		//palabras = null;
		System.out.println ("Por favor introduzca una palabra (hasta 20 letras):");

        String entradaTeclado = "";

        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        palabras = new String[entradaTeclado.length()];
       // System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        
        palabras= CargarPalabra(entradaTeclado );

        
        

	}

    public static String[] CargarPalabra( String entradaTeclado ) {
    	for(int i=0;i<entradaTeclado.length();i++) {
    		palabras[i] = entradaTeclado.substring(i, i+1);
        	//System.out.println(i +") " +entradaTeclado.substring(i, i+1));
        }
        return palabras;
    }
    
}
