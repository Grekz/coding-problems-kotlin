object Pangram {
    fun isPangram( str: String ) :Boolean = 
        26 == str.toLowerCase()
                .chars()
                .distinct()
                .filter{ 97 <= it && it <= 122 }
                .toArray()
                .count()
}