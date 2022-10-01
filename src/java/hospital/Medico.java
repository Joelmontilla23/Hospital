
package hospital;

public class Medico extends Persona{
    private String capacidadPacientes;

    public Medico(String nombre, String apellido, String sexo, String capacidadPacientes) {
        super(nombre, apellido, sexo);
        this.capacidadPacientes = capacidadPacientes;
    }
    
     
}
