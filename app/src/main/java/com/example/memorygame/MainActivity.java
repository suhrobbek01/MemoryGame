package com.example.memorygame;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.memorygame.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

//yo`qolish animatsiyasi, bir nechtasi bosilganda enabled(false)
public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
    private ActivityMainBinding binding;
    private boolean isImage1 = false;
    private boolean isImage2 = false;
    private boolean isImage3 = false;
    private boolean isImage4 = false;
    private boolean isImage5 = false;
    private boolean isImage6 = false;
    private boolean isImage7 = false;
    private boolean isImage8 = false;
    private boolean isImage9 = false;
    private boolean isImage10 = false;
    private boolean isImage11 = false;
    private boolean isImage12 = false;
    private boolean isImage13 = false;
    private boolean isImage14 = false;
    private boolean isImage15 = false;
    private boolean isImage16 = false;
    private boolean isImage17 = false;
    private boolean isImage18 = false;
    private boolean isImage19 = false;
    private boolean isImage20 = false;
    private boolean isImage21 = false;
    private boolean isImage22 = false;
    private boolean isImage23 = false;
    private boolean isImage24 = false;
    private int count = 0;
    private ArrayList<ImageView> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(binding.getRoot());
        list = new ArrayList<>();

        binding.image1.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image1);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage1 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image1.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image2.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image2);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage2 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image2.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image3.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image3);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage3 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image3.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image4.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image4);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage4 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image4.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image5.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image5);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage5 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image5.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image6.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image6);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage6 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image6.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image7.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image7);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage7 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image7.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image8.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image8);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage8 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image8.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image9.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image9);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage9 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image9.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image10.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image10);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage10 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image10.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image11.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image11);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage11 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image11.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image12.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image12);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage12 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image12.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image13.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image13);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage13 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image13.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image14.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image14);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage14 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image14.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image15.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image15);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage15 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image15.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image16.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image16);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage16 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image16.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image17.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image17);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage17 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image17.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image18.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image18);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage18 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image18.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image19.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image19);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage19 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image19.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image20.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image20);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage20 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image20.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image21.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image21);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage21 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image21.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image22.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image22);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage22 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image22.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image23.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image23);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage23 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image23.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
        binding.image24.setOnClickListener(v -> {
            if (list.size() < 2) {
                list.add(binding.image24);
                if (list.size() == 2 && list.get(0).getId() == list.get(1).getId()) {
                    list.remove(1);
                } else {
                    isImage24 = true;
                    Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
                    binding.image24.startAnimation(animation);
                    animation.setAnimationListener(this);
                }
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale2);
        if (isImage1) {
            binding.image1.setImageResource(R.drawable.lavender);
            binding.image1.startAnimation(animation1);
            isImage1 = false;
        } else if (isImage2) {
            binding.image2.setImageResource(R.drawable.black);
            binding.image2.startAnimation(animation1);
            isImage2 = false;
        } else if (isImage3) {
            binding.image3.setImageResource(R.drawable.cherry_blossom);
            binding.image3.startAnimation(animation1);
            isImage3 = false;
        } else if (isImage4) {
            binding.image4.setImageResource(R.drawable.floral);
            binding.image4.startAnimation(animation1);
            isImage4 = false;
        } else if (isImage5) {
            binding.image5.setImageResource(R.drawable.flowers);
            binding.image5.startAnimation(animation1);
            isImage5 = false;
        } else if (isImage6) {
            binding.image6.setImageResource(R.drawable.macro);
            binding.image6.startAnimation(animation1);
            isImage6 = false;
        } else if (isImage7) {
            binding.image7.setImageResource(R.drawable.rose);
            binding.image7.startAnimation(animation1);
            isImage7 = false;
        } else if (isImage8) {
            binding.image8.setImageResource(R.drawable.sunflower);
            binding.image8.startAnimation(animation1);
            isImage8 = false;
        } else if (isImage9) {
            binding.image9.setImageResource(R.drawable.sabi);
            binding.image9.startAnimation(animation1);
            isImage9 = false;
        } else if (isImage10) {
            binding.image10.setImageResource(R.drawable.lipstick);
            binding.image10.startAnimation(animation1);
            isImage10 = false;
        } else if (isImage11) {
            binding.image11.setImageResource(R.drawable.grass);
            binding.image11.startAnimation(animation1);
            isImage11 = false;
        } else if (isImage12) {
            binding.image12.setImageResource(R.drawable.international_day_of_yoga);
            binding.image12.startAnimation(animation1);
            isImage12 = false;
        } else if (isImage13) {
            binding.image13.setImageResource(R.drawable.lavender);
            binding.image13.startAnimation(animation1);
            isImage13 = false;
        } else if (isImage14) {
            binding.image14.setImageResource(R.drawable.black);
            binding.image14.startAnimation(animation1);
            isImage14 = false;
        } else if (isImage15) {
            binding.image15.setImageResource(R.drawable.cherry_blossom);
            binding.image15.startAnimation(animation1);
            isImage15 = false;
        } else if (isImage16) {
            binding.image16.setImageResource(R.drawable.floral);
            binding.image16.startAnimation(animation1);
            isImage16 = false;
        } else if (isImage17) {
            binding.image17.setImageResource(R.drawable.flowers);
            binding.image17.startAnimation(animation1);
            isImage17 = false;
        } else if (isImage18) {
            binding.image18.setImageResource(R.drawable.macro);
            binding.image18.startAnimation(animation1);
            isImage18 = false;
        } else if (isImage19) {
            binding.image19.setImageResource(R.drawable.rose);
            binding.image19.startAnimation(animation1);
            isImage19 = false;
        } else if (isImage20) {
            binding.image20.setImageResource(R.drawable.sunflower);
            binding.image20.startAnimation(animation1);
            isImage20 = false;
        } else if (isImage21) {
            binding.image21.setImageResource(R.drawable.sabi);
            binding.image21.startAnimation(animation1);
            isImage21 = false;
        } else if (isImage22) {
            binding.image22.setImageResource(R.drawable.lipstick);
            binding.image22.startAnimation(animation1);
            isImage22 = false;
        } else if (isImage23) {
            binding.image23.setImageResource(R.drawable.grass);
            binding.image23.startAnimation(animation1);
            isImage23 = false;
        } else if (isImage24) {
            binding.image24.setImageResource(R.drawable.international_day_of_yoga);
            binding.image24.startAnimation(animation1);
            isImage24 = false;
        }

        animation1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (list.size() == 2) {
                    if (list.get(0).getTag() == list.get(1).getTag()) {
                        list.get(0).setVisibility(View.INVISIBLE);
                        list.get(1).setVisibility(View.INVISIBLE);
                        list.clear();
                        Toast.makeText(MainActivity.this, "Excellent!", Toast.LENGTH_SHORT).show();
                        binding.tv3.setText(String.valueOf(count += 2));
                    } else {
                        closeImages();
                    }
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    private void closeImages() {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale1);
        list.get(0).startAnimation(animation);
        list.get(1).startAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale2);
                list.get(0).setImageResource(R.drawable.question);
                list.get(0).startAnimation(animation1);

                list.get(1).setImageResource(R.drawable.question);
                list.get(1).startAnimation(animation1);
                list.clear();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}