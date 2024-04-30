
package cl.duoc.evaluacion3.DTO;


public class MovieDTO {

    private int IdMovie;
    private int Anio;
    private String Titulo;
    private String Director;
    private String Genero;
    private int Duracion;

    public MovieDTO(String Titulo, String Director, String Genero, int IdMovie , int anio, int Duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Genero = Genero;
        this.IdMovie = IdMovie;
        this.Anio = anio;
        this.Duracion = Duracion;
    }
    public MovieDTO() {
        this.Titulo = "";
        this.Director = "";
        this.Genero = "";
        this.IdMovie = -1;
        this.Anio = -1;
        this.Duracion = -1;
    }
    
    
    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getID() {
        return IdMovie;
    }

    public void setID(int IdMovie) {
        this.IdMovie = IdMovie;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        this.Anio = anio;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return  this.IdMovie + "Titulo" + this.Titulo + "Director" + this.Director + "Año" 
                + this.Anio + "Duracion" + this.Duracion + "Genero" + this.Genero;
    }


}
