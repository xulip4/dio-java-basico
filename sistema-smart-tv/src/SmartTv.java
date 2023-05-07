/**
 * SmartTv
 */
public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void mostrarStatus() {
        
        if (ligada) {

            System.out.println("A TV está ligada.");
            System.out.println("O Canal é " + canal + " e o volume está em " + volume + ".");
        } else {

            System.out.println("A TV está desligada.");
        }
    }

    public void ligarDesligar() {

        ligada = !ligada;
        mostrarStatus();

    }

    public void aumentarVolume() {

        if(volume < 100) {
            volume++;
            mostrarStatus();
        } else {
            System.out.println("O volume está no máximo.");
        }

    }

    public void diminuirVolume() {

        if(volume > 0) {
            volume--;
            mostrarStatus();
        } else {
            System.out.println("O volume já está mudo.");
        }

    }

    public void trocarCanal(int novoCanal) {

        if (novoCanal > 0 
            && novoCanal <= 999) {
            canal = novoCanal;
            mostrarStatus();
        } else {
            System.out.println("Canal inválido.");
        }

    }

    public void subirCanal() {
        
        canal++;
        mostrarStatus();

    }

    public void descerCanal() {
        
        if(canal > 1) {
            canal--;
            mostrarStatus();
        } else {
            System.out.println("Menor canal atingido.");
        }
    }
}
