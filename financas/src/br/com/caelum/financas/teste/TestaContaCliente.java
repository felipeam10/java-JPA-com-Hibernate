package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Cliente;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaContaCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Zezao");
		cliente.setEndereco("Rua do fulano, 123");
		cliente.setProfissao("Professor");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Doyglas");
		cliente2.setEndereco("Rua do fulano, 555");
		cliente2.setProfissao("Atoa");
		
		Conta conta = new Conta();
		conta.setId(2);

		cliente.setConta(conta);
		cliente2.setConta(conta);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.persist(cliente);
//		em.persist(cliente2);
		
		em.getTransaction().commit();
		
		
	}
}
