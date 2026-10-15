package h;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import i0.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class o implements d0.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f2425y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f2427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f2430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f2434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2436k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f2438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f2439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f2440o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f2447v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2449x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2437l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2441p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2442q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2443r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2444s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f2445t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2446u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2448w = false;

    public o(Context context) {
        Resources resources;
        int identifier;
        boolean z4 = false;
        this.f2426a = context;
        Resources resources2 = context.getResources();
        this.f2427b = resources2;
        this.f2431f = new ArrayList();
        this.f2432g = new ArrayList();
        this.f2433h = true;
        this.f2434i = new ArrayList();
        this.f2435j = new ArrayList();
        this.f2436k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : x0.b(viewConfiguration)) {
                z4 = true;
            }
        }
        this.f2429d = z4;
    }

    public final q a(int i4, int i5, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (f2425y[i8] << 16) | (65535 & i6);
        q qVar = new q(this, i4, i5, i6, i9, charSequence, this.f2437l);
        ArrayList arrayList = this.f2431f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((q) arrayList.get(size)).f2456d <= i9) {
                i7 = size + 1;
                arrayList.add(i7, qVar);
                p(true);
                return qVar;
            }
        }
        i7 = 0;
        arrayList.add(i7, qVar);
        p(true);
        return qVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f2426a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            q qVarA = a(i4, i5, i6, resolveInfo.loadLabel(packageManager));
            qVarA.setIcon(resolveInfo.loadIcon(packageManager));
            qVarA.f2459g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = qVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(c0 c0Var, Context context) {
        this.f2446u.add(new WeakReference(c0Var));
        c0Var.g(context, this);
        this.f2436k = true;
    }

    public final void c(boolean z4) {
        if (this.f2444s) {
            return;
        }
        this.f2444s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2446u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                c0Var.b(this, z4);
            }
        }
        this.f2444s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        q qVar = this.f2447v;
        if (qVar != null) {
            d(qVar);
        }
        this.f2431f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2439n = null;
        this.f2438m = null;
        this.f2440o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(q qVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2446u;
        boolean zD = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2447v == qVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                c0 c0Var = (c0) weakReference.get();
                if (c0Var != null) {
                    zD = c0Var.d(qVar);
                    if (zD) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zD) {
                this.f2447v = null;
            }
        }
        return zD;
    }

    public boolean e(o oVar, MenuItem menuItem) {
        m mVar = this.f2430e;
        return mVar != null && mVar.e(oVar, menuItem);
    }

    public boolean f(q qVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2446u;
        boolean zK = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            c0 c0Var = (c0) weakReference.get();
            if (c0Var != null) {
                zK = c0Var.k(qVar);
                if (zK) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zK) {
            this.f2447v = qVar;
        }
        return zK;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f2431f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            q qVar = (q) arrayList.get(i5);
            if (qVar.f2453a == i4) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (menuItemFindItem = qVar.f2467o.findItem(i4)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final q g(int i4, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2445t;
        arrayList.clear();
        h(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean zN = n();
        for (int i5 = 0; i5 < size; i5++) {
            q qVar = (q) arrayList.get(i5);
            char c5 = zN ? qVar.f2462j : qVar.f2460h;
            char[] cArr = keyData.meta;
            if ((c5 == cArr[0] && (metaState & 2) == 0) || ((c5 == cArr[2] && (metaState & 2) != 0) || (zN && c5 == '\b' && i4 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return (MenuItem) this.f2431f.get(i4);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    public final void h(ArrayList arrayList, int i4, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList2 = this.f2431f;
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                q qVar = (q) arrayList2.get(i5);
                if (qVar.hasSubMenu()) {
                    qVar.f2467o.h(arrayList, i4, keyEvent);
                }
                char c5 = zN ? qVar.f2462j : qVar.f2460h;
                if ((modifiers & 69647) == ((zN ? qVar.f2463k : qVar.f2461i) & 69647) && c5 != 0) {
                    char[] cArr = keyData.meta;
                    if (c5 != cArr[0] && c5 != cArr[2]) {
                        if (zN && c5 == '\b') {
                            if (i4 == 67) {
                            }
                        }
                    }
                    if (qVar.isEnabled()) {
                        arrayList.add(qVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2449x) {
            return true;
        }
        ArrayList arrayList = this.f2431f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((q) arrayList.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f2436k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2446u;
            boolean zI = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                c0 c0Var = (c0) weakReference.get();
                if (c0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zI |= c0Var.i();
                }
            }
            ArrayList arrayList = this.f2434i;
            ArrayList arrayList2 = this.f2435j;
            if (zI) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i4 = 0; i4 < size; i4++) {
                    q qVar = (q) arrayListL.get(i4);
                    if (qVar.f()) {
                        arrayList.add(qVar);
                    } else {
                        arrayList2.add(qVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2436k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return g(i4, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public o k() {
        return this;
    }

    public final ArrayList l() {
        boolean z4 = this.f2433h;
        ArrayList arrayList = this.f2432g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2431f;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            q qVar = (q) arrayList2.get(i4);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f2433h = false;
        this.f2436k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2448w;
    }

    public boolean n() {
        return this.f2428c;
    }

    public boolean o() {
        return this.f2429d;
    }

    public final void p(boolean z4) {
        if (this.f2441p) {
            this.f2442q = true;
            if (z4) {
                this.f2443r = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f2433h = true;
            this.f2436k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2446u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                c0Var.c();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return q(findItem(i4), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        q qVarG = g(i4, keyEvent);
        boolean zQ = qVarG != null ? q(qVarG, null, i5) : false;
        if ((i5 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b1 A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, c0 c0Var, int i4) {
        r rVar;
        boolean zExpandActionView;
        r rVar2;
        boolean z4;
        i0 i0Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        c0 c0Var2;
        q qVar = (q) menuItem;
        boolean zJ = false;
        if (qVar == null || !qVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = qVar.f2468p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(qVar)) {
            o oVar = qVar.f2466n;
            if (oVar.e(oVar, qVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = qVar.f2459g;
                if (intent != null) {
                    try {
                        oVar.f2426a.startActivity(intent);
                    } catch (ActivityNotFoundException e5) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e5);
                        rVar = qVar.A;
                        if (rVar == null) {
                        }
                        zExpandActionView = false;
                        rVar2 = qVar.A;
                        if (rVar2 == null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (qVar.e()) {
                            zExpandActionView |= qVar.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (qVar.hasSubMenu()) {
                            if ((i4 & 4) == 0) {
                                c(false);
                            }
                            if (!qVar.hasSubMenu()) {
                                i0 i0Var2 = new i0(this.f2426a, this, qVar);
                                qVar.f2467o = i0Var2;
                                i0Var2.setHeaderTitle(qVar.f2457e);
                            }
                            i0Var = qVar.f2467o;
                            if (z4) {
                                rVar2.f2480b.getClass();
                                rVar2.f2479a.onPrepareSubMenu(i0Var);
                            }
                            copyOnWriteArrayList = this.f2446u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (c0Var != null) {
                                }
                                for (WeakReference weakReference : copyOnWriteArrayList) {
                                    c0Var2 = (c0) weakReference.get();
                                    if (c0Var2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zJ) {
                                        zJ = c0Var2.j(i0Var);
                                    }
                                }
                            }
                            zExpandActionView |= zJ;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i4 & 4) == 0) {
                                c(false);
                            }
                            if (!qVar.hasSubMenu()) {
                                i0 i0Var3 = new i0(this.f2426a, this, qVar);
                                qVar.f2467o = i0Var3;
                                i0Var3.setHeaderTitle(qVar.f2457e);
                            }
                            i0Var = qVar.f2467o;
                            if (z4) {
                                rVar2.f2480b.getClass();
                                rVar2.f2479a.onPrepareSubMenu(i0Var);
                            }
                            copyOnWriteArrayList = this.f2446u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zJ = c0Var != null ? c0Var.j(i0Var) : false;
                                while (r8.hasNext()) {
                                    c0Var2 = (c0) weakReference.get();
                                    if (c0Var2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zJ) {
                                        zJ = c0Var2.j(i0Var);
                                    }
                                }
                            }
                            zExpandActionView |= zJ;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    rVar = qVar.A;
                    if (rVar == null && rVar.f2479a.onPerformDefaultAction()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        rVar2 = qVar.A;
        if (rVar2 == null && rVar2.f2479a.hasSubMenu()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (qVar.e()) {
            zExpandActionView |= qVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (qVar.hasSubMenu() || z4) {
            if ((i4 & 4) == 0) {
                c(false);
            }
            if (!qVar.hasSubMenu()) {
                i0 i0Var4 = new i0(this.f2426a, this, qVar);
                qVar.f2467o = i0Var4;
                i0Var4.setHeaderTitle(qVar.f2457e);
            }
            i0Var = qVar.f2467o;
            if (z4) {
                rVar2.f2480b.getClass();
                rVar2.f2479a.onPrepareSubMenu(i0Var);
            }
            copyOnWriteArrayList = this.f2446u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (c0Var != null) {
                }
                while (r8.hasNext()) {
                    c0Var2 = (c0) weakReference.get();
                    if (c0Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zJ) {
                        zJ = c0Var2.j(i0Var);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i4 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(c0 c0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f2446u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            c0 c0Var2 = (c0) weakReference.get();
            if (c0Var2 == null || c0Var2 == c0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        ArrayList arrayList = this.f2431f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((q) arrayList.get(i6)).f2454b == i4) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((q) arrayList.get(i6)).f2454b != i4) {
                    break;
                }
                if (i6 >= 0) {
                    ArrayList arrayList2 = this.f2431f;
                    if (i6 < arrayList2.size()) {
                        arrayList2.remove(i6);
                    }
                }
                i5 = i7;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        ArrayList arrayList = this.f2431f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((q) arrayList.get(i5)).f2453a == i4) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            ArrayList arrayList2 = this.f2431f;
            if (i5 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i5);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f2431f.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((i0) item.getSubMenu()).s(bundle);
            }
        }
        int i5 = bundle.getInt("android:menu:expandedactionview");
        if (i5 <= 0 || (menuItemFindItem = findItem(i5)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z4, boolean z5) {
        ArrayList arrayList = this.f2431f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            q qVar = (q) arrayList.get(i5);
            if (qVar.f2454b == i4) {
                qVar.f2476x = (qVar.f2476x & (-5)) | (z5 ? 4 : 0);
                qVar.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f2448w = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z4) {
        ArrayList arrayList = this.f2431f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            q qVar = (q) arrayList.get(i5);
            if (qVar.f2454b == i4) {
                qVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z4) {
        ArrayList arrayList = this.f2431f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            q qVar = (q) arrayList.get(i5);
            if (qVar.f2454b == i4) {
                int i6 = qVar.f2476x;
                int i7 = (i6 & (-9)) | (z4 ? 0 : 8);
                qVar.f2476x = i7;
                if (i6 != i7) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f2428c = z4;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2431f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2431f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((i0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        Resources resources = this.f2427b;
        if (view != null) {
            this.f2440o = view;
            this.f2438m = null;
            this.f2439n = null;
        } else {
            if (i4 > 0) {
                this.f2438m = resources.getText(i4);
            } else if (charSequence != null) {
                this.f2438m = charSequence;
            }
            if (i5 > 0) {
                Context context = this.f2426a;
                Object obj = z.d.f5428a;
                this.f2439n = z.b.b(context, i5);
            } else if (drawable != null) {
                this.f2439n = drawable;
            }
            this.f2440o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2441p = false;
        if (this.f2442q) {
            this.f2442q = false;
            p(this.f2443r);
        }
    }

    public final void w() {
        if (this.f2441p) {
            return;
        }
        this.f2441p = true;
        this.f2442q = false;
        this.f2443r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return a(0, 0, 0, this.f2427b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f2427b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        q qVarA = a(i4, i5, i6, charSequence);
        i0 i0Var = new i0(this.f2426a, this, qVarA);
        qVarA.f2467o = i0Var;
        i0Var.setHeaderTitle(qVarA.f2457e);
        return i0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f2427b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f2427b.getString(i7));
    }
}
