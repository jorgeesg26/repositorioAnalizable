public class TokiPakala {

  public static void main(String[] args) {
    /*
     * ->Este programa se llama Toki Pakala, que es un generador de textos escritos que
     *   imita a la lengua inventada Toki Pona.
     * ->Nuestro generador de textos se encarga de escribir textos de manera aleatoria
     *   siguiendo las reglas básicas del lenguaje.
     */
    int numeroDeFrases, numeroPalabras, númeroSílabas;
    int vocal, consonante, posibilidadVocalConsonante;
    int numeroParrafos = (int) (Math.random() * 21) + 1;
    /*
     * ->Lo primero que hacemos es definir nuestras variables fuera del código principal
     *
     * ->Tras esto, aleatorizamos el numero de párrafos que tendrá nuestro documento,
     *   que será un valor entre 1 y 21.
     */
    for (int documento = 1; documento <= numeroParrafos; documento++) {
      //->Nos metemos un bucle que creará el número de párrafos que le hayamos dicho.
      numeroDeFrases = (int) (Math.random() * 12) + 1;
      /*
       * ->Ahora, aleatorizamos el número de frases que contendrá cada párrafo,
       *   lo cual genera un valor entre 1 y 12.
       */
      for (int parrafo = 1; parrafo <= numeroDeFrases; parrafo++) {
        //Nos metemos dentro de otro bucle que escribirá el número de frases generado.
        numeroPalabras = (int) (Math.random() * 53) + 1;
        /*
         * ->Es un proceso bastante repetitivo.
         * ->El siguiente número aleatorizado es el del número de palabras que
         *   tendrá cada frase, siendo un valor entre 1 y 53.
         */
        for (int frase = 1; frase <= numeroPalabras; frase++) {
          /*
           * ->Una vez dentro del bucle que genera el número de palabras,
           *   tenemos que generar un número de sílabas para cada palabra.
           * ->Según el lenguaje Toki Pona, una palabra tendrá entre 1 o 6 sílabas.
           */
          númeroSílabas = (int) (Math.random() * 6) + 1;
          for (int palabra = 1; palabra <= númeroSílabas; palabra++) {
            /*
             * ->Cada sílaba puede estar formada por una vocal o por una
             *   consonante seguida de una vocal.
             * ->La posibilidad de cada evento es de 1/8 o 7/8, respectivamente.
             */
            posibilidadVocalConsonante = (int) (Math.random() * 8) + 1;
            vocal = (int) (Math.random() * 5) + 1;
            consonante = (int) (Math.random() * 9) + 1;
            /*
             * ->Como también hay que aleatorizar las letras que se escriben,
             *   en unas funciones más abajo que tenemos un switch que, según
             *   un valor aleatorio, escriben la letra indicada.
             * ->Para calcular las posibilidades de las sílabas, hemos generado
             *   un número aleatorio entre 1 y 8: si sale el 1 (podría haber sido
             *   otro valor, todos tienen la misma posibilidad de salir) se escribe
             *   una vocal, sino, una consonante vocal.
             */
            if (posibilidadVocalConsonante == 1) {
              System.out.print(convertirVocalToki(vocal));
            } else {
              System.out.print(convertirConsonanteToki(consonante));
              System.out.print(convertirVocalToki(vocal));
            }
          }
          /*
           * ->Esto es una forma de controlar si es el final de la frase.
           * ->Si es la última iteración, escribe un punto en lugar de un espacio.
           */
          if (frase == numeroPalabras) {
            System.out.print(".");
          } else {
            System.out.print(" ");
          }
        }
        //Igual que arriba, pero controlamos que al final de cada párrafo haya dos
        //líneas de separación.
        if (parrafo == numeroDeFrases) {
          System.out.println("");
          System.out.println("");
          System.out.println("");
        } else {
          System.out.print(" ");
        }
      }
    }
  }

  //Las funciones que transforman las variables "vocal" y "consonante" en caracteres.
  public static String convertirVocalToki(int vocal) {
    switch (vocal) {
      case 1:
        return "a";
      case 2:
        return "e";
      case 3:
        return "i";
      case 4:
        return "o";
      case 5:
        return "u";
    }
    return "";
  }

  public static String convertirConsonanteToki(int consonante) {
    switch (consonante) {
      case 1:
        return "p";
      case 2:
        return "t";
      case 3:
        return "k";
      case 4:
        return "s";
      case 5:
        return "m";
      case 6:
        return "n";
      case 7:
        return "l";
      case 8:
        return "j";
      case 9:
        return "w";
    }
    return "";
  }
}
