package greschelon;

import java.util.*;
/**
 * Created by IntelliJ IDEA.
 * User: michael
 * Date: 10/19/11
 * Time: 4:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    //revert both of following to private
    public String name;
    public String email;

    Map<String,Group>memberOf = new HashMap<String,Group>();
    //todo - the following map is never populated
    Map<String,Person>membership = new HashMap<String,Person>();

    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void updatePersonsMembership(Group group){
        String scramble;
        scramble = group.getName();
        memberOf.put(scramble, group);
    }

//    todo - this always returns an empty list because of the previous "todo"
    public List getMembershipList(){
    List<Person> membershipList = new ArrayList<Person>(membership.values());
        return membershipList;
    }
}