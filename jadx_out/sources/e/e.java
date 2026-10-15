package e;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f1803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f1804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f1805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f1806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DialogInterface.OnKeyListener f1807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListAdapter f1808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DialogInterface.OnClickListener f1809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1811j = -1;

    public e(ContextThemeWrapper contextThemeWrapper) {
        this.f1802a = contextThemeWrapper;
        this.f1803b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
