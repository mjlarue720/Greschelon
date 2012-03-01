package greschelon

class InvitationController {
    //this line required to "inject" service into controller
    //'type' followed by 'variable' (per GV) - at some point I need an explanation of how/why this is needed
    def InvitationService invitationService
//Finally worked!
    def serviceMethod1 = {
        invitationService.printFromServiceCLass.call()
    }

    def serviceMethod2 = {
        invitationService.makeMessageText.call()
    }

    //default is to present "index" action
    //can either "render" or "redirect(to the GEvent "list" action)"
    //comment/uncomment the pair to experiment
    def index = {
        render "From this Page Do All INVITATIONS Flow!"
        //redirect action: "list", controller: "GEvent"
    }

}
