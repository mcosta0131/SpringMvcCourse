package com.mballen.curso.boot.dao;

import java.util.List;

import com.mballen.curso.boot.domain.Funcionario;

public interface FuncionarioDao {
	
	public void save(Funcionario funcionario);
	public void update(Funcionario funcionario);
	public void delete(Long id); 
	public Funcionario findById(Long id); 
	public List<Funcionario> findAll();

}
