/**
 * 
 */
package com.br.tci.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.br.tci.daoImpl.ImagemDaoImpl;
import com.br.tci.model.Imagem;

/**
 * @author eduardo.sa
 *
 */
public class MainPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

		ImagemDaoImpl imagemDaoImpl = (ImagemDaoImpl) context.getBean("imagemDaoImpl");

		Imagem imagem = new Imagem();

		// Read the Employee
		Imagem img = imagemDaoImpl.getEmployeeById(6988);

		System.out.println(" olha!!" + img.getIdDocumento());

	}

}
