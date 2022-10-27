package com.example.midtermtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkViewHolder> {
    private Context mContext;
    private List<Landmark> mLandmarkList;

    public LandmarkAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Landmark>list){
        this.mLandmarkList=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public LandmarkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.landmarkitems,parent,false);
        return new LandmarkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkViewHolder holder, int position) {
        Landmark landmark = mLandmarkList.get(position);
        if(landmark == null){
            return;
        }
        holder.imgLandmark.setImageResource(landmark.getResourceId());
        holder.landmark_name.setText(landmark.getName());
        holder.landmark_description.setText(landmark.getDescription());
        holder.rating_list.setText("Rating: "+String.valueOf(landmark.getRating())+ "/5");
    }

    @Override
    public int getItemCount() {
        if(mLandmarkList !=null){
            return mLandmarkList.size();
        }
        return 0;
    }

    public class LandmarkViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgLandmark;
        private TextView landmark_name;
        private TextView landmark_description;
        private TextView rating_list;
        public LandmarkViewHolder(@NonNull View itemView) {
            super(itemView);

            imgLandmark = itemView.findViewById(R.id.img_landmark);
            landmark_name = itemView.findViewById(R.id.landmark_name);
            landmark_description= itemView.findViewById((R.id.landmark_description));
            rating_list = itemView.findViewById((R.id.rating_list));
        }
    }

}
