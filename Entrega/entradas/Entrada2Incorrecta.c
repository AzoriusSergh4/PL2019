#define centena 100
#define decena 10
#define falso 0
#define verdadero 1

void cambioValor (float uno, float dos) {
	
	if (uno > dos){
		uno = dos;
		dos = aux;
	} else {
		uno = dos;
	}
}

int acceso(int edad + 55) {		//se hace una suma al pasarle los parametros
	int sePuede;
	if (edad < 18) {
		sePuede = falso;
	}
	else{
		sePuede = verdadero;
	}
	return sePuede;
}

void main (void){
	int personas;
	personas = 5 * decena + centena;
	int mayoresPares;
	do {
		int aux;
		aux = falso;
		aux = aux + acceso(15);
		personas = personas - 1;
	} until (personas = 0)
	mayoresPares = aux;
}