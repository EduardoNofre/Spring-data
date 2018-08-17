/**
 * 
 */
package com.br.tci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.tci.model.Imagem;

/**
 * @author eduardo.sa
 *
 */
public interface ImagemRepository  extends JpaRepository<Imagem,Integer> {

}
