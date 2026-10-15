package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s implements b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f880a;

    public s(e.m mVar) {
        this.f880a = mVar;
    }

    @Override // b.b
    public final void a() {
        u uVar = this.f880a;
        t tVar = (t) uVar.f890r.f785c;
        tVar.f886m.b(tVar, tVar, null);
        Bundle bundleA = uVar.f274f.f5440b.a("android:support:fragments");
        if (bundleA != null) {
            Parcelable parcelable = bundleA.getParcelable("android:support:fragments");
            t tVar2 = (t) uVar.f890r.f785c;
            if (!(tVar2 instanceof androidx.lifecycle.r0)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            tVar2.f886m.O(parcelable);
        }
    }
}
