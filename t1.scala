object t1{
    import scala.language.postfixOps
    def main(args: Array[String]) = {
        var k,i,j = 2
        var m,n = 5
        var f = 12.0
        var g = 4.0
        var c = 'X'
        println(k+12*m)
        println(m/j)
        println(n%j)
        println(m/j*j)
        println(f+10*5+g)
        // println(++i*n)

        var (a,b,c2,d,k2) = (2,3,4,5,4.3)
        // println(--b*a+c*d--)
        // println(a++)
        println(-2*(g-k2)+c2)
        // println(c=c++)
        // println(c=++c*a++)

        def otpay(a:Int) = a*85
        def normalpay(a:Int) = a*250
        def taxed(a:Int) = a*0.88
        def monthlysalary(ot:Int, wh:Int) = 4*taxed(otpay(ot) + normalpay(wh))
        println("monthly salary = " + monthlysalary(30,40))

        def people(price:Int) = 120 - (price-15)*20/5
        def cost(price:Int) = 3 * people(price) + 500
        def revenue(price:Int) = price * people(price)
        def profit(price:Int) = revenue(price)-cost(price)
        print("Best price is "+ List.range(1,50).map(x=>(x,profit(x))).reduce((x,y)=> if (x._2>y._2) x else y)._1 + "\n")
    }
}