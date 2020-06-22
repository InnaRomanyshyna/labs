package com.example.labs.service;

import com.example.labs.model.Client;
import java.util.List;
import java.util.UUID;

public interface ClientService {
    Client getClient(UUID id);
    Client getByEmail(String email);
    Client getByFirstname(String firstName);
    List<Client> getAll();
    Client createClient(Client client);
    void deleteClient(Client client);
    Client updateClient(Client client);

}
