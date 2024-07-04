

final class test$_ {
def args = test_sc.args$
def scriptPath = """test.sc"""
/*<script>*/
object test{


    def main(args: Array[String]): Unit={
        val arr= new Array[Int](5)
        arr(0)=1;arr(1)=2;arr(2)=4;arr(3)=5;arr(4)=8
        arr(3)=6
        // println(arr(3))
        val ls1= List("a")
        val ls2= List("c", "d")
        val ls3= 1::ls2
        println( ls3(0).getClass())
    }
}
/*</script>*/ /*<generated>*//*</generated>*/
}

object test_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new test$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export test_sc.script as `test`

