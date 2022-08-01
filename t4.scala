import scala.compiletime.ops.int
object t4 extends App{
    
    def interest(deposit: Double) = deposit match{
        case x if x > 2000000 => x*0.065
        case x if x >200000 => x*0.04
        case x if x > 20000 => x*0.035
        case _ => deposit*0.02
    }


    def PatternMatching()={
        print(("Enter integer: "))
        val i = scala.io.StdIn.readInt()
        i%2==0 match{
            case true => println("Even")
            case false => println("Odd")
        }
        i match{
            case x if x<0 => println("Negative")
            case x if x==0 => println("Zero")
            case x if x>0 => println("Positive")
        }
    }
    PatternMatching()

    def toUpper(s:String)=println(s.toUpperCase())
    def toLower(s:String)=println(s.toLowerCase())

    def u2(s:String)={
        var newstr = s(0).toString() + s(1).toUpper + s.substring(2)
        println(newstr)
    }

    def ulast(s:String)={
        var newstr = s.subSequence(0,s.length()-1).toString + s.last.toUpper
        println(newstr)
    }

    def formatNames(s:String,func:(String)=>Any) = {
        func(s)
    }        

    formatNames("Benny",toUpper)
    formatNames("Niroshan",u2)
    formatNames("Saman",toLower)
    formatNames("Kumara",ulast)

}
