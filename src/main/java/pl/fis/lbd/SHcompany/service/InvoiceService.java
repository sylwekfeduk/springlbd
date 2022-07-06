package pl.fis.lbd.SHcompany.service;

import org.springframework.stereotype.Service;
import pl.fis.lbd.SHcompany.repository.InvoiceRepository;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
}
