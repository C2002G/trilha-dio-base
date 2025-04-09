public class SmarTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("aumentar canal: "+ canal);
    }
    public void dimminuiCanal(){
        canal--;
        System.out.println("diminuir canal: "+ canal);
    }


    public void aumentarVolume(){
        // volume = volume + 1;
        // ou
        volume++;
        System.out.println("aumentar volume: "+ volume);
    }
    
    public void dimminuiVolume(){
        
        volume--;
        System.out.println("Diminuivolume: " + volume);
    }

    void ligar(){
        ligada = true;
    }

    
    void desligar(){
        ligada = false;
    }
}
