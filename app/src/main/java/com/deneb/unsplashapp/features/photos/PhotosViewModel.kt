package com.deneb.unsplashapp.features.photos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.deneb.unsplashapp.core.interactor.UseCase
import com.deneb.unsplashapp.core.platform.BaseViewModel
import com.deneb.unsplashapp.features.photos.model.UnsplashItemView
import com.deneb.unsplashapp.features.photos.model.UnsplashResponseItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PhotosViewModel
@Inject constructor(private val getPhotos: GetPhotos): BaseViewModel() {

    private val _photos: MutableLiveData<List<UnsplashItemView>> = MutableLiveData()
    val photos: LiveData<List<UnsplashItemView>> = _photos

    private var currentPage = 1

    fun loadPhotos() {
        getPhotos(ParamsPhoto(currentPage), viewModelScope) {
            it.fold(::handleFailure, ::handlePhotoList)
        }
        currentPage += 1
    }

    private fun handlePhotoList(photos: List<UnsplashItemView>) {
        val currentPhotos = _photos.value ?: emptyList()
        _photos.value = currentPhotos + photos
    }
}