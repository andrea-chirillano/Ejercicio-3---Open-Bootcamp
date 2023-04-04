public class App {
    public static void main(String[] args) throws Exception {
        int suma = sumar(1, 2, 3);
        System.out.println("El resultado es: " + suma);
    }

    public static int sumar(int primerValor, int segundoValor, int tercerValor) {
        return primerValor + segundoValor + tercerValor;
    }
    
}