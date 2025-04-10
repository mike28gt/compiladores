//Código de usuario

package com.example.clase08.ejemplojflex;

%%

//Opciones y declaracions

%class AnalizadorLexico
%public
%standalone
%char
%line
%column

%{

public void imprimirLexema(String lexema, 
                            long caracter, 
                            int linea) {
    System.out.println("Lexema: " + 
                        lexema + 
                        " Columna: " + 
                        caracter + 
                        " Linea: " + 
                        linea);
}

%}

id = [a-zA-Z][a-zA-Z0-9]*

%%

//Reglas léxicas

"{"     {imprimirLexema(yytext(), yychar, yyline);}
"}"     {imprimirLexema(yytext(), yychar, yyline);}
{id}    {imprimirLexema(yytext(), yychar, yyline);}