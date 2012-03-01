package greschelon;

import greschelon.Event;
import greschelon.Group;
import greschelon.Person;
import junit.framework.TestCase;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: michael
 * Date: 10/21/11
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class GroupTest extends TestCase{

    private Event event;
    private Group group;
    private Person person1;
    private Person person2;
    private Person person3;

    //protected void setUp(){
    //reference on JUnit --> http://junit.sourceforge.net/doc/testinfected/testing.htm
    //more reference --> http://junit.sourceforge.net/doc/faq/faq.htm
    public void setUp(){
       //setup a new group
       group = new Group("Michael's Movie Friends");
       assertTrue(group.groupMembers.isEmpty());
       System.out.println("It is " + group.groupMembers.isEmpty() + " that the Hash Map is empty");
       person1 = new Person("Emile", "emile@gmail.com");
       person2 = new Person("Suzy Q", "sexyMamaCamelCase@gmail.com");
       person3 = new Person("michael", "mjl@gmail.com");

       System.out.println("setUp has been called and completed");
    }

    public void testIsEmpty(){
        //
        rig0ne();
        //
        assertFalse(group.groupMembers.isEmpty());
        System.out.println("test of isEmpty has been completed");
    }

        public void rig0ne(){
            System.out.println("rigOne setup has been initiated");
            //group = new greschelon.Group("Michael's Movie Friends");
            //assertTrue(group.groupMembers.isEmpty());
            System.out.println("It is " + group.groupMembers.isEmpty() + " that the Hash Map is empty");
            //person1 = new greschelon.Person("Emile", "emile@gmail.com");
            //person2 = new greschelon.Person("Suzy Q", "sexyMamaCamelCase@gmail.com");
            event = new Event("Summer Solstice", "June 25th, 2011", "10:30 PM", 3);

            group.addMember(person1);
            group.addMember(person2);
            group.addMember(person3);
            //event.getMailingList();
       //
       //event = new greschelon.Event("Torn and Frayed", "11/08/2011", "10:00", 6);
       //event.compositeEmailSet.add("fatandhappy@gmail.com");
       //
            System.out.println("It is " + group.groupMembers.isEmpty() + " that the Hash Map is empty");
            System.out.println("rigOne setup has been completed");
        }
//
   public void testAddMember(){
       System.out.println("test of addMember has been initiated");
       System.out.println("It is " + group.groupMembers.isEmpty() + " that the Hash Map is empty");
       group.addMember(person1);
       System.out.println("Just added: " + group.groupMembers.get("Emile"));
       System.out.println("It is " + group.groupMembers.isEmpty() + " that the Hash Map is empty");
       group.addMember(person2);
       System.out.println("Just added: " + group.groupMembers.get("Suzy Q"));
       group.addMember(person3);
       System.out.println("Just added: " + group.groupMembers.get("michael"));
       System.out.println("It is " + group.groupMembers.isEmpty() + " that the Hash Map is empty");

       System.out.println("HashMap contains " + group.groupMembers.size() + " key value pairs.");

       System.out.println("test of addMember has been completed");
    }

    //   System.out.println("HashMap contains " + group.groupMembers.size() + " key value pairs.");

    public void testValueIsMappedWithWhatKey(){
//        greschelon.Person one = group.getMember("Emile");
//        greschelon.Person two = group.getMember("Suzy Q");
//        assertTrue(one != null);
//        assertTrue(one == null);
//        assertTrue(two == null);
        System.out.println("start to the method testValueIsMappedWithWhatKey");
        group.addMember(person1);
        System.out.println("Just added: " + group.groupMembers.get("Emile"));
        group.addMember(person2);
        System.out.println("Just added: " + group.groupMembers.get("Suzy Q"));
        Person one = group.getMember("Emile");
        Person two = group.getMember("Suzy Q");

        assertTrue(one != null);
        assertTrue(two != null);
        System.out.println("Value mapped with key \"Emile\" is " + one);
        System.out.println("Value mapped with key \"Suzy Q\" is " + two);
        System.out.println("Finish testValueIsMappedWithWhatKey");

    }

    public void testGetMember(){
        //
        rig0ne();
        //this is not a correct test because this method returns a greschelon.Person object, not a string
        //assertEquals(group.groupMembers.get("Emile"), "Emile");
    }

    public void testGetMemberList(){
        rig0ne();
        System.out.println(group.groupMembers + "\t\tJoy! Joy!");
    }

    public void testGetGroupMembership(){

    }

    public void testGetName() {
        String name;
        name = group.getName();
        assertTrue("Michael's Movie Friends".equals(name));
        System.out.println("the Name of the greschelon.Group is: " + group.getName());
    }

   public void testHashMapContents(){
   //
   rig0ne();
   //
       if(group.groupMembers.containsKey("Suzy Q")){
                System.out.println("HashMap contains 'Suzy Q' as key");
            }else{
                System.out.println("HashMap does not contain 'Suzy Q' as key");
            }
   }

    public void testUpdateMembership(){

        rig0ne();

        List<String> membership = group.getGroupMembership();
        for (String dummy : membership){
            Person person = group.groupMembers.get(dummy);
            String email = person.getEmail();
            //fix
            //List<String> mails = event.compositeEmailSet;
            event.compositeEmailSet.add(email);
            System.out.println("email: " + email);
            System.out.println(event.compositeEmailSet + " Did this finally work?");
        }
    }

    public void testGetMembership(){
        //
        //prints correctly but I don't think this method is set up right (no getMembership)
        //
        rig0ne();
        //
        //List<greschelon.Person> membership= new ArrayList(group.groupMembers.values());
        System.out.println(group.groupMembers.values());
    }

    public void tearDown(){
    }

}
