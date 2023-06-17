public class Botiga {
    private static final int DEFAULT_MAX_VINS = 10;
    
    private Vi[] vins;
    private int maxVins;
    private int numVins;
    
    public Botiga() {
        this(DEFAULT_MAX_VINS);
    }
    
    public Botiga(int maxVins) {
        if (maxVins < 1) {
            throw new IllegalArgumentException("El número máximo de vinos debe ser igual o mayor que 1.");
        }
        
        this.maxVins = maxVins;
        this.vins = new Vi[maxVins];
        this.numVins = 0;
    }
    
    public Vi afegeix(Vi vi) {
        if (vi == null) {
            return null;
        }
        
        String nomNormalitzat = normalitzaNom(vi.getNombre());
        
        if (trobaVi(nomNormalitzat) != null) {
            return null; // Ya existe un vino con el mismo nombre
        }
        
        if (numVins >= maxVins) {
            return null; // No hay espacio disponible para agregar más vinos
        }
        
        vins[numVins] = vi;
        numVins++;
        
        return vi;
    }
    
    public Vi cerca(String nom) {
        String nomNormalitzat = normalitzaNom(nom);
        
        for (int i = 0; i < numVins; i++) {
            if (vins[i].getNombre().equals(nomNormalitzat)) {
                return vins[i];
            }
        }
        
        return null; // No se encontró el vino con el nombre especificado
    }
    
    public Vi elimina(String nom) {
        String nomNormalitzat = normalitzaNom(nom);
        
        for (int i = 0; i < numVins; i++) {
            if (vins[i].getNombre().equals(nomNormalitzat)) {
                if (vins[i].getStock() > 0) {
                    return null; // El vino aún tiene stock, no se puede eliminar
                }
                
                Vi vinoEliminado = vins[i];
                vins[i] = null;
                compactarArrayVins();
                numVins--;
                
                return vinoEliminado;
            }
        }
        
        return null; // No se encontró el vino con el nombre especificado
    }
    
    private void compactarArrayVins() {
        int indiceDestino = 0;
        
        for (int i = 0; i < numVins; i++) {
            if (vins[i] != null) {
                vins[indiceDestino] = vins[i];
                indiceDestino++;
            }
        }
        
        for (int i = indiceDestino; i < numVins; i++) {
            vins[i] = null;
        }
    }
    
    private String normalitzaNom(String nom) {
        // Eliminar espacios al principio y al final del nombre
        nom = nom.trim();
        
        // Eliminar espacios extra dentro del nombre
        nom = nom.replaceAll("\\s+", " ");
        
        return nom;
    }
    
    private Vi trobaVi(String nom) {
        for (int i = 0; i < numVins; i++) {
            if (vins[i].getNombre().equals(nom)) {
                return vins[i];
            }
        }
        
        return null;
    }
}
