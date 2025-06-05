// codigo de usuario
package com.example.clase13.implementacionjflexycup;

import java_cup.runtime.*;

%%

// opciones y declaraciones

%class AnalizadorLexico
%public
%cup
%char
%line
%column

%{
    public void imprimirLexema(String lexema, long columna, 
                               int linea) {
        System.out.println("Lexema:" + lexema +
                          " Columna: " + columna +
                          " Línea: " + linea);
    }

    public Symbol getToken(int tipo, Object valor) {
        return new Symbol(tipo, yyline, yycolumn, valor);
    }
%}

digito = [0-9]
espacios_blanco = [ \t\n\r]

%%

// reglas léxicas

"n"                 { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.N, yytext()); }

"+"                 { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.SUMA, yytext()); }

"*"                 { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.MULTIPLICACION, yytext()); }

"("                 { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.PAR_ABRE, yytext()); }

")"                 { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.PAR_CIERRA, yytext()); }

{digito}            { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.DIGITO, Integer.parseInt(yytext())); }

<<EOF>>             { return getToken(sym.EOF, null); }

{espacios_blanco}   { /* Ignora espacios en blanco */ }