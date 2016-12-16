package alokhin.flight.main;

import alokhin.flight.database.DataHelper;
import alokhin.flight.entities.Directories.Aircraft;
import alokhin.flight.entities.Directories.Place;
import alokhin.flight.entities.Objects.Flight;
import alokhin.flight.entities.Objects.Passenger;
import alokhin.flight.entities.Objects.Reservation;
import alokhin.flight.impls.BuyImpl;
import alokhin.flight.impls.CheckImpl;
import alokhin.flight.impls.SearchImpl;
import alokhin.flight.interfaces.Buy;
import alokhin.flight.interfaces.Check;
import alokhin.flight.interfaces.Search;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        System.out.println(DataHelper.getInstance().getAllCities());
//        System.out.println(DataHelper.getInstance());
//        DataHelper.closeTransaction();
//        System.out.println(DataHelper.getInstance());
//        ArrayList<Flight> flights = search.searchFlight(1479591900000L, DataHelper.getInstance().getCityById(1L), DataHelper.getInstance().getCityById(2L));
//        System.out.println(flights);
//        for(Flight f : flights) {
//            System.out.println(f.getId());
//            System.out.println(f.getAircraft());
//            System.out.println(f.getDuration());
//            System.out.println(f.getCityFrom());
//            System.out.println(f.getCityTo());
//            System.out.println(f.getCode());
//            System.out.println("----");
//        }

       // System.out.println(DataHelper.getInstance().getFlightById(3L));
       // System.out.println(DataHelper.getInstance().getPlaceById(1L));
       // System.out.println(DataHelper.getInstance().getPassengerById(5L));

//        System.out.println(search.getAllCities());
//        System.out.println(DataHelper.getInstance());
//        System.out.println(DataHelper.getInstance());

//        Buy buy = new BuyImpl();
//        Passenger passenger = new Passenger();
//        passenger.setGivenName("as");
//        passenger.setMiddleName("qwe");
//        passenger.setFamilyName("qtwerwe");
//        passenger.setEmail("exekiller@gmaicl.com");
//        passenger.setPhone("09537231");
//        passenger.setDocumentNumber("234234");
//
//        if(buy.buyTicket(DataHelper.getInstance().getFlightById(3L), DataHelper.getInstance().getPlaceById(1L),
//                passenger, " fa fa fa")) {
//            System.out.println("Transaction successful.");
//        } else {
//            System.out.println("Transaction failed");
//            DataHelper.closeTransaction();
//        }

//        List places = DataHelper.getInstance().getPlacesBusy(1L, 2L);
//
//        for(Object o : places) {
//
//            Place p = (Place) o;
//            System.out.println(p.getId());
//            System.out.println(p.getRow());
//            System.out.println(p.getSeat());
//            System.out.println(p.getFlightClass().getName());
//            System.out.println(p.getBusy());
//        }
//        Check check = new CheckImpl();
//        Reservation r1 = check.checkReservationByCode("87d6ab68-d143-41f7-a68f-65f8a41703af");
//        ArrayList<Reservation> r2 = check.checkReservationByDateReserv(1480502968488L);
//        ArrayList<Reservation> r3 = check.checkReservationByDocumentNumber("TR5123");
//        ArrayList<Reservation> r4 = check.checkReservationByFamilyName("Pupkin");
//
//        System.out.println(r1);
//        System.out.println(r2);
//        System.out.println(r3);
//        System.out.println(r4);


//        DataHelper.closeTransaction();

    }
}
