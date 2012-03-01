package greschelon

class InvitationTagLib {

def dateFromNow = { attrs ->
    def date = attrs.date
    def niceDate = getNiceDate(date) // implement this somehow...
    out << niceDate
}

}
