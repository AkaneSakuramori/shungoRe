package i;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class l2 implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2 f2638b;

    public l2(m2 m2Var) {
        this.f2638b = m2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g0 g0Var;
        int action = motionEvent.getAction();
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        m2 m2Var = this.f2638b;
        if (action == 0 && (g0Var = m2Var.A) != null && g0Var.isShowing() && x4 >= 0 && x4 < m2Var.A.getWidth() && y4 >= 0 && y4 < m2Var.A.getHeight()) {
            m2Var.f2706w.postDelayed(m2Var.f2702s, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        m2Var.f2706w.removeCallbacks(m2Var.f2702s);
        return false;
    }
}
