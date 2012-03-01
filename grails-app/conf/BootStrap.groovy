/*class BootStrap {

    def init = { servletContext ->
    }
    def destroy = {
    }
}*/

import grails.util.GrailsUtil
import greschelon.GPerson
import greschelon.GGroup
import greschelon.GEvent



class BootStrap {
def init = { servletContext ->
switch(GrailsUtil.environment){
case "development":
def a = new GPerson(
name:"Michael Jay LaRue",
email:"mjl@gmail.com"
)
a.save()
if(a.hasErrors()){
println a.errors
}

def b = new GPerson(
name:"Suzy",
email:"suzy@gmail.com"
)
b.save()
if(b.hasErrors()){
println b.errors
}

def c = new GPerson(
name:"Captain Kirk",
email:"jtk@ussenterprise.com"
)
c.save()
if(c.hasErrors()){
println c.errors
}

def d = new GPerson(
name:"Mr Spock",
email:"spock@ussenterprise.com"
)
d.save()
if(d.hasErrors()){
println d.errors
}

def aa = new GGroup(
name:"the Flaming Groovys"
)
aa.save()
if(aa.hasErrors()){
println aa.errors
}

def bb = new GGroup(
name:"Starship Command Staff"
)
bb.save()
if(bb.hasErrors()){
println bb.errors
}

/*def aaa = new GEvent(
name:"Let's Beam Down Now",
//errors on run-app; problems with "date" format
//date: "November 19th, 2011",
time: "10 PM",
duration: "2"
)
aaa.save()
if(aaa.hasErrors()){
    println aaa.errors
}*/

//def reg = new Registration(
//paid:false,
//runner:jane,
//race:trot
//)
//reg.save()
//if(reg.hasErrors()){
//println reg.errors
//}
break
case "production" : break
}
}
def destroy = { }
}

