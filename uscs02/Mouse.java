package uscs02;

public class Mouse {
    private String numSerie;
    protected String fabricante;
    public String cor;
    
    public Mouse() {
    }
    
    public Mouse(String numSerie, String fabricante, String cor){
        this.numSerie = numSerie;
        this.fabricante = fabricante;
        this.cor = cor;
    }
    
    public void ImprimeMouse() {
        System.out.println("----------------- Mouse ------------------");
        System.out.println("Número de série - mouse: "+this.numSerie);
        System.out.println("Fabricante - mouse: "+this.fabricante);
        System.out.println("Cor mouse: "+this.cor);
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
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    @Override
        public String toString() {
            return "Informações do Mouse\nNúmero de serie: " + numSerie + "\nFabricante: " +
            fabricante + "\nCor: " + cor + "\n";
        }
}
