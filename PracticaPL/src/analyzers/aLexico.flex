package analyzers;
import java_cup.runtime.*;
%%
%line
%column
%cup
%class Lexico

Espacios = [\n\r\t ]+
%%
/*operadores*/
"=" {return new java_cup.runtime.Symbol(sym.igual, new Token(yytext(), yyline, yycolumn));}
">" {return new java_cup.runtime.Symbol(sym.condMayor, new Token(yytext(), yyline, yycolumn));}
"<" {return new java_cup.runtime.Symbol(sym.condMenor, new Token(yytext(), yyline, yycolumn));}
"<=" {return new java_cup.runtime.Symbol(sym.condMenorIgual, new Token(yytext(), yyline, yycolumn));}
">=" {return new java_cup.runtime.Symbol(sym.condMayorIgual, new Token(yytext(), yyline, yycolumn));}
"not" {return new java_cup.runtime.Symbol(sym.negacion, new Token(yytext(), yyline, yycolumn));}
"or" {return new java_cup.runtime.Symbol(sym.condO, new Token(yytext(), yyline, yycolumn));}
"and" {return new java_cup.runtime.Symbol(sym.condY, new Token(yytext(), yyline, yycolumn));}

/*palabras reservadas*/
("program"|"PROGRAM") {return new java_cup.runtime.Symbol(sym.cabecera, new Token(yytext(), yyline, yycolumn));}
"begin" {return new java_cup.runtime.Symbol(sym.inicio, new Token(yytext(), yyline, yycolumn));}
"end" {return new java_cup.runtime.Symbol(sym.fin, new Token(yytext(), yyline, yycolumn));}
"const" {return new java_cup.runtime.Symbol(sym.constant, new Token(yytext(), yyline, yycolumn));}
"var" {return new java_cup.runtime.Symbol(sym.var, new Token(yytext(), yyline, yycolumn));}
"procedure" {return new java_cup.runtime.Symbol(sym.procedimiento, new Token(yytext(), yyline, yycolumn));}
"function" {return new java_cup.runtime.Symbol(sym.funcion, new Token(yytext(), yyline, yycolumn));}
"INTEGER" {return new java_cup.runtime.Symbol(sym.entero, new Token(yytext(), yyline, yycolumn));}
"REAL" {return new java_cup.runtime.Symbol(sym.real, new Token(yytext(), yyline, yycolumn));}

"if" {return new java_cup.runtime.Symbol(sym.si, new Token(yytext(), yyline, yycolumn));}
"else" {return new java_cup.runtime.Symbol(sym.sino, new Token(yytext(), yyline, yycolumn));}
"then" {return new java_cup.runtime.Symbol(sym.entonces, new Token(yytext(), yyline, yycolumn));}
"while" {return new java_cup.runtime.Symbol(sym.mientras, new Token(yytext(), yyline, yycolumn));}
"do" {return new java_cup.runtime.Symbol(sym.hacer, new Token(yytext(), yyline, yycolumn));}
"repeat" {return new java_cup.runtime.Symbol(sym.repite, new Token(yytext(), yyline, yycolumn));}
"until" {return new java_cup.runtime.Symbol(sym.hasta, new Token(yytext(), yyline, yycolumn));}
"for" {return new java_cup.runtime.Symbol(sym.para, new Token(yytext(), yyline, yycolumn));}
"to" {return new java_cup.runtime.Symbol(sym.hastaArriba, new Token(yytext(), yyline, yycolumn));}
"downto" {return new java_cup.runtime.Symbol(sym.hastaAbajo, new Token(yytext(), yyline, yycolumn));}
"UNIT" {return new java_cup.runtime.Symbol(sym.paquete, new Token(yytext(), yyline, yycolumn));}

/*operaciones*/
"\+" {return new java_cup.runtime.Symbol(sym.suma, new Token(yytext(), yyline, yycolumn));}
"\-" {return new java_cup.runtime.Symbol(sym.resta, new Token(yytext(), yyline, yycolumn));}
"\*" {return new java_cup.runtime.Symbol(sym.producto, new Token(yytext(), yyline, yycolumn));}
"div" {return new java_cup.runtime.Symbol(sym.division, new Token(yytext(), yyline, yycolumn));}
"mod" {return new java_cup.runtime.Symbol(sym.modulo, new Token(yytext(), yyline, yycolumn));}



/*Identificadores y constantes*/
[a-zA-Z]+([a-z]*|[A-Z]*|[0-9]*|"_")* {return new java_cup.runtime.Symbol(sym.identifier, new Token(yytext(), yyline, yycolumn));}
[+-]?[0-9]+ {return new java_cup.runtime.Symbol(sym.constanteEntera, new Token(yytext(), yyline, yycolumn));}
[+-]?(([0-9]+"."[0-9]+)|([0-9]+[eE][0-9]+)|([0-9]+"."[0-9]+[eE][+-]?[0-9]+))+ {return new java_cup.runtime.Symbol(sym.constanteReal, new Token(yytext(), yyline, yycolumn));}

/*separadores*/
":=" {return new java_cup.runtime.Symbol(sym.asignacion, new Token(yytext(), yyline, yycolumn));}
";" {return new java_cup.runtime.Symbol(sym.puntoComa, new Token(yytext(), yyline, yycolumn));}
"." {return new java_cup.runtime.Symbol(sym.punto, new Token(yytext(), yyline, yycolumn));}
":" {return new java_cup.runtime.Symbol(sym.dosPuntos, new Token(yytext(), yyline, yycolumn));}
"," {return new java_cup.runtime.Symbol(sym.coma, new Token(yytext(), yyline, yycolumn));}
"(" {return new java_cup.runtime.Symbol(sym.parentesisAbierto, new Token(yytext(), yyline, yycolumn));}
")" {return new java_cup.runtime.Symbol(sym.parentesisCerrado, new Token(yytext(), yyline, yycolumn));}
{Espacios} {}

/*comentarios*/
"\{".*"\}" {System.out.println("Linea reconocida");}
"\(\*" [.\n\r] "\*\)" {System.out.println("Varias Linea reconocida");}

. {System.out.println("Error lexico: " + yytext() + " Linea: " + yyline+ " Columna: " + yycolumn); TError error = new TError(yytext(), "Error lexico", "Simbolo incorrecto", yyline, yycolumn); }