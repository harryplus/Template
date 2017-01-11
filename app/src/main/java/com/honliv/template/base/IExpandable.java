package com.honliv.template.base;

import java.util.List;

/**
 * Created by Rodin on 2016/12/1.
 */

public interface IExpandable<T> {
    boolean isExpanded();
    void setExpanded(boolean expanded);
    List<T> getSubItems();

    /**
     * Get the level of this item. The level start from 0.
     * If you don't care about the level, just return a negative.
     */
    int getLevel();
}
