package n0;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import i.l3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f3538a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((l3) this.f3538a).c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorG;
        l3 l3Var = (l3) this.f3538a;
        if (charSequence == null) {
            string = "";
        } else {
            l3Var.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = l3Var.f2643l;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorG = l3Var.g(l3Var.f2644m, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException e5) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e5);
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        c cVar = this.f3538a;
        Cursor cursor = ((b) cVar).f3533d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((l3) cVar).b((Cursor) obj);
    }
}
