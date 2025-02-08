package umg.compiladores;

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

"n"                 { System.out.println("Se reconoce lexema: " + yytext()); return symbol(sym.FIN_CADENA, yytext()); }
"+"                 { System.out.println("Se reconoce lexema: " + yytext()); return symbol(sym.SUM, yytext()); }
"*"                 { System.out.println("Se reconoce lexema: " + yytext()); return symbol(sym.MULT, yytext()); }
"("                 { System.out.println("Se reconoce lexema: " + yytext()); return symbol(sym.PAR_ABRE, yytext()); }
")"                 { System.out.println("Se reconoce lexema: " + yytext()); return symbol(sym.PAR_CIERRA, yytext()); }
{numero}            { System.out.println("Se reconoce lexema: " + yytext()); return symbol(sym.DIGITO, new Integer(yytext())); }
{espacios_blanco}   { System.out.println("Se reconoce lexema: " + yytext()); }