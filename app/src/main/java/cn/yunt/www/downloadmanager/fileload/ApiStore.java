package cn.yunt.www.downloadmanager.fileload;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiStore {
    String API_SERVER_URL="";
    @GET("download")
    Call<ResponseBody> loadFile();
}
