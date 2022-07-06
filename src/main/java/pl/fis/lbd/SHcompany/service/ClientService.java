package pl.fis.lbd.SHcompany.service;

import org.springframework.stereotype.Service;
import pl.fis.lbd.SHcompany.repository.ClientRepository;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
}
