package jana60.geometria;

public class Rettangolo 
{
	int base;
	int altezza;
	//Metodo Perimetro
	int calcolaPerimetro()
	{
           int perimetro= (base+altezza)*2;
           return perimetro;
    }
	//Metodo Area
	int calcolaArea()
	{
		int area=base*altezza;
		return area;
	}
}