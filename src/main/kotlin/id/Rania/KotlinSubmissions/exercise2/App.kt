package id.Rania.KotlinSubmissions.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini

    val banyakBaris = 10
    var lipatanGenap = 2
    var sumBilGenap = 1

    for (row in 1..banyakBaris) {
        for (col in 1..row) {
            if (lipatanGenap > 100) {
                break
            }
            print(String.format("%02d", lipatanGenap))
            lipatanGenap += 2
            sumBilGenap++

            print(" ")
        }

        if (lipatanGenap > 100) {
            break
        }

        println()
    }

/** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    val listBulan = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

        // Cetak semua nama bulan dengan forEach
        listBulan.forEach { (key, value) ->
            println("$key -> $value")
        }

        // Cetak nama bulan sekarang dan bulan lahir
        var monthNow = listBulan["Jun"]
        var birthMonth = listBulan["Sep"]

        // Mencetak format String
        println("\nIt's $monthNow now, I was born in $birthMonth \n")

        // Memasukkan input bulan monthNow
        print("Masukkan bulan sekarang (format inisial): ")
        monthNow = readLine()

        // Memasukkan input bulan birthMonth
        print("Masukkan bulan kelahiran (format inisial): ")
        birthMonth = readLine()

        // Mengecek dan mencetak nama bulan sekarang dan bulan kelahiran
        if (monthNow != null && birthMonth != null) {
            val monthNowFullName = listBulan[monthNow]
            val birthMonthFullName = listBulan[birthMonth]
            if (monthNowFullName != null && birthMonthFullName != null) {
                println("It's $monthNowFullName now, I was born in $birthMonthFullName")
            } else {
                println("Input bulan tidak valid")
            }
        } else {
            println("Input bulan tidak valid")
        }

}