fun main() {

    var sentence: String = " this is a good program"

    println(antiVowel(sentence))
    }


fun antiVowel(text:String): String{
    val result = StringBuilder()
    for(char:Char in text){
        if(!"aeiou".contains(char.toLowerCase())){
            result.append(char)
        }
    }

    return result. toString()

}