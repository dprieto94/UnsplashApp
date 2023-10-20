package com.deneb.unsplashapp.features.photos.model

import org.junit.Assert.*
import org.junit.Test

class SocialTest{

    @Test
    fun `given a Social, when getInstagramUsername is called, then return the same value`(){
        val social = Social(instagramUsername = "instagram")
        assertEquals("instagram", social.instagramUsername)
    }

    @Test
    fun `given a Social, when getTwitterUsername is called, then return the same value`(){
        val social = Social(twitterUsername = "twitter")
        assertEquals("twitter", social.twitterUsername)
    }

    @Test
    fun `given a Social, when getPortfolioUrl is called, then return the same value`(){
        val social = Social(portfolioUrl = "portfolio")
        assertEquals("portfolio", social.portfolioUrl)
    }

    @Test
    fun `given a Social, when paypalEmail is called, then return the same value`(){
        val social = Social(paypalEmail = "paypal")
        assertEquals("paypal", social.paypalEmail)
    }

}