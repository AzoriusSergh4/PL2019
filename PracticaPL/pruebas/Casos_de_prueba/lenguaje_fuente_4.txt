UNIT prueba4;

procedure prueba1(i1, i2, i3: INTEGER; r1: REAL; i4: INTEGER; r2, r3: REAL);
var
	a, b, c, d: INTEGER;
	e, f, g: REAL;
begin
	f := e * g ; 
end;
function prueba2(v1, v2: INTEGER; v3, v4: REAL): INTEGER;
var
	aux1, aux2, aux3, aux4: INTEGER;
	aux6, aux7: INTEGER;
	r1: REAL;
	r2: REAL;
	controlFlujo, cont1, cont2, cont3: INTEGER;
	cont4: INTEGER;
begin
	{Comentario de una sola linea}
	v1 := v2 * v3 ; 
	v3 := v1 + 1 ; 
	v3 := v2 + 1 ; 
	if v1 < v2 then 
	begin
		controlFlujo := v1 * v2 + 5 ; 
	end
	else
	begin
		aux1 := v2 * v3 ; 
	end

	prueba2 := v1;

	(* Comentario 
	 de varias lineas *)
end;

.