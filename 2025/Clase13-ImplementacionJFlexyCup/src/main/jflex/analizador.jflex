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
numero = {digito}+
espacios_blanco = [ \t\n\r]

%%

// reglas léxicas

"+"                 { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.SUMA, yytext()); }

"-"                 { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.RESTA, yytext()); }

"*"                 { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.MULTIPLICACION, yytext()); }

"/"                 { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.DIVISION, yytext()); }

{numero}            { imprimirLexema(yytext(), yycolumn, yyline ); 
                      return getToken(sym.NUMERO, yytext()); }

{espacios_blanco}   { imprimirLexema(yytext(), yycolumn, yyline ); }


