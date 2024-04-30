/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.evaluacion3.Services;

import cl.duoc.evaluacion3.DTO.MovieDTO;
import java.util.List;

/**
 *
 * @author Marco
 */
public interface IMovie {
    public boolean Guardar(MovieDTO m);
    public void Actualizar(MovieDTO m);
    public List<MovieDTO> listar();
    public void Eliminar(int id );
    public List<MovieDTO> BuscarTitulo(String titulo);
}
