package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    penggunaanTryCatchPrime(31, 20)
}

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    // Contoh Kasus: Penggunaan try-catch untuk menangani kesalahan saat pemeriksaan bilangan prima

    fun penggunaanTryCatchPrime(number1: Int, number2: Int) {
        println("\nCoba Try Catch Prime:")

        try {
            checkPrimeNumber(number1)
            println("$number1 Merupakan Bilangan Prima")
        } catch (e: IllegalArgumentException) {
            println("$number1 Terjadi Error ${e.message}")
        }

        try {
            checkPrimeNumber(number2)
            println("$number2 Merupakan Bilangan Prima")
        } catch (e: IllegalArgumentException) {
            println("$number2 Terjadi Error ${e.message}")
        }
    }

fun checkPrimeNumber(number: Int) {
    if (number <= 1) {
        throw IllegalArgumentException("Bilangan harus lebih besar dari 1")
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            throw IllegalArgumentException("(Bukan Bilangan Prima)")
        }
    }
}


