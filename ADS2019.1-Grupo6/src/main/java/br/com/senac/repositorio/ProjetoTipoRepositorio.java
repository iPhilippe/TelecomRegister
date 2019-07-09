package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.dominio.ProjetoTipo;

@Repository
public interface ProjetoTipoRepositorio extends JpaRepository<ProjetoTipo, Integer>{

}