package br.com.grafica.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grafica.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
