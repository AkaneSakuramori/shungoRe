package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m[] f971g;

    static {
        m mVar = new m("DESTROYED", 0);
        f966b = mVar;
        m mVar2 = new m("INITIALIZED", 1);
        f967c = mVar2;
        m mVar3 = new m("CREATED", 2);
        f968d = mVar3;
        m mVar4 = new m("STARTED", 3);
        f969e = mVar4;
        m mVar5 = new m("RESUMED", 4);
        f970f = mVar5;
        f971g = new m[]{mVar, mVar2, mVar3, mVar4, mVar5};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f971g.clone();
    }
}
