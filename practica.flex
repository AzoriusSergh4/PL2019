import java_cup.runtime.*;
%%
%line
%column
%cup
%%
/*operadores*/
"=" {return new java_cup.runtime.Symbol(sym.igual, new Token(yytext(), yyline, yycolumn));}

/*palabras reservadas*/
"program" {return new java_cup.runtime.Symbol(sym.cabecera, new Token(yytext(), yyline, yycolumn));}
"begin" {return new java_cup.runtime.Symbol(sym.inicio, new Token(yytext(), yyline, yycolumn));}
"end" {return new java_cup.runtime.Symbol(sym.fin, new Token(yytext(), yyline, yycolumn));}
"const" {return new java_cup.runtime.Symbol(sym.const, new Token(yytext(), yyline, yycolumn));}
"var" {return new java_cup.runtime.Symbol(sym.var, new Token(yytext(), yyline, yycolumn));}
"procedure" {return new java_cup.runtime.Symbol(sym.procedimiento, new Token(yytext(), yyline, yycolumn));}
"function" {return new java_cup.runtime.Symbol(sym.funcion, new Token(yytext(), yyline, yycolumn));}
"INTEGER" {return new java_cup.runtime.Symbol(sym.entero, new Token(yytext(), yyline, yycolumn));}
"REAL" {return new java_cup.runtime.Symbol(sym.real, new Token(yytext(), yyline, yycolumn));}

/*Identificadores y constantes*/
[a-zA-Z]+([a-z]*|[A-Z]*|[0-9]*|"_")* {return new java_cup.runtime.Symbol(sym.identifier, new Token(yytext(), yyline, yycolumn));}
[+-]?[0-9]+ {return new java_cup.runtime.Symbol(sym.constanteEntera, new Token(yytext(), yyline, yycolumn));}
[+-]?(([0-9]+"."[0-9]+)|([0-9]+[eE][0-9]+)|([0-9]+"."[0-9]+[eE][+-]?[0-9]+))+ {return new java_cup.runtime.Symbol(sym.constanteReal, new Token(yytext(), yyline, yycolumn));}

/*bucles*/

/*separadores*/
";" {return new java_cup.runtime.Symbol(sym.puntoComa, new Token(yytext(), yyline, yycolumn));}
"." {return new java_cup.runtime.Symbol(sym.punto, new Token(yytext(), yyline, yycolumn));}
":" {return new java_cup.runtime.Symbol(sym.dosPuntos, new Token(yytext(), yyline, yycolumn));}
"," {return new java_cup.runtime.Symbol(sym.coma, new Token(yytext(), yyline, yycolumn));}
"(" {return new java_cup.runtime.Symbol(sym.parentesisAbierto, new Token(yytext(), yyline, yycolumn));}
")" {return new java_cup.runtime.Symbol(sym.parentesisCerrado, new Token(yytext(), yyline, yycolumn));}

/*comentarios*/
"\{"[^\n]"\}" {System.out.println "Linea reconocida";}
"\(\*".*"\*\)" {System.out.println " Varias Linea reconocida";}

