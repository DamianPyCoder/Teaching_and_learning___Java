public class Vi {
    private String Nom;
    private float precio;
    private int stock;
    
    public Vi(String Nom, float precio, int stock) {
        setNom(Nom);
        setPrecio(precio);
        setStock(stock);
    }
    
    public String getNom() {
        return Nom;
    }
    
    public void setNom(String Nom) {
        this.Nom = normalitzaNom(Nom);
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        if (esValid(precio)) {
            this.precio = precio;
        }
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        if (esValid(stock)) {
            this.stock = stock;
        }
    }
    
    private String normalitzaNom(String Nom) {
        // Eliminar espacios al principio y al final del Nom
        Nom = Nom.trim();
        
        // Eliminar espacios extra dentro del Nom
        Nom = Nom.replaceAll("\\s+", " ");
        
        return Nom;
    }
    
    private boolean esValid(float num) {
        return num >= 0;
    }
    
    private boolean esValid(int num) {
        return num >= 0;
    }
}
