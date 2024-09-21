package junit.monprojet;

public class SommeArgent {
    private int quantite;
    private String unite;

    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getUnite() {
        return unite;
    }

    public SommeArgent add(SommeArgent m) throws UniteDistincteException {
        if (!m.getUnite().equals(this.getUnite())) {
            throw new UniteDistincteException(this, m);
        } else {
            return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
        }
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (anObject == null || getClass() != anObject.getClass()) return false;

        SommeArgent that = (SommeArgent) anObject;

        if (quantite != that.quantite) return false;
        return unite.equals(that.unite);
    }
    @Override
    public String toString() {
        return quantite + " " + unite;
    }
}