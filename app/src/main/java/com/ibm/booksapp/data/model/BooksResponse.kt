package com.ibm.booksapp.data.model

data class BooksResponse(val totalItems: Int,
                         val items: List<BookResult>)