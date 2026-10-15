package d3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f1768e;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f1765b = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f1766c = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f1767d = aVar3;
        f1768e = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1768e.clone();
    }
}
