package com.example.labs.controller;

import com.example.labs.model.Client;
import com.example.labs.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "api/client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("list")
    public List<Client> getAll()
    {
        return clientService.getAll();
    }
    @GetMapping("get/{id}")
    public Client getClientById(@PathVariable UUID id)
    {
        return clientService.getClient(id);
    }
    @GetMapping("getemail/{email}")
   public Client getByEmail(@PathVariable String email)
   {
        return clientService.getByEmail(email);
   }
   @GetMapping(path = "getname/{firstName}")
  public Client getByFirstname(@PathVariable String firstName)
  {
       return clientService.getByFirstname(firstName);
   }
    @DeleteMapping("delete/{id}")
    public void delete(Client client)
    {
        clientService.deleteClient(client);
    }
    @PostMapping
    public Client createClient(Client client)
    {
      return clientService.createClient(client);

    }
    //@PostMapping
   // public Client update(Client client)
   // {
    //    return clientService.updateClient(client);

   // }




}
