package y0;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5201c;

    public /* synthetic */ l(int i4, Object obj) {
        this.f5200b = i4;
        this.f5201c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f5200b;
        Object obj = this.f5201c;
        switch (i4) {
            case 0:
                p pVar = (p) obj;
                int i5 = pVar.A;
                ValueAnimator valueAnimator = pVar.f5272z;
                if (i5 == 1) {
                    valueAnimator.cancel();
                } else if (i5 != 2) {
                }
                pVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).z0();
                break;
        }
    }
}
