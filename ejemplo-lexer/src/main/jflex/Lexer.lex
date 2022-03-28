package jlex.test;

%%

%public
%class AnalizadorLexico
%line
%column
%standalone

//Definiciones regulares
letra           = [a-zA-Z]
digito          = [0-9]
alfanumerico    = {letra}|{digito}
guion_bajo      = [_]
identificador   = {letra}({alfanumerico}|{guion_bajo})*
espacios_blanco = [ \t\r\n]

%%

if                  {}
while               {}
for                 {}
{identificador}     {System.out.println("Se reconoce el lexema: " + yytext() + " columna: " + yychar + " línea: " + yyline);}
{espacios_blanco}   {/*Se ignoran los espacios en blanco*/}
