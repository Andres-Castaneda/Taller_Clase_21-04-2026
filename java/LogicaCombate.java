<<<<<<< HEAD
package rpg_java;

public class LogicaCombate {
    public static void main(String[] args) {
=======
public class LogicaCombate {
    public static void main(String[] args) {
        
>>>>>>> ffe809b94dee399370cb32b1eb795a6cd39ab45f
        double vida = 25.0;
        double vidaMax = 100.0;
        String estado;

        double pct = (vida / vidaMax) * 100;
<<<<<<< HEAD
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
=======

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
        
        String clase = "Mago";
        int nivelHabilidad = 3;

        String tipoAtaque = switch (clase) {
        case "Guerrero" -> "Espada";
        case "Mago"     -> "Hechizo";
        case "Arquero"  -> "Flecha";
        default          -> "Puño";
        };

        // Condicion compuesta
        boolean puedeUsarMagia = clase.equals("Mago") && nivelHabilidad >= 3;

        if (puedeUsarMagia)
            System.out.println("Bola de fuego!");
        else 
            System.out.println(tipoAtaque + " basico");
        
        int bonificacion;
        int vida_enemigo = 40;
        int ataque = 35;
        int nivel_jugador = 6;
        if (nivel_jugador >=5)
            bonificacion = 10;
        else 
            bonificacion = 0;

        double dano_total = ataque + bonificacion;
        double vida_restante = vida_enemigo - dano_total;

        if (vida_restante <=0 )
            System.out.println("Enemigo derrotado! +50 XP");
        else if (vida_restante <= 20) 
            System.out.println("'Enemigo en estado critico");
        else 
            System.out.println("'Enemigo resiste. Vida restante = " + vida_enemigo);
    }
}

>>>>>>> ffe809b94dee399370cb32b1eb795a6cd39ab45f
