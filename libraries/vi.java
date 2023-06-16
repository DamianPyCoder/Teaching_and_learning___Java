public class Vi {
    private String nombre;
    private float precio;
    private int stock;
    
    public Vi(String nombre, float precio, int stock) {
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = normalitzaNom(nombre);
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
    
    private String normalitzaNom(String nombre) {
        // Eliminar espacios al principio y al final del nombre
        nombre = nombre.trim();
        
        // Eliminar espacios extra dentro del nombre
        nombre = nombre.replaceAll("\\s+", " ");
        
        return nombre;
    }
    
    private boolean esValid(float num) {
        return num >= 0;
    }
    
    private boolean esValid(int num) {
        return num >= 0;
    }
}
