package pl.fis.lbd.SHcompany.service;

import org.springframework.stereotype.Service;
import pl.fis.lbd.SHcompany.repository.SprintRepository;

@Service
public class SprintService {

    private final SprintRepository sprintRepository;

    public SprintService(SprintRepository sprintRepository) {
        this.sprintRepository = sprintRepository;
    }
}
