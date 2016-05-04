package com.yydcdut.note.markdown.grammar;

import android.support.annotation.Nullable;
import android.text.SpannableStringBuilder;

/**
 * Created by yuyidong on 16/5/3.
 */
public interface IGrammar {
    @Nullable
    SpannableStringBuilder format(@Nullable String text);

    boolean isMatch(@Nullable String text);

    @Nullable
    SpannableStringBuilder format(@Nullable SpannableStringBuilder ssb);
}
