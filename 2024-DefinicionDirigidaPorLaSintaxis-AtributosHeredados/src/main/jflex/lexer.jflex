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

"*"                 { System.out.println("Se reconoce lexema: " + yytext()); 
                      return symbol(sym.MULTIPLICACION, yytext()); } 
{numero}            { System.out.println("Se reconoce lexema: " + yytext()); 
                      return symbol(sym.DIGITO, new Integer(yytext())); }
{espacios_blanco}   { System.out.println("Se reconoce lexema: " + yytext()); }
.                   { System.err.println("Caracter desconocido: " + yytext()); }