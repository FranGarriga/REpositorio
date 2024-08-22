
public class Main {
    public static void main(String[] args) {
        Juego partida1 = new Juego( 5);
        System.out.println("Partida 1:");
        partida1.MuestraVidasRestantes();
//Resta de vidas y printeo;
        partida1.Vidas--;
        partida1.MuestraVidasRestantes();
//Creación de nueva partida y printeo de ambas;
        Juego partida2 = new Juego(5);
        System.out.println("Partida 1 vidas finales:");
        partida1.MuestraVidasRestantes();
        System.out.println("Partida 2 vidas finales:");
        partida2.MuestraVidasRestantes();







    }
}