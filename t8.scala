object t8 extends App{
    case class Point(a:Int,b:Int){
        val x = a
        val y = b

        def +(p:Point)=Point(p.x+this.x,p.y+this.y)
        def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
        def distance(p:Point)=Math.sqrt(Math.pow(p.y-this.y,2)+Math.pow(p.x-this.x,2))
        def invert()=Point(this.y,this.x)
    }
    val p1 = Point(2,3)
    val p2 = Point(5,-1)
    println(p1)
    println(p2)
    println(p2.distance(p1))
    println(p2.invert())
    println(p1+p2)
    println(p2.move(5,11))
}