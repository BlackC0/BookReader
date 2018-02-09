package hyx.com.bookreader.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Request {

    /**
     * 搜索
     * @param keyword 关键词
     * @return
     */
    @GET("search.htm")//需要修改
    Call<String> search(@Query("keyword") String keyword);


    /**
     * 书本目录
     * @param location 书本目录的具体地址
     * @return
     */
    @GET("{location}")
    Call<String> bookCatalogue(@Path("location") String location);


}