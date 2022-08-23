object t5 extends App{
    def prime(n:Int,i:Int=0):Any = i match{
        case x if i==0 =>prime(n,1+Math.sqrt(n).toInt)
        case x if n%2==1 && i==2 => println("True")
        case x if n%i == 0 => println("False")
        case _ => prime(n,i-1)
    }
    prime(41)

    def sum(n:Int):Int = n match{
        case 1 => 1
        case _ => n+ sum(n-1)
    }
    println(sum(5))

    def oddeven(n:Int):Any = n match{
        case 1 => println("Odd")
        case 0 => println("Even")
        case _ => oddeven(n-2)
    }
    oddeven(5)
    oddeven(8)

    def sumeven(n:Int):Int = n match{
        case 1 => 0
        case 2 => 0
        case x if x%2==1 => sumeven(n-1) + n-1
        case _ => sumeven(n-2) + n-2
    }
    println(sumeven(11))
    println(sumeven(12))
    println(sumeven(13))
    
    def fib(n:Int):Int = n match{
        case 1 => 0
        case 2 => 1
        case _ => fib(n-1) + fib(n-2)
    }

    def fibseq(n:Int):Unit = n match{
        case 0 => print("0 ")
        case n => fibseq(n-1);print(fib(n)+" ")
    }
    fibseq(10)
}