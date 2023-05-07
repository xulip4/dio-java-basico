public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        
        smartTv.mostrarStatus();

        smartTv.ligarDesligar();

        smartTv.trocarCanal(13);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.descerCanal();
        smartTv.descerCanal();

        smartTv.trocarCanal(2);

        smartTv.descerCanal();
        smartTv.descerCanal();
        smartTv.descerCanal();

        smartTv.trocarCanal(-12);
        smartTv.trocarCanal(0);

        smartTv.subirCanal();



    }
}
