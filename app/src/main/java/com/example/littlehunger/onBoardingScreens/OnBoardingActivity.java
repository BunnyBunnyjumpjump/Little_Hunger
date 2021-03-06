package com.example.littlehunger.onBoardingScreens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.littlehunger.R;

import java.util.ArrayList;
import java.util.List;

public class OnBoardingActivity extends AppCompatActivity {
    private OnBoardingAdapter onBoardingAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        setOnBoardingItems();
        ViewPager2 onBoardingViewPager = findViewById(R.id.onBoardViewPager);
        onBoardingViewPager.setAdapter(onBoardingAdapter);
    }
    private void setOnBoardingItems(){
        List<OnBoardingItems> onBoardingItems = new ArrayList<>();
        OnBoardingItems itemFreshFood = new OnBoardingItems();
        itemFreshFood.setTitle("Fresh Everything");
        itemFreshFood.setDescription("You don't have to cook fancy or complicated masterpieces just good food from fresh ingredients");
        itemFreshFood.setScreenImg(R.mipmap.fresh);

        OnBoardingItems itemDelivery = new OnBoardingItems();
        itemDelivery.setTitle("Deliver Anywhere");
        itemDelivery.setDescription("Giving your Hunger a new Option anywhere");
        itemDelivery.setScreenImg(R.mipmap.delivery);

        OnBoardingItems itemPayment = new OnBoardingItems();
        itemPayment.setTitle("Online Payment");
        itemPayment.setDescription("Money doesn't buy happiness but do buy food for you.");
        itemPayment.setScreenImg(R.mipmap.payment);

        onBoardingItems.add(itemFreshFood);
        onBoardingItems.add(itemDelivery);
        onBoardingItems.add(itemPayment);

        onBoardingAdapter = new OnBoardingAdapter(onBoardingItems);



    }
}