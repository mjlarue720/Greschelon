package greschelon

class GPersonController {
    def scaffold = GPerson
    
    def muggleTest = {
        // your test goes here...
        GPerson person = GPerson.newPerson("doody", "pants@gmail.com");
        person.finalize();
        //
        System.out.println "A new person has been added, again, and his name is Doody";
        //

    }
}
