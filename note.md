### 1. val只读变量与java中final的不同之处：在取值的时候，可重写getter函数返回修改的值。

### 2. kotlin中没有基本数据类型，都是对象类型，如Int Float。但我们日常开发中仍要有是否装箱的概念，可空变量装箱，所以变量尽量用不可空变量。
        另外，使用IntArry、FloatArray等也是不装箱的。
      
### 3.object关键字：创建一个类，并且创建一个这个类的对象。直接用来实现单例(且线程安全)，很简单。
        既有 class 关键字的功能，又实现了单例
        
### 4.匿名内部类
```val listener = object: ViewPager.SimpleOnPageChangeListener() {
       override fun onPageSelected(position: Int) {
           // override
       }
   }    
   ```
   
   和 Java 创建匿名类的方式很相似，只不过把 new 换成了 object: 
   
### 5.伴生对象companion修饰（一个类中最多只可以有一个伴生对象，但可以有多个嵌套对象。）
伴生对象：
```class A {
       companion object B {
           var c: Int = 0
       }
   }
```
    调用：A.c
    
嵌套对象：
```class A {
       object B {
           var c: Int = 0
       }
   }
   ```
   调用：A.B.c

### 6.常量（const关键字修饰，Kotlin 中只有基本类型和 String 类型可以声明成常量）

### 7.集合
```Kotlin 中集合分为两种类型：只读的和可变的。这里的只读有两层意思：
   
   集合的 size 不可变
   集合中的元素值不可变
   以下是三种集合类型创建不可变和可变实例的例子：
   
   listOf() 创建不可变的 List，mutableListOf() 创建可变的 List。
   setOf() 创建不可变的 Set，mutableSetOf() 创建可变的 Set。
   mapOf() 创建不可变的 Map，mutableMapOf() 创建可变的 Map。
   
   ---------
   
   不过不可变的可以通过 toMutable*() 系函数转换成可变的集合：
   
   val strList = listOf("a", "b", "c")
               
   strList.toMutableList()
   val strSet = setOf("a", "b", "c")
               
   strSet.toMutableSet()
   val map = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 3)
            
   map.toMutableMap()

   然后就可以对集合进行修改了，这里有一点需要注意下：
   
   toMutable*() 返回的是一个新建的集合，原有的集合还是不可变的，所以只能对函数返回的集合修改。
   ```








