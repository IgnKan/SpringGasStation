package ru.vsu.cs.gasstation.dao;

import org.springframework.stereotype.Repository;
import ru.vsu.cs.gasstation.entity.Client;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Repository
public class ClientDAOImpl implements ClientDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public List<Client> getAllClients() {
        Session session = sessionFactory.getCurrentSession();

        Query<Client> query = session.createQuery("from Client", Client.class);

        List<Client> allClients = query.getResultList();

        return allClients;
    }

    public void saveClient(Client client) {

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(client);
    }

    public Client getClient(int id) {

        Session session = sessionFactory.getCurrentSession();

        Client client = session.get(Client.class, id);

        return client;
    }

    public void deleteClient(int id) {

        Session session = sessionFactory.getCurrentSession();
        Query<Client> query = session.createQuery("delete from Client " + "where id =:clientId");

        query.setParameter("clientId", id);
        query.executeUpdate();

    }
}
