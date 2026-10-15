package t3;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4409a;

    public /* synthetic */ p(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                this.f4409a = new ArrayList();
            } else {
                this.f4409a = new ArrayList();
            }
        }
    }

    public void a(String str, String str2) {
        c3.h.b0(str, "name");
        c3.h.b0(str2, "value");
        ArrayList arrayList = this.f4409a;
        arrayList.add(str);
        arrayList.add(q3.l.t3(str2).toString());
    }

    public q b() {
        return new q((String[]) this.f4409a.toArray(new String[0]));
    }

    public void c(String str) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4409a;
            if (i4 >= arrayList.size()) {
                return;
            }
            if (q3.l.U2(str, (String) arrayList.get(i4))) {
                arrayList.remove(i4);
                arrayList.remove(i4);
                i4 -= 2;
            }
            i4 += 2;
        }
    }

    public p() {
        this.f4409a = new ArrayList(20);
    }
}
