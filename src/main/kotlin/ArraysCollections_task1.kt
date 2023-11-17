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
    var arrComparison = mutableListOf<Int>()
    var check = true
    print("Введите количество строк и столбцов (через пробел): ")
    var string = readln()
    var newstring =string.split(" ")
    var i = newstring[0].toInt()
    var j = newstring[1].toInt()
    var count = 0
    var arrTwoDimens =Array(i){ Array(j){ 0 } }
    for (i1 in 0..<i){
        for(j1 in 0..<j) {println("Введите трехзначное число для ячейки [$i1,$j1]: ")
            arrTwoDimens[i1][j1] = readln().toInt()
}
    }

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
