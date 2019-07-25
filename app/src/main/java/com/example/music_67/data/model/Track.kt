package com.example.music_67.data.model

data class Track(
		val id: Int,
		val title: String? = null,
		val artworkUrl: String? = null,
		val duration: Long? = null,
		val downloadable: Boolean? = null,
		val downloadUrl: String? = null,
		val streamUrl: String? = null,
		val artist: String? = null,
		val username: String? = null
)
