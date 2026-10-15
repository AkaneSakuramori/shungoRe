package com.topjohnwu.superuser.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
class RootServerMain extends ContextWrapper implements Callable {
    private static final Method c;
    private static final Method d;
    private final int a;
    private final boolean b;

    static {
        try {
            c = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            d = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: all -> 0x00af, RemoteException -> 0x00b6, TryCatch #7 {RemoteException -> 0x00b6, all -> 0x00af, blocks: (B:26:0x005f, B:39:0x009e, B:40:0x00a4, B:29:0x0083, B:31:0x008b, B:33:0x008f, B:34:0x0092), top: B:82:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[Catch: all -> 0x00af, RemoteException -> 0x00b6, TryCatch #7 {RemoteException -> 0x00b6, all -> 0x00af, blocks: (B:26:0x005f, B:39:0x009e, B:40:0x00a4, B:29:0x0083, B:31:0x008b, B:33:0x008f, B:34:0x0092), top: B:82:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[Catch: all -> 0x00af, RemoteException -> 0x00b6, TryCatch #7 {RemoteException -> 0x00b6, all -> 0x00af, blocks: (B:26:0x005f, B:39:0x009e, B:40:0x00a4, B:29:0x0083, B:31:0x008b, B:33:0x008f, B:34:0x0092), top: B:82:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x009e A[Catch: all -> 0x00af, RemoteException -> 0x00b6, TryCatch #7 {RemoteException -> 0x00b6, all -> 0x00af, blocks: (B:26:0x005f, B:39:0x009e, B:40:0x00a4, B:29:0x0083, B:31:0x008b, B:33:0x008f, B:34:0x0092), top: B:82:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[Catch: all -> 0x00af, RemoteException -> 0x00b6, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x00b6, all -> 0x00af, blocks: (B:26:0x005f, B:39:0x009e, B:40:0x00a4, B:29:0x0083, B:31:0x008b, B:33:0x008f, B:34:0x0092), top: B:82:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f  */
    /* JADX WARN: Code duplicated, block: B:82:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public RootServerMain(String[] strArr) throws IllegalAccessException, NoSuchMethodException, PackageManager.NameNotFoundException, InvocationTargetException {
        boolean z;
        IBinder iBinder;
        IInterface iInterfaceQueryLocalInterface;
        IInterface aVar;
        Resources system;
        Field declaredField;
        Context context;
        int i;
        Context contextCreatePackageContext;
        super(null);
        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(strArr[0]);
        int i2 = Integer.parseInt(strArr[1]);
        this.a = i2;
        String str = strArr[2];
        str.getClass();
        switch (str) {
            case "daemon":
                z = false;
                this.b = true;
                if (this.b) {
                    try {
                        iBinder = (IBinder) c.invoke(null, "libsu-" + componentNameUnflattenFromString.getPackageName());
                        int i3 = b.a;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.topjohnwu.superuser.internal.IRootServiceManager");
                            if (iInterfaceQueryLocalInterface == null && (iInterfaceQueryLocalInterface instanceof c)) {
                                aVar = (c) iInterfaceQueryLocalInterface;
                            } else {
                                aVar = new a(iBinder);
                            }
                        }
                        if (aVar != null) {
                            if (z) {
                                ((a) aVar).b(componentNameUnflattenFromString, i2);
                            } else {
                                ((a) aVar).a(i2);
                                System.exit(0);
                            }
                            if (z) {
                                System.exit(0);
                            }
                        } else if (z) {
                            System.exit(0);
                        }
                    } catch (RemoteException unused) {
                        if (z) {
                            System.exit(0);
                        }
                    } catch (Throwable th) {
                        if (z) {
                            System.exit(0);
                        }
                        throw th;
                    }
                }
                system = Resources.getSystem();
                try {
                    Class.forName("com.lge.systemservice.core.integrity.IntegrityManager");
                    d dVar = new d(system);
                    declaredField = Resources.class.getDeclaredField("mSystem");
                    try {
                        declaredField.setAccessible(true);
                        declaredField.set(null, dVar);
                        break;
                    } catch (ReflectiveOperationException unused2) {
                    }
                } catch (ReflectiveOperationException unused3) {
                    declaredField = null;
                }
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    context = (Context) cls.getMethod("getSystemContext", new Class[0]).invoke(cls.getMethod("systemMain", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                    i = this.a / 100000;
                    try {
                        Class<?> cls2 = Integer.TYPE;
                        contextCreatePackageContext = (Context) context.getClass().getDeclaredMethod("createPackageContextAsUser", String.class, cls2, UserHandle.class).invoke(context, componentNameUnflattenFromString.getPackageName(), 3, (UserHandle) UserHandle.class.getDeclaredMethod("of", cls2).invoke(null, Integer.valueOf(i)));
                        break;
                    } catch (Throwable th2) {
                        Log.w("IPC", "Failed to create package context as user: " + i, th2);
                        contextCreatePackageContext = context.createPackageContext(componentNameUnflattenFromString.getPackageName(), 3);
                    }
                    attachBaseContext(contextCreatePackageContext);
                    ClassLoader classLoader = contextCreatePackageContext.getClassLoader();
                    if (declaredField != null) {
                        try {
                            declaredField.set(null, system);
                            break;
                        } catch (ReflectiveOperationException unused4) {
                        }
                    }
                    Constructor<?> declaredConstructor = classLoader.loadClass(componentNameUnflattenFromString.getClassName()).getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    d.invoke(declaredConstructor.newInstance(new Object[0]), this);
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            case "stop":
                z = true;
                this.b = true;
                if (this.b) {
                    iBinder = (IBinder) c.invoke(null, "libsu-" + componentNameUnflattenFromString.getPackageName());
                    int i4 = b.a;
                    if (iBinder == null) {
                        aVar = null;
                    } else {
                        iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.topjohnwu.superuser.internal.IRootServiceManager");
                        if (iInterfaceQueryLocalInterface == null) {
                            aVar = new a(iBinder);
                        } else {
                            aVar = new a(iBinder);
                        }
                    }
                    if (aVar != null) {
                        if (z) {
                            ((a) aVar).b(componentNameUnflattenFromString, i2);
                        } else {
                            ((a) aVar).a(i2);
                            System.exit(0);
                        }
                        if (z) {
                            System.exit(0);
                        }
                    } else if (z) {
                        System.exit(0);
                    }
                }
                system = Resources.getSystem();
                Class.forName("com.lge.systemservice.core.integrity.IntegrityManager");
                d dVar2 = new d(system);
                declaredField = Resources.class.getDeclaredField("mSystem");
                declaredField.setAccessible(true);
                declaredField.set(null, dVar2);
                Class<?> cls3 = Class.forName("android.app.ActivityThread");
                context = (Context) cls3.getMethod("getSystemContext", new Class[0]).invoke(cls3.getMethod("systemMain", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                i = this.a / 100000;
                Class<?> cls4 = Integer.TYPE;
                contextCreatePackageContext = (Context) context.getClass().getDeclaredMethod("createPackageContextAsUser", String.class, cls4, UserHandle.class).invoke(context, componentNameUnflattenFromString.getPackageName(), 3, (UserHandle) UserHandle.class.getDeclaredMethod("of", cls4).invoke(null, Integer.valueOf(i)));
                attachBaseContext(contextCreatePackageContext);
                ClassLoader classLoader2 = contextCreatePackageContext.getClassLoader();
                if (declaredField != null) {
                    declaredField.set(null, system);
                    break;
                }
                Constructor<?> declaredConstructor2 = classLoader2.loadClass(componentNameUnflattenFromString.getClassName()).getDeclaredConstructor(new Class[0]);
                declaredConstructor2.setAccessible(true);
                d.invoke(declaredConstructor2.newInstance(new Object[0]), this);
                return;
            case "start":
                this.b = false;
                z = false;
                if (this.b) {
                    iBinder = (IBinder) c.invoke(null, "libsu-" + componentNameUnflattenFromString.getPackageName());
                    int i5 = b.a;
                    if (iBinder == null) {
                        aVar = null;
                    } else {
                        iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.topjohnwu.superuser.internal.IRootServiceManager");
                        if (iInterfaceQueryLocalInterface == null) {
                            aVar = new a(iBinder);
                        } else {
                            aVar = new a(iBinder);
                        }
                    }
                    if (aVar != null) {
                        if (z) {
                            ((a) aVar).b(componentNameUnflattenFromString, i2);
                        } else {
                            ((a) aVar).a(i2);
                            System.exit(0);
                        }
                        if (z) {
                            System.exit(0);
                        }
                    } else if (z) {
                        System.exit(0);
                    }
                }
                system = Resources.getSystem();
                Class.forName("com.lge.systemservice.core.integrity.IntegrityManager");
                d dVar3 = new d(system);
                declaredField = Resources.class.getDeclaredField("mSystem");
                declaredField.setAccessible(true);
                declaredField.set(null, dVar3);
                Class<?> cls5 = Class.forName("android.app.ActivityThread");
                context = (Context) cls5.getMethod("getSystemContext", new Class[0]).invoke(cls5.getMethod("systemMain", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                i = this.a / 100000;
                Class<?> cls6 = Integer.TYPE;
                contextCreatePackageContext = (Context) context.getClass().getDeclaredMethod("createPackageContextAsUser", String.class, cls6, UserHandle.class).invoke(context, componentNameUnflattenFromString.getPackageName(), 3, (UserHandle) UserHandle.class.getDeclaredMethod("of", cls6).invoke(null, Integer.valueOf(i)));
                attachBaseContext(contextCreatePackageContext);
                ClassLoader classLoader3 = contextCreatePackageContext.getClassLoader();
                if (declaredField != null) {
                    declaredField.set(null, system);
                    break;
                }
                Constructor<?> declaredConstructor3 = classLoader3.loadClass(componentNameUnflattenFromString.getClassName()).getDeclaredConstructor(new Class[0]);
                declaredConstructor3.setAccessible(true);
                d.invoke(declaredConstructor3.newInstance(new Object[0]), this);
                return;
            default:
                throw new IllegalArgumentException("Unknown action");
        }
    }

    public static void main(String[] strArr) {
        System.out.close();
        System.err.close();
        if (strArr.length < 3) {
            System.exit(1);
        }
        Looper.prepareMainLooper();
        try {
            new RootServerMain(strArr);
        } catch (Exception e) {
            Log.e("IPC", "Error in IPCMain", e);
            System.exit(1);
        }
        Looper.loop();
        System.exit(1);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)};
    }
}
