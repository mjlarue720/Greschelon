package greschelon

class GPerson {

    String name
    String email

    static hasMany = [groups : GGroup, events : GEvent]
    //static belongsTo = [GGroup]

    String toString(){
        return "${name}"
    }


    static constraints = {
    name()
    email()
        //the following line allows for creation of a person
        //without first having created a group for the person
        //to belong to
        groups(nullable:true)
    }

    /*this method (not part of the stock domain
    * class structure - added so as to enable a java class
    * to call and make a "newPerson"
    * then the method below saves it (making the java
    * class utilize groovy functionality*/

    public static GPerson newPerson (String name, String email ) {
       GPerson person = new GPerson()
       person.name = name
       person.email = email
       return person
    }
    /*the following was added during session
    * with GV on 2-1-2012
    * it is required because the save method
    * is only available within the groovy domain class
    * and to expose it to any java class it must be
    * wrapped as shown
    * */
    public void finalize(){ this.save() }  //note that this line is problematic... produces non-fatal runtime error (my words which may be "clumsy")
}
//2012-02-03 14:49:26,490 [Finalizer] ERROR events.PatchedDefaultFlushEventListener  - Could not synchronize database state with session
//org.hibernate.HibernateException: No Hibernate Session bound to thread, and configuration does not allow creation of non-t