package com.deneb.unsplashapp.features.photos.model

import org.junit.Assert.*
import org.junit.Test

class UnsplashDetailResponseTest{

    @Test
    fun `test UnsplashDetailResponse model`() {
        val unsplashDetailResponse = UnsplashDetailResponse(
            id = "id",
            description = "description",
            urls = Urls(
                raw = "raw",
                full = "full",
                regular = "regular",
                small = "small",
                thumb = "thumb"
            ),
            user = User(
                id = "id",
                username = "username",
                name = "name",
                profileImage = ProfileImage(
                    small = "small",
                    medium = "medium",
                    large = "large"
                )
            )
        )
        assertEquals("id", unsplashDetailResponse.id)
        assertEquals("description", unsplashDetailResponse.description)
        assertEquals("raw", unsplashDetailResponse.urls.raw)
        assertEquals("full", unsplashDetailResponse.urls.full)
        assertEquals("regular", unsplashDetailResponse.urls.regular)
        assertEquals("small", unsplashDetailResponse.urls.small)
        assertEquals("thumb", unsplashDetailResponse.urls.thumb)
        assertEquals("id", unsplashDetailResponse.user.id)
        assertEquals("username", unsplashDetailResponse.user.username)
        assertEquals("name", unsplashDetailResponse.user.name)
        assertEquals("small", unsplashDetailResponse.user.profileImage.small)
        assertEquals("medium", unsplashDetailResponse.user.profileImage.medium)
        assertEquals("large", unsplashDetailResponse.user.profileImage.large)
    }
}