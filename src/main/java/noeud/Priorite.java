package noeud;

public enum Priorite {
    MULTIPLICATION (1),
    CONSTANTE (-1),
    OTHER (0);

    private int priorite;

    Priorite(int priorite) {
        this.priorite = priorite;
    }

    public int getPriorite() {
        return this.priorite;
    }

}
