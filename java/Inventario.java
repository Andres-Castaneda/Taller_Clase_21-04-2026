package rpg_java;
import java.util.ArrayList;

public class Inventario {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();
        inventario.add("Espada de hierro");
        inventario.add("Pocion de vida");
        inventario.add("Escudo de madera");
        inventario.add("Llave dorada");

        System.out.println("=== INVENTARIO ===");
        for (String item : inventario) {
            System.out.println("- " + item);
        }
        String buscar = "Pocion de vida";
        if (inventario.contains(buscar)) {
            System.out.println("\n[OK] " + buscar + " encontrada en la mochila.");
        } else {
            System.out.println("\n[X] " + buscar + " no disponible.");
        }
    }
}