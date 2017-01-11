package com.honliv.template.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import com.honliv.template.base.BaseAnimation;


/**
 * Created by Rodin on 2016/12/1.
 */

public class AlphaInAnimation implements BaseAnimation {

    private static final float DEFAULT_ALPHA_FROM = 0f;
    private final float mFrom;

    public AlphaInAnimation() {
        this(DEFAULT_ALPHA_FROM);
    }

    public AlphaInAnimation(float from) {
        mFrom = from;
    }

    @Override
    public Animator[] getAnimators(View view) {
        return new Animator[]{ObjectAnimator.ofFloat(view, "alpha", mFrom, 1f)};
    }
}