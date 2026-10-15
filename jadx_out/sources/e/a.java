package e;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1771a;

    public a(a aVar) {
        super((ViewGroup.MarginLayoutParams) aVar);
        this.f1771a = 0;
        this.f1771a = aVar.f1771a;
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1771a = 0;
    }
}
