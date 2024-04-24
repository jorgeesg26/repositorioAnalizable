public class TresOMás {

    public static void main(String[] args) {
        System.out.println("TRES O MÁS");

        // Bucle para las 10 rondas
        for (int ronda = 1; ronda <= 10; ronda++) {
            int puntosJugador1 = 0;
            int puntosJugador2 = 0;

            // Tiros del jugador 1
            tirarYSumarPuntos("Jugador 1", ronda, puntosJugador1);

            // Tiros del jugador 2
            tirarYSumarPuntos("Jugador 2", ronda, puntosJugador2);

            // Mostrar resultados de la ronda
            System.out.println("Fin de ronda " + ronda + ". Jugador 1 - " + puntosJugador1 +
                    "; Jugador 2 - " + puntosJugador2);
        }

        // Mostrar ganador final
        int puntosTotalJugador1 = mostrarGanador(puntosJugador1Total);
        int puntosTotalJugador2 = mostrarGanador(puntosJugador2Total);
    }

    private static void tirarYSumarPuntos(String jugador, int ronda, int puntosJugador) {
        int[] tirada = new int[5];
        boolean tiradaExtra = false;

        for (int i = 0; i < tirada.length; i++) {
            tirada[i] = (int) (Math.random() * 6) + 1;
        }

        System.out.print("Tirada " + ronda + " de " + jugador + ": ");
        for (int i = 0; i < tirada.length; i++) {
            System.out.print(tirada[i] + (i < tirada.length - 1 ? "-" : ""));
        }

        puntosJugador += contarPuntosTirada(tirada);

        // Si hay 2 pares, tirada extra
        if (hayDosPares(tirada)) {
            tiradaExtra = true;
            System.out.print("; Tirada Extra");

            while (tiradaExtra) {
                tirada = new int[5];
                for (int i = 0; i < tirada.length; i++) {
                    tirada[i] = (int) (Math.random() * 6) + 1;
                }

                System.out.print("\nTirada Extra: ");
                for (int i = 0; i < tirada.length; i++) {
                    System.out.print(tirada[i] + (i < tirada.length - 1 ? "-" : ""));
                }

                puntosJugador += contarPuntosTirada(tirada);

                tiradaExtra = hayDosPares(tirada);
                if (tiradaExtra) {
                    System.out.print("; Tirada Extra");
                }
            }
        }

        System.out.println("\n" + jugador + " consigue " + puntosJugador + " puntos.");
    }

    private static int contarPuntosTirada(int[] tirada) {
        int puntos = 0;
        int[] contadorNumeros = new int[6];

        for (int numero : tirada) {
            contadorNumeros[numero - 1]++;
        }

        for (int i = 0; i < contadorNumeros.length; i++) {
            if (contadorNumeros[i] == 3) {
                puntos += 3;
            } else if (contadorNumeros[i] == 4) {
                puntos += 6;
            } else if (contadorNumeros[i] == 5) {
                puntos += 12;
            }
        }

        return puntos;
    }

    private static boolean hayDosPares(int[] tirada) {
        int pares = 0;
        int[] contadorNumeros = new int[6];

        for (int numero : tirada) {
            contadorNumeros[numero - 1]++;
        }

        for (int i = 0; i < contadorNumeros.length; i++) {
            if (contadorNumeros[i] == 2) {
                pares++;
            }
        }

        return pares == 2;
    }

    private static int mostrarGanador(int puntosJugador) {
        System.out.println("\n" + puntosJugador + " puntos");

        if (puntosJugador1Total > puntosJugador2Total) {
            System.out.println("¡Gana el jugador 1!");
            return puntosJugador1Total;
        }

