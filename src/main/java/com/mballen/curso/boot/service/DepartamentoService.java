package com.mballen.curso.boot.service;

import java.util.List;

import com.mballen.curso.boot.domain.Departamento;

public interface DepartamentoService {

	public void salvar(Departamento departamento);
	public void editar(Departamento departamento);
	public void excluir(Long id);
	public Departamento buscarPorId(Long id);
	public List<Departamento> buscarTodos();
	public boolean departamentoHasCargos(Long id);
	
}
