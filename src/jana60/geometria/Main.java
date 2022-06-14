package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
      Scanner scan=new Scanner(System.in);		
      Rettangolo figura=new Rettangolo();
      System.out.print("Inserisci base: ");
      figura.base=scan.nextInt();
      System.out.print("Inserisci altezza: ");
      figura.altezza=scan.nextInt();
      
      System.out.println("Il tuo perimetro e': "+ figura.calcolaPerimetro());
      System.out.println("La tua area e': " + figura.calcolaArea());
      
  
      scan.close();
	}

}
