package com.example.littlehunger.onBoardingScreens;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.littlehunger.R;

import java.util.List;

public class OnBoardingAdapter extends RecyclerView.Adapter<OnBoardingAdapter.OnboardingViewHolder> {
    private List<OnBoardingItems> onBoardingItems;

    public OnBoardingAdapter(List<OnBoardingItems> onBoardingItems) {
        this.onBoardingItems = onBoardingItems;
    }

    @NonNull
    @Override
    public OnboardingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OnboardingViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.intro_items, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull OnboardingViewHolder holder, int position) {
        holder.setOnboardingData(onBoardingItems.get(position));
    }

    @Override
    public int getItemCount() {
        return onBoardingItems.size();
    }

    static class OnboardingViewHolder extends RecyclerView.ViewHolder{

        private TextView textTitle;
        private TextView textDescription;
        private ImageView imageOnBoard;


        OnboardingViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.intro_title);
            textDescription = itemView.findViewById(R.id.intro_description);
            imageOnBoard = itemView.findViewById(R.id.intro_img);

        }
        void setOnboardingData(OnBoardingItems onBoardingItems ){
            textTitle.setText(onBoardingItems.getTitle());
            textDescription.setText(onBoardingItems.getDescription());
            imageOnBoard.setImageResource(onBoardingItems.getScreenImg());
        }
    }
}
