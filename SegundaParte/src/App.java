public class App {
    public static void main(String[] args) throws Exception {
        Coche.puertas = 2;
        var puertasNuevas = 2;
        var miCoche = Coche.totalPuertas(puertasNuevas);
        System.out.println("La cantidad de puertas que tenia el auto es: " + Coche.puertas);
        System.out.println("La cantidad de puertas agregadas es: " + puertasNuevas);
        System.out.println("El total de puertas es: " + miCoche);
    }
}
