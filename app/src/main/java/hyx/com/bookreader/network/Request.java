package hyx.com.bookreader.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Request {

    /**
     * 搜索
     * @param keyword 关键词
     * @return
     */
    @GET("keyword/{keyword}")
    Call<String> get(@Path("keyword") String keyword);


}