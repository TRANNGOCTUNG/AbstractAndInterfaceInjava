package animal;

public class Animal {
    private String roam;
    private String chaseCat;

    public Animal() {
    }

    public Animal(String roam, String chaseCat) {
        this.roam = roam;
        this.chaseCat = chaseCat;
    }

    public String getRoam() {
        return roam;
    }

    public void setRoam(String roam) {
        this.roam = roam;
    }

    public String getChaseCat() {
        return chaseCat;
    }

    public void setChaseCat(String chaseCat) {
        this.chaseCat = chaseCat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "roam='" + roam + '\'' +
                ", chaseCat='" + chaseCat + '\'' +
                '}';
    }
}
