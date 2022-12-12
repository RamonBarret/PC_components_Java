package uscs02;

public class Teclado {
    private String numSerie;
    protected String fabricante;
    public String cor;
    
    public Teclado() {
    }
    
    public Teclado (String numSerie, String fabricante, String cor) {
        this.numSerie = numSerie;
        this.fabricante = fabricante;
        this.cor = cor;
    }
    
    
    public void ImprimeTeclado() {
        System.out.println("------------- Teclado -------------");
        System.out.println("Número de série - teclado: "+this.numSerie);
        System.out.println("Fabricante - teclado: "+this.fabricante);
        System.out.println("Cor - teclado: "+this.cor);
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
            return "Informações do Teclado\nNúmero de serie: " + numSerie + "\nFabricante: " +
            fabricante + "\nCor: " + cor + "\n";
        }
}
