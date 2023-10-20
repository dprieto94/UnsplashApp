package com.deneb.unsplashapp.features.photos.model

import org.junit.Assert.*
import org.junit.Test

class ProfileImageTest{

    @Test
    fun `test ProfileImage model`() {
        val profileImage = ProfileImage(
            small = "small",
            medium = "medium",
            large = "large"
        )
        assertEquals("small", profileImage.small)
        assertEquals("medium", profileImage.medium)
        assertEquals("large", profileImage.large)
    }
}