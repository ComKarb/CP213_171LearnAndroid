package com.example.a171lablearnandroid.utils

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * ทดสอบโครงสร้าง Data Class พื้นฐาน
 * เนื่องจากไม่มี Mocking Library เราจึงเขียนเพื่อทดสอบว่า Data Class
 * สามารถเก็บค่าและดึงค่าออกมาได้ถูกต้องตามที่ประกาศไว้หรือไม่
 */
class PokemonDataModelTest {

    @Test
    fun testPokemonSpeciesCreation() {
        // จัดเตรียมข้อมูล (Arrange)
        val speciesName = "Pikachu"
        val speciesUrl = "https://pokeapi.co/api/v2/pokemon-species/25/"

        // ลงมือทำ (Act)
        val species = PokemonSpecies(name = speciesName, url = speciesUrl)

        // ตรวจสอบผลลัพธ์ (Assert)
        assertEquals(speciesName, species.name)
        assertEquals(speciesUrl, species.url)
    }

    @Test
    fun testPokemonEntryCreation() {
        val entryNumber = 25
        val species = PokemonSpecies(name = "Pikachu", url = "url_here")

        val entry = PokemonEntry(entry_number = entryNumber, pokemon_species = species)

        assertEquals(25, entry.entry_number)
        assertEquals("Pikachu", entry.pokemon_species.name)
    }
}
