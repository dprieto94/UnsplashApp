package com.deneb.unsplashapp.features.photos.model


import junit.framework.TestCase.assertEquals
import org.junit.Test

class UnsplashResponseItemTest{

    @Test
    fun `getUnsplashResponseItem should return the same value as the one passed to the constructor`() {
        val unsplashResponseItem = UnsplashResponseItem(
            id = "id",
            description = "description",
            altDescription = "altDescription",
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
                ),
                links = LinksUser(
                    self = "self",
                    html = "html",
                    photos = "photos",
                    likes = "likes",
                    portfolio = "portfolio",
                    following = "following",
                    followers = "followers"
                )
            ),
        )

        assertEquals("id", unsplashResponseItem.id)
        assertEquals("description", unsplashResponseItem.description)
        assertEquals("altDescription", unsplashResponseItem.altDescription)
        assertEquals("raw", unsplashResponseItem.urls.raw)
        assertEquals("full", unsplashResponseItem.urls.full)
        assertEquals("regular", unsplashResponseItem.urls.regular)
        assertEquals("small", unsplashResponseItem.urls.small)
        assertEquals("thumb", unsplashResponseItem.urls.thumb)
        assertEquals("id", unsplashResponseItem.user.id)
        assertEquals("username", unsplashResponseItem.user.username)
        assertEquals("name", unsplashResponseItem.user.name)
        assertEquals("small", unsplashResponseItem.user.profileImage.small)
        assertEquals("medium", unsplashResponseItem.user.profileImage.medium)
        assertEquals("large", unsplashResponseItem.user.profileImage.large)
        assertEquals("self", unsplashResponseItem.user.links.self)
        assertEquals("html", unsplashResponseItem.user.links.html)
        assertEquals("photos", unsplashResponseItem.user.links.photos)
        assertEquals("likes", unsplashResponseItem.user.links.likes)
        assertEquals("portfolio", unsplashResponseItem.user.links.portfolio)
        assertEquals("following", unsplashResponseItem.user.links.following)
        assertEquals("followers", unsplashResponseItem.user.links.followers)


    }

}