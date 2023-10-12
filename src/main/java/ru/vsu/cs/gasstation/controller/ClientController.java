package ru.vsu.cs.gasstation.controller;

import ru.vsu.cs.gasstation.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vsu.cs.gasstation.service.ClientService;
import ru.vsu.cs.gasstation.service.FuelService;
import ru.vsu.cs.gasstation.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping()
    public List<Client> showAllClients() {
        List<Client> allClients = clientService.getAllClients();

        return allClients;
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable int id) {

        Client client = clientService.getClient(id);

//        if (client == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in Database!");
//        }

        return client;
    }

    @PostMapping()
    public Client addNewClient(@RequestBody Client client){

        clientService.saveClient(client);

        return client;
    }

    @PutMapping()
    public Client updateClient(@RequestBody Client client) {

        clientService.saveClient(client);

        return client;
    }

    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable int id){

        Client client = clientService.getClient(id);

//        if(employee == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in database");
//        }

        clientService.deleteClient(id);

        return "Client with ID = " + id + " was deleted!";

    }
}
