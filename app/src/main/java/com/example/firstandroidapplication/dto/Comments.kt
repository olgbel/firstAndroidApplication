package com.example.firstandroidapplication.dto

class Comments(val count: Int = 0,
               val canPost: Boolean = true,
               val groupsCanPost: Boolean = true,
               val canClose: Boolean = true,
               val canOpen: Boolean = true) {
}