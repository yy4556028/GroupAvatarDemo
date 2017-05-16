package yy.com.groupavatardemo;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by Yamap on 2017/5/16.
 */

public class Util {
    public static int dp2px(Context context, int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }
}
