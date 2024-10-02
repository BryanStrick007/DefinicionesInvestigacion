package dominio;

public class Investigacion {
    private String titulo;
    private String descripcion;
    private String referencia;
    private String foto; 
 
    public Investigacion(String titulo, String descripcion, String referencia, String foto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.referencia = referencia;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
