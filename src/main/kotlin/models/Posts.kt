package models
import com.google.gson.annotations.SerializedName


class Posts : ArrayList<PostsItem>()

data class PostsItem(
    @SerializedName("body")
    val body: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("userId")
    val userId: Int?
)