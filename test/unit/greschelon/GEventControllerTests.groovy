package greschelon

import grails.test.*

class GEventControllerTests extends ControllerUnitTestCase {
    GEventController controller
    protected void setUp() {
        super.setUp()
        controller = new GEventController()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testSomething() {
        controller.inviteFoo()

    }
}
