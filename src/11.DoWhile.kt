fun main() {

//sampleStart
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    //do while

    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    // Eat a cake
    // Eat a cake
    // Eat a cake
    // Bake a cake
    // Bake a cake
    // Bake a cake

//Exercise


//sampleEnd
}