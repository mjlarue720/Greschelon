package greschelon

class InvitationService {

    static transactional = true
    static def printFromServiceClass

    def printFromServiceCLass = {
        println "oh my gosh!"
    }

    def makeMailingList = {
        //mailing list code
    }

    def makeMessageText = {
        //  Make types as specific as you can.  THis helps the IDE find errors.
        String name = "Happy Robot Dance until Dawn!"
        String date = "February 22nd"
        def duration = "1"
        def time = "10AM"
        def message =
        """        You are cordially invited to attend the event '${name}'
        which is scheduled to take place on ${date} and which will
        start promptly at ${time}, and, if all goes as planned, will
        last for approximately ${duration} hours.

        Please logon at www.echelon.com to accept, decline, or propose a change for this event."""

        println message
    }

    //CN:  Look at book examles.  Use methods here, not closures.
    //  make above defs look like this (which has been fixed                                                                   //
    void makeMessageSubject(){
        //compose the subject line (based off of event
        //name)
    }
}
