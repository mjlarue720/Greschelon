package greschelon;

import greschelon.Event;
import greschelon.GPerson;
import junit.framework.TestCase;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: michael
 * Date: 10/19/11
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class EventTest extends TestCase {

    private Event event;
    private Person person;
    private Person person1;
    private Person person2;
    private Person person3;
//
//    private GGroup group = new GGroup("the Bizarro's");
    private Group groupA;
    private Group groupB;
    private Group groupC;

    protected void setUp() {
        event = new Event("Movie Night","November 19th, 2011", "7:30 PM", 4);
        person = new Person("Michael Jay LaRue", "mjlarue720@gmail.com");
        groupA = new Group("the Dimwits");
        groupB = new Group("the Numbskulls");
        groupC = new Group("the Heathens");
    }

    public void testGetName(){
        String name = event.getName();
        assertTrue("Movie Night".equals(name));
        //System.out.println("blank"); //only here to create a blank line
        System.out.println("\ngreschelon.Event Name: " + event.getName());
    }

    public void testGetDate(){
            String date = event.getDate();
            assertTrue("November 19th, 2011".equals(date));
            System.out.println("greschelon.Event Date: " + event.getDate());
        }

    public void testGetTime(){
        String time = event.getTime();
        assertTrue("7:30 PM".equals(time));
        System.out.println("greschelon.Event Time: " + event.getTime());
    }

    public void testGetDuration(){
        int duration = event.getDuration();
        assertEquals(4, duration);
        System.out.println("Duration  : " + event.getDuration() + " hours");
    }

    public void testIntendedForGroup(){
//        event.intendedForGroup(groupA);
//        event.intendedForGroup(groupB);
//        event.intendedForGroup(groupC);
        String name;
        name = event.getName();
        System.out.println("Just made '" + name + "' applicable to " + groupA.getName() + " group");
        System.out.println("Just made '" + name + "' applicable to " + groupB.getName() + " group");
        System.out.println("Just made '" + name + "' applicable to " + groupC.getName() + " group");
    }

    public void testIntendedForPerson(){
        event.intendedForPerson(person);
        String name;
        name = event.getName();
        System.out.println("Just made '" + name + "' applicable to the person " + person.getName());
    }

    //random additions from session with George
    public void testFoo() {
        String eventString = event.toString();
        assertTrue(eventString != null);
    }

    public void testGetBody(){
        String body;
        body = event.getBody();
        System.out.println("\nWoof");
        System.out.println("\nThe body of any invitation to this event will look like this:\n" + body);
        //retaining the lines below because they allude to how to "wrap" text, assuming presence of the right libraries
        //System.out.println(body);
        //System.out.println("\nWrap length of 30:\n" + WordUtils.wrap(body, 30));
    }

    public void testGetMailingList(){

        event = new Event("Hootchie Koochie Dance", "November 25th, 2011", "10:30 PM", 3 );
        person = new Person("Michael Jay LaRue", "mjlarue720@gmail.com");
        person1 = new Person("Jimmy Page", "jp@ledzeppelin.com");
        person2 = new Person("Robert Plant", "robert@zeppelin.com");
        person3 = new Person("Eddie Vedder", "eddie@pearljam.com");

        groupA.addMember(person);
        groupA.addMember(person1);
        groupA.addMember(person2);
        groupB.addMember(person);
        groupB.addMember(person1);
        groupB.addMember(person2);
        groupC.addMember(person);
        groupC.addMember(person1);
        groupC.addMember(person2);
        //the following line adds eddie vedder to groupC - confirms that "set" function works by not duplicating Eddie
        //who has previously been added as an individual
        groupC.addMember(person3);

//        event.intendedForGroup(groupA);
//        event.intendedForGroup(groupB);
//        event.intendedForGroup(groupC);

        event.intendedForPerson(person);
        event.intendedForPerson(person1);
        event.intendedForPerson(person2);
        event.intendedForPerson(person3);

        System.out.println("Just made '" + event.getName() + "' applicable to " + groupA.getName() + " group");
        System.out.println("Just made '" + event.getName() + "' applicable to " + groupB.getName() + " group");
        System.out.println("Just made '" + event.getName() + "' applicable to " + groupC.getName() + " group");

        //List <String> groupNamesforAnEvent =  event.getMailingList();
        //System.out.println(groupNamesforAnEvent + " what is going on here? print of List groupNamesForAnEvent =  event.getMailingList();");

        System.out.println("\n" + event.getMailingList() + " as printed from inside 'the test rig'");

        //System.out.println("The 'eventForGroup' HashMap contains " + event.eventForGroup.size() + " key value pairs.");
        //System.out.println("\nRetrieving all keys from the 'eventForGroup' HashMap");



//      Iterator iterator = event.eventForGroup.keySet().iterator();

//        while(iterator. hasNext()){
//            System.out.println(iterator.next() + "     test word");
//        }
//
//        System.out.println("\nA simple printout of eventForGroup HashMap: " + event.eventForGroup);


    Set<GPerson> foo = event.getMailingList();
        System.out.println("\nplease work!!!" + foo);
    }


    protected void tearDown() {
        // release objects under test here, if necessary
    }
}
