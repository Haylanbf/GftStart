mport java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	   
	    double pe�as = 95; 
	    
	    System.out.print("Quantidade de Pe�as: ");
	    double quantidade = input.nextDouble();
	    
	    System.out.println("total: "+quantidade * pe�as);
	    double total = input.nextDouble();
	
	    
	    double redu��o;
	    if (total < 399 ){ 
	       (redu��o = (total - 300 / 100));
	       System.out.print("Desconto de: " +redu��o);
	       int desconto = input.nextInt();
	    }
	    
	
	}	
}