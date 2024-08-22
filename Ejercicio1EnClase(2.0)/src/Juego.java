public class Juego {
    private int Vidas;
    private int VidasIniciales;

    public Juego(int vidas) {

        this.VidasIniciales = vidas;
        this.Vidas = vidas;
    }

    public void MuestraVidasRestantes(){
        System.out.println("El numero de vidas restantes es " + Vidas);

    }

    public boolean QuitaVida() {
        Vidas--;
        return Vidas>0;
    }

    public void ReiniciaPartida(){
        Vidas = VidasIniciales;
    }


}
