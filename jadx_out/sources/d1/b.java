package d1;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1.a f1686a;

    public b(u1.a aVar) {
        this.f1686a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f1686a.f4675b.f4688p;
        if (colorStateList != null) {
            c0.b.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        u1.c cVar = this.f1686a.f4675b;
        ColorStateList colorStateList = cVar.f4688p;
        if (colorStateList != null) {
            c0.b.g(drawable, colorStateList.getColorForState(cVar.f4692t, colorStateList.getDefaultColor()));
        }
    }
}
