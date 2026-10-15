package com.topjohnwu.superuser.internal;

import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
final class d extends Resources {
    public d(Resources resources) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        Method declaredMethod = Resources.class.getDeclaredMethod("getImpl", new Class[0]);
        declaredMethod.setAccessible(true);
        Method declaredMethod2 = Resources.class.getDeclaredMethod("setImpl", declaredMethod.getReturnType());
        declaredMethod2.setAccessible(true);
        declaredMethod2.invoke(this, declaredMethod.invoke(resources, new Object[0]));
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i) {
        try {
            return super.getBoolean(i);
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
