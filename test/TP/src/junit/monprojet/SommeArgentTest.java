package junit.monprojet;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SommeArgentTest {

    private SommeArgent m12CHF;
    private SommeArgent m14CHF;
    private SommeArgent m14USD;

    @Before
    public void setUp() {
        System.out.println("1st passage avant exécution d'une méthode de test");
        m12CHF = new SommeArgent(12, "CHF");
        m14CHF = new SommeArgent(14, "CHF");
        m14USD = new SommeArgent(14, "USD");
    }

    @After
    public void tearDown() {
        
        System.out.println("1st passage APRES exécution d'une méthode de test");
    }

    @Test(expected = UniteDistincteException.class)
    public void testAddWithDistinctUnits() throws UniteDistincteException {
        m12CHF.add(m14USD);
    }

    /*@Test
    public void testAddition() {
        SommeArgent m12CHF = new SommeArgent(12, "CHF");
        SommeArgent m14CHF = new SommeArgent(14, "CHF");
        SommeArgent expected = new SommeArgent(26, "CHF");
        SommeArgent result = m12CHF.add(m14CHF);

        Assert.assertTrue(expected.equals(result));
        

    }*/
    @Test
    public void testEqualsMethod() {
        SommeArgent m12CHF = new SommeArgent(12, "CHF");
        SommeArgent m14CHF = new SommeArgent(14, "CHF");
        SommeArgent m14USD = new SommeArgent(14, "USD");

        Assert.assertTrue(m12CHF.equals(m12CHF));
        Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF"));
        Assert.assertTrue(!m12CHF.equals(m14CHF));
        Assert.assertTrue(!m14USD.equals(m14CHF));
    }

    @After
    public void finalTearDown() {
        System.out.println("2nd passage APRES exécution d'une méthode de test");
    }
}