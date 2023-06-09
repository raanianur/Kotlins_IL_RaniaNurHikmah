package id.Rania.KotlinSubmissions.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    val namaDepan: String = "Rania"
    val namaBelakang: String = "Nur Hikmah"
    val usia: Int = 23
    val isSingle: Boolean = false

    val isStatus: String = if (isSingle) {
        "single"
    } else {
        "tidak single"
    }

    println("\nSaya adalah $namaDepan $namaBelakang, saat ini berusia $usia tahun dan Saya $isStatus\n")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {

    println("Saya dari kelompok ke-$groupId dari sesi $session dengan anggota kelompok yaitu: ${groupMember.joinToString(", ")}")

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {
    val anggotaGrup = listOf("Rania Nur Hikmah", "Lutfia", "Anjeli", "Zaky", "Niken", "Rasyid", "Desti", "Widya", "Aisya", "ALif", "Ariffal", "Cahya")
    val arrSaya = anggotaGrup[0]

    return arrSaya
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val anggota = listOf("Rania Nur Hikmah", "Lutfia", "Anjeli", "Zaky", "Niken", "Rasyid", "Desti", "Widya", "Aisya", "ALif", "Ariffal", "Cahya")
    val totalMentor = mentor.size
    val jumlahAnggotaGrup = anggota.size

    return totalMentor + jumlahAnggotaGrup

}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(3, listOf("Rania Nur Hikmah", "Lutfia", "Anjeli", "Zaky", "Niken", "Rasyid", "Desti", "Widya", "Aisya", "ALif", "Ariffal", "Cahya"), "Morning")

}