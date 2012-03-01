package greschelon;

import greschelon.Group;
import greschelon.Person;
import greschelon.GPerson;
import junit.framework.TestCase;

import java.util.Iterator;
import java.util.List;
//this is needed, otherwise newPerson below fails in testFilbert
import static greschelon.GPerson.*;

/**
 * Created by IntelliJ IDEA.
 * User: michael
 * Date: 10/19/11
 * Time: 5:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonTest extends TestCase {
    //
    private Person person;
    private Group groupA;
    private Group groupB;
    private Group groupC;

//    static GPerson newPerson(String name, String email){
//       GPerson person = new GPerson();
//       person.name = name;
//       person.email = email;
//    }

    public void setUp() {
        //
        //the following form based on "bootstrap.groovy"
        //trying to replicate
        //personZ = new GPerson(person.name:"Suzy", person.email:"suzy@gmail.com");
        //personZ = new GPerson("popeye", "sailorman@gmail.com");
        //
        person = new Person("Michael Jay LaRue", "mjlarue720@gmail.com");
        groupA = new Group("the Dimwits");
        groupB = new Group("the Numbskulls");
        groupC = new Group("the Heathens");
    }

    public void testGetName() {
        //
        String name = person.getName();
        assertTrue("Michael Jay LaRue".equals(name));
    }

    public void testGetEmail() {
        //
        String email = person.getEmail();
        assertTrue("mjlarue720@gmail.com".equals(email));
    }

    public void testUpdatePersonsInGroup(){

    }

    public void testUpdatePersonsMembership(){
        person.updatePersonsMembership(groupA);
        person.updatePersonsMembership(groupB);
        person.updatePersonsMembership(groupC);
        String name;
        name = person.getName();

        System.out.println("Just made " + name + " a member of " + groupA.getName());
        System.out.println("Just made " + name + " a member of " + groupB.getName());
        System.out.println("Just made " + name + " a member of " + groupC.getName());
        System.out.println("One of " + name + "'s groups is: " + groupA.getName());
        System.out.println("One of " + name + "'s groups is: " + groupB.getName());
        System.out.println("One of " + name + "'s groups is: " + groupC.getName());
        System.out.println("HashMap contains " + person.memberOf.size() + " key value pairs.");

        System.out.println("the groups that " + name + " belongs to are: " + person.memberOf.values());
        System.out.println(person.memberOf.toString());


        Iterator iterator = person.memberOf.keySet().iterator();

            while (iterator.hasNext()) {
               String key = iterator.next().toString();
               String value = person.memberOf.get(key).toString();
               System.out.println(key + " " + value);
            }
     }
    public void testGetMembershipList(){

        person.updatePersonsMembership(groupA);
        person.updatePersonsMembership(groupB);
        person.updatePersonsMembership(groupC);

        List dummy = person.getMembershipList();
        System.out.println(dummy);
    }
    //
    //stuck again
    /*MJL "made-up" the following code in order to
    * make this java class able to invoke a groovy domain class method
    * not sure the implications of the "funny name" or the implication of there
    * not being a "Filbert" method
    * with GV's help it seems to be working */
    public void testFilbert() throws Throwable {
        GPerson person = newPerson("Happy Squirrel", "StayAwayFromMyNuts@gmail.com");
        person.finalize();
        //
        System.out.println("a new person has been added from PersonTest.java, and his name is Happy Squirrel");
        //
    }
    //
    protected void tearDown() {
    }
}
