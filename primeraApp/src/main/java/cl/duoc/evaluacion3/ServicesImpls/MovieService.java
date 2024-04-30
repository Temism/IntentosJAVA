/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.evaluacion3.ServicesImpls;

import cl.duoc.evaluacion3.DAO.ConexionDB;
import cl.duoc.evaluacion3.DTO.MovieDTO;
import cl.duoc.evaluacion3.Services.IMovie;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieService implements IMovie {
    ConexionDB DB;
    public MovieService(){
        DB = new ConexionDB();
    }
    
    
    @Override
    public boolean Guardar(MovieDTO m) {
        try {
            String query1 = "SELECT * FROM `movie` WHERE id = '" + m.getID() + "'";
            ResultSet rs = DB.ConsultarQuery(query1);

            if (rs.next()) {
                System.out.println("El ID que desea ingresar ya se encuentra almacenado en la base de datos");
                return false; 
            } else {
                String query = "INSERT INTO `movie`(`ID`, `titulo`, `director`, `anio`, `duracion`, `genero`) VALUES('" + m.getID() + "','" + m.getTitulo() + "','" + m.getDirector() + "','" + m.getAnio() + "','" + m.getDuracion() + "','" + m.getGenero() + "')";
                DB.InsertarQuery(query);
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un error! " + ex.getMessage());
            return false; 
        }
    }



    @Override
    public List<MovieDTO> listar() {
        List<MovieDTO> lista = new ArrayList<>();
        try {
            ResultSet rs = DB.ConsultarQuery("SELECT * FROM movie");
            while(rs.next()){
                lista.add(new MovieDTO(rs.getString("titulo"),rs.getString("director"),rs.getString("genero"),rs.getInt("id"),rs.getInt("anio"),rs.getInt("duracion")) );    
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un Error");
        }    
        return  lista;
    }

    @Override
    public void Eliminar(int id) {
        try {
            String query = "DELETE FROM `movie` WHERE `id` = '" + id+ "'";                                         
            DB.InsertarQuery(query);
        } catch (SQLException ex) {
            System.out.println("Hubo un error! " + ex.getMessage());
        }
    }

    @Override
    public List<MovieDTO> BuscarTitulo(String titulo) {
        List<MovieDTO> lista = new ArrayList<>();
        try{
            String query = "SELECT * FROM `movie` WHERE titulo = '" +titulo +"'";
            ResultSet rs = DB.ConsultarQuery(query);
            while(rs.next()){
                lista.add(new MovieDTO(rs.getString("titulo"),rs.getString("director"),rs.getString("genero"),rs.getInt("id"),rs.getInt("anio"),rs.getInt("duracion")) );    
            }   
        }catch (SQLException ex) {
            System.out.println("Hubo un error! " + ex.getMessage());
        } 
        return lista ;
    }

    @Override
    public void Actualizar(MovieDTO m) {
        try {
                String query = "UPDATE `movie` SET titulo = '"+m.getTitulo()+"',director = '"+m.getDirector()+"',"
                        + "Genero = '"+m.getGenero()+"',Duracion = '"+m.getDuracion()+"',anio= '"+m.getAnio()+"'WHERE id ='" +m.getID()+"'";                                        
                DB.InsertarQuery(query);
        } catch (SQLException ex) {
            System.out.println("Hubo un error! " + ex.getMessage());
        }
    }
  

   
    
}
