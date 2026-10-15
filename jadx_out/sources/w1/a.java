package w1;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dialog f4883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4886e;

    public a(Dialog dialog, Rect rect) {
        this.f4883b = dialog;
        this.f4884c = rect.left;
        this.f4885d = rect.top;
        this.f4886e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f4884c;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f4885d;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i4 = this.f4886e;
            motionEventObtain.setLocation((-i4) - 1, (-i4) - 1);
        }
        view.performClick();
        return this.f4883b.onTouchEvent(motionEventObtain);
    }
}
