package com.okason.prontosalon.data;

import com.okason.prontosalon.model.Client;
import com.okason.prontosalon.util.ClientUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Valentine on 1/10/2016.
 */
public class InMemoryClientData {
    public static List<Client> getDemoClients(){
        List<Client> clients = new ArrayList<Client>();


        Client client1 = new Client(ClientUtils.getNetId());
        client1.setName("Debbie Sam");
        client1.setEmail("deb@email.net");
        client1.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest1.JPG");
        Calendar calendar2 = GregorianCalendar.getInstance();
        calendar2.add(Calendar.DAY_OF_WEEK, 1);
        calendar2.add(Calendar.MILLISECOND, 10005623);
        client1.setNextAppointmentDate(calendar2);
        calendar2.add(Calendar.DAY_OF_WEEK, -1);
        client1.setLastAppointmentDate(calendar2);
        clients.add(client1);


        Client client2 = new Client(ClientUtils.getNetId());
        client2.setName("Keisha Williams");
        client2.setEmail("diva@comcast.com");
        client2.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest2.JPG");
        Calendar calendar3 = GregorianCalendar.getInstance();
        calendar3.add(Calendar.DAY_OF_WEEK, 2);
        calendar3.add(Calendar.MILLISECOND, 8962422);
        client2.setNextAppointmentDate(calendar3);
        calendar3.add(Calendar.DAY_OF_WEEK, -2);
        client2.setLastAppointmentDate(calendar3);
        clients.add(client2);


        Client client3 = new Client(ClientUtils.getNetId());
        client3.setName("Gregg McQuire");
        client3.setEmail("emailing@nobody.com");
        client3.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/guest3.JPG");
        Calendar calendar4 = GregorianCalendar.getInstance();
        calendar4.add(Calendar.DAY_OF_WEEK, 4);
        calendar4.add(Calendar.MILLISECOND, 49762311);
        client3.setNextAppointmentDate(calendar4);
        calendar4.add(Calendar.DAY_OF_WEEK, -3);
        client3.setLastAppointmentDate(calendar4);
        clients.add(client3);


//        Client client4 = new Client(ClientUtils.getNetId());
//        client4.setName("Jamal Puma");
//        client4.setEmail("jamal@hotmail.com");
//        client4.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/client4.JPG");
//        clients.add(client4);
//
//
//        Client client5 = new Client(ClientUtils.getNetId());
//        client5.setName("Dora Keesler");
//        client5.setEmail("dora@yahoo.com");
//        client5.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/client5.JPG");
//        clients.add(client5);
//
//        Client client6 = new Client(ClientUtils.getNetId());
//        client6.setName("Anthony Lopez");
//        client6.setEmail("toney@gmail.com");
//        client6.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/client6.JPG");
//        clients.add(client6);
//
//        Client client7 = new Client(ClientUtils.getNetId());
//        client7.setName("Ricardo Weisel");
//        client7.setEmail("ricardo@gmail.com");
//        client7.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/client7.JPG");
//        clients.add(client7);
//
//        Client client8 = new Client(ClientUtils.getNetId());
//        client8.setName("Angele Lu");
//        client8.setEmail("angele@ymail.com");
//        client8.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/client8.JPG");
//        clients.add(client8);
//
//
//        Client client9 = new Client(ClientUtils.getNetId());
//        client9.setName("Brendon Suh");
//        client9.setEmail("brendon@outlook.com");
//        client9.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/client9.JPG");
//        clients.add(client9);
//
//
//        Client client10 = new Client(ClientUtils.getNetId());
//        client10.setName("Pietro Augustino");
//        client10.setEmail("pietro@company.com");
//        client10.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/client10.JPG");
//        clients.add(client10);
//
//
//        Client client11 = new Client(ClientUtils.getNetId());
//        client11.setName("Matt Zebrotta");
//        client11.setEmail("matt@stopasking.com");
//        client11.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/client11.JPG");
//        clients.add(client11);
//
//        Client client12 = new Client(ClientUtils.getNetId());
//        client12.setName("James McGiney");
//        client12.setEmail("james@outlook.com");
//        client12.setImagePath("https://dl.dropboxusercontent.com/u/15447938/attendanceapp/client12.JPG");
//        clients.add(client12);



        return clients;
    }
}
