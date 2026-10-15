package i2;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class e extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3012e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar, int i4) {
        super(nVar);
        this.f3012e = i4;
    }

    @Override // i2.o
    public final void r() {
        switch (this.f3012e) {
            case 0:
                n nVar = this.f3058b;
                nVar.f3049p = null;
                CheckableImageButton checkableImageButton = nVar.f3041h;
                checkableImageButton.setOnLongClickListener(null);
                c3.h.r2(checkableImageButton, null);
                break;
        }
    }
}
