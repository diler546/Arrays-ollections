fun main(){
    val alphabet = hashMapOf(
        'А' to 21, 'Б' to 13, 'В' to 4, 'Г' to 20, 'Д' to 22, 'Е' to 1, 'Ё' to 25,
        'Ж' to 12, 'З' to 24, 'И' to 14, 'Й' to 2, 'К' to 28, 'Л' to 9, 'М' to 23,
        'Н' to 3, 'О' to 29, 'П' to 6, 'Р' to 16, 'С' to 15, 'Т' to 11, 'У' to 26,
        'Ф' to 5, 'Х' to 30, 'Ц' to 27, 'Ч' to 8, 'Ш' to 18, 'Щ' to 10, 'Ь' to 33,
        'Ы' to 31, 'Ъ' to 32, 'Э' to 19, 'Ю' to 7, 'Я' to 17
    )

    var text = "Сообщение"
    text = text.uppercase()
    println("Исходный текст:  $text")

    var keyword = "Поле"
    keyword = keyword.uppercase()
    println("Ключевое слово:  $keyword")

//Encrypt
    val encryptResult = StringBuilder()

    for (i in text.indices) {
        val textCharNumber = alphabet.filterKeys { it == text[i] }.values.first()
        val keywordCharNumber = alphabet.filterKeys { it == keyword[i % keyword.length] }.values.first()
        val encryptedCharNumber = (textCharNumber + keywordCharNumber) % 33
        val encryptedChar = alphabet.filterValues { it == encryptedCharNumber }.keys.first()
        encryptResult.append(encryptedChar)
    }

//Decrypt
    val decryptResult = StringBuilder()

    for (i in text.indices) {
        val textCharNumber = alphabet.filterKeys { it == encryptResult[i] }.values.first()
        val keywordCharNumber = alphabet.filterKeys { it == keyword[i % keyword.length] }.values.first()
        val decryptedCharNumber = (textCharNumber - keywordCharNumber + 33) % 33
        val decryptedChar = alphabet.filterValues { it == decryptedCharNumber }.keys.first()
        decryptResult.append(decryptedChar)
    }

    println("Зашифрованный текст: $encryptResult")
    println("Расшифрованный текст: $decryptResult")
}