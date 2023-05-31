object Main {
  def main(args: Array[String]): Unit = {
    //    println("Hello world!")
    var arr = Array(10, 20, 30, 40, 50, 60)
    //    for (i <- 0 to arr.length-1){
    //      println(arr(i))
    //    }
    //    arr.foreach(i=>println(i))
    //    var arr2 = arr.filter(i=>i%3==0)
    //    arr2.foreach(i=>println(i))
    //    var arr3 = arr.filter(_%3==0).foreach(println)
//    var a = List(1,2,3)
//    var b = List(4,5,6)
//    :: +: :+ ++ ++: :::
//      这些符号全都是连接的作用
//    ，将元素与集合
//    、集合与集合相连接
//    var c = a :: b
//    c = b :: a
//    c = a+:b // 效果等同于 a::b
//    c = b+:a
//    c = a:+b
//    c = a+:b
//    c = a++b
//    c = a++:b
//    c = a:::b
//    println(c)
//    println(arr.getClass.getName )
//    var  c = "&^"
//    println(c + "." * 10)
//    var a = 10
//    var b = 10
//    var c = new String("10")
//    var d = new String("10")
//
//    println(a,b,c,d)
//    println(a == b)
//    println(c == d)
//    //scala中的==先检查左侧是否为null，不是就调用左侧的equals()进行检查而equals只比较值是否相等
//    println(c.eq(d))
    //eq是比较引用是否相对比较的是两个对象的地址是否相等
//    println(c.equals(a))
    //  def add(a: Int, b: Int) => Int = a + b
//    var a = 10
//    var b = if(a>1) 1 else 0
//    println(pd(a))
//    //等价于
//    //方法声明时注意
//    //1.写清变量的类型和返回值的类型
//    //2.return 可以不写
//    //scala中没有++和--同时scala不建议使用while和do while但可以用
//    def pd(a:Int):Int = {
//      if(a>1) 1 else 0
//    }
//    for(i <-1 to 10 if(i%2==0) ){
//
//        println(i)
//    }
    //定义数组
    var a = Array(1,2)
    for (i <- 0 until a.length){
      println(arr(i))
    }
  }
}
