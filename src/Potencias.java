public class Potencias implements Runnable{


    private final int numero;


    public Potencias(int numero) {
        this.numero = numero;
    }


    @Override
    public void run() {

        for (int i = 1; i<= 10; i++){

            double potencia = Math.pow((double) numero,(double)i);

            System.out.println(Thread.currentThread().getName() + " " + numero + " ^ " + i + " = " + potencia);

        }

    }
}
