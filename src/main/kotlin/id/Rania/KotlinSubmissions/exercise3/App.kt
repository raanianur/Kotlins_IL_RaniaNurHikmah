package id.Rania.KotlinSubmissions.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    var score= 0
    var result = ""

    print("Masukkan Nilai Anda\t\t: ")
    val inputScore = readLine()?.toIntOrNull()
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
    } else {
        main()
    }
}