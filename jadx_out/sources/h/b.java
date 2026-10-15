package h;

import androidx.appcompat.view.menu.ActionMenuItemView;
import i.c2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f2349k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2349k = actionMenuItemView;
    }

    @Override // i.c2
    public final g0 b() {
        i.h hVar;
        c cVar = this.f2349k.f351n;
        if (cVar == null || (hVar = ((i.i) cVar).f2609a.f2675u) == null) {
            return null;
        }
        return hVar.a();
    }

    @Override // i.c2
    public final boolean c() {
        g0 g0VarB;
        ActionMenuItemView actionMenuItemView = this.f2349k;
        n nVar = actionMenuItemView.f349l;
        return nVar != null && nVar.e(actionMenuItemView.f346i) && (g0VarB = b()) != null && g0VarB.a();
    }
}
