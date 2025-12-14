package Repository;

import Entity.Client;
import java.util.List;

public interface IClientRepository {
    void insert(Client client);
    List<Client> findAll();
}
