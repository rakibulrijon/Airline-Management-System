import controller.Airliner;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AirlinerTest {
    Airliner a;
   @Before
   public void setUp()throws Exception{
       a = new Airliner();
   }
       
   @Test
   public void testgetCountriesOperated(){
       assertEquals(0,a.getCountriesOperated());
       
   }
   @Test
   public void testsetCountriesOperated(){
       a.setCountriesOperated(5);
       assertEquals(5,a.getCountriesOperated());
   }
    @Test
    public void testgetOriginCountry(){
        assertEquals(null,a.getOriginCountry());
        
    }
    @Test
    public void testsetOriginCountry(){
        a.setOriginCountry(null);
        assertEquals(null,a.getOriginCountry());
    }
    @Test
    public void testgetName(){
        assertEquals(null,a.getName());
    }
    @Test
    public void testsetName(){
        a.setName("Rijon");
        assertEquals("Rijon",a.getName());
        
    }
    @Test
    public void testgetAirlineCode(){
        assertEquals(null,a.getAirlineCode());
    }
    @Test
    public void testsetAirlineCode(){
        a.setAirlineCode("A01");
        assertEquals("A01",a.getAirlineCode());
    }
    @Test
    public void testgetNumOfFlights(){
        assertEquals(null,a.getAirlineCode());
        
    }
    @Test
    public void testsetNumOfFlights(){
        a.setNumOfFlights(50);
        assertEquals(null,a.getAirlineCode());
        
    }
    @Test
    public void testtoString(){
        a.toString();
        assertEquals(null,a.getName());
        
    }
}
