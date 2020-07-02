package feed.r.facebookv2.data;

import java.util.List;

import feed.r.facebookv2.pojo.PostModel;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostClient {
    private static String BASE_URL="https://jsonplaceholder.typicode.com/";
    private postInterface postinterface;
    private static PostClient INSTANCE;

    public PostClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .build();
        postinterface = retrofit.create(postInterface.class);
    }

    public static PostClient getINSTANCE() {
        if(INSTANCE==null)
        {
            INSTANCE = new PostClient();
        }
        return INSTANCE;
    }
    public Call<List<PostModel>> getPosts()
    {
        return postinterface.getPosts();
    }
}
