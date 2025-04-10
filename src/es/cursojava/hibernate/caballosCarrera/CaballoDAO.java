package es.cursojava.hibernate.caballosCarrera;

import java.util.List;

import es.cursojava.hibernate.entity.CaballoCarrera;

public interface CaballoDAO {
    void insertar(CaballoCarrera caballo);
    List<CaballoCarrera> obtenerTodos();
    List<CaballoCarrera> obtenerActivos();
    void eliminar(Long id);
}