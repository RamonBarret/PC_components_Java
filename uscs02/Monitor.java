package uscs02;

public class Monitor {
    private String numSerie;
    protected String fabricante;
    public String cor;
    
    public Monitor() {
    }
    
    public Monitor(String numSerie, String fabricante, String cor) {
        this.numSerie = numSerie;
        this.fabricante = fabricante;
        this.cor = cor;
    }
    
    public void ImprimeMonitor() {
        System.out.println("------------- Teclado -------------");
        System.out.println("Número de série - Monitor: "+this.numSerie);
        System.out.println("Fabricante - Monitor: "+this.fabricante);
        System.out.println("Cor - Monitor: "+this.cor);
    }
    
    public String getNumSerie() {
        return numSerie;
    }
    
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }
    
    public String getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
        public String toString() {
            return "Informações do Monitor\nNúmero de serie: " + numSerie + "\nFabricante: " +
            fabricante + "\nCor: " + cor + "\n";
        }
}
