package uscs02;

public class Computador {
    private String numSerie;
    public Teclado teclado;
    public Mouse mouse;
    public Monitor monitor;
    public Gabinete gabinete;
    
    public Computador() {
    }
    
    public Computador(String numSerie, Teclado teclado, Mouse mouse, Monitor monitor, Gabinete gabinete) {
        this.numSerie = numSerie;
        this.teclado = teclado;
        this.mouse = mouse;
        this.monitor = monitor;
        this.gabinete = gabinete;
    }
    
    public void ImprimeComputador() {
        System.out.println("\n------------------- Computador -------------------");
        System.out.println("Número de série - pc: "+ getNumSerie() +"\n");
        System.out.println("Teclado - pc: "+ getTeclado());
        System.out.println("Mouse - pc: "+ getMouse());
        System.out.println("Monitor - pc: "+ getMonitor());
        System.out.println("Gabinete - pc: "+ getGabinete());
        System.out.println("--------------------------------------------------------------------");
    }
    
    public String getNumSerie() {
        return this.numSerie;
    }
    
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }
    
    public Teclado getTeclado() {
        return this.teclado;
    }
    
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    
    public Mouse getMouse() {
        return this.mouse;
    }
    
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    
    public Monitor getMonitor() {
        return this.monitor;
    }
    
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    public Gabinete getGabinete() {
        return this.gabinete;
    }
    
    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }
}
