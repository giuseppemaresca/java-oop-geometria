package jana60.geometria;

import java.util.Scanner;

public class MainBonus
{

	public static void main(String[] args) 
		{
		      Scanner scan=new Scanner(System.in);		
		      Rettangolo figura=new Rettangolo();
		      int areaMaggiore=0;
		      for(int i=0;i<5;i++)
		      {
		        System.out.print("Inserisci base: ");
		        figura.base=scan.nextInt();
		        System.out.print("Inserisci altezza: ");
		        figura.altezza=scan.nextInt();
		         if(figura.calcolaArea()>areaMaggiore) 
		      {
		    	 areaMaggiore=figura.calcolaArea();
		      }
		      
		      }
		      System.out.println("L'area del rettangolo piu' grande e': "+areaMaggiore);		       
		      scan.close();
		}

}
