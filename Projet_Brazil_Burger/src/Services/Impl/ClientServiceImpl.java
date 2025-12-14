package Services.Impl;

import Services.IClientService;
import Entity.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientServiceImpl implements IClientService {

    private List<Client> clients = new ArrayList<>();

    @Override
    public void enregistrerClient(Client c){
        clients.add(c);
    }

    

    @Override
    public List<Client> listerClients(){
        return clients;
    }
}