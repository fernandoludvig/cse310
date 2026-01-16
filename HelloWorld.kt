// Entry point of the program
fun main() {
    println("Welcome to the CSE310 Kotlin Demo")

    val user = User("Fernando", 21)
    user.introduce()

    val numbers = mutableListOf<Int>()
    fillList(numbers)
    printList(numbers)

    val average = calculateAverage(numbers)
    println("Average value: $average")

    checkAverage(average)
    simulateMenu(numbers)

}

// Class example
class User(private val name: String, private val age: Int) {

    // Function to introduce the user
    fun introduce() {
        println("My name is $name and I am $age years old.")
    }
}

// Function that fills a list with numbers
fun fillList(list: MutableList<Int>) {
    for (i in 1..10) {
        list.add(i * 2)
    }
}

// Function that prints all values in a list
fun printList(list: List<Int>) {
    println("List values:")
    for (value in list) {
        println(value)
    }
}

// Function that calculates the average of a list
fun calculateAverage(list: List<Int>): Double {
    var sum = 0
    for (value in list) {
        sum += value
    }
    return sum.toDouble() / list.size
}

// Function using conditionals
fun checkAverage(avg: Double) {
    if (avg >= 10) {
        println("The average is high.")
    } else {
        println("The average is low.")
    }
}
// Function that displays a simple menu
fun showMenu() {
    println("-------- MENU --------")
    println("1 - Show numbers")
    println("2 - Show even numbers")
    println("3 - Show odd numbers")
    println("4 - Exit")
}

// Function that filters even numbers from a list
fun getEvenNumbers(list: List<Int>): List<Int> {
    val evens = mutableListOf<Int>()
    for (number in list) {
        if (number % 2 == 0) {
            evens.add(number)
        }
    }
    return evens
}

// Function that filters odd numbers from a list
fun getOddNumbers(list: List<Int>): List<Int> {
    val odds = mutableListOf<Int>()
    for (number in list) {
        if (number % 2 != 0) {
            odds.add(number)
        }
    }
    return odds
}

// Function that simulates user menu selection
fun simulateMenu(list: List<Int>) {
    showMenu()

    val option = 1  // Simulated user choice

    when (option) {
        1 -> printList(list)
        2 -> printList(getEvenNumbers(list))
        3 -> printList(getOddNumbers(list))
        4 -> println("Exiting program...")
        else -> println("Invalid option")
    }
}
