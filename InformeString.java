/*
Programa que hace pruebas sobre los Strings
*/

public class InformeString {
    public static void main(String[] args) {
    

/*
Programa que hace pruebas sobre los Strings
*/

	//Pedimos las variables

 	System.out.println("Text principal?");    
    	String principal = Entrada.readLine();

 	System.out.println("Text secundari ?");    
    	String secundario = Entrada.readLine();

    	System.out.println("Número positiu?");    
    	int numero = Integer.parseInt(Entrada.readLine());




	//Contamos cuantas letras tiene el primer string
	System.out.println("\""+principal+"\".length(): "+principal.length());

	//Compara si los textos empiezan igual, dará False si hay una palabra en mayúscula y otra en minúscula
   	System.out.println("\""+principal+"\".startsWith(\""+secundario+"\"): "+principal.startsWith(secundario));

	//Compara si los textos terminan igual
   	System.out.println("\""+principal+"\".endsWith(\""+secundario+"\"): "+principal.endsWith(secundario));

	//Compara si los textos son iguales
   	System.out.println("\""+principal+"\".equals(\""+secundario+"\"): "+principal.equals(secundario));

	//Compara si los textos son iguales, ignorará las mayúsculas y minúsculas. 
   	System.out.println("\""+principal+"\".equalsIgnoreCase(\""+secundario+"\"): "+principal.equalsIgnoreCase(secundario));

	//Boolean que indica si la cadena només conté caracters blancs o bé està buida
	System.out.println("\""+principal+"\".isBlank(): "+principal.isBlank());
	
	//Boolean que indica si la cadena està buida
	System.out.println("\""+principal+"\".isEmpty(): "+principal.isEmpty());

	//Caràcter a la posició indicada	
	System.out.println("\""+principal+"\".charAt("+numero+"): "+principal.charAt(numero));

	//Cadena resultant de concatenar la cadena amb l’altre
	System.out.println("\""+principal+"\".concat(\""+secundario+"\"): "+principal.concat(secundario));
	
	//Cadena repetida el nombre de cops indicat
	System.out.println("\""+principal+"\".repeat("+numero+"): "+principal.repeat(numero));	
	
	//Cadena amb tot en majúscules
	System.out.println("\""+principal+"\".toUpperCase(): "+principal.toUpperCase());				

	//Cadena amb tot en minúscules
	System.out.println("\""+principal+"\".toLowerCase(): "+principal.toLowerCase());		


    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////



    01_58_manipulant_strings:


//declaro variable paraula
jshell> String paraula = "paraula";
paraula ==> "paraula"


//pido la segunda letra de paraula
jshell> char segonaLletra = paraula.charAt(1);
segonaLletra ==> 'a'


//La longitud de la paraula (quantes lletres conté)
jshell> paraula.length();
$3 ==> 7


//La darrera lletra de la paraula
jshell> paraula.charAt(paraula.length()-1);
$4 ==> 'a'


//La penúltima lletra de la paraula
jshell> paraula.charAt(paraula.length()-2);
$5 ==> 'l'



//La paraula amb totes les lletres en majúscules
jshell> paraula.toUpperCase();
$6 ==> "PARAULA"



//Una coposició formada per la darrera lletra de la paraula, seguida de les tres primeres. (ex. si la paraula és «Nekane» mostrarà «eNek»)
System.out.print((paraula.charAt(paraula.length()-1)+paraula.charAt(0)+paraula.charAt(1)+paraula.charAt(2)));

		System.out.print(palabra.charAt(palabra.length()-1));
		System.out.print(palabra.charAt(0));
		System.out.print(palabra.charAt(1));
		System.out.print(palabra.charAt(2));
		System.out.println("");


/* admito que no es la forma más elegante, pero me he ceñido estrictamente a lo que nos pedías, el código funciona: 
En aquest exercici et toca revisar la documentació oficial.

Considera que disposes d’una referència a String anomenada paraula que conté una paraula amb un mínim de quatre lletres.

Proposa un codi que mostri:
*/


//Una composició formada per la primera lletra de la paraula en majúscules, seguida de les següents tres lletres en minúscules. Per exemple, si la paraula és «aIbIcId», resultatà en «Aibi».


	System.out.print(palabra.toUpperCase().charAt(0));
	System.out.print(palabra.toLowerCase().charAt(1));
	System.out.print(palabra.toLowerCase().charAt(2));	
	System.out.print(palabra.toLowerCase().charAt(3));


    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Caràcter?");
    String texto = Entrada.readLine(); 

if (!texto.isEmpty()){

	System.out.println("Character.getName(\'"+texto.charAt(0)+"\'): "+Character.getName(texto.charAt(0)));
	// nom del caràcter
		
	System.out.println("Character.isDigit('"+texto.charAt(0)+"\'): "+Character.isDigit(texto.charAt(0)));
	// boolean que indica si és o no un dígit

	System.out.println("Character.isJavaIdentifierStart(\'"+texto.charAt(0)+"\'): "+Character.isJavaIdentifierStart(texto.charAt(0)));
	// boolean que indica si pot ser o no l’inici d’un identificador vàlid per Java

	System.out.println("Character.isJavaIdentifierPart(\'"+texto.charAt(0)+"\'): "+Character.isJavaIdentifierPart(texto.charAt(0)));
	// boolean que indica si pot ser o no part d’un identificador vàlid de Java (sense considerar el caràcter inicial)

	System.out.println("Character.isLetter(\'"+texto.charAt(0)+"\'): "+Character.isLetter(texto.charAt(0)));
	// boolean que indica si correspon o no a una lletra

	System.out.println("Character.isLowerCase(\'"+texto.charAt(0)+"\'): "+Character.isLowerCase(texto.charAt(0)));
	// boolean que indica si està o no en minúscules

	System.out.println("Character.isUpperCase(\'"+texto.charAt(0)+"\'): "+Character.isUpperCase(texto.charAt(0)));
	// boolean que indica si està o no en majúscules

	System.out.println("Character.isWhitespace(\'"+texto.charAt(0)+"\'): "+Character.isWhitespace(texto.charAt(0)));
	// boolean que indica si correspon o no amb un espai blanc

	System.out.println("Character.toLowerCase(\'"+texto.charAt(0)+"\'): "+Character.toLowerCase(texto.charAt(0)));
	// retorna la versió del caràcter com a minúscules

	System.out.println("Character.toUpperCase(\'"+texto.charAt(0)+"\'): "+Character.toUpperCase(texto.charAt(0)));
	// retorna la versió del caràcter com a majúscules

} else {
	System.out.println("Caràcter buit");
}
     



}
}