package m2;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3468g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2.f f3462a = o2.f.f3619d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3463b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f3464c = g.f3445b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3465d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f3466e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f3467f = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3469h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3470i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3471j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v f3472k = z.f3478b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f3473l = z.f3479c;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(p pVar, Type type) {
        ArrayList arrayList = this.f3466e;
        TypeToken<?> typeToken = TypeToken.get(type);
        arrayList.add(new p2.r(pVar, typeToken, typeToken.getType() == typeToken.getRawType()));
        if (pVar instanceof b0) {
            p2.u uVar = p2.x.f3841a;
            arrayList.add(new p2.u(TypeToken.get(type), (b0) pVar, 2));
        }
    }
}
