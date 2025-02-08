package com.mycompany.jflexycup;

import java_cup.runtime.*;

%%

%public
%class Lexer
%char
%line
%column
%cup

%{
    private Symbol symbol(int tipo, Object valor) {
        return new Symbol(tipo, yyline, yycolumn, valor);
    }
%}

digito          = [0-9]
numero          = {digito}+
espacios_blanco = [ \t\r\n]

%%

"n"                 { System.out.println("Se reconoce lexema: " + yytext()); 
                      return symbol(sym.N, yytext()); }
"+"                 { System.out.println("Se reconoce lexema: " + yytext()); 
                      return symbol(sym.SUMA, yytext()); }
"*"                 { System.out.println("Se reconoce lexema: " + yytext()); 
                      return symbol(sym.MULTIPLICACION, yytext()); }
"("                 { System.out.println("Se reconoce lexema: " + yytext()); 
                      return symbol(sym.PARENTESIS_IZQUIERDO, yytext()); }
")"                 { System.out.println("Se reconoce lexema: " + yytext()); 
                      return symbol(sym.PARENTESIS_DERECHO, yytext()); }
{numero}            { System.out.println("Se reconoce lexema: " + yytext()); 
                      return symbol(sym.DIGITO, new Integer(yytext())); }
{espacios_blanco}   { System.out.println("Se reconoce lexema: " + yytext()); }
.                   { System.err.println("Caracter desconocido: " + yytext()); }