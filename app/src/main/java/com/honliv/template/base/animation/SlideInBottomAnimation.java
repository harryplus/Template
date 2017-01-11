package com.honliv.template.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import com.honliv.template.base.BaseAnimation;


/**
 * Created by Rodin on 2016/12/1.
 */

public class SlideInBottomAnimation implements BaseAnimation {


    @Override
    public Animator[] getAnimators(View view) {
        return new Animator[]{
                ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0)
        };
    }
}
