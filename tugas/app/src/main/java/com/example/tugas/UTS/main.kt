package com.example.tugas.UTS

fun main() {
    val clubs = listOf(
        Club("Liverpool", 19, 8, 9, 6, 3),
        Club("Manchester United", 20, 12, 6, 3, 1),
        Club("Chelsea", 6, 6, 5, 2, 2),
        Club("Manchester City", 8, 8, 8, 0, 0),
        Club("Arsenal", 13, 14, 2, 0, 0)
    )

    val sortedClubs = sortClubsByTotalTrophies(clubs)
    println("Klub dengan total trofi tertinggi : ")
    sortedClubs.forEachIndexed { index, club ->
        println("${index + 1}. ${club.name}: ${club.totalTrophies} trofi")
    }

    val filteredClubs = filterClubs(clubs) { clubs ->
        clubs.filter { club ->
            club.championsLeague == 0 && club.europaLeague == 0
        }
    }

    println("\nKlub yang belum pernah memenangkan trofi Liga Champions dan Liga Eropa UEFA:")
    filteredClubs.forEach { club ->
        println("${club.name} belum pernah memenangkan trofi Liga Champions dan Liga Eropa UEFA")
    }

    // Memanggil extension function untuk menampilkan rekap perolehan trofi klub
    println("\nDaftar Perolehan Medali Club :")
    clubs.forEach { it.printTrophySummary() }
}


fun sortClubsByTotalTrophies(clubs: List<Club>): List<Club> {
    return clubs.sortedByDescending { it.totalTrophies }
}

fun filterClubs(clubs: List<Club>, predicate: (List<Club>) -> List<Club>): List<Club> {
    return predicate(clubs)
}

fun Club.printTrophySummary() {
    println("$name berhasil meraih ${premierLeague} trofi Liga Primer Inggris, " +
            "${faCup} trofi FA, ${eflCup} trofi EFL, " +
            "${championsLeague} trofi Liga Champions, dan " +
            "${europaLeague} trofi Liga Eropa UEFA")
}

