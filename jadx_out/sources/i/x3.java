package i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class x3 implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f2837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f2839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f2840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f2841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f2842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f2844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f2845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f2846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f2847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f2849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f2851o;

    public final void a(int i4) {
        View view;
        int i5 = this.f2838b ^ i4;
        this.f2838b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    b();
                }
                int i6 = this.f2838b & 4;
                Toolbar toolbar = this.f2837a;
                if (i6 != 0) {
                    Drawable drawable = this.f2842f;
                    if (drawable == null) {
                        drawable = this.f2851o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                c();
            }
            int i7 = i5 & 8;
            Toolbar toolbar2 = this.f2837a;
            if (i7 != 0) {
                if ((i4 & 8) != 0) {
                    toolbar2.setTitle(this.f2844h);
                    toolbar2.setSubtitle(this.f2845i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f2839c) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f2838b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f2846j);
            Toolbar toolbar = this.f2837a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f2850n);
            } else {
                toolbar.setNavigationContentDescription(this.f2846j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i4 = this.f2838b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) == 0 || (drawable = this.f2841e) == null) {
            drawable = this.f2840d;
        }
        this.f2837a.setLogo(drawable);
    }
}
