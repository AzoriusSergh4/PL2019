#define falso 0
#define verdadero 1

void operacion (float uno, float dos) {
	float op1;
	float op2;
	int op3;
	int op4;
	uno = op1 + op3 / op4;
	dos = op4 * op4 * op2 - op3;
}

int esPar (int numero) {
	int aux;
	aux = numero % 2;
    if (aux == 0) {
       solucion = verdadero;
    }
    else
    {
       solucion = falso;
    }    
    return solucion;
}

void main (void){
	float n1;
	float n2;
	int n3;
	int n4;
	n1 = 10;
	n2 = 29;
	n3 = 99;
	n4 = 13;
	int solucion;
	do {
		operacion(n1, n2);
		while ( 9 == 2 || n1 < n2) {
			solucion = esPar(n3);
			n3 = n3 + 1;
			n1 = n1 + 1;
		}
	} until (n3 >= n4)
}