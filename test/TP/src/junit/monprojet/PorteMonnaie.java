package junit.monprojet;

import java.util.HashMap;

public class PorteMonnaie {

    private HashMap<String, Integer> contenu;

    public HashMap<String, Integer> getContenu() {
        return contenu;
    }

    public PorteMonnaie() {
        contenu = new HashMap<>();
    }

    public void ajouteSomme(SommeArgent sa) {
        String unite = sa.getUnite();
        int quantite = sa.getQuantite();

        contenu.put(unite, contenu.getOrDefault(unite, 0) + quantite);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Contenu du porte-monnaie:\n");

        for (String unite : contenu.keySet()) {
            result.append(contenu.get(unite)).append(" ").append(unite).append("\n");
        }

        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PorteMonnaie that = (PorteMonnaie) obj;

        for (String unite : contenu.keySet()) {
            if (!that.contenu.containsKey(unite) || !that.contenu.get(unite).equals(contenu.get(unite))) {
                return false;
            }
        }

        return true;
    }
}