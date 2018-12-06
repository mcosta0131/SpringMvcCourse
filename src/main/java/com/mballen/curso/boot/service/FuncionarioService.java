package com.mballen.curso.boot.service;

import java.util.List;

import com.mballen.curso.boot.domain.Funcionario;

public interface FuncionarioService {
	
	public void salvar(Funcionario funcionario);
	public void editar(Funcionario funcionario);
	public void excluir(Long id);
	public Funcionario buscarPorId(Long id);
	public List<Funcionario> buscarTodos();
	

}
