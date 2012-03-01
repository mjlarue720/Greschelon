package greschelon

class GGroup {

    String name

    //many to many relationship example gleaned from link -->     http://chrisbroadfoot.id.au/2008/07/19/many-to-many-relationship-mapping-with-gorm-grails/
    static hasMany = [members :GPerson]
    static belongsTo = [GPerson]
//
     String toString(){
        return "${name}"
    }
    /**
     * Returns group members as a set
     * @return set of group members
     */
    public Set<GPerson> groupMembers(){
     return members
    }
    /**
     * Return group members as a map keyed to member name
     * @return group member map
     */


    public Map<String,GPerson>groupNamedMemberMap(){
        Map<String,GPerson>persons = new HashMap<String,GPerson> ()
        for(GPerson person: members){
            persons.put(person.getName(),person)
        }
        return persons;
    }

    static constraints = {

        name()
    }

       static GGroup newGroup(String name){
       GGroup group = new GGroup()
       group.name = name
       return group
    }
}