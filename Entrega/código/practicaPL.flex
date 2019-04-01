import java_cup.runtime.*;
%%
%class AnalizadorLexico
%line
%column
%cup
%%
/*
Parte opcional
*/
/*Operaciones*/
"<" {return new java_cup.runtime.Symbol(sym.op_menor, new Token(yytext(), yyline, yycolumn));}
">" {return new java_cup.runtime.Symbol(sym.op_mayor, new Token(yytext(), yyline, yycolumn));}
"<=" {return new java_cup.runtime.Symbol(sym.op_menor_igual, new Token(yytext(), yyline, yycolumn));}
">="    {return new java_cup.runtime.Symbol(sym.op_mayor_igual, new Token(yytext(), yyline, yycolumn));}
"||"    {return new java_cup.runtime.Symbol(sym.op_or_doble, new Token(yytext(), yyline, yycolumn));}
"&&"    {return new java_cup.runtime.Symbol(sym.op_and_doble, new Token(yytext(), yyline, yycolumn));}
/*Palabras reservadas*/
"if"    {return new java_cup.runtime.Symbol(sym.p_if, new Token(yytext(), yyline, yycolumn));}
"else"  {return new java_cup.runtime.Symbol(sym.p_else, new Token(yytext(), yyline, yycolumn));}
"while" {return new java_cup.runtime.Symbol(sym.p_while, new Token(yytext(), yyline, yycolumn));}
"do"    {return new java_cup.runtime.Symbol(sym.p_do, new Token(yytext(), yyline, yycolumn));}
"until" {return new java_cup.runtime.Symbol(sym.p_until, new Token(yytext(), yyline, yycolumn));}
"for"   {return new java_cup.runtime.Symbol(sym.p_buclefor, new Token(yytext(), yyline, yycolumn));}
/*
Parte obligatoria
*/
/*Operaciones*/
"=" {return new java_cup.runtime.Symbol(sym.op_igual, new Token(yytext(), yyline, yycolumn));}
"+" {return new java_cup.runtime.Symbol(sym.op_mas, new Token(yytext(), yyline, yycolumn));}
"-" {return new java_cup.runtime.Symbol(sym.op_menos, new Token(yytext(), yyline, yycolumn));}
"*" {return new java_cup.runtime.Symbol(sym.op_mult, new Token(yytext(), yyline, yycolumn));}
"/" {return new java_cup.runtime.Symbol(sym.op_div, new Token(yytext(), yyline, yycolumn));}
"%" {return new java_cup.runtime.Symbol(sym.op_mod, new Token(yytext(), yyline, yycolumn));}
"!" {return new java_cup.runtime.Symbol(sym.op_not, new Token(yytext(), yyline, yycolumn));}
"==" {return new java_cup.runtime.Symbol(sym.op_igual_doble, new Token(yytext(), yyline, yycolumn));}
/*Separadores*/
"(" {return new java_cup.runtime.Symbol(sym.parentesis_abierto, new Token(yytext(), yyline, yycolumn));}
")" {return new java_cup.runtime.Symbol(sym.parentesis_cerrado, new Token(yytext(), yyline, yycolumn));}
"{" {return new java_cup.runtime.Symbol(sym.corchete_abierto, new Token(yytext(), yyline, yycolumn));}
"}" {return new java_cup.runtime.Symbol(sym.corchete_cerrado, new Token(yytext(), yyline, yycolumn));}
"," {return new java_cup.runtime.Symbol(sym.coma, new Token(yytext(), yyline, yycolumn));}
";" {return new java_cup.runtime.Symbol(sym.punto_y_coma, new Token(yytext(), yyline, yycolumn));}
/*Palabras reservadas*/
"int" {return new java_cup.runtime.Symbol(sym.entero, new Token(yytext(), yyline, yycolumn));}
"float" {return new java_cup.runtime.Symbol(sym.real, new Token(yytext(), yyline, yycolumn));}
"#define" {return new java_cup.runtime.Symbol(sym.p_define, new Token(yytext(), yyline, yycolumn));}
"void"  {return new java_cup.runtime.Symbol(sym.p_v, new Token(yytext(), yyline, yycolumn));}
"return"  {return new java_cup.runtime.Symbol(sym.p_return, new Token(yytext(), yyline, yycolumn));}
/*Identificadores, constantes y comentarios*/
/*revisar esto para letras solas y para todo lo demas*/
("$"[a-zA-Z_0-9]+|[a-zA-Z][a-zA-Z_0-9]*) {return new java_cup.runtime.Symbol(sym.ident, new Token(yytext(), yyline, yycolumn));}
[+-]?[0-9]+ {return new java_cup.runtime.Symbol(sym.constint, new Token(yytext(), yyline, yycolumn));}
"0"[+-]?[0-9]+ {return new java_cup.runtime.Symbol(sym.constint, new Token(yytext(), yyline, yycolumn));}
"0x"[+-]?[0-9A-F]+ {return new java_cup.runtime.Symbol(sym.constint, new Token(yytext(), yyline, yycolumn));}
[+-]?[0-9]+("."[0-9]+)? {return new java_cup.runtime.Symbol(sym.constfloat, new Token(yytext(), yyline, yycolumn));}
"0"[+-]?[0-9]+("."[0-9]+)? {return new java_cup.runtime.Symbol(sym.constfloat, new Token(yytext(), yyline, yycolumn));}
"0x"[+-]?[0-9A-F]+("."[0-9A-F]+)? {return new java_cup.runtime.Symbol(sym.constfloat, new Token(yytext(), yyline, yycolumn));}
\'([^\\\']|\\.|("\\\'")?)*\' {return new java_cup.runtime.Symbol(sym.constlit, new Token(yytext(), yyline, yycolumn));}
("//"[^\n]*)|("/*"([^*]|"*"[^/])*"*"+"/") {;}
(" "|\n|\t|\r)+ {;}
[^] {System.out.print("error en linea:"+ yyline + " y columna:" + yycolumn);}