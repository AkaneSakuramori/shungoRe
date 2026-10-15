package k1;

import androidx.fragment.app.p;
import c3.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public final String toString() {
        if (h.I(this, c.f3252a)) {
            return "GET";
        }
        if (h.I(this, b.f3251c)) {
            return "POST";
        }
        if (h.I(this, b.f3250b)) {
            return "PATCH";
        }
        if (h.I(this, b.f3249a)) {
            return "DELETE";
        }
        throw new p();
    }
}
