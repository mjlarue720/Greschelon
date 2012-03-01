package greschelon;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: michael
 * Date: 10/21/11
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Group {
    private String name;

    //HashMap group1Members = new HashMap();
    //suggested replacement by George (replaces the above... not sure why?)

    Map<String, Person> groupMembers = new HashMap<String, Person>();
    //HashSet<String> localComposite = new HashSet<String>();

    public Group(String name){
        System.out.println("Quack");
        this.name = name;
    }


    //addMember
    public void addMember(Person person){
        String name;
        name = person.getName();
        Group foo;
        foo = this;
        groupMembers.put(name, person);

        System.out.println("Just made " + name + " a member of " + getName() + " group");
        //
        person.updatePersonsMembership(foo);
        getGroupMembership();
    }

    //getMember
    public Person getMember(String name){
        return groupMembers.get(name);
    }

    public List getGroupMembership(){
        List<String> membership= new ArrayList(groupMembers.keySet());
        System.out.println("took a long time but here it is: " + membership);
        return membership;
    }

    //getName
    public String getName(){
        return name;
    }



}
