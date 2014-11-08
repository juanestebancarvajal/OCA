/*
*
* Topic - Strings
*	Questions
* 	- How it works the contatenation in terms of memory used
* 	- Wich is the default capacity of the StringBuilder Class (Important) - amount of characters
* 	- StringBuilder vs Stringbuffer
* 	- Cuando Java concatena una linea lo pasa a StringBuilder si son mas lineas no lo pasa a StringBuilder
* 	- 2 StringBuilder no son iguales asi tengan el mismo literal
*   - El Paquete Java Lang
*   - Operadores relaciones (<,<=,>,=>,)
*	- Operaciones condicionales (&&,||,!)
*	- Switch (int,char, short, byte, String) Don´t repeat a case, a final variables can be used in a case statement
*   - The String object are inmutable, if you operate over a String object Java separates a new position of memory for the result of the operation
*   
*/
public class Stringtest{

	String str1 = new String("String1"); //This two variables are located in different memory positions
	String str2 = new String("String1");


	public static void main(String args[]){
		System.out.println("Hola Mundo");
	}



}
