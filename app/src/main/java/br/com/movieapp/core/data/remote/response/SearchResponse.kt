package br.com.movieapp.core.data.remote.response


import br.com.movieapp.core.data.remote.model.SeachResultResult
import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val seachResultResults: List<SeachResultResult>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)