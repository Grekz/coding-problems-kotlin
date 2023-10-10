class Anagram( val base :String ) {
    private val baseOrdered = orderedList(base)
    private fun orderedList( x :String ) = x.toLowerCase().toList().sorted()
    fun match( compareList :List<String> ) :Set<String> =
        compareList
            .filter{
                !it.equals(base, ignoreCase = true) 
                && baseOrdered.equals(orderedList(it))
            }.toSet()
}