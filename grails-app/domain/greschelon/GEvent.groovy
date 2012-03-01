package greschelon

class GEvent {

    String name
    Date date
    String time
    int duration

    static hasMany = [invitedGroups : GGroup]
    static belongsTo = [GGroup]

    String toString(){
        return "${name}"
    }

    static constraints = {
        name()
        date()
        time()
        duration()
    }

    static GEvent newEvent(String name, Date date, String time, int duration){
       GEvent event = new GEvent()
       event.name = name
       event.date = date
       event.time = time
       event.duration = duration
    }
}
