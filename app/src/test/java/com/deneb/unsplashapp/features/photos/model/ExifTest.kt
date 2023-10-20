package com.deneb.unsplashapp.features.photos.model

import org.junit.Assert.*
import org.junit.Test

class ExifTest {

    @Test
    fun testExif() {
        val exif = Exif(
            make = "make",
            model = "model",
            exposureTime = "exposureTime",
            aperture = "aperture",
            focalLength = "focalLength",
            iso = 20
        )

        assertEquals("make", exif.make)
        assertEquals("model", exif.model)
        assertEquals("exposureTime", exif.exposureTime)
        assertEquals("aperture", exif.aperture)
        assertEquals("focalLength", exif.focalLength)
        assertEquals(20, exif.iso)

    }

}