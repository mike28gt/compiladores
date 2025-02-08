//User code
package mi.primer.scanner;

%%

//Opciones y definiciones regulares

%public
%class Scanner
%char
%line
%column
%standalone

//Definición regular
palabra = [a-zA-Z]+
identificador = [a-zA-Z][a-zA-Z0-9]*
digito = [0-9]+
espacios_blanco = [\r|\n|\r\n| |\t]

%%

//Reglas léxicas
"void"     { System.out.println("Lexema: " 
              + yytext() 
              + " columna: " 
              + yychar 
              + " fila: " 
              + yyline ); }

"extends"  { System.out.println("Lexema: " 
              + yytext() 
              + " columna: " 
              + yychar 
              + " fila: " 
              + yyline ); }
"class"     { System.out.println("Lexema: " 
              + yytext() 
              + " columna: " 
              + yychar 
              + " fila: " 
              + yyline ); }
"+"         { System.out.println("Lexema: " 
              + yytext() 
              + " columna: " 
              + yychar 
              + " fila: " 
              + yyline ); }
">"         { System.out.println("Lexema: " 
              + yytext() 
              + " columna: " 
              + yychar 
              + " fila: " 
              + yyline ); }
"&&"        { System.out.println("Lexema: " 
              + yytext() 
              + " columna: " 
              + yychar 
              + " fila: " 
              + yyline ); }
{identificador} { System.out.println("Lexema: " 
              + yytext() 
              + " columna: " 
              + yychar 
              + " fila: " 
              + yyline ); }

{digito}    { System.out.println("Lexema: " 
              + yytext() 
              + " columna: " 
              + yychar 
              + " fila: " 
              + yyline ); }
{espacios_blanco}   { /*Ignorar estos símbolos*/ }