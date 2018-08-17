/**
 * 
 */
package com.br.tci.dao;

import java.util.List;

import com.br.tci.model.Imagem;

/**
 * @author eduardo.sa
 *
 */
public interface ImagemDao {
	
    public abstract Imagem getEmployeeById(int id);
    public abstract void saveEmployee(Imagem employee);
    public abstract void updateEmployee(Imagem employee);
    public abstract void deleteEmployee(int id);
    public abstract List<Imagem> getAllEmployees();

}
