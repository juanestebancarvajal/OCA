/*
*
* Topic - Switch Sentence
*	Questions
*	- Switch (int,char, short, byte, String) Don´t repeat a case, a final variables can be used in a case statement
*   - Las variables locales no se inicializan por defecto -- OJO
* 	- The variables of the case statements are locals to the switch statements
*   - You need to initialize the variables of the switch
*   - Watchout with the promotion of variables (Make a test)  
- Los datos de los cases no se promocionan se intenan convetir al tipo del tipo que se esta evaluando
- no se puede colocar un continue a un switch 
- Los literales son enteros
- Modificadores de acceso menos restrictivos o igual si vamos a sobreescribir (public - protectected - default - private)
*/
public class Switchtest{


	public static void declareSwitch(){
		int a = 1;
		long b = 2;

		switch (a/*+ b*/){ //The result is a long type
			case 0:
				System.out.println("Estamos en 0");
				break; //if the break sentence is not declared then the program execute the rest of the case cases.
			case 1:
				System.out.println("Estamos en 1");
				break;
			case 2:
				System.out.println("Estamos en 2");
				break;
		}
	}


	public static void main(String args[]){
		System.out.println("Hola Switch");
		declareSwitch();
	}



}
