import java.util.Scanner;

public class ejercicio{

public static void profesor(){
    System.out.println("la funcion del docente es enseñar");
}
public void maquinPC(){
System.out.println(" la funcion es procesar informacion");
}
public static void estudiante() {
System.out.println(" la funcion del estudiante  es aprender");
}
public void proyector() {
    System.out.println("la funcion es proyectar");

}
public static void main(String[] args) {
    ejercicio objx=new ejercicio();
     
    Scanner lt=new Scanner(System.in);
    System.out.println(" ingrese  el algoritmo que se desea  probar \n1=profesor"+
    "\n2=estudiante\n3=maquina\n4=proyector");
    int opcmet=lt.nextInt();
    switch (opcmet) {
        case 1:{profesor(); }break;
        case 2: estudiante (); break ;
        case 3: objx.maquinPC(); break;
        case 4: objx.proyector(); break;

        default: System.err.println("opcion no existe"); break; 

     

    }

}
}