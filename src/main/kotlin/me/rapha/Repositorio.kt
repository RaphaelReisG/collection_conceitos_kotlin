package me.rapha

class Repositorio <T> {
    private val map = mutableMapOf<String, T>()   // T -> generics

    fun create (id: String, value: T ){
        map[id] = value     // map.put
    }

    fun remove(id: String) =map.remove(id)
    fun findById (id: String) = map[id] // map.get

    fun findAll() = map.values
}
