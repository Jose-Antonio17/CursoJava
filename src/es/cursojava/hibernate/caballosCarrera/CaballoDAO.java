package es.cursojava.hibernate.caballosCarrera;

import java.util.List;

import es.cursojava.hibernate.dto.CaballoDTO;
import es.cursojava.hibernate.entity.CaballoCarrera;




public interface CaballoDAO {
    CaballoCarrera getCaballoPorId(long id);
    void insertar(CaballoCarrera caballo);
    List<CaballoCarrera> obtenerTodos();
    List<CaballoCarrera> obtenerActivos();
    void eliminar(Long id);
    void actualizar(CaballoCarrera caballo);
    CaballoDTO obtenerJinete (long caballoId);
}