package 알고리즘.자바와_비교.출력

fun main(args: Array<String>) {
    val s1 = readLine()!!

    for (i in s1.indices) {
        if (s1[i] in 'a'..'z') print(s1[i].uppercase())
        else print(s1[i].lowercase())
    }

    /*
      println("!@#\$%^&*(\\'\"<>?:;") // !@#$%^&*(\'"<>?:;
     */
}

class 대소문자_바꿔서_출력하기 {
}