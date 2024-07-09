object todays extends App{
    val person1=new Person("oggy", 24)
        println(person1.x)
    val s= person1.name 
    person1.greet("jack")
    person1.greetsimple()
    val a = Array(1,2,3,4)
    val b = Array(2, 4, 1, 3)
    val as = a.toSet
    val bs = b.toSet
    println(as==bs)
    val nonTarget = Set(1487, 4817, 8147)
    println(nonTarget(147))
}

class Person(  val name:String, age:Int){
    val x=2
    println(1+3)
    def greet(name:String): Unit = println(s"${name} says hii, $name")
    
    def greetsimple():Unit=println(s"hii, I am $name")


}