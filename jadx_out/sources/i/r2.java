package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends z1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2763n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2764o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n2 f2765p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h.q f2766q;

    public r2(Context context, boolean z4) {
        super(context, z4);
        if (1 == q2.a(context.getResources().getConfiguration())) {
            this.f2763n = 21;
            this.f2764o = 22;
        } else {
            this.f2763n = 22;
            this.f2764o = 21;
        }
    }

    @Override // i.z1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        h.l lVar;
        int headersCount;
        int iPointToPosition;
        int i4;
        if (this.f2765p != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                lVar = (h.l) headerViewListAdapter.getWrappedAdapter();
            } else {
                lVar = (h.l) adapter;
                headersCount = 0;
            }
            h.q qVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = iPointToPosition - headersCount) < 0 || i4 >= lVar.getCount()) ? null : lVar.getItem(i4);
            h.q qVar = this.f2766q;
            if (qVar != qVarB) {
                h.o oVar = lVar.f2419b;
                if (qVar != null) {
                    this.f2765p.i(oVar, qVar);
                }
                this.f2766q = qVarB;
                if (qVarB != null) {
                    this.f2765p.o(oVar, qVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i4 == this.f2763n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i4 != this.f2764o) {
            return super.onKeyDown(i4, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (h.l) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (h.l) adapter).f2419b.c(false);
        return true;
    }

    public void setHoverListener(n2 n2Var) {
        this.f2765p = n2Var;
    }

    @Override // i.z1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
