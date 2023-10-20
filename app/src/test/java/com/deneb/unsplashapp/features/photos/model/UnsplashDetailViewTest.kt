package com.deneb.unsplashapp.features.photos.model

import org.junit.Assert.*
import org.junit.Test

class UnsplashDetailViewTest{

    @Test
    fun testToUnsplashDetailView() {
        val response = UnsplashDetailResponse(
            id = "123",
            description = "A description",
            altDescription = "An alternate description",
            likes = 100,
            views = 1000,
            downloads = 5000

        )

        val view = response.toUnsplashDetailView()

        assertEquals("123", view.id)
        assertEquals("A description", view.description)
        assertEquals("An alternate description", view.altDescription)
        assertEquals(100, view.likes)
        assertEquals(1000, view.views)
        assertEquals(5000, view.downloads)

    }

}