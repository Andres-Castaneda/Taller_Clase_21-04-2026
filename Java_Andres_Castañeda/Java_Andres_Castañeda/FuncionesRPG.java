package Java_Andres_Castañeda;

public class FuncionesRPG {
    public static int calcularDano(int ataque, int defensa) {
        int dano = ataque - defensa;
        return dano > 0 ? dano : 1;
    }
    public static double aplicarCuracion(double vida, double cur, double max) {
        double nueva = vida + cur;
        return nueva > max ? max : nueva;
    }
    public static void mostrarEstado(String n, double vida, int niv) {
        System.out.printf("%s [Nv%d] HP: %.0f%n", n, niv, vida);
    }
    public static int subirNivel(int xpActual, int xpNecesario, int nivelActual) {
        if (xpActual >= xpNecesario) {
            nivelActual++;
            System.out.println("¡Nivel " + nivelActual + " alcanzado!");
            return nivelActual;
        }
        return nivelActual;
    }
    public static void main(String[] args) {
        int d = calcularDano(20, 8);
        System.out.println("Dano calculado: " + d);

        double v = aplicarCuracion(40, 80, 100);
        mostrarEstado("Frodo", v, 1);
        int nuevoNivel = subirNivel(110, 100, 1);
        System.out.println("Nivel final: " + nuevoNivel);
    }
}