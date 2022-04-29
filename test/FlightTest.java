
import controller.Flight;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class FlightTest {
    
    Flight f;
   @Before
   public void setUp()throws Exception{
       f = new Flight();
   }
   @Test
   public void testgetDuration(){
       assertEquals(0,f.getDuration());
   }
   @Test
   public void testsetDuration(){
       f.setDuration(0);
       assertEquals(0,f.getDuration());
   }
   @Test
   public void testgetOtod(){
       assertEquals(null,f.getOtod());
   }
   @Test
   public void testsetOtod(){
       f.setOtod("Dhaka");
       assertEquals("Dhaka",f.getOtod());
       
   }
   @Test
   public void testgetOwner(){
       assertEquals(null,f.getOwner());
   }
   @Test
   public void testsetOwner(){
       f.setOwner("John");
       assertEquals("John",f.getOwner());
   }
   @Test
   public void testgetSeats(){
       assertEquals(null,f.getSeats());
   }
   @Test
   public void testsetSeats(){
       f.setSeats(null);
       assertEquals(null,f.getSeats());
   }
   @Test
   public void testgetHour(){
       assertEquals(0,f.getHour());
   }
   @Test
   public void testsetHour(){
       f.setHour(4);
       assertEquals(4,f.getHour());
   }
   @Test
   public void testgetMinutes(){
       assertEquals(0,f.getMinutes());
       
   }
   @Test
   public void testsetMinutes(){
       f.setMinutes(45);
       assertEquals(45,f.getMinutes());
   }
   @Test
   public void testgetDepTime(){
       assertEquals(null,f.getDepTime());
   }
   @Test
   public void testsetDepTime(){
       f.setDepTime("Night");
       assertEquals("Night",f.getDepTime());
   }
   @Test
   public void testgetArrTime(){
       assertEquals(null,f.getDepTime());
   }
   @Test
   public void testsetArrTime(){
      f.setArrTime("MidNight");
      assertEquals(null,f.getDepTime());
   }
   @Test
   public void testgetFlightNumber(){
       assertEquals(null,f.getFlightNumber());
   }
   @Test
   public void testsetFlightNumber(){
       f.setFlightNumber("A004");
       assertEquals("A004",f.getFlightNumber());
   }
   @Test
   public void testgetSource(){
    assertEquals(null,f.getSource());
    }
   @Test
   public void testsetSource(){
       f.setSource("Boston");
       assertEquals("Boston",f.getSource());
       
   }
   @Test
   public void testgetDestination(){
       assertEquals(null,f.getDestination());
   }
   @Test
   public void testsetDestination(){
       f.setDestination("Munshiganj");
       assertEquals("Munshiganj",f.getDestination());
   }
   @Test
   public void testgetPrice(){
       assertEquals(null,f.getPrice());
   }
   @Test
   public void testsetPrice(){
       f.setPrice(null);
       assertEquals(null,f.getPrice());
   }
   @Test
   public void testgetDate(){
       assertEquals(null,f.getDate());
   }
   @Test
   public void testsetDate(){
       f.setDate(null);
       assertEquals(null,f.getDate());
   }
   @Test
   public void testgetNoOfSeats(){
       assertEquals(0,f.getNoOfSeats());
   }
   @Test
   public void testsetNoOfSeats(){
       f.setNoOfSeats(100);
       assertEquals(100,f.getNoOfSeats());
   }
}
