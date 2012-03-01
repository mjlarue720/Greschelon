package greschelon

class GEventController {
    def scaffold = GEvent
//CN: Controllers should not contain public methods, only closures.  Public methods should be moved to utility or other classes,
    void inviteFoo(){
//todo - figure out why this method executes even though the first line is flagged
//todo - how do I fix this?
        //InvitationO invitation = new InvitationO("foo")
        //invitation.setText("Please come to the fucking party")
        //String subject = invitation.getSubject()
        println 'pesky problem'
        //println invitation.text
    }

    void inviteBar() {
        println "happy days are here again!"
    }

    def invite = {
      inviteFoo()
    }
}
