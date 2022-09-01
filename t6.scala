object t6 extends App{

    def encrypt(arr:Array[Int],shift:Int)={
        arr.map(x=>{
            if (x>=65 && x<=90)
                (x-65+shift)%26 + 65
            else if (x>=97 && x<=122)
                (x-97+shift)%26 + 97
            else x 
        })
    }

    def decrypt(arr:Array[Int],shift:Int)={
        arr.map(x=>{
            if (x>=65 && x<=90)
                (x-65-shift+26)%26 + 65
            else if (x>=97 && x<=122)
                (x-97-shift+26)%26 + 97
            else x 
        })
    }

    def Cipher(f1:(Array[Int],Int)=>(Array[Int]),s:String,shift:Int)={
            val arr = s.toCharArray().map(_.toInt)
            val a = f1(arr,shift).map(_.toChar).foreach(print)
            println()
    }

    Cipher(encrypt,"A B | Y Z | a b | y z",14)
    Cipher(decrypt,"Zwts'g Ufsoh",14)
}