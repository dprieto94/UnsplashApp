package com.deneb.unsplashapp.features.photos.model

import org.junit.Assert.*
import org.junit.Test

class UnsplashItemViewTest{

    @Test
    fun testUnsplashItemViewParcelable() {
        val itemView = UnsplashItemView(id = "123", image = "url")

        assertEquals("123", itemView.id)
        assertEquals("url", itemView.image)
    }

}