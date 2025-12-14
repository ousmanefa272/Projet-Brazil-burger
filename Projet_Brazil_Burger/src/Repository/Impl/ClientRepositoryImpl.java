package Repository.Impl;

import Repository.IClientRepository;
import Entity.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImpl implements IClientRepository {

    private List<Client> clients = new ArrayList<>();

    @Override
    public void insert(Client client) {
        clients.add(client);
    }

    @Override
    public List<Client> findAll() {
        return clients;
    }
}


