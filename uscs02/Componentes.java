package uscs02;

public class Componentes {

    public static void main(String[] args) {
        Teclado t = new Teclado();
        t.setNumSerie("1232");
        t.setFabricante("Logitech");
        t.setCor("Preto");
        
        Mouse m = new Mouse("HGY6654", "Microsoft", "Preto");
        
        Monitor mon = new Monitor("AFB876", "Samsung", "Preto");
        
        Gabinete g = new Gabinete("4587HHY", "Logitech", "Preto");
        Computador cp = new Computador("76TRDE35", t, m, mon, g);
        cp.ImprimeComputador();
    }
        
}