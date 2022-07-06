package pl.fis.lbd.SHcompany.service;

import org.springframework.stereotype.Service;

@Service
public class ProjectManagementService {

    private final ClientService clientService;
    private final ProjectService projectService;
    private final TeamService teamService;
    private final InvoiceService invoiceService;

    public ProjectManagementService(ClientService clientService, ProjectService projectService, TeamService teamService, InvoiceService invoiceService) {
        this.clientService = clientService;
        this.projectService = projectService;
        this.teamService = teamService;
        this.invoiceService = invoiceService;
    }
}
