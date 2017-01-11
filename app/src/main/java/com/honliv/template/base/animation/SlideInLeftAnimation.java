package com.honliv.template.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import com.honliv.template.base.BaseAnimation;


/**
 * Created by Rodin on 2016/12/1.
 */

public class SlideInLeftAnimation implements BaseAnimation {


    @Override
    public Animator[] getAnimators(View view) {
        return new Animator[] {
                ObjectAnimator.ofFloat(view, "translationX", -view.getRootView().getWidth(), 0)
        };
    }
}
