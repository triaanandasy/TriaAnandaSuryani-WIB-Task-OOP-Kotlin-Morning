package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Tria Ananda"
    val lastName: String = "Suryani"
    val age: Int = 20
    val status: Boolean = true

    println("Nama Saya Adalah: $firstName $lastName")
    println("Umur Saya: $age tahun")
    println("Status: ${if (status) "Single" else "Tidak Single"}")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("\nNama Grup saya adalah: $groupId")
    println("Anggota Grup:")
    groupMember.forEachIndexed { index, it ->
        println("${index + 1}. $it")
    }
    println("Sesi: $session")
    return "Detail Group"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(member: List<Any>): Any{
    return member[0]
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(countOfGroup: List<String>): Int {
    val mentor = arrayOf<String>("Kak Reynaldi", "Kak Malik")

    return mentor.size + countOfGroup.size
}

fun main() {
    val memberTeam = listOf<String>(
        "Tria Ananda Suryani",
        "Naufal Kesuma",
        "Syahrul Ghifari",
        "Muhammad Irfan Hakim",
        "Angga Zefanya Situmorang",
        "Aisyah",
        "Bram Kahlil Romadhon",
        "Felicia",
        "M.Fikri Eka Putra",
        "Raisa Cintia",
        "Zulham Ariyandi"
    )

    myProfile()

    val myTeam = myTeam(memberTeam)
    println("My team is: $myTeam")

    val totalMember = totalMember(memberTeam)
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("WIB (Waktu Indonesia Bahagia)", memberTeam, "Morning")

}