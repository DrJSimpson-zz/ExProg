#include <iostream>
#define MOD 1000000007
using namespace std;
long long paw(long long base, long long power){
	cout << "\n ------------- PAW -------------------";
	cout << "\n a : " <<base << " b : " << power;
	cout << "\n";
	if(power==0){
		cout << "Caso base de PAW retorna 1";
		return 1;
	}
	long long uso = paw(base,power/2);
	cout << "\n |Dentro de paw| uso = " << uso << " para power = " << power;
	cout << "\n |Dentro de paw| (uso*uso) = " << uso * uso << " para power = " << power;
	//siempre hace uso * uso
	uso=(uso*uso)%MOD;
	cout << "\n |Dentro de paw| (uso*uso)%MOD = " << uso << " para power = " << power;
	// si es impar multiplica por la dimension - 1 y aplica el mòdulo
	if(power % 2 != 0) {
		uso=(uso*base)%MOD;
		cout << " -- es impar mult por base -- "<< uso;
	} 
	cout << "\n ---- Fin paw ---- retorna: uso = " << uso << " para power = " << power;
	return uso;
}
int main (){
	
	long long uso,s=0,r,uso2,i,k,n;
	cin>>n>>k; //n es las dimensiones del aray k es la fase a la que se lo lleva
	for(i=0;i<n;i++){
		cin>>uso;
		s+=uso;
	}
	n--;
	cout << "\n paw(n, k) : " << paw(n,k);
	cout << "\n" << (s*paw(n,k))%MOD << "\n";
}
