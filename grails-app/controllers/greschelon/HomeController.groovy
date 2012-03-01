package greschelon

class HomeController {
//homepage superstructure created
//via reference to "http://jan-so.blogspot.com/2009/04/creating-home-and-admin-page.html"

    def index = {
       render (view:'home')
    }
}
