package f;

import android.graphics.drawable.Drawable;
import d1.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1996b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1997c;

    public a(e eVar) {
        this.f1997c = eVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f1996b) {
            case 0:
                break;
            default:
                ((e) this.f1997c).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        switch (this.f1996b) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f1997c;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j4);
                }
                break;
            default:
                ((e) this.f1997c).scheduleSelf(runnable, j4);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f1996b) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f1997c;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            default:
                ((e) this.f1997c).unscheduleSelf(runnable);
                break;
        }
    }
}
