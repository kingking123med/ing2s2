package junit.monprojet;

 
import org.junit.Assert;
import org.junit.Test;

public class PorteMonnaieTest {

    @Test
    public void testAjouteSomme() {
        PorteMonnaie porte1 = new PorteMonnaie();
        PorteMonnaie porte2 = new PorteMonnaie();

        SommeArgent sa5Euro = new SommeArgent(5, "EUR");
        SommeArgent sa10Euro = new SommeArgent(10, "EUR");

        porte1.ajouteSomme(sa5Euro);
        porte1.ajouteSomme(sa5Euro);

        porte2.ajouteSomme(sa10Euro);

        Assert.assertEquals(porte1, porte2);
    }
}