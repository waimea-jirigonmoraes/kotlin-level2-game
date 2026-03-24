/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   PROJECT NAME HERE
 * Project Author: PROJECT AUTHOR HERE
 * GitHub Repo:    GITHUB REPO URL HERE
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */


fun showBoard () {
    println("+--------------------+".red())
    for (i in 0 until board.size) {
       val square = "${i + 1 }: ${board[i]}"
        println (square.padEnd(29))
    }



