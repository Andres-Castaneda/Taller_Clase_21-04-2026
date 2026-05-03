package Java_Andres_Castañeda;

public class CombateRondas {
    public static void main(String[] args) {
        int vidaHero = 80;
        int vidaEnemigo = 60;
        int ronda = 1;
        while (vidaHero > 0 && vidaEnemigo > 0) {
            int danoHeroe = 15;
            vidaEnemigo -= danoHeroe;
            int danoEnemigo = 10;
            vidaHero -= danoEnemigo;
            System.out.println("Ronda " + ronda + ": Hero=" + vidaHero + " | Enemigo=" + vidaEnemigo);
            ronda++;
        }
        System.out.println(vidaHero > 0 ? "VICTORIA!" : "DERROTA");
    }
}