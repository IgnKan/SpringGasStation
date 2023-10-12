package ru.vsu.cs.gasstation.service;

import org.springframework.stereotype.Service;
import ru.vsu.cs.gasstation.entity.Client;

import java.util.List;


public interface ClientService {

    public List<Client> getAllClients();

    public void saveClient(Client client);

    public Client getClient(int id);

    public void deleteClient(int id);
}
