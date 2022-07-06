package pl.fis.lbd.SHcompany.service;


import org.springframework.stereotype.Service;
import pl.fis.lbd.SHcompany.repository.UserStoryRepository;

@Service
public class UserStoryService {

    private final UserStoryRepository userStoryRepository;

    public UserStoryService(UserStoryRepository userStoryRepository) {
        this.userStoryRepository = userStoryRepository;
    }
}
