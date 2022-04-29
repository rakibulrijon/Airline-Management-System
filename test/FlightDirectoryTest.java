import model.FlightDirectory;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FlightDirectoryTest {
    
    FlightDirectory f1;
   @Before
   public void setUp()throws Exception{
       f1 = new FlightDirectory();
   }
    @Test
    public void testgetFlights(){
      
        assertEquals(null,f1.getFlights());
    }
    @Test
    public void testsetFlights(){
        f1.setFlights(null);
        assertEquals(null,f1.getFlights());
    }
    @Test
    public void testgetAirDir(){
       assertEquals(null,f1.getAirDir()); 
    }
    @Test
    public void testsetAirDir(){
        f1.setAirDir(null);
        assertEquals(null,f1.getAirDir());
        
        
    }
}
