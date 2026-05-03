package rpg_java;

public class SubirNivel {
    public static void main(String[] args) {
        int xp = 0;
        int nivel = 1;
        int xpNecesario = 100;
        int[] batallas = {20, 35, 15, 40, 30};
        for (int xpGanado : batallas) { 
            xp += xpGanado;
            if (xp >= xpNecesario) { 
                nivel++;
                xp -= xpNecesario;
                System.out.println("¡Subiste de nivel! Ahora eres Nivel " + nivel);
            }
        }
    }
}