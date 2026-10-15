package d1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f1742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f1743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f1744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f1746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f1752l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1741a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new o(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new o(this);
    }
}
