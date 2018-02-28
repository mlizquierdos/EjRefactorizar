package ejemplo3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author https://cysingsoft.wordpress.com/un-ejercicio-de-refactorizacion/
 */
public class FechaTest {
    
    private FechaBase fechaCorrecta = new FechaBase (20, 6, 2008);
    private FechaBase mesMal1 = new FechaBase (21, 0, 3000);
    private FechaBase mesMal2 = new FechaBase (21, 13, 3000);
    private FechaBase diaMal1 = new FechaBase (0, 11, 2000);
    private FechaBase diaMal2 = new FechaBase (32, 11, 2000);
    private FechaBase diaMalNoviembre = new FechaBase (31, 11, 2000);
    private FechaBase diaBienDiciembre = new FechaBase (31, 12, 2000);
    private FechaBase diaMalFebrero = new FechaBase (30, 2, 2008);
    private FechaBase diaBienFebreroBisiesto1 = new FechaBase (29, 2, 2008);
    private FechaBase diaBienFebreroBisiesto2 = new FechaBase (29, 2, 2000);
    private FechaBase diaMalFebreroBisiesto1 = new FechaBase (29, 2, 2007);
    private FechaBase diaMalFebreroBisiesto2 = new FechaBase (29, 2, 1900);

    public FechaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validar method, of class FechaBase.
     */
    @Test
    public void testValidar() {
        
        System.out.println("validar");
        assertTrue(fechaCorrecta.validar());
        assertFalse(mesMal1.validar());
        assertFalse(mesMal2.validar());
        assertFalse(diaMal1.validar());
        assertFalse(diaMal2.validar());
        assertFalse(diaMalNoviembre.validar());
        assertTrue(diaBienDiciembre.validar());
        assertFalse(diaMalFebrero.validar());
        assertTrue(diaBienFebreroBisiesto1.validar());
        assertTrue(diaBienFebreroBisiesto2.validar());
        assertFalse(diaMalFebreroBisiesto1.validar());
        assertFalse(diaMalFebreroBisiesto2.validar());

    }
    
}
