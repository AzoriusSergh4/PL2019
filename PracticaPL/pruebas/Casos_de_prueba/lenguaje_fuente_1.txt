program prueba1;
const
	cte1 = 0;
	cte2 = 21;
	cte = 98;
var
	i, j: INTEGER;
	k, l: REAL;

function PruebaAdicional: INTEGER;
begin
	PruebaAdicional := 5;
end;

function funcion(var1, var2: INTEGER; var3: REAL): INTEGER;
var
	aux1, var7, var6, v1, var2: INTEGER;
	aux3, aux4, var4, var8: REAL;
begin
	PruebaAdicional;
	a := PruebaAdicional + 3;
	aux1 := var1 ; 
	aux3 := var3 ; 
	var2 := funcion2 ( i + j , 5 , 3 + 8 ) ; 
	var4 := 5 * 4 + 3 div 8 + ( 5 + 4 ) * 9 ; 
	acumulador_total_2 := 'hola que tal?' ; 
	var6 := 'hola que tal '' me llamo Marcos '' y vivo en Madrid' ; 
	var2 := 'ejemplo de constantes literales' ; 
	v1 := aux1 mod aux2 + 3 div 7 ; 
	funcion := v1;
end;

procedure proc(a: INTEGER; b: REAL);
var
	c, d, e: REAL;
begin
	d := 0 ; 
	e := 0 ; 
	c := a * b ; 
	c := proc ( funcion ( a , b , e * a + b ) ) ; 
end;
begin
	f := funcion(i,j,k*l);
end.
