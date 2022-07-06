package pl.fis.lbd.SHcompany.service;

import org.springframework.stereotype.Service;
import pl.fis.lbd.SHcompany.repository.TeamRepository;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
}
