package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini

    val bilanganGenap = (1..100).filter { it % 2 == 0 }

    println("Latihan 1 List Bilangan Genap: $bilanganGenap")


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
     */
    // Buat di bawah sini

    val month = mapOf("Jan" to "January", "Feb" to "February", "Mar" to "March", "Apr" to "April", "May" to "May", "Jun" to "June", "Jul" to "July", "Aug" to "August", "Sep" to "September", "Oct" to "October", "Nov" to "November", "Dec" to "December")

    println("\nLatihan 2 Map Daftar nama bulan dalam setahun: ")
    println("Map: " + month)
    println("Map Keys: " + month.keys )
    println("Map Values: " + month.values )

    /**

     Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
     - Jan -> January
     - Feb -> February
     - Dst...
     */
     //Buat di bawah sini
    println("\nCetak Nama bulan dalam setahun dengan fungsi forEach:")
    month.forEach { (key, value) ->
        println("$key -> $value")
    }
    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    println("\nNama Bulan Sekarang dan Bulan Lahir:")
    val monthNow = month["Nov"]
    val birthMonth = month["Jan"]
    println("It's $monthNow now, I was born in $birthMonth")

}