package pl.fis.lbd.SHcompany.service;

import org.springframework.stereotype.Service;
import pl.fis.lbd.SHcompany.repository.ProjectRepository;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final SprintService sprintService;

    public ProjectService(ProjectRepository projectRepository, SprintService sprintService) {
        this.projectRepository = projectRepository;
        this.sprintService = sprintService;
    }
}
