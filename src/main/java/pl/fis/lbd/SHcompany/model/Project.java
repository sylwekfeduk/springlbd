package pl.fis.lbd.SHcompany.model;

import java.util.List;

public class Project {

    private Long id;
    private String projectName;
    private Double estimatedPrice;
    private List<Technology> usedTechnology;
    private Team workingTeam;
    private List<Sprint> listOfSprints;


}
