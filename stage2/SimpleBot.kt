// Stage 2/5: Print your name
package bot

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    // reading a name
    val myName = scanner.next()

    println("What a great name you have, $myName!")
}
