package e;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import i.u2;
import i.x3;
import i.z3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends androidx.fragment.app.u implements n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e0 f1894w;

    public m() {
        this.f274f.f5440b.b("androidx:appcompat", new k(this));
        i(new l(this));
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        e0 e0Var = (e0) l();
        e0Var.w();
        ((ViewGroup) e0Var.B.findViewById(R.id.content)).addView(view, layoutParams);
        e0Var.f1827n.a(e0Var.f1826m.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018e  */
    /* JADX WARN: Code duplicated, block: B:104:0x019d  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:138:0x0217 A[Catch: all -> 0x020b, TRY_LEAVE, TryCatch #4 {, blocks: (B:129:0x01f7, B:131:0x01fb, B:137:0x0215, B:138:0x0217, B:140:0x021b, B:146:0x022d, B:145:0x0224, B:136:0x020e), top: B:160:0x01f7, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0117  */
    /* JADX WARN: Code duplicated, block: B:74:0x011f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0127  */
    /* JADX WARN: Code duplicated, block: B:80:0x012f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x0152  */
    /* JADX WARN: Code duplicated, block: B:92:0x0161  */
    /* JADX WARN: Code duplicated, block: B:95:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int i4;
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        g.f fVar;
        Resources.Theme theme;
        Method method;
        float f5;
        float f6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        e0 e0Var = (e0) l();
        e0Var.P = true;
        int i45 = e0Var.T;
        if (i45 == -100) {
            i45 = r.f1908c;
        }
        int iC = e0Var.C(context, i45);
        int i46 = 0;
        if (r.c(context) && r.c(context)) {
            if (!e0.b.a()) {
                synchronized (r.f1915j) {
                    try {
                        e0.h hVar = r.f1909d;
                        if (hVar == null) {
                            if (r.f1910e == null) {
                                r.f1910e = e0.h.a(r3.q.p(context));
                            }
                            if (!((e0.j) r.f1910e.f1960a).f1961a.isEmpty()) {
                                r.f1909d = r.f1910e;
                            }
                        } else if (!hVar.equals(r.f1910e)) {
                            e0.h hVar2 = r.f1909d;
                            r.f1910e = hVar2;
                            r3.q.o(context, ((e0.j) hVar2.f1960a).f1961a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!r.f1912g) {
                r.f1907b.execute(new o(context, i46));
            }
        }
        e0.h hVarP = e0.p(context);
        if (e0.f1815l0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(e0.t(context, iC, hVarP, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof g.f) {
                    ((g.f) context).a(e0.t(context, iC, hVarP, null, false));
                } else if (e0.f1814k0) {
                    i4 = Build.VERSION.SDK_INT;
                    Configuration configuration4 = new Configuration();
                    configuration4.uiMode = -1;
                    configuration4.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = null;
                    } else {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f5 = configuration.fontScale;
                            f6 = configuration2.fontScale;
                            if (f5 != f6) {
                                configuration3.fontScale = f6;
                            }
                            i5 = configuration.mcc;
                            i6 = configuration2.mcc;
                            if (i5 != i6) {
                                configuration3.mcc = i6;
                            }
                            i7 = configuration.mnc;
                            i8 = configuration2.mnc;
                            if (i7 != i8) {
                                configuration3.mnc = i8;
                            }
                            w.a(configuration, configuration2, configuration3);
                            i9 = configuration.touchscreen;
                            i10 = configuration2.touchscreen;
                            if (i9 != i10) {
                                configuration3.touchscreen = i10;
                            }
                            i11 = configuration.keyboard;
                            i12 = configuration2.keyboard;
                            if (i11 != i12) {
                                configuration3.keyboard = i12;
                            }
                            i13 = configuration.keyboardHidden;
                            i14 = configuration2.keyboardHidden;
                            if (i13 != i14) {
                                configuration3.keyboardHidden = i14;
                            }
                            i15 = configuration.navigation;
                            i16 = configuration2.navigation;
                            if (i15 != i16) {
                                configuration3.navigation = i16;
                            }
                            i17 = configuration.navigationHidden;
                            i18 = configuration2.navigationHidden;
                            if (i17 != i18) {
                                configuration3.navigationHidden = i18;
                            }
                            i19 = configuration.orientation;
                            i20 = configuration2.orientation;
                            if (i19 != i20) {
                                configuration3.orientation = i20;
                            }
                            i21 = configuration.screenLayout & 15;
                            i22 = configuration2.screenLayout & 15;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 192;
                            i24 = configuration2.screenLayout & 192;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            i25 = configuration.screenLayout & 48;
                            i26 = configuration2.screenLayout & 48;
                            if (i25 != i26) {
                                configuration3.screenLayout |= i26;
                            }
                            i27 = configuration.screenLayout & 768;
                            i28 = configuration2.screenLayout & 768;
                            if (i27 != i28) {
                                configuration3.screenLayout |= i28;
                            }
                            i29 = configuration.colorMode & 3;
                            i30 = configuration2.colorMode & 3;
                            if (i29 != i30) {
                                configuration3.colorMode |= i30;
                            }
                            i31 = configuration.colorMode & 12;
                            i32 = configuration2.colorMode & 12;
                            if (i31 != i32) {
                                configuration3.colorMode |= i32;
                            }
                            i33 = configuration.uiMode & 15;
                            i34 = configuration2.uiMode & 15;
                            if (i33 != i34) {
                                configuration3.uiMode |= i34;
                            }
                            i35 = configuration.uiMode & 48;
                            i36 = configuration2.uiMode & 48;
                            if (i35 != i36) {
                                configuration3.uiMode |= i36;
                            }
                            i37 = configuration.screenWidthDp;
                            i38 = configuration2.screenWidthDp;
                            if (i37 != i38) {
                                configuration3.screenWidthDp = i38;
                            }
                            i39 = configuration.screenHeightDp;
                            i40 = configuration2.screenHeightDp;
                            if (i39 != i40) {
                                configuration3.screenHeightDp = i40;
                            }
                            i41 = configuration.smallestScreenWidthDp;
                            i42 = configuration2.smallestScreenWidthDp;
                            if (i41 != i42) {
                                configuration3.smallestScreenWidthDp = i42;
                            }
                            i43 = configuration.densityDpi;
                            i44 = configuration2.densityDpi;
                            if (i43 != i44) {
                                configuration3.densityDpi = i44;
                            }
                        }
                    }
                    Configuration configurationT = e0.t(context, iC, hVarP, configuration3, true);
                    fVar = new g.f(context, com.shungo.app.R.style.Theme_AppCompat_Empty);
                    fVar.a(configurationT);
                    if (context.getTheme() != null) {
                        theme = fVar.getTheme();
                        if (i4 >= 29) {
                            a0.p.a(theme);
                        } else {
                            synchronized (a0.o.f35a) {
                                if (a0.o.f37c) {
                                    method = a0.o.f36b;
                                    if (method != null) {
                                        method.invoke(theme, new Object[0]);
                                    }
                                } else {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    a0.o.f36b = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                    a0.o.f37c = true;
                                    method = a0.o.f36b;
                                    if (method != null) {
                                        method.invoke(theme, new Object[0]);
                                    }
                                }
                            }
                        }
                    }
                    context = fVar;
                }
            }
        } else if (context instanceof g.f) {
            try {
                ((g.f) context).a(e0.t(context, iC, hVarP, null, false));
            } catch (IllegalStateException unused2) {
                if (e0.f1814k0) {
                    i4 = Build.VERSION.SDK_INT;
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f5 = configuration.fontScale;
                            f6 = configuration2.fontScale;
                            if (f5 != f6) {
                                configuration3.fontScale = f6;
                            }
                            i5 = configuration.mcc;
                            i6 = configuration2.mcc;
                            if (i5 != i6) {
                                configuration3.mcc = i6;
                            }
                            i7 = configuration.mnc;
                            i8 = configuration2.mnc;
                            if (i7 != i8) {
                                configuration3.mnc = i8;
                            }
                            w.a(configuration, configuration2, configuration3);
                            i9 = configuration.touchscreen;
                            i10 = configuration2.touchscreen;
                            if (i9 != i10) {
                                configuration3.touchscreen = i10;
                            }
                            i11 = configuration.keyboard;
                            i12 = configuration2.keyboard;
                            if (i11 != i12) {
                                configuration3.keyboard = i12;
                            }
                            i13 = configuration.keyboardHidden;
                            i14 = configuration2.keyboardHidden;
                            if (i13 != i14) {
                                configuration3.keyboardHidden = i14;
                            }
                            i15 = configuration.navigation;
                            i16 = configuration2.navigation;
                            if (i15 != i16) {
                                configuration3.navigation = i16;
                            }
                            i17 = configuration.navigationHidden;
                            i18 = configuration2.navigationHidden;
                            if (i17 != i18) {
                                configuration3.navigationHidden = i18;
                            }
                            i19 = configuration.orientation;
                            i20 = configuration2.orientation;
                            if (i19 != i20) {
                                configuration3.orientation = i20;
                            }
                            i21 = configuration.screenLayout & 15;
                            i22 = configuration2.screenLayout & 15;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 192;
                            i24 = configuration2.screenLayout & 192;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            i25 = configuration.screenLayout & 48;
                            i26 = configuration2.screenLayout & 48;
                            if (i25 != i26) {
                                configuration3.screenLayout |= i26;
                            }
                            i27 = configuration.screenLayout & 768;
                            i28 = configuration2.screenLayout & 768;
                            if (i27 != i28) {
                                configuration3.screenLayout |= i28;
                            }
                            i29 = configuration.colorMode & 3;
                            i30 = configuration2.colorMode & 3;
                            if (i29 != i30) {
                                configuration3.colorMode |= i30;
                            }
                            i31 = configuration.colorMode & 12;
                            i32 = configuration2.colorMode & 12;
                            if (i31 != i32) {
                                configuration3.colorMode |= i32;
                            }
                            i33 = configuration.uiMode & 15;
                            i34 = configuration2.uiMode & 15;
                            if (i33 != i34) {
                                configuration3.uiMode |= i34;
                            }
                            i35 = configuration.uiMode & 48;
                            i36 = configuration2.uiMode & 48;
                            if (i35 != i36) {
                                configuration3.uiMode |= i36;
                            }
                            i37 = configuration.screenWidthDp;
                            i38 = configuration2.screenWidthDp;
                            if (i37 != i38) {
                                configuration3.screenWidthDp = i38;
                            }
                            i39 = configuration.screenHeightDp;
                            i40 = configuration2.screenHeightDp;
                            if (i39 != i40) {
                                configuration3.screenHeightDp = i40;
                            }
                            i41 = configuration.smallestScreenWidthDp;
                            i42 = configuration2.smallestScreenWidthDp;
                            if (i41 != i42) {
                                configuration3.smallestScreenWidthDp = i42;
                            }
                            i43 = configuration.densityDpi;
                            i44 = configuration2.densityDpi;
                            if (i43 != i44) {
                                configuration3.densityDpi = i44;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationT2 = e0.t(context, iC, hVarP, configuration3, true);
                    fVar = new g.f(context, com.shungo.app.R.style.Theme_AppCompat_Empty);
                    fVar.a(configurationT2);
                    try {
                        if (context.getTheme() != null) {
                            theme = fVar.getTheme();
                            if (i4 >= 29) {
                                a0.p.a(theme);
                            } else {
                                synchronized (a0.o.f35a) {
                                    if (a0.o.f37c) {
                                        try {
                                            Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                            a0.o.f36b = declaredMethod2;
                                            declaredMethod2.setAccessible(true);
                                        } catch (NoSuchMethodException e5) {
                                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e5);
                                        }
                                        a0.o.f37c = true;
                                        method = a0.o.f36b;
                                        if (method != null) {
                                            try {
                                                method.invoke(theme, new Object[0]);
                                            } catch (IllegalAccessException | InvocationTargetException e6) {
                                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e6);
                                                a0.o.f36b = null;
                                            }
                                        }
                                    } else {
                                        method = a0.o.f36b;
                                        if (method != null) {
                                            method.invoke(theme, new Object[0]);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (NullPointerException unused3) {
                    }
                    context = fVar;
                }
            }
        } else if (e0.f1814k0) {
            i4 = Build.VERSION.SDK_INT;
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f5 = configuration.fontScale;
                    f6 = configuration2.fontScale;
                    if (f5 != f6) {
                        configuration3.fontScale = f6;
                    }
                    i5 = configuration.mcc;
                    i6 = configuration2.mcc;
                    if (i5 != i6) {
                        configuration3.mcc = i6;
                    }
                    i7 = configuration.mnc;
                    i8 = configuration2.mnc;
                    if (i7 != i8) {
                        configuration3.mnc = i8;
                    }
                    w.a(configuration, configuration2, configuration3);
                    i9 = configuration.touchscreen;
                    i10 = configuration2.touchscreen;
                    if (i9 != i10) {
                        configuration3.touchscreen = i10;
                    }
                    i11 = configuration.keyboard;
                    i12 = configuration2.keyboard;
                    if (i11 != i12) {
                        configuration3.keyboard = i12;
                    }
                    i13 = configuration.keyboardHidden;
                    i14 = configuration2.keyboardHidden;
                    if (i13 != i14) {
                        configuration3.keyboardHidden = i14;
                    }
                    i15 = configuration.navigation;
                    i16 = configuration2.navigation;
                    if (i15 != i16) {
                        configuration3.navigation = i16;
                    }
                    i17 = configuration.navigationHidden;
                    i18 = configuration2.navigationHidden;
                    if (i17 != i18) {
                        configuration3.navigationHidden = i18;
                    }
                    i19 = configuration.orientation;
                    i20 = configuration2.orientation;
                    if (i19 != i20) {
                        configuration3.orientation = i20;
                    }
                    i21 = configuration.screenLayout & 15;
                    i22 = configuration2.screenLayout & 15;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 192;
                    i24 = configuration2.screenLayout & 192;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    i25 = configuration.screenLayout & 48;
                    i26 = configuration2.screenLayout & 48;
                    if (i25 != i26) {
                        configuration3.screenLayout |= i26;
                    }
                    i27 = configuration.screenLayout & 768;
                    i28 = configuration2.screenLayout & 768;
                    if (i27 != i28) {
                        configuration3.screenLayout |= i28;
                    }
                    i29 = configuration.colorMode & 3;
                    i30 = configuration2.colorMode & 3;
                    if (i29 != i30) {
                        configuration3.colorMode |= i30;
                    }
                    i31 = configuration.colorMode & 12;
                    i32 = configuration2.colorMode & 12;
                    if (i31 != i32) {
                        configuration3.colorMode |= i32;
                    }
                    i33 = configuration.uiMode & 15;
                    i34 = configuration2.uiMode & 15;
                    if (i33 != i34) {
                        configuration3.uiMode |= i34;
                    }
                    i35 = configuration.uiMode & 48;
                    i36 = configuration2.uiMode & 48;
                    if (i35 != i36) {
                        configuration3.uiMode |= i36;
                    }
                    i37 = configuration.screenWidthDp;
                    i38 = configuration2.screenWidthDp;
                    if (i37 != i38) {
                        configuration3.screenWidthDp = i38;
                    }
                    i39 = configuration.screenHeightDp;
                    i40 = configuration2.screenHeightDp;
                    if (i39 != i40) {
                        configuration3.screenHeightDp = i40;
                    }
                    i41 = configuration.smallestScreenWidthDp;
                    i42 = configuration2.smallestScreenWidthDp;
                    if (i41 != i42) {
                        configuration3.smallestScreenWidthDp = i42;
                    }
                    i43 = configuration.densityDpi;
                    i44 = configuration2.densityDpi;
                    if (i43 != i44) {
                        configuration3.densityDpi = i44;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationT3 = e0.t(context, iC, hVarP, configuration3, true);
            fVar = new g.f(context, com.shungo.app.R.style.Theme_AppCompat_Empty);
            fVar.a(configurationT3);
            if (context.getTheme() != null) {
                theme = fVar.getTheme();
                if (i4 >= 29) {
                    a0.p.a(theme);
                } else {
                    synchronized (a0.o.f35a) {
                        if (a0.o.f37c) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            a0.o.f36b = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            a0.o.f37c = true;
                            method = a0.o.f36b;
                            if (method != null) {
                                method.invoke(theme, new Object[0]);
                            }
                        } else {
                            method = a0.o.f36b;
                            if (method != null) {
                                method.invoke(theme, new Object[0]);
                            }
                        }
                    }
                }
            }
            context = fVar;
        }
        super.attachBaseContext(context);
    }

    @Override // e.n
    public final void b() {
    }

    @Override // e.n
    public final void c() {
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((e0) l()).A();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // e.n
    public final void d() {
    }

    @Override // y.j, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((e0) l()).A();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i4) {
        e0 e0Var = (e0) l();
        e0Var.w();
        return e0Var.f1826m.findViewById(i4);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        e0 e0Var = (e0) l();
        if (e0Var.f1830q == null) {
            e0Var.A();
            s0 s0Var = e0Var.f1829p;
            e0Var.f1830q = new g.l(s0Var != null ? s0Var.R2() : e0Var.f1825l);
        }
        return e0Var.f1830q;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i4 = z3.f2883a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        l().b();
    }

    public final r l() {
        if (this.f1894w == null) {
            l0 l0Var = r.f1907b;
            this.f1894w = new e0(this, null, this, this);
        }
        return this.f1894w;
    }

    public final void m() {
        View decorView = getWindow().getDecorView();
        c3.h.b0(decorView, "<this>");
        decorView.setTag(com.shungo.app.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        c3.h.b0(decorView2, "<this>");
        decorView2.setTag(com.shungo.app.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        c3.h.b0(decorView3, "<this>");
        decorView3.setTag(com.shungo.app.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        c3.h.b0(decorView4, "<this>");
        decorView4.setTag(com.shungo.app.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.fragment.app.u, androidx.activity.n, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e0 e0Var = (e0) l();
        if (e0Var.G && e0Var.A) {
            e0Var.A();
            s0 s0Var = e0Var.f1829p;
            if (s0Var != null) {
                s0Var.U2(new g.a(s0Var.f1923j, 0).f2207a.getResources().getBoolean(com.shungo.app.R.bool.abc_action_bar_embed_tabs));
            }
        }
        i.x xVarA = i.x.a();
        Context context = e0Var.f1825l;
        synchronized (xVarA) {
            u2 u2Var = xVarA.f2835a;
            synchronized (u2Var) {
                n.e eVar = (n.e) u2Var.f2791b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        e0Var.S = new Configuration(e0Var.f1825l.getResources().getConfiguration());
        e0Var.n(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        l().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // androidx.fragment.app.u, androidx.activity.n, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        Intent intentI;
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        e0 e0Var = (e0) l();
        e0Var.A();
        s0 s0Var = e0Var.f1829p;
        if (menuItem.getItemId() == 16908332 && s0Var != null && (((x3) s0Var.f1927n).f2838b & 4) != 0 && (intentI = r3.q.i(this)) != null) {
            if (!y.l.c(this, intentI)) {
                y.l.b(this, intentI);
                return true;
            }
            y.a0 a0Var = new y.a0(this);
            Intent intentI2 = r3.q.i(this);
            if (intentI2 == null) {
                intentI2 = r3.q.i(this);
            }
            ArrayList arrayList = a0Var.f5020b;
            Context context = a0Var.f5021c;
            if (intentI2 != null) {
                ComponentName component = intentI2.getComponent();
                if (component == null) {
                    component = intentI2.resolveActivity(context.getPackageManager());
                }
                int size = arrayList.size();
                try {
                    for (Intent intentJ = r3.q.j(context, component); intentJ != null; intentJ = r3.q.j(context, intentJ.getComponent())) {
                        arrayList.add(size, intentJ);
                    }
                    arrayList.add(intentI2);
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e5);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = z.d.f5428a;
            z.a.a(context, intentArr, null);
            try {
                int i5 = y.e.f5022b;
                y.a.a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i4, Menu menu) {
        return super.onMenuOpened(i4, menu);
    }

    @Override // androidx.fragment.app.u, androidx.activity.n, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i4, Menu menu) {
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((e0) l()).w();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        e0 e0Var = (e0) l();
        e0Var.A();
        s0 s0Var = e0Var.f1829p;
        if (s0Var != null) {
            s0Var.C = true;
        }
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((e0) l()).n(true, false);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        super.onStop();
        e0 e0Var = (e0) l();
        e0Var.A();
        s0 s0Var = e0Var.f1829p;
        if (s0Var != null) {
            s0Var.C = false;
            g.n nVar = s0Var.B;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        l().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((e0) l()).A();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i4) {
        m();
        l().j(i4);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        super.setTheme(i4);
        ((e0) l()).U = i4;
    }

    @Override // androidx.activity.n, android.app.Activity
    public void setContentView(View view) {
        m();
        l().k(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        l().l(view, layoutParams);
    }
}
