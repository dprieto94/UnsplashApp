package com.deneb.unsplashapp.features.photos.model

import org.junit.Assert.*
import org.junit.Test

class LinksUserTest{

    @Test
    fun `getLinksUser should return the same value as the one passed to the constructor`(){
        val linksUser = LinksUser("self", "html", "photos", "likes", "portfolio", "following", "followers")
        assertEquals("self", linksUser.self)
        assertEquals("html", linksUser.html)
        assertEquals("photos", linksUser.photos)
        assertEquals("likes", linksUser.likes)
        assertEquals("portfolio", linksUser.portfolio)
        assertEquals("following", linksUser.following)
        assertEquals("followers", linksUser.followers)
    }

}