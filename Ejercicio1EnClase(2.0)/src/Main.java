
public class Main {
    public static void main(String[] args) {
        Juego partida1 = new Juego( 5);
        if(partida1.QuitaVida()){
            System.out.println("Moriste");
            partida1.MuestraVidasRestantes();

        }else{
            System.out.println("Partida 1 terminada");
        }
    }
}