package feed.r.facebookv2.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import feed.r.facebookv2.R;
import feed.r.facebookv2.pojo.PostModel;

public class PostListAdaper extends RecyclerView.Adapter<PostListAdaper.PostViewHolder> {
    private ArrayList<PostModel>PostsArrayList =new ArrayList<>();
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item , parent , false));
    }


    /////////////////////////Nooooooooooooooootes///////
    public void setList(List<PostModel> postsList)
    {
        PostsArrayList = (ArrayList<PostModel>) postsList;
        notifyDataSetChanged();
    }
    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.PostTitleTV.setText(PostsArrayList.get(position).getTitle());
        holder.PostUserIDTV.setText(PostsArrayList.get(position).getUserId()+"");
        holder.PostBodyTV.setText(PostsArrayList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return PostsArrayList.size();
    }
    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView PostTitleTV;
        TextView PostUserIDTV;
        TextView PostBodyTV;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            PostTitleTV =itemView.findViewById(R.id.titleTV);
            PostUserIDTV = itemView.findViewById(R.id.userIDTV);
            PostBodyTV = itemView.findViewById(R.id.bodyTv);
        }
    }
}
