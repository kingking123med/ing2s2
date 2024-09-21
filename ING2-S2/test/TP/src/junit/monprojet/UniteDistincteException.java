package junit.monprojet;
 
public class UniteDistincteException extends Exception {
    private SommeArgent somme1;
    private SommeArgent somme2;

    public UniteDistincteException(SommeArgent s1, SommeArgent s2) {
        somme1 = s1;
        somme2 = s2;
    }

    @Override
    public String toString() {
        return "unité distincte: " + somme1.getUnite() + "!=" + somme2.getUnite();
    }
}