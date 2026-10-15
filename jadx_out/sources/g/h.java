package g;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import h.f0;
import h.w;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class h implements b, e0.d, o2.n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static h f2222f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2226e;

    public h(int i4) {
        if (i4 == 3) {
            this.f2224c = new p.e(10, 1);
            this.f2226e = new n.k();
            this.f2225d = new ArrayList();
            this.f2223b = new HashSet();
            return;
        }
        if (i4 == 6) {
            this.f2224c = new n.b();
            this.f2223b = new SparseArray();
            this.f2225d = new n.e();
            this.f2226e = new n.b();
            return;
        }
        if (i4 == 7) {
            this.f2224c = new Object();
            this.f2223b = new Handler(Looper.getMainLooper(), new h2.e(this));
        } else {
            this.f2224c = new p.e(256, 0);
            this.f2223b = new p.e(256, 0);
            this.f2225d = new p.e(256, 0);
            this.f2226e = new p.i[32];
        }
    }

    @Override // g.b
    public final boolean a(c cVar, h.o oVar) {
        return ((ActionMode.Callback) this.f2224c).onPrepareActionMode(h(cVar), i(oVar));
    }

    @Override // g.b
    public final void b(c cVar) {
        ((ActionMode.Callback) this.f2224c).onDestroyActionMode(h(cVar));
    }

    @Override // g.b
    public final boolean c(c cVar, h.o oVar) {
        return ((ActionMode.Callback) this.f2224c).onCreateActionMode(h(cVar), i(oVar));
    }

    @Override // o2.n
    public final Object d() {
        try {
            return ((c3.h) this.f2224c).C1((Class) this.f2223b);
        } catch (Exception e5) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + ((Type) this.f2225d) + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e5);
        }
    }

    @Override // e0.d
    public final void e() {
        ((View) this.f2224c).clearAnimation();
        ((ViewGroup) this.f2223b).endViewTransition((View) this.f2224c);
        ((androidx.fragment.app.f) this.f2225d).b();
    }

    @Override // g.b
    public final boolean f(c cVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2224c).onActionItemClicked(h(cVar), new w((Context) this.f2223b, (d0.b) menuItem));
    }

    public final void g(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((n.k) this.f2226e).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                g(arrayList2.get(i4), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final i h(c cVar) {
        int size = ((ArrayList) this.f2225d).size();
        for (int i4 = 0; i4 < size; i4++) {
            i iVar = (i) ((ArrayList) this.f2225d).get(i4);
            if (iVar != null && iVar.f2228b == cVar) {
                return iVar;
            }
        }
        i iVar2 = new i((Context) this.f2223b, cVar);
        ((ArrayList) this.f2225d).add(iVar2);
        return iVar2;
    }

    public final Menu i(h.o oVar) {
        Menu menu = (Menu) ((n.k) this.f2226e).getOrDefault(oVar, null);
        if (menu != null) {
            return menu;
        }
        f0 f0Var = new f0((Context) this.f2223b, oVar);
        ((n.k) this.f2226e).put(oVar, f0Var);
        return f0Var;
    }

    public final l.e j(PendingIntent pendingIntent) {
        boolean z4;
        l.b bVar = new l.b();
        bVar.attachInterface(bVar, "android.support.customtabs.ICustomTabsCallback");
        new Handler(Looper.getMainLooper());
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                a.c cVar = (a.c) ((a.e) this.f2224c);
                cVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(bVar);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!cVar.f0a.transact(10, parcelObtain, parcelObtain2, 0)) {
                        int i4 = a.d.f1a;
                    }
                    parcelObtain2.readException();
                    z4 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            } else {
                a.c cVar2 = (a.c) ((a.e) this.f2224c);
                cVar2.getClass();
                Parcel parcelObtain3 = Parcel.obtain();
                Parcel parcelObtain4 = Parcel.obtain();
                try {
                    parcelObtain3.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain3.writeStrongBinder(bVar);
                    if (!cVar2.f0a.transact(3, parcelObtain3, parcelObtain4, 0)) {
                        int i5 = a.d.f1a;
                    }
                    parcelObtain4.readException();
                    z4 = parcelObtain4.readInt() != 0;
                    parcelObtain4.recycle();
                    parcelObtain3.recycle();
                } catch (Throwable th2) {
                    parcelObtain4.recycle();
                    parcelObtain3.recycle();
                    throw th2;
                }
            }
            if (z4) {
                return new l.e(bVar, (ComponentName) this.f2225d, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public h(Typeface typeface, a2.a aVar) {
        int i4;
        int i5;
        this.f2226e = typeface;
        this.f2224c = aVar;
        this.f2225d = new androidx.emoji2.text.w(1024);
        a2.a aVar2 = (a2.a) this.f2224c;
        int iA = aVar2.a(6);
        if (iA != 0) {
            int i6 = iA + aVar2.f3876a;
            i4 = ((ByteBuffer) aVar2.f3879d).getInt(((ByteBuffer) aVar2.f3879d).getInt(i6) + i6);
        } else {
            i4 = 0;
        }
        this.f2223b = new char[i4 * 2];
        a2.a aVar3 = (a2.a) this.f2224c;
        int iA2 = aVar3.a(6);
        if (iA2 != 0) {
            int i7 = iA2 + aVar3.f3876a;
            i5 = ((ByteBuffer) aVar3.f3879d).getInt(((ByteBuffer) aVar3.f3879d).getInt(i7) + i7);
        } else {
            i5 = 0;
        }
        for (int i8 = 0; i8 < i5; i8++) {
            androidx.emoji2.text.q qVar = new androidx.emoji2.text.q(this, i8);
            q0.a aVarC = qVar.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarC.f3879d).getInt(iA3 + aVarC.f3876a) : 0, (char[]) this.f2223b, i8 * 2);
            c3.h.U("invalid metadata codepoint length", qVar.b() > 0);
            ((androidx.emoji2.text.w) this.f2225d).a(qVar, 0, qVar.b() - 1);
        }
    }
}
