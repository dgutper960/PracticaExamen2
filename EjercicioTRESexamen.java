public class EjercicioTRESexamen {

    /**
     * Calcula el primer y último número primo entre dos números dados (inclusives).
     *
     * Ej: a = 20, b = 30 → primerPrimo = 23, ultimoPrimo = 29
     * Ej: a = 17, b = 29 → primerPrimo = 17, ultimoPrimo = 29
     */
        public static void main(String[] args) {
            int a = 2, b = 100;
            int primerPrimo = 0, ultimoPrimo = 0;

            for (int i = a; i <= b; i++) {
                if (primerPrimo == 0 && Primos.esPrimo(i)) {
                    primerPrimo = i;
                    ultimoPrimo = i; // El primer primo también es el último mientras no haya otro superior
                } else if (Primos.esPrimo(i)) {
                    ultimoPrimo = i;
                }
            }

            // si el primerPrimo no se ha obtenido, entonces el ultimoPrimo tampoco
            if (primerPrimo == 0)
                System.out.println("No existen primos entre ambos números");
            else
                System.out.println("El primer primo es " + primerPrimo + " y el último " + ultimoPrimo);
        }
    }
}
