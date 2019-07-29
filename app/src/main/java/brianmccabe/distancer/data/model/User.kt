package brianmccabe.distancer.data.model

import com.google.gson.annotations.SerializedName

data class User(@SerializedName("latitude") val latitude : Double,
                 @SerializedName("user_id") val user_id : Int,
                 @SerializedName("name") val name : String,
                 @SerializedName("longitude") val longitude : Double
)