package l0;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import e.n0;
import i0.e;
import i0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f3367a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f3367a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        n0 n0Var;
        Bundle bundle2;
        if (inputContentInfo == null) {
            n0Var = null;
        } else {
            n0Var = new n0(16, new n0(inputContentInfo));
        }
        View view = (View) this.f3367a.f3366a;
        if ((i4 & 1) != 0) {
            try {
                n0Var.g();
                Parcelable parcelable = (Parcelable) ((d) n0Var.f1896c).p();
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e5) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e5);
            }
        } else {
            bundle2 = bundle;
        }
        n0 n0Var2 = new n0(new ClipData(n0Var.f(), new ClipData.Item(n0Var.s())), 2);
        ((e) n0Var2.f1896c).b(n0Var.l());
        ((e) n0Var2.f1896c).a(bundle2);
        if (v0.h(view, ((e) n0Var2.f1896c).d()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i4, bundle);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return super.performPrivateCommand(str, bundle);
    }
}
