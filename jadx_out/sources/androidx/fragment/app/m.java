package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public class m extends q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler T;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f797c0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Dialog f799e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f800f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f801g0;
    public final v U = new v(2, this);
    public final i V = new i(this);
    public final j W = new j(this);
    public int X = 0;
    public int Y = 0;
    public boolean Z = true;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f795a0 = true;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f796b0 = -1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final k f798d0 = new k(0, this);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f802h0 = false;

    @Override // androidx.fragment.app.q
    public final void A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.A(layoutInflater, viewGroup, bundle);
        if (this.F != null || this.f799e0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f799e0.onRestoreInstanceState(bundle2);
    }

    public final void G(boolean z4, boolean z5) {
        if (this.f801g0) {
            return;
        }
        this.f801g0 = true;
        Dialog dialog = this.f799e0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f799e0.dismiss();
            if (!z5) {
                if (Looper.myLooper() == this.T.getLooper()) {
                    onDismiss(this.f799e0);
                } else {
                    this.T.post(this.U);
                }
            }
        }
        this.f800f0 = true;
        if (this.f796b0 >= 0) {
            i0 i0VarJ = j();
            int i4 = this.f796b0;
            if (i4 < 0) {
                throw new IllegalArgumentException(defpackage.a.e("Bad id: ", i4));
            }
            i0VarJ.v(new h0(i0VarJ, i4), false);
            this.f796b0 = -1;
            return;
        }
        a aVar = new a(j());
        i0 i0Var = this.f865s;
        if (i0Var != null && i0Var != aVar.f678p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new p0(3, this));
        if (z4) {
            aVar.d(true);
        } else {
            aVar.d(false);
        }
    }

    public Dialog H() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(C(), this.Y);
    }

    @Override // androidx.fragment.app.q
    public final c3.h b() {
        return new l(this, new n(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f800f0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        G(true, true);
    }

    @Override // androidx.fragment.app.q
    public final void p(Context context) {
        super.p(context);
        this.P.d(this.f798d0);
        this.f801g0 = false;
    }

    @Override // androidx.fragment.app.q
    public void q(Bundle bundle) {
        super.q(bundle);
        this.T = new Handler();
        this.f795a0 = this.f870x == 0;
        if (bundle != null) {
            this.X = bundle.getInt("android:style", 0);
            this.Y = bundle.getInt("android:theme", 0);
            this.Z = bundle.getBoolean("android:cancelable", true);
            this.f795a0 = bundle.getBoolean("android:showsDialog", this.f795a0);
            this.f796b0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.q
    public final void s() {
        this.D = true;
        Dialog dialog = this.f799e0;
        if (dialog != null) {
            this.f800f0 = true;
            dialog.setOnDismissListener(null);
            this.f799e0.dismiss();
            if (!this.f801g0) {
                onDismiss(this.f799e0);
            }
            this.f799e0 = null;
            this.f802h0 = false;
        }
    }

    @Override // androidx.fragment.app.q
    public final void u() {
        this.D = true;
        if (!this.f801g0) {
            this.f801g0 = true;
        }
        k kVar = this.f798d0;
        androidx.lifecycle.x xVar = this.P;
        xVar.getClass();
        androidx.lifecycle.x.a("removeObserver");
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) xVar.f997b.b(kVar);
        if (wVar == null) {
            return;
        }
        wVar.d();
        wVar.c(false);
    }

    @Override // androidx.fragment.app.q
    public final LayoutInflater v(Bundle bundle) {
        LayoutInflater layoutInflaterV = super.v(bundle);
        boolean z4 = this.f795a0;
        if (!z4 || this.f797c0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f795a0) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return layoutInflaterV;
        }
        if (z4 && !this.f802h0) {
            try {
                this.f797c0 = true;
                Dialog dialogH = H();
                this.f799e0 = dialogH;
                if (this.f795a0) {
                    int i4 = this.X;
                    if (i4 == 1 || i4 == 2) {
                        dialogH.requestWindowFeature(1);
                    } else if (i4 == 3) {
                        Window window = dialogH.getWindow();
                        if (window != null) {
                            window.addFlags(24);
                        }
                        dialogH.requestWindowFeature(1);
                    }
                    Context contextG = g();
                    if (contextG instanceof Activity) {
                        this.f799e0.setOwnerActivity((Activity) contextG);
                    }
                    this.f799e0.setCancelable(this.Z);
                    this.f799e0.setOnCancelListener(this.V);
                    this.f799e0.setOnDismissListener(this.W);
                    this.f802h0 = true;
                } else {
                    this.f799e0 = null;
                }
                this.f797c0 = false;
            } catch (Throwable th) {
                this.f797c0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f799e0;
        return dialog != null ? layoutInflaterV.cloneInContext(dialog.getContext()) : layoutInflaterV;
    }

    @Override // androidx.fragment.app.q
    public void w(Bundle bundle) {
        Dialog dialog = this.f799e0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i4 = this.X;
        if (i4 != 0) {
            bundle.putInt("android:style", i4);
        }
        int i5 = this.Y;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z4 = this.Z;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z5 = this.f795a0;
        if (!z5) {
            bundle.putBoolean("android:showsDialog", z5);
        }
        int i6 = this.f796b0;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
        }
    }

    @Override // androidx.fragment.app.q
    public void x() {
        this.D = true;
        Dialog dialog = this.f799e0;
        if (dialog != null) {
            this.f800f0 = false;
            dialog.show();
            View decorView = this.f799e0.getWindow().getDecorView();
            c3.h.b0(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.q
    public void y() {
        this.D = true;
        Dialog dialog = this.f799e0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.q
    public final void z(Bundle bundle) {
        Bundle bundle2;
        this.D = true;
        if (this.f799e0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f799e0.onRestoreInstanceState(bundle2);
    }
}
