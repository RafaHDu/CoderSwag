package com.rafaelduarte.coderswag.Services

import com.rafaelduarte.coderswag.Model.Category
import com.rafaelduarte.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$25", "hat1"),
        Product("Devslopes Black", "$18", "hat2"),
        Product("Devslopes Whit", "$18", "hat3"),
        Product("Devslopes Snapback", "$30", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Logo Black", "$30", "hoodie1"),
        Product("Devslopes Logo Red", "$30", "hoodie2"),
        Product("Devslopes Gray", "$20", "hoodie3"),
        Product("Devslopes Black", "$20", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Logo Black", "$20", "shirt1"),
        Product("Devslopes Badge Light Gray", "$15", "shirt2"),
        Product("Devslopes Logo Red", "$20", "shirt3"),
        Product("Devslopes Hustle", "$10", "shirt4"),
        Product("Kickflip Studios", "$20", "shirt5")
    )

}