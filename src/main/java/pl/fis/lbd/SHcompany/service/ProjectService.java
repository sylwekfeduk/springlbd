package pl.fis.lbd.SHcompany.service;

import org.springframework.stereotype.Service;
import pl.fis.lbd.SHcompany.repository.ProjectRepository;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
}
