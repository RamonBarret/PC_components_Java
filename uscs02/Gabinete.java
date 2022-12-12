package uscs02;

public class Gabinete {
    private String numSerie;
    protected String fabricante;
    public String cor;
    
    public Gabinete() {
    }
    
    public Gabinete(String numSerie, String fabricante, String cor) {
        this.numSerie = numSerie;
        this.fabricante = fabricante;
        this.cor = cor;
    }
    
    public void ImprimeGabinete() {
        System.out.println("------------------- Gabinete -------------------");
        System.out.println("Número de série - gabinete: "+this.numSerie);
        System.out.println("Fabricante - gabinete: "+this.fabricante);
        System.out.println("Cor - gabinete: "+this.cor);
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
    
    public void SetFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void SetCor(String cor) {
        this.cor = cor;
    }
    
    @Override
        public String toString() {
            return "Informações do Gabinete\nNúmero de serie: " + numSerie + "\nFabricante: " +
            fabricante + "\nCor: " + cor + "\n";
        }
}
