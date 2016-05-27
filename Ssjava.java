import java.util.Scanner;

public class Ssjava {
	
	public static void main(String[] args) {
		long uso,s=0,r,uso2,i,k,n;
		Scanner sc = new Scanner(System.in);
		//n es las dimensiones del aray k es la fase a la que se lo lleva
		n = sc.nextInt();
		k = sc.nextInt();
		
		for(i=0;i<n;i++){
			uso = sc.nextInt();
			s+=uso;
		}
		n--;
		//System.out.print( "\n paw(n, k) : " + paw(n,k));
		System.out.print((s*paw(n,k))%1000000007 + "\n");

		
	}

	public static long paw(long base, long power) {
		//System.out.print("\n ------------- PAW -------------------");
		//System.out.print("\n a : " + base + " b : " + power);
		//System.out.print("\n");
		if(power==0){
			//System.out.println("Caso base de PAW retorna 1");
			return 1;
		}
		long uso = paw(base,power/2);
		//System.out.print("\n |Dentro de paw| uso = " + uso + " para power = " + power);
		//System.out.print("\n |Dentro de paw| (uso*uso) = " + uso * uso + " para power = " + power);
		//siempre hace uso * uso
		uso=(uso*uso)%1000000007;
		//System.out.print("\n |Dentro de paw| (uso*uso)%1000000007 = " + uso + " para power = " + power);
		// si es impar multiplica por la dimension - 1 y aplica el mòdulo
		if(power % 2 != 0) {
			uso=(uso*base)%1000000007;
			//System.out.println("\n -- es impar mult por base -- " + uso);
		} 
		//System.out.print("\n ---- Fin paw ---- retorna: uso = " + uso + " para power = " + power);
		return uso;
	}

}

