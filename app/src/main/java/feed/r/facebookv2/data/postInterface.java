package feed.r.facebookv2.data;

import java.util.List;

import feed.r.facebookv2.pojo.PostModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface postInterface {
    @GET("posts")
    public Call<List<PostModel>> getPosts();
}
