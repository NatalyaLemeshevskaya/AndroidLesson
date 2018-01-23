package by.itacademy.Task1

fun main(arg: Array<String>){

    var student  =  Student()
    student.age = 15
    var nam = student.name
    student.surname = "sass"


    var a : Int? = null
    //если а не 0,то вып конструкция, если нул то присвоит 25
    var e :Byte =  a?.toByte() ?: 25
   // when()= switch
    val i = 50
    when(i){
        in 10..40 -> {

        }
        50 ->{

        }
        else ->{

        }
    }


    for(a in arg){

    }

   // val list: MutableList<String>

    println("Hi")
}
//входящте значения в метод всегда val-неизменяемая(final)
fun test(value : Int){
    println("hi"+value)
}