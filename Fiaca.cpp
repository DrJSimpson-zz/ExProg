//Intento de leer una matriz 3d

#include <iostream>

using namespace std;

int main()
{
   int n_testcases;
   cin >> n_testcases;
   
   int matrixes[n_testcases][4][4];
   
   for (int i = 0; i < n_testcases; i++) {
       cin >> matrixes[i][0][0] >> matrixes[i][1][1] >> matrixes[i][2][2] >> matrixes[i][3][3];
   }
   
   
}
