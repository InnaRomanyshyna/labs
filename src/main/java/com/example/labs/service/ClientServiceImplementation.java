package com.example.labs.service;


import com.example.labs.model.Client;
import com.example.labs.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImplementation implements ClientService {

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client getClient(UUID id) {
        return clientRepository.findById(id).get();
    }

   @Override
    public Client getByFirstname(String firstName) {
        Client client = new Client();

        client.setFirstName(firstName);
       return clientRepository.findOne(Example.of(client)).get();
    }

    @Override
    public Client getByEmail(String email) {
        Client client = new Client();
        client.setEmail(email);
        return clientRepository.findOne(Example.of(client)).get();
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client createClient(Client client) {
        Client save = clientRepository.save(client);
        return save;
    }

    @Override
    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

    @Override
    public Client updateClient(Client client) {
        clientRepository.save(client);
        return client;
    }
}
