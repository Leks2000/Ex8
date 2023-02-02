//Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.
fun main()
{
    println("Введите натуральное число: ")
    var forreverse: String = ""
    var x: Int  = readLine().toString().toInt()
    while(x >= 1)
    {
        forreverse += (x%2).toString()
        x/=2
    }
    println(forreverse.reversed())
}

