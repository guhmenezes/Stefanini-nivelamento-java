/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stefanini.stefaninifood;

import br.com.stefanini.stefaninifood.dao.util.JPAUtil;
import br.com.stefanini.stefaninifood.model.Empresa;
import javax.persistence.EntityManager;

/**
 *
 * @author ghmenezes
 */
public class teste {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.setNome("teste");
        empresa.setCelular("18728172781");
        empresa.setCnpj("12917287128");
        empresa.setEmail("sjhuds@ahsja.com");
        
        EntityManager em = JPAUtil.getEntityManager();
        
        em.getTransaction().begin();
        em.persist(empresa);
        em.getTransaction().commit();
        em.close();
    }
    
}
