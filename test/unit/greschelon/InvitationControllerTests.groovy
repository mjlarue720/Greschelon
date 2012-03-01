package greschelon

import grails.test.*

class InvitationControllerTests extends ControllerUnitTestCase {
/*    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testSomething() {

    }
*/
    void testRenderInvitationHomePage(){
        controller.index()
        assertEquals "From this Page Do All INVITATIONS Flow!", controller.response.contentAsString
    }
}
