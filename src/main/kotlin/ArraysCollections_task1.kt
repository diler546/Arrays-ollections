/*
Создать программу, выполняющую следующий функционал:
- запрашивается количество строк и столбцов для двумерного массива
- вводится необходимое количество трехзначных чисел (числа могут повторяться)
- подсчитывается количество различных цифр в полученном массиве
- на консоль выводится двумерный массив из введенных чисел и количество различных цифр используемых в данном массиве
Например, для массива
100 951 101 950
519 999 155 501
510 911 144 554
выведется результат: В массиве использовано 5 различных цифр
*/
fun main() {
    println("Программма преобразует введенное натуральное число из 10-ичной системы в двоичную")
    var string:String=""
    var checkeror=true
    var i:Int=0
    var j:Int=0
    var arrTwoDimens =Array(i){ Array(j){ 0 } }
    while (checkeror) {
        print("Введите количество строк и столбцов (через пробел): ")
        string = readln()
        try {
            var newstring =string.split(" ")
            i = newstring[0].toInt()
            j = newstring[1].toInt()
            if (string == "") {
                println("Строка пустая.")
            }
            else if(i<0||j<0){
                println("Число не должно быть отрицательным")
            }
            else {
                checkeror = false
            }
            for (i1 in 0..<i){
                for(j1 in 0..<j) {println("Введите трехзначное число для ячейки [$i1,$j1]: ")
                    arrTwoDimens[i1][j1] = readln().toInt()
                }
            }
        }
        catch (e:NumberFormatException){
            println("Введите число")
        }
        catch (e:IndexOutOfBoundsException){
            println("Введите число")
        }
    }
    var arrComparison = mutableListOf<Int>()
    var check = true
    var count = 0
for (k in 0..9) {
    for (i1 in 0..<i){
        for (j1 in 0..<j){
    var newarr =arrTwoDimens[i1][j1]
    var hundreds =newarr / 100
    var tens =(newarr % 100)/ 10
    var ones =newarr % 10
    arrComparison.addAll(listOf(hundreds,tens,ones) )
    for (i in 0..<3) {
        if (arrComparison[i] == k && check) {
            count++
            check = false
        }
    }
     arrComparison.clear()
}

}

check=true

}

for (i1 in 0..<i){
    for(j1 in 0..<j){
        print("${arrTwoDimens[i1][j1]} ")
}
println()
}
println("В массиве использовано $count различных цифр")

}
