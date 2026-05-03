package rpg_java;

public class LogicaCombate {
    public static void main(String[] args) {
        double vida = 25.0;
        double vidaMax = 100.0;
        String estado;

        double pct = (vida / vidaMax) * 100;
        if (pct <= 0) {
            estado = "MUERTO";
        } else if (pct <= 25) {
            estado = "CRITICO";
        } else if (pct <= 50) {
            estado = "HERIDO";
        } else if (pct <= 75) {
            estado = "ESTABLE";
        } else {
            estado = "SALUDABLE";
        }
        System.out.println("Estado: " + estado); 
        int vidaEnemigo = 40;
        int ataque = 35;
        int nivelJugador = 6;
        
        int bonificacion = (nivelJugador >= 5) ? 10 : 0;
        int danoTotal = ataque + bonificacion;
        int vidaRestante = vidaEnemigo - danoTotal; 
        if (vidaRestante <= 0) {
            System.out.println("Enemigo derrotado! +50 XP");
        } else if (vidaRestante <= 20) {
            System.out.println("Enemigo en estado critico");
        } else {
            System.out.println("Enemigo resiste. Vida restante: " + vidaRestante);
        }
    }
}