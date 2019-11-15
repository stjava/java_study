/**
 * @Author: cheng guang
 * @Date: 2019/11/7
 */

import com.alibaba.fastjson.JSONObject


//快速创建一个Bean类
data class Person(val id: Long, var name: String, var age: Int)

fun main() {
    // 创建实例
    val zhangsan = Person(0L, "zhangsan", 23)
    // set/get方法
    zhangsan.age = 24
    val name = zhangsan.name

    //copy方法
    val lisi = zhangsan.copy(id = 1, name = "lisi")
    //默认生成的tostring和equals/hashcode方法，可重写
    zhangsan.toString()
    zhangsan.hashCode()
    var isEqual = zhangsan.equals(lisi)

}

fun main(args: Array<String>) {
    print("循环输出：")
    for (i in 1..4) print(i) // 输出“1234”
    println("\n----------------")
    print("设置步长：")
    for (i in 1..4 step 2) print(i) // 输出“13”
    println("\n----------------")
    print("使用 downTo：")
    for (i in 4 downTo 1 step 2) print(i) // 输出“42”
    println("\n----------------")
    print("使用 until：")
    // 使用 until 函数排除结束元素
    for (i in 1 until 4) {   // i in [1, 4) 排除了 4
        print(i)
    }
    println("\n----------------")
    var json1 = JSONObject()
    json1["1"] = 2
    println(json1)

}

