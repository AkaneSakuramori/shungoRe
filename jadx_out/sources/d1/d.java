package d1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f1691a;

    public d(Drawable.ConstantState constantState) {
        this.f1691a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f1691a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f1691a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f1691a.newDrawable();
        eVar.f1697b = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f1696g);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f1691a.newDrawable(resources);
        eVar.f1697b = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f1696g);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f1691a.newDrawable(resources, theme);
        eVar.f1697b = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f1696g);
        return eVar;
    }
}
