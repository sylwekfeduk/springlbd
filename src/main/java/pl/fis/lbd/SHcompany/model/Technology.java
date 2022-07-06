package pl.fis.lbd.SHcompany.model;

public enum Technology {

    SPRING("Spring"),
    SPRINGBOOT("Springboot"),
    JAVA("Java"),
    SAP("SAP"),
    NET(".NET"),
    CSHARP("C#"),
    KAFKA("Kafka"),
    AZURE("Azure"),
    AWS("AWS");

    private final String name;

    private Technology(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
