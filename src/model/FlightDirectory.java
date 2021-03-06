/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Flight;
import model.Seats;
import controller.AirlinerDirectory;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vennelareddy
 */
public class FlightDirectory {
    private List<Flight> flightDir;
    private Flight flights;
    private AirlinerDirectory airDir;
    public FlightDirectory(){
        flightDir = new ArrayList<Flight>();
        mockFlightSchedules();
    }
    public void mockFlightSchedules(){
        String[][] arr = {  {"British Airways","BA01","Boston","Los Angles","01:30","4:30","100.0","Morning","3"},
                            {"British Airways","BA02","Los Angles","Boston","01:30","4:30","100.0","Afternoon","3"},
                            {"American Airways","AA01","Barcelona","Chicago","01:30","4:30","100.0","Morning","4"},
                            {"American Airways","AA02","Chicago","Barcelona","01:30","4:30","100.0","Afternoon","4"},
                            {"Jet Airways","JA01","Cairo","Miami","01:30","4:30","100.0","Morning","4"},
                            {"Jet Airways","JA02","Miami","Cairo","01:30","4:30","100.0","Afternoon","4"},
                            {"Indian Airways","IA01","Toronto","Sao Paulo","01:30","4:30","100.0","Morning","4"},
                            {"Indian Airways","IA02","Sao Paulo","Toronto","01:30","4:30","100.0","Evening","4"},
                            {"Chineese Airways","CA01","Rosario","Vancuver","01:30","4:30","100.0","Night","4"},
                            {"Chineese Airways","CA02","Vancuver","Rosario","01:30","4:30","100.0","Night","4"},
                            {"Aerlingus Airways","AA01","New Delhi","Sydney","01:30","4:30","100.0","Morning","4"},
                            {"Aerlingus Airways","AA02","Sydney","New Delhi","01:30","4:30","100.0","Morning","4"}
                         };

        for(int i=0;i<arr.length;i++) {
            Flight temp = new Flight();

            temp.setOwner(arr[i][0]);
            temp.setFlightNumber(arr[i][1]);
            temp.setSource(arr[i][2]);
            temp.setDestination(arr[i][3]);
            temp.setDepTime(arr[i][4]);
            temp.setArrTime(arr[i][5]);
            temp.setPrice(Double.parseDouble(arr[i][6]));
            temp.setOtod(arr[i][7]);
            temp.setDuration((int)Double.parseDouble(arr[i][8]));
            // setting objects
            Seats seats = new Seats();
            temp.setSeats(seats);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String dateInString = "16-10-2019";

            try {

                Date date = formatter.parse(dateInString);
                //System.out.println(formatter.format(date));
                temp.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Please enter date in dd-MM-yyyy format");
                return;
            }
            flightDir.add(temp);
        }

    }


    public List<Flight> getFlightDir() {
        return flightDir;
    }

    public void setFlightDir(List<Flight> flightDir) {
        this.flightDir = flightDir;
    }

    public void addFlight(Flight newFlight){
        flightDir.add(newFlight);
    }


    public Flight getFlights() {
        return flights;
    }

    public void setFlights(Flight flights) {
        this.flights = flights;
    }

    public AirlinerDirectory getAirDir() {
        return airDir;
    }

    public void setAirDir(AirlinerDirectory airDir) {
        this.airDir = airDir;
    }

    public ArrayList<Flight> searchMaster(String destination, String source, String otod, String date) {
        ArrayList<Flight> flightDirFiltered = new ArrayList<>();
        for (Flight f:flightDir)
        {
            //SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String strDate = "";
            try {
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                strDate = dateFormat.format(f.getDate());
                //System.out.println("Converted String: " + strDate);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (f.getDestination().equals(destination) && f.getSource().equals(source) && f.getOtod().equals(otod) && strDate.equals(date))
            {
                flightDirFiltered.add(f);
            }
        }

        return flightDirFiltered;
    }
}
