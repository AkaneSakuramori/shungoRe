package p2;

import java.lang.reflect.Field;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
public final class w implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Field f3840a;

    public w(Field field) {
        this.f3840a = field;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        this.f3840a.setAccessible(true);
        return null;
    }
}
