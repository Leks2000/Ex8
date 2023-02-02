//Создать приложение, с помощью которого пользователь, введя число n и основание степени x узнает, существует ли
// целочисленный показатель степени y для которого выполняется равенство xy = n. В случае, если показатель
// существует – вычислить его и вывести. В противном случае вывести текст – «Целочисленный показатель не существует».
import kotlin.math.log
fun main()
{
    print("Введите число n для равенства x^y = n: ")
    var n: String = readLine().toString()
    print("Введите x(основание степени) для равенства x^y = n: ")
    var x: String = readLine().toString()
    var text = "Целочисленный показатель не существует"

    var result = log(n.toDouble(),x.toDouble())
    var fraction = result.toString().split('.')
    if (fraction[1] in "0") println(fraction[0]) else println(text)
}