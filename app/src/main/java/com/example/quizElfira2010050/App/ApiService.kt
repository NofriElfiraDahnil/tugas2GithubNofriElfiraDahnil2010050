package com.example.quizElfira2010050.App
import com.example.quizElfira2010050.Model.MahasiswaModel
import com.example.quizElfira2010050.Model.ResponModel
import retrofit2.Call
import retrofit2.http.*
interface ApiService {
    @FormUrlEncoded
    @POST("mahasiswa/save")
    fun saveBarang(
        @Body data: MahasiswaModel,
    ):Call<ResponModel>
    @GET("mahasiswa")
    fun getMahasiswa():Call<ResponModel>
}

