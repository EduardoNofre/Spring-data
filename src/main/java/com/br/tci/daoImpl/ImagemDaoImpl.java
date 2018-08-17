/**
 * 
 */
package com.br.tci.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.br.tci.dao.ImagemDao;
import com.br.tci.dao.ImagemRepository;
import com.br.tci.model.Imagem;

@Component
public class ImagemDaoImpl implements ImagemDao {

	@Autowired
	private ImagemRepository imagemRepository;

	@Transactional
	public Imagem getEmployeeById(int id) {
		
		return imagemRepository.findOne(id);
	}

	@Transactional
	public void saveEmployee(Imagem employee) {

		imagemRepository.save(employee);
	}

	@Transactional
	public void updateEmployee(Imagem employee) {

		imagemRepository.save(employee);
	}

	@Transactional
	public void deleteEmployee(int id) {

		imagemRepository.delete(id);
	}

	@Transactional
	public List<Imagem> getAllEmployees() {

		return imagemRepository.findAll();
	}
}
