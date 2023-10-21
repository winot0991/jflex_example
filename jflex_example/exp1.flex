
%%

%cup

digito = [0-9]
letra = [A-Za-z]
ident = letra(letra|digito)*
Inteiro = {digito}+

%%

{Inteiro} {
	int aux = Integer.parseInt(yytext());
	return new Symbol(sym.INTEIRO,yyline,yycolumn,yytext());
}
"+" {return new Symbol(sym.MAIS);}
"-" {return new Symbol(sym.MENOS);}
";" {return new Symbol(sym.PTVIRG);}

\n {return new Symbol(sym.EOF,yyline,yycolumn,yytext());}

