object test{


    def main(args: Array[String]): Unit={
        val arr= new Array[Int](5)
        arr(0)=1;arr(1)=2;arr(2)=4;arr(3)=5;arr(4)=8
        arr(3)=6
        // println(arr(3))
        //This is a test line 
        val ls1= List("a")
        val ls2= List("c", "d")
        val ls3= 1::ls2
        println( ls3(0).getClass())
    }
}