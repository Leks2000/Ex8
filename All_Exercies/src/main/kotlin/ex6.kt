//Создать приложение, в котором пользователь вводит две различных цифры. На выходе приложение выдает,
// если это возможно, из введенных цифр, нечетное число. Результат выводится в консоль.
// При невозможности создать нечетное число выводится сообщение – «Создать нечетное число невозможно»
fun main()
{
    println("Введите два числа через пробел: ")
    var str = readLine()!!.split(" ")
    println("Нечетные числа: ")
    var odd = false
    var i = 0
    while (i < str.size) {
        if ((str[i] != " ") && (str[i].toDouble() % 2) == 1.0) {
            println(str[i])
            odd = true
        }
        i++;
    }
    if (!odd)println("Создать нечетное число невозможно!")
}