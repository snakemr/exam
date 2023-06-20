import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.*
import java.util.*

interface Api {
    // Опишите интерфейсную функцию для получения данных с сервера:

    @GET("primer")
    suspend fun primer(): List<Primer>

    companion object {
        fun getApi(): Api = Retrofit.Builder()
            .baseUrl("https://mad.lrmk.ru/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create()
    }
}