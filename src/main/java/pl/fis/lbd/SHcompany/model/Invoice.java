package pl.fis.lbd.SHcompany.model;

import java.util.Date;

public class Invoice {

    private Long id;
    private String invoiceNumber;
    private InvoiceStatus invoiceStatus;
    private Project project;
    private Client client;
    private Double quote;
    private Date paymentdDate;

}
