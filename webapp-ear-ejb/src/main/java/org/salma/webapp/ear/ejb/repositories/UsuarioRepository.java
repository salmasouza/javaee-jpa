package org.salma.webapp.ear.ejb.repositories;

import org.salma.webapp.ear.ejb.entities.Usuario;

import java.util.List;

public interface UsuariosRepository {

    List<Usuario> listar();
}
