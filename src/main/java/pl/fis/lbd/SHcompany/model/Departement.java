package pl.fis.lbd.SHcompany.model;

public enum Departement {

    Java("Java"),
    SAP("SAP"),
    NET(".NET");

    private final String name;

    Departement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
