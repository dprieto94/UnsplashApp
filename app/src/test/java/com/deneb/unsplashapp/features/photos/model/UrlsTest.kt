package com.deneb.unsplashapp.features.photos.model

import org.junit.Assert.*
import org.junit.Test

class UrlsTest{

    @Test
    fun `getUrls should return the same value as the one passed to the constructor`(){
        val urls = Urls("raw", "full", "regular", "small", "thumb")
        assertEquals("raw", urls.raw)
        assertEquals("full", urls.full)
        assertEquals("regular", urls.regular)
        assertEquals("small", urls.small)
        assertEquals("thumb", urls.thumb)
    }

}