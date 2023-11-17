import kotlin.random.Random

data class philosoph(var dir:Char)

fun main(args: Array<String>) {
    println("Введите количество философов")
    var n = readln().toInt()

    var philosoph_:List<philosoph> = List(n) {philosoph(' ')}

    var a:Int = Random.nextInt(0, n)
    for (i in a until n)
    {
        var rand:Int = Random.nextInt(0, 11)
        if (rand < 5)
        {
            philosoph_[i].dir = 'l'
            println("Филосов " + i + ": Левый")
        }
        else
        {
            philosoph_[i].dir = 'r'
            println("Филосов " + i + ": Правый")
        }
    }
    if (a != 0)
    {
        for (i in 0 until a)
        {
            var rand:Int = Random.nextInt(0, 11)
            if (rand < 5)
            {
                philosoph_[i].dir = 'l'
                println("Филосов " + i + ": Левый")
            }
            else
            {
                philosoph_[i].dir = 'r'
                println("Филосов " + i + ": Правый")
            }
        }
    }
    println()
    for (i in a until n)
    {
        if (i != 0)
        {
            if (philosoph_[i].dir == 'l')
            {
                if (philosoph_[i-1].dir == 'r')
                {
                    println(println("Филосов " + i + " - Размышляет"))
                }
                else
                {
                    println(println("Филосов " + i + " - Обедает"))
                }
            }
            else
            {
                println(println("Филосов " + i + " - Обедает"))
            }
        }
    }
    if (a != 0)
    {
        for (i in 0 until a)
        {
            if (i != 0)
            {
                if (philosoph_[i].dir == 'r')
                {
                    if (philosoph_[i+1].dir == 'l')
                    {
                        println(println("Филосов " + i + " - Размышляет"))
                    }
                    else
                    {
                        println(println("Филосов " + i + " - Обедает"))
                    }
                }
                else
                {
                    println(println("Филосов " + i + " - Обедает"))
                }
            }
            else
            {
                if (philosoph_[i].dir == 'l')
                {
                    if (philosoph_[a-1].dir == 'r')
                    {
                        println(println("Филосов " + i + " - Размышляет"))
                    }
                    else
                    {
                        println(println("Филосов " + i + " - Обедает"))
                    }
                }
                else{
                    println(println("Филосов " + i + " - Обедает"))
                }
            }
        }
    }
}