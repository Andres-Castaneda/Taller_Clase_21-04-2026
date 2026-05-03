package Java_Andres_Castañeda;

public class SimuladorRPG {
    
    public static double Combatir(PersonajeBase Personaje, double vidaEnemigo, double ataqueEnemigo) {
        int ronda = 1;
        

        while (Personaje.vida > 0 && vidaEnemigo > 0) {
            vidaEnemigo -= Personaje.puntosAtaque;
            if (vidaEnemigo > 0) {
                Personaje.vida -= ataqueEnemigo;
            }
            System.out.println("Ronda " + ronda + ": Hero=" + Personaje.vida + " | Enemigo=" + vidaEnemigo);
            if (vidaEnemigo <= 0){
                System.out.println("Enemigo DERROTADO +20 de vida\n");
                Personaje.vida += 20;
            } else if (Personaje.vida <= 0){
                System.out.println("El personaje fue DERROTADO\n ----------GAME OVER---------");
            }
            ronda++;
        }
        return vidaEnemigo;
    }

    public static int Pelea() {
        PersonajeBase Personaje = new PersonajeBase();
        int Derrotados = 0;

        Object[][] enemigos = {
            {"Goblin", 40, 8},
            {"Orco", 70, 14},
            {"Dragon", 120, 25}
        };

        for(int i = 0; i < enemigos.length; i++){
            int vida      = (int) enemigos[i][1];
            int daño      = (int) enemigos[i][2];
            double Batalla = Combatir(Personaje, vida, daño);
            if(Personaje.vida <= 0)
                break;
            if(Batalla <= 0) {
                Derrotados++;
            }
            System.out.println("Enemigos derrotados de momento: " + Derrotados);

        }
       
        return 0;
    }

    public static void main(String[] args) {
        Pelea();
    }
}