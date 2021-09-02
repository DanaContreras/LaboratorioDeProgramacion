
package trabajopractico1;

public abstract class PersonajeBuilder {
    
    // Constructor.
    
    protected Personaje personaje = new Personaje();
    
    public abstract void buildPoseeArma();
    
    public abstract void buildPoseePoderes();
    
    public abstract void buildNivel();
    
    public abstract void buildDescripcion();
}