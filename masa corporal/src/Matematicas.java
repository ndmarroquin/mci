import java.util.Scanner;

public class Matematicas {
	
	public void imc () {
		
		Scanner scanner = new Scanner (System.in) ;
		
		System.out.println("Ingrese su peso en kilogramos...");
		
		double kg;
		kg = scanner.nextDouble();	
	
		System.out.println("Ingrese su altura en metros...");
		
		double m;
		m = scanner.nextDouble();
		 
		System.out.println("Su peso es: " + kg + "kilogramos");
		System.out.println("Su altura es: " + m + "metros");
		
		double resultado = kg / (m*m);
		
		System.out.println("Su IMC es: " + resultado);
		
		if ( resultado < 18.5) {
			System.out.println("Peso bajo detectado ");
			
		}
		
		if ( resultado >= 18.5 && resultado <25) {
		    System.out.println("Optimo");
	    }
	
	    if ( resultado >= 25 && resultado <30) {
	    	System.out.println("Sobrepeso detectado ");
	    }
	    
	    if (resultado >= 30) {
	    	System.out.println("Obeso ");
	    }
	    
	    scanner.close();
        
	}
	
}




  