package hospital;

public class Paciente extends Persona {

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the lugAtend
     */
    public String getLugAtend() {
        return lugAtend;
    }

    /**
     * @param lugAtend the lugAtend to set
     */
    public void setLugAtend(String lugAtend) {
        this.lugAtend = lugAtend;
    }

    /**
     * @return the medAtend
     */
    public String getMedAtend() {
        return medAtend;
    }

    /**
     * @param medAtend the medAtend to set
     */
    public void setMedAtend(String medAtend) {
        this.medAtend = medAtend;
    }

    /**
     * @return the razonAsistencia
     */
    public String getRazonAsistencia() {
        return razonAsistencia;
    }

    /**
     * @param razonAsistencia the razonAsistencia to set
     */
    public void setRazonAsistencia(String razonAsistencia) {
        this.razonAsistencia = razonAsistencia;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    private String codigo; 
    private String direccion;
    private String lugAtend;
    private String medAtend;
    private String razonAsistencia;
    private String fecha;

    public Paciente(String nombre, String apellido, String sexo, String codigo, String direccion, String lugAtend, String medAtend, String razonAsistencia, String fecha) {
        super(nombre, apellido, sexo);
        this.codigo = codigo;
        this.direccion = direccion;
        this.lugAtend = lugAtend;
        this.medAtend = medAtend;
        this.razonAsistencia = razonAsistencia;
        this.fecha = fecha;
    }
    
    

}
