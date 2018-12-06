package com.mballen.curso.boot.service;

import java.util.List;

import com.mballen.curso.boot.domain.Cargo;

public interface CargoService {

	public void salvar(Cargo cargo);
	public void editar(Cargo cargo);
	public void excluir(Long id);
	public Cargo buscarPorId(Long id);
	public List<Cargo> buscarTodos();

}
