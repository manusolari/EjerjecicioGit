
package ejerjeciciogit;


public class Escuela {
    private String nombre;
    private int numero;
    private String especialidad;

    public Escuela(String nombre, int numero, String especialidad) {
        this.nombre = nombre;
        this.numero = numero;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
