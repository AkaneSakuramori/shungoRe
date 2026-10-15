package n0;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import i.j2;
import i.l3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cursor f3533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f3535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j2 f3536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f3537h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f3533d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f3535f;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                j2 j2Var = this.f3536g;
                if (j2Var != null) {
                    cursor2.unregisterDataSetObserver(j2Var);
                }
            }
            this.f3533d = cursor;
            if (cursor != null) {
                a aVar2 = this.f3535f;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                j2 j2Var2 = this.f3536g;
                if (j2Var2 != null) {
                    cursor.registerDataSetObserver(j2Var2);
                }
                this.f3534e = cursor.getColumnIndexOrThrow("_id");
                this.f3531b = true;
                notifyDataSetChanged();
            } else {
                this.f3534e = -1;
                this.f3531b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f3531b || (cursor = this.f3533d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f3531b) {
            return null;
        }
        this.f3533d.moveToPosition(i4);
        if (view == null) {
            l3 l3Var = (l3) this;
            view = l3Var.f2642k.inflate(l3Var.f2641j, viewGroup, false);
        }
        a(view, this.f3533d);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f3537h == null) {
            d dVar = new d();
            dVar.f3538a = this;
            this.f3537h = dVar;
        }
        return this.f3537h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        Cursor cursor;
        if (!this.f3531b || (cursor = this.f3533d) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f3533d;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        Cursor cursor;
        if (this.f3531b && (cursor = this.f3533d) != null && cursor.moveToPosition(i4)) {
            return this.f3533d.getLong(this.f3534e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f3531b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f3533d.moveToPosition(i4)) {
            throw new IllegalStateException(defpackage.a.e("couldn't move cursor to position ", i4));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f3533d);
        return view;
    }
}
