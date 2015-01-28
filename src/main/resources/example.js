println("Methods")
ext.getClass().getDeclaredMethods().forEach(function(m) {
    println(m)
})

var result = ext.func(2)
println(result)
