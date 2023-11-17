fun main() {
    val words = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")

    val wordGroups = mutableMapOf<String, MutableList<String>>()

    for (word in words) {

        val sortedWord = word.toCharArray().sorted().toString()

        if (wordGroups.containsKey(sortedWord)) {
            wordGroups[sortedWord]!!.add(word)
        } else {
            wordGroups[sortedWord] = mutableListOf(word)
        }
    }
    for (group in wordGroups.values) {
        println(group)
    }
}