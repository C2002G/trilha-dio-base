public class Usuario {
    public static void main(String[] args) throws Exception {

        SmarTv smartTv = new SmarTv();
        // ver dnv

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.dimminuiVolume();
        
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);;
        System.out.println("Canal atual: " + smartTv.canal);
        

        System.out.println("Volume atual : " + smartTv.volume);

        
        System.out.println("Está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("New State: TV Ligada " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("New State: TV Ligada " + smartTv.ligada);
    }
}
