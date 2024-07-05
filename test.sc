import scala.annotation.tailrec
object test extends App {

    val acodeblock ={
            val a=2
            val b=4
            val result1 = if(a>b) a+b else a-b
            val ar="hii"
            val br= "by"
            if(!ar.isEmpty()) (result1,ar+br) else br
    }
    println(acodeblock)
    println(acodeblock.getClass())
    
    def aGreetFunction(name: String, age: Int): Unit= println("hi, my name is "+ name + " and i am "+age + " years old.")
    // aGreetFunction("Parveen", 21)

    def afactorial(n:Int): Int={
        if(n<=1) 1
        else n*afactorial(n-1)
    }
    // println(afactorial(5))
    def afibonacci(n:Int): Int={
        if(n==1) 1
        else if(n==2) 1
        else afibonacci(n-1)+afibonacci(n-2)
    }
    // println(afibonacci(3))

    // tail recursive approach for concatenation
    def concatTailrec(str:String , n:Int):String={
        def helper(str: String, t:Int , accum:String):String ={
            if(t<=1) accum
            else helper(str,t-1,str+accum)
        }

        helper(str,n,str)
    }
    println(concatTailrec("hello",3))

    // tail recursive approach for checking prime
    def isPrime(n:Int): Boolean={
         def isPrimeTailRec(t:Int, isStillPrime: Boolean): Boolean={
            if(!isStillPrime) false
            else if(t<=1) true
            else isPrimeTailRec(t-1,(n%t!=0)&&isStillPrime)
         }
         isPrimeTailRec(n/2,true)
    }
    println(isPrime(2003))
    println(isPrime(69))
}