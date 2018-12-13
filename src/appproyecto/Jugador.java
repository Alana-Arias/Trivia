
package appproyecto;

public class Jugador {
    private String nombre;
    private int puntuaje;

    public Jugador(String nombre, int puntuaje) {
        this.nombre = nombre;
        this.puntuaje = puntuaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuaje() {
        return puntuaje;
    }

    public void setPuntuaje(int puntuaje) {
        this.puntuaje = puntuaje;
    }
    
    public String toString(){
            String hilera= this.nombre + "\t" + this.puntuaje + "\n";
            return hilera;
    }

    
}
