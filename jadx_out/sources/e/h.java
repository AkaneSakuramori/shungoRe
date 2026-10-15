package e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.shungo.app.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f1848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f1849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f1850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f1851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f1852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f1853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NestedScrollView f1854i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f1856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f1857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f1858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f1859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f1860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ListAdapter f1861p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1865t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f1866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f1867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f1868w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1855j = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1862q = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f1869x = new b(0, this);

    public h(Context context, j jVar, Window window) {
        this.f1846a = context;
        this.f1847b = jVar;
        this.f1848c = window;
        f fVar = new f();
        fVar.f1840a = new WeakReference(jVar);
        this.f1868w = fVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, d.a.f1658e, R.attr.alertDialogStyle, 0);
        this.f1863r = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f1864s = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1865t = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f1866u = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f1867v = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        jVar.k().i(1);
    }

    public static void a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
