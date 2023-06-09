package id.Rania.KotlinSubmissions.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    var score = 0
    var result = ""

    print("Masukkan Nilai Anda\t\t: ")
    val inputScore = readLine()?.toIntOrNull()

    try {
        if (inputScore != null) {
            score = inputScore

            if (score >= 90 && score <= 100) {
                result = "Selamat! Anda mendapatkan nilai A."
            } else if (score >= 80 && score <= 89) {
                result = "Anda mendapatkan nilai B."
            } else if (score >= 70 && score <= 79) {
                result = "Anda mendapatkan nilai C."
            } else if (score >= 60 && score <= 69) {
                result = "Anda mendapatkan nilai D."
            } else if (score >= 0 && score <= 59) {
                result = "Anda mendapatkan nilai E."
            } else {
                result = "Nilai $score tuh udah diluar nayla, gak habis fikri, gak masuk haikal, sungguh herman sekali, semoga nurul fatimah. "
            }

            println(result)

            // Output penjelasan ketika inputan = null
        } else {
            throw Exception("Input tidak valid. Masukkan angka yang valid.")
        }
        // Trigger output penjelasan ketika inputan = null
    } catch (e: Exception) {
        println("Terjadi kesalahan: ${e.message}")
        main()
    }

}