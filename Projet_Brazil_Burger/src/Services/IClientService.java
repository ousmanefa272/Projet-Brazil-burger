package Services;

import Entity.Client;
import java.util.List;

public interface IClientService {
    void enregistrerClient(Client c);
    List<Client> listerClients();
}

