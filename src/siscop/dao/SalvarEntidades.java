package siscop.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import siscop.entidades.Produto;
import siscop.entidades.Usuario;


public class SalvarEntidades {
    
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("Siscop-V.1.0PU");

    public void SalvarEntidade(Object objeto) {
      
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(objeto);
        manager.getTransaction().commit();

        manager.close();        

    }

    public List ListarProdutos() {
        
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        Query query = manager.createQuery("from Produto");
        List<Produto> produtos = query.getResultList();

        manager.getTransaction().commit();

        manager.close();
        

        return produtos;

    }

    public List ListarProdutosPorId(Long id) {
        
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        Query query = manager.createQuery("from Produto c where c.id = :id");
        query.setParameter("id", id);
        List<Produto> produtos = query.getResultList();

        manager.getTransaction().commit();

        manager.close();
        

        return produtos;

    }
    
    public List ListarUsuarios() {
        
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        Query query = manager.createQuery("from Usuario");
        List<Usuario> usuarios = query.getResultList();

        manager.getTransaction().commit();

        manager.close();
        

        return usuarios;

    }
    
    public Usuario userLogado(Usuario user){
        return user;
    }
    
    
}
