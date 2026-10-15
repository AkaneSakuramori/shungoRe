package m0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f3419s = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccelerateInterpolator f3421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f3422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.activity.j f3423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f3424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f3425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f3428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f3429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f3430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3435q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ListView f3436r;

    public g(ListView listView) {
        a aVar = new a();
        aVar.f3414e = Long.MIN_VALUE;
        aVar.f3416g = -1L;
        aVar.f3415f = 0L;
        this.f3420b = aVar;
        this.f3421c = new AccelerateInterpolator();
        this.f3424f = new float[]{0.0f, 0.0f};
        this.f3425g = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3428j = new float[]{0.0f, 0.0f};
        this.f3429k = new float[]{0.0f, 0.0f};
        this.f3430l = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3422d = listView;
        float f5 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f3430l;
        float f6 = ((int) ((1575.0f * f5) + 0.5f)) / 1000.0f;
        fArr[0] = f6;
        fArr[1] = f6;
        float[] fArr2 = this.f3429k;
        float f7 = ((int) ((f5 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f7;
        fArr2[1] = f7;
        this.f3426h = 1;
        float[] fArr3 = this.f3425g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f3424f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f3428j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f3427i = f3419s;
        aVar.f3410a = 500;
        aVar.f3411b = 500;
        this.f3436r = listView;
    }

    public static float b(float f5, float f6, float f7) {
        if (f5 > f7) {
            return f7;
        }
        return f5 < f6 ? f6 : f5;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public final float a(float f5, float f6, float f7, int i4) {
        float fB;
        float interpolation;
        float fB2 = b(this.f3424f[i4] * f6, 0.0f, this.f3425g[i4]);
        float fC = c(f6 - f5, fB2) - c(f5, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f3421c;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f8 = this.f3428j[i4];
            float f9 = this.f3429k[i4];
            float f10 = this.f3430l[i4];
            float f11 = f8 * f7;
            return fB > 0.0f ? b(fB * f11, f9, f10) : -b((-fB) * f11, f9, f10);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f12 = this.f3428j[i4];
        float f13 = this.f3429k[i4];
        float f14 = this.f3430l[i4];
        float f15 = f12 * f7;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f5, float f6) {
        if (f6 == 0.0f) {
            return 0.0f;
        }
        int i4 = this.f3426h;
        if (i4 != 0 && i4 != 1) {
            if (i4 == 2 && f5 < 0.0f) {
                return f5 / (-f6);
            }
            return 0.0f;
        }
        if (f5 >= f6) {
            return 0.0f;
        }
        if (f5 >= 0.0f) {
            return 1.0f - (f5 / f6);
        }
        return (this.f3434p && i4 == 1) ? 1.0f : 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    public final boolean d(View view, MotionEvent motionEvent) {
        int i4;
        if (!this.f3435q) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                e();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    e();
                }
            }
            return false;
        }
        this.f3433o = true;
        this.f3431m = false;
        float x4 = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.f3422d;
        float fA = a(x4, width, view2.getWidth(), 0);
        float fA2 = a(motionEvent.getY(), view.getHeight(), view2.getHeight(), 1);
        a aVar = this.f3420b;
        aVar.f3412c = fA;
        aVar.f3413d = fA2;
        if (!this.f3434p && f()) {
            if (this.f3423e == null) {
                this.f3423e = new androidx.activity.j(4, this);
            }
            this.f3434p = true;
            this.f3432n = true;
            if (this.f3431m || (i4 = this.f3427i) <= 0) {
                this.f3423e.run();
            } else {
                androidx.activity.j jVar = this.f3423e;
                long j4 = i4;
                WeakHashMap weakHashMap = v0.f2983a;
                e0.n(view2, jVar, j4);
            }
            this.f3431m = true;
        }
        return false;
    }

    public final void e() {
        int i4 = 0;
        if (this.f3432n) {
            this.f3434p = false;
            return;
        }
        a aVar = this.f3420b;
        aVar.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i5 = (int) (jCurrentAnimationTimeMillis - aVar.f3414e);
        int i6 = aVar.f3411b;
        if (i5 > i6) {
            i4 = i6;
        } else if (i5 >= 0) {
            i4 = i5;
        }
        aVar.f3418i = i4;
        aVar.f3417h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f3416g = jCurrentAnimationTimeMillis;
    }

    public final boolean f() {
        ListView listView;
        int count;
        a aVar = this.f3420b;
        float f5 = aVar.f3413d;
        int iAbs = (int) (f5 / Math.abs(f5));
        Math.abs(aVar.f3412c);
        if (iAbs == 0 || (count = (listView = this.f3436r).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i4 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i4 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
