package com.deneb.unsplashapp.features.photos.model

import org.junit.Assert.*
import org.junit.Test

class UserTest{

    @Test
    fun `getUser should return the same value as the one passed to the constructor`(){
        val user = User("id", "username", "name", "firstName", "lastName", "twitterUsername", "portfolioUrl", "bio", "location", LinksUser(), ProfileImage(), "instagramUsername", 5)

        assertEquals("id", user.id)
        assertEquals("username", user.username)
        assertEquals("name", user.name)
        assertEquals("firstName", user.firstName)
        assertEquals("lastName", user.lastName)
        assertEquals("twitterUsername", user.twitterUsername)
        assertEquals("portfolioUrl", user.portfolioUrl)
        assertEquals("bio", user.bio)
        assertEquals("location", user.location)
        assertEquals(LinksUser(), user.links)
        assertEquals(ProfileImage(), user.profileImage)
        assertEquals("instagramUsername", user.instagramUsername)
        assertEquals(5, user.totalCollections)

    }
}