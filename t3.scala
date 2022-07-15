object t3{
    def main(args: Array[String]) = {
        
        def Area(r:Double) = math.Pi *r *r
        println(Area(5))

        
        def Farenheit(c:Double) = c*1.8 +32
        println(Farenheit(35))

        def volume(r:Double) = 4/3*math.Pi*r*r*r
        println(volume(5))


        def shippingcost(books:Int):Double = books<=50 match{
            case true => books*3
            case _ => 50*3 + (books-50)*0.75
        }
        def bookprice(n:Int) = n*24.95*0.6
        def wholesalecost(n:Int) = bookprice(n)+shippingcost(n)
        println(wholesalecost(60))

        def easyTime(d:Double) = d/8
        def tempoTime(d:Double) = d/7
        def runningtime(easy:Int,tempo:Int) = easyTime(easy) + tempoTime(tempo)
        println(runningtime(4,3))
    }
}