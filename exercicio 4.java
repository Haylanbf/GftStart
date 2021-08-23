mport java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	   
	    double peças = 95; 
	    
	    System.out.print("Quantidade de Peças: ");
	    double quantidade = input.nextDouble();
	    
	    System.out.println("total: "+quantidade * peças);
	    double total = input.nextDouble();
	
	    
	    double redução;
	    if (total < 399 ){ 
	       (redução = (total - 300 / 100));
	       System.out.print("Desconto de: " +redução);
	       int desconto = input.nextInt();
	    }
	    
	
	}	
}