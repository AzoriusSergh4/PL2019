program prueba2;
var
	c1, c2, c3: INTEGER;
	j: INTEGER;

begin
	if c1 < c2 then 
	begin
		c3 := c1 + c2 ; 
	end
	else
	begin
		c3 := c1 - c2 ; 
	end

	c1 := c1 + c3 ; 
	while c1 > 0 do
	begin
		c1 := c1 - 1 ; 
		c2 := c2 * c3 ; 
	end

	for i:= 0 to 10 do
	begin
		c2 := c2 + 1 ; 
	end

	for i:= c1 downto c2 do
	begin
		c3 := c3 + 1 ; 
	end

	while i < 10 do
	begin
		c3 := c3 + 1 ; 
		i := i + 2 ;
	end

	j := 0 ; 
	repeat
	begin
		j := j + 1 ; 
		c1 := c2 * c3 ; 
	end
	until j <= 20;

end.

