public class EjercicioDOSexamen {

        final static int anyoActual = 2022;
        final static int anyoFinalSiglo = 2098;

        public static void main(String[] args) {
            int oportunidades = 0;
            for (int i = anyoActual; i <= anyoFinalSiglo; i = i + 4) {
                oportunidades++;
            }
            System.out.println("Oportunidades: " + oportunidades);
        }
    }
