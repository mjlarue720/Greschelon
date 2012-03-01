package greschelon;//import java.util.Calendar;
//import java.util.Date;
import greschelon.GGroup;
import greschelon.GPerson;

import java.util.*;

//import greschelon.GGroup.groupMembers;

/**
 * Created by IntelliJ IDEA.
 * User: michael
 * Date: 10/17/11
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Event {

//    private GGroup group;
    private String name;
    private String date;
    private String time;
    private int duration;

    private Set<GGroup>groups = new HashSet<GGroup>();                      // I (George) did this... fixed per analysis
    Set<GPerson>recipients = new HashSet<GPerson>();                 // I (George) did this
    Map<String, Person>eventForPerson = new HashMap<String, Person>();

    StringBuilder message = new StringBuilder();

    public List<String> compositeEmailSet;
    public Set<GPerson>membershipFromGrails;

    public Event(String name, String date, String time, int duration){
        this.name = name;
        this.date = date;
        this.time = time;
        this.duration = duration;

        this.compositeEmailSet = new ArrayList<String>();
        }
//
//
    public Set<GPerson> getMailingList(){

        List<String> personsForEvent = new ArrayList<String>(eventForPerson.keySet());
        //      should add each individual in each group associated with an event
        List<Person> personsEmailForEvent = new ArrayList<Person>(eventForPerson.values());
        //      List<greschelon.Group> personsOfGroupForEvent = new ArrayList<greschelon.Group>(eventForGroup.values());
        //      System.out.println("\n" + personsOfGroupForEvent + "<----there it is");

        HashSet<String>compositeEmailSet = new HashSet<String>();

        System.out.println("\nhappy    : " + personsForEvent);
        //       System.out.println("sad      : " + groupsForEvent);
        System.out.println("ecstatic : " + personsEmailForEvent +"\n");

        //attempting to extract members for an invited GGroup
//        Set<GPerson>membershipFromGrails = group.groupMembers();

//        for(GPerson p: membershipFromGrails){
//            String name = p.getName();
//            System.out.println(name + "frustration?");
//        }
        //

        //loop through the list, retrieve and print email for each
        // person that has been invited as an individual
        //List poop = group.getGroupMembership();
        //compositeEmailSet.addAll(poop);
        for(Person person : personsEmailForEvent){
            String email = person.getEmail();
            compositeEmailSet.add(email);// <-------------IMPORTANT
            System.out.println(compositeEmailSet);
            System.out.println("email: " + email);
        }

        //after adding persons as individuals, loop on the group
        //group.getGroupMembership();
        //testing this line because "group" was null prior to the point program was failing
        // "greschelon.EventTest testGetMailingList runs successfully when the line below is uncommented, but it fails otherwise

        //we fixed it here


        for(GGroup group : groups){
            String groupName = group.getName();
            System.out.println("name of group: " + groupName);
            Map<String,GPerson>namedMembers = group.groupNamedMemberMap();
            System.out.println("includes: " + namedMembers);

            recipients.addAll(group.groupMembers());

            System.out.println("all the people: " + recipients);
        //the line, 2 below, results from my realization that group was null - test ran, but result was empty - compiled, but wrong
        //Brian helped with the above outside loop which properly initialized group
        //greschelon.Group group = new greschelon.Group("test");
        //    List<String>membership = GGroup.groupMembers();
//
//            for (GGroup name : groups){
//                greschelon.Person person = GGroup.groupMembers.get();
//                String email = group.groupMembers();
//                //fix
//                //List<String> mails = event.compositeEmailSet;
//                compositeEmailSet.add(email);
//                System.out.println("email: " + email);
//                System.out.println(compositeEmailSet + " Did this finally work?");
            }
        return recipients;
    }

    public String getName(){
        return name;
    }

    public String getDate(){
        return date;
    }

    public String getTime(){
        return time;
    }

    public int getDuration(){
        return duration;
    }
//************************************************************
//    public void intendedForGroup(greschelon.Group group){
//        eventForGroup.add(group);
//    }
//************************************************************

    public void intendedForPerson(Person person){
        String scramble;
        scramble = person.getName();
        eventForPerson.put(scramble, person);
    }
    public String getBody(){
        message.append("You are cordially invited to attend the event '" + name + "' ");
        message.append("which is scheduled to take place on " + date + " ");
        message.append("and which will start promptly at " + time + ", ");
        message.append("and, if all goes as planned, will last for approximately " + duration + " hours.");
        message.append(" Please logon at www.echelon.com to accept, decline, or propose a change for this event.");

        return message.toString();
     }


}