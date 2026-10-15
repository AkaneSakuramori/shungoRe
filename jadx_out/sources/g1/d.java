package g1;

import a3.j;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2308b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2309a;

    public d(Map map) {
        this.f2309a = j.d3(map);
    }

    public final void a(String str, String str2) {
        LinkedHashMap linkedHashMap = this.f2309a;
        if (str2 == null) {
            linkedHashMap.remove(str);
        } else {
            linkedHashMap.put(str, str2);
        }
    }
}
