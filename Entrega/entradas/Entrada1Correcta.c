#define operando1 700
#define operando2 33

int sumaLenta (int variable) {
	int contador;
	int solucion;
	solucion = variable;
	for(contador = 0 ; contador <= operando1 ; contador = contador + 1){
		solucion = solucion + 1;
	}
	
	return solucion;
}

int restaLenta (int minuendo, int sustraendo) {
	int contador;
	int solucion;
	solucion = minuendo;
	for(contador = 0 ; contador <= sustraendo ; contador = contador - 1) {
		solucion = solucion - 1;
	}
	return solucion;
}

int restaRara (int minuendo, int sustraendo, float real, int entero) {
	int contador;
	int solucion;
	solucion = minuendo;
	for(contador = 0 ; contador <= sustraendo ; contador = contador + contador * (2 - 1)) {
		solucion = solucion - 1;
	}
	return solucion;
}

void main (void){
	float numero;
	numero = 55.7;
	int entero;
	if (!operando2 == 37) {
		numero = 7 + 3 * numero;
	} else {
		entero = sumaLenta(operando1, 55);
	}
	entero = entero % numero;
}