package i;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements v0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e.j f2748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListAdapter f2749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f2750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f2751e;

    public q0(w0 w0Var) {
        this.f2751e = w0Var;
    }

    @Override // i.v0
    public final boolean a() {
        e.j jVar = this.f2748b;
        if (jVar != null) {
            return jVar.isShowing();
        }
        return false;
    }

    @Override // i.v0
    public final CharSequence b() {
        return this.f2750d;
    }

    @Override // i.v0
    public final void c(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // i.v0
    public final int d() {
        return 0;
    }

    @Override // i.v0
    public final void dismiss() {
        e.j jVar = this.f2748b;
        if (jVar != null) {
            jVar.dismiss();
            this.f2748b = null;
        }
    }

    @Override // i.v0
    public final void e(int i4, int i5) {
        if (this.f2749c == null) {
            return;
        }
        w0 w0Var = this.f2751e;
        e.i iVar = new e.i(w0Var.getPopupContext());
        CharSequence charSequence = this.f2750d;
        Object obj = iVar.f1879c;
        if (charSequence != null) {
            ((e.e) obj).f1805d = charSequence;
        }
        ListAdapter listAdapter = this.f2749c;
        int selectedItemPosition = w0Var.getSelectedItemPosition();
        e.e eVar = (e.e) obj;
        eVar.f1808g = listAdapter;
        eVar.f1809h = this;
        eVar.f1811j = selectedItemPosition;
        eVar.f1810i = true;
        e.j jVarA = iVar.a();
        this.f2748b = jVarA;
        AlertController$RecycleListView alertController$RecycleListView = jVarA.f1882g.f1850e;
        o0.d(alertController$RecycleListView, i4);
        o0.c(alertController$RecycleListView, i5);
        this.f2748b.show();
    }

    @Override // i.v0
    public final void g(CharSequence charSequence) {
        this.f2750d = charSequence;
    }

    @Override // i.v0
    public final int j() {
        return 0;
    }

    @Override // i.v0
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // i.v0
    public final void l(int i4) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // i.v0
    public final Drawable m() {
        return null;
    }

    @Override // i.v0
    public final void n(ListAdapter listAdapter) {
        this.f2749c = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        w0 w0Var = this.f2751e;
        w0Var.setSelection(i4);
        if (w0Var.getOnItemClickListener() != null) {
            w0Var.performItemClick(null, i4, this.f2749c.getItemId(i4));
        }
        dismiss();
    }

    @Override // i.v0
    public final void p(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
