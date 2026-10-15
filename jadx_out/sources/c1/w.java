package c1;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f1225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f1226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f1227c;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f1225a = true;
        f1226b = true;
        f1227c = i4 >= 28;
    }
}
