object t7 extends App{
        class Rational(x:Int, y:Int){

            val n = x
            val d = y
            def +(that:Rational)=
                new Rational(this.n*that.d + that.n*this.d,this.d*that.d)
            def neg() = new Rational(-this.n,this.d)
            def -(that:Rational)= this+that.neg()
            def Ts()= println(this.n+"/"+this.d)

        }

        val v = new Rational(13,37)
        v.Ts()
        v.neg().Ts()

        val x = new Rational(3,4)
        val y = new Rational(5,8)
        val z = new Rational(2,7)

        (x-y-z).Ts()


        class Account(idno:String,b:Double){
            val id:String = idno
            var balance: Double = b

            def print() = 
               println("ID: "+ this.id + "\t" + "balance: "+ this.balance)
            def withdraw(a:Double)= this.balance = this.balance-a
            def deposit(a:Double) = this.balance = this.balance+a
            def transfer(a:Account,b:Double)={
                this.withdraw(b)
                a.deposit(b)
            }
        }
        val e = new Account("#1",2000)
        val f = new Account("#2",5000)
        val g = new Account("#3",-2000)
        val h = new Account("#4",5000)
        val i = new Account("#5",-3000)
        val j = new Account("#6",4000)

        val bank = List(e,f,g,h,i,j)

        val negbalance = (accounts:List[Account])=> accounts.filter(x=>x.balance<0)
        negbalance(bank).map(x=>x.print())

        val total = (accounts:List[Account])=> 
                accounts.reduce((x,y)=>{new Account("sum",x.balance+y.balance)})
        println("Sum of all accounts = "+total(bank).balance)
        
        def interest(acc:Account):Double = acc.balance<0 match{
            case true=> acc.balance * 0.1
            case false=> acc.balance * 0.05
        }
        val finalbalance= (accounts:List[Account])=>
            total(accounts.map(x=>{x.deposit(interest(x));x}))
        println("Final balance of all accounts = "+finalbalance(bank).balance)

    }
