import java.util.Scanner;

public class PersonajeBase {
    String nombre = "Aragorn";
    int nivel = 1;
    double vida = 100.0;
    double vidaMaxima = 100.0;
    boolean estaVivo = true;
    String clase = "Guerrero";
    int puntosAtaque = 15;
    int puntosDefensa = 10;

    public static void main(String[] args) {
        PersonajeBase p = new PersonajeBase();
        System.out.println(p.nombre);
        System.out.println(p.nivel);
        System.out.println(p.vida);
    }

    int ataque = 15;
    double dano = (double) ataque * 1.5; // cast
    String msg = "Dano: " + dano;      // auto
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Nombre: ");
    String nom = sc.nextLine();
    System.out.print("Nivel: ");
    int niv = sc.nextInt();
    System.out.println(nom + " Nv." + niv);
}