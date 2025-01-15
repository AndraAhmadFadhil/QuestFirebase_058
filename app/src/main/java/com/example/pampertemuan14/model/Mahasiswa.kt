package com.example.pampertemuan14.model

data class Mahasiswa (
    val nim: String,
    val nama: String,
    val alamat: String,
    val dospem1: String,
    val dospem2: String,
    val judul: String
){
    constructor(nim: String, nama: String) :this("","","","","","")
}
