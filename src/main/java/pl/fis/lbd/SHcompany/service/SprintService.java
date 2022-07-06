package pl.fis.lbd.SHcompany.service;

import org.springframework.stereotype.Service;
import pl.fis.lbd.SHcompany.repository.SprintRepository;

@Service
public class SprintService {

    private final SprintRepository sprintRepository;
    private final UserStoryService userStoryService;

    public SprintService(SprintRepository sprintRepository, UserStoryService userStoryService) {
        this.sprintRepository = sprintRepository;
        this.userStoryService = userStoryService;
    }
}
