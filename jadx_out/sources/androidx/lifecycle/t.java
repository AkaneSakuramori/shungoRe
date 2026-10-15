package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k.a f982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WeakReference f984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f988k;

    public t(r rVar) {
        c3.h.b0(rVar, "provider");
        new AtomicReference();
        this.f981d = true;
        this.f982e = new k.a();
        this.f983f = m.f967c;
        this.f988k = new ArrayList();
        this.f984g = new WeakReference(rVar);
    }

    @Override // androidx.lifecycle.j0
    public final void a(q qVar) {
        p reflectiveGenericLifecycleObserver;
        r rVar;
        c3.h.b0(qVar, "observer");
        d("addObserver");
        m mVar = this.f983f;
        m mVar2 = m.f966b;
        if (mVar != mVar2) {
            mVar2 = m.f967c;
        }
        s sVar = new s();
        HashMap map = u.f989a;
        boolean z4 = qVar instanceof p;
        boolean z5 = qVar instanceof d;
        if (z4 && z5) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, (p) qVar);
        } else if (z5) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, null);
        } else if (z4) {
            reflectiveGenericLifecycleObserver = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj = u.f990b.get(cls);
                c3.h.X(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                g[] gVarArr = new g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        sVar.f980b = reflectiveGenericLifecycleObserver;
        sVar.f979a = mVar2;
        if (((s) this.f982e.c(qVar, sVar)) == null && (rVar = (r) this.f984g.get()) != null) {
            boolean z6 = this.f985h != 0 || this.f986i;
            m mVarC = c(qVar);
            this.f985h++;
            while (sVar.f979a.compareTo(mVarC) < 0 && this.f982e.f3230f.containsKey(qVar)) {
                this.f988k.add(sVar.f979a);
                j jVar = l.Companion;
                m mVar3 = sVar.f979a;
                jVar.getClass();
                l lVarA = j.a(mVar3);
                if (lVarA == null) {
                    throw new IllegalStateException("no event up from " + sVar.f979a);
                }
                sVar.a(rVar, lVarA);
                ArrayList arrayList = this.f988k;
                arrayList.remove(arrayList.size() - 1);
                mVarC = c(qVar);
            }
            if (!z6) {
                h();
            }
            this.f985h--;
        }
    }

    @Override // androidx.lifecycle.j0
    public final void b(q qVar) {
        c3.h.b0(qVar, "observer");
        d("removeObserver");
        this.f982e.b(qVar);
    }

    public final m c(q qVar) {
        s sVar;
        HashMap map = this.f982e.f3230f;
        k.c cVar = map.containsKey(qVar) ? ((k.c) map.get(qVar)).f3235d : null;
        m mVar = (cVar == null || (sVar = (s) cVar.f3233b) == null) ? null : sVar.f979a;
        ArrayList arrayList = this.f988k;
        m mVar2 = arrayList.isEmpty() ^ true ? (m) arrayList.get(arrayList.size() - 1) : null;
        m mVar3 = this.f983f;
        c3.h.b0(mVar3, "state1");
        if (mVar == null || mVar.compareTo(mVar3) >= 0) {
            mVar = mVar3;
        }
        return (mVar2 == null || mVar2.compareTo(mVar) >= 0) ? mVar : mVar2;
    }

    public final void d(String str) {
        if (this.f981d && !j.b.Q2().f3124j.Q2()) {
            throw new IllegalStateException(defpackage.a.g("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(l lVar) {
        c3.h.b0(lVar, "event");
        d("handleLifecycleEvent");
        f(lVar.a());
    }

    public final void f(m mVar) {
        m mVar2 = this.f983f;
        if (mVar2 == mVar) {
            return;
        }
        m mVar3 = m.f967c;
        m mVar4 = m.f966b;
        if (mVar2 == mVar3 && mVar == mVar4) {
            throw new IllegalStateException(("no event down from " + this.f983f + " in component " + this.f984g.get()).toString());
        }
        this.f983f = mVar;
        if (this.f986i || this.f985h != 0) {
            this.f987j = true;
            return;
        }
        this.f986i = true;
        h();
        this.f986i = false;
        if (this.f983f == mVar4) {
            this.f982e = new k.a();
        }
    }

    public final void g() {
        m mVar = m.f968d;
        d("setCurrentState");
        f(mVar);
    }

    public final void h() {
        l lVar;
        r rVar = (r) this.f984g.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            k.a aVar = this.f982e;
            if (aVar.f3244e != 0) {
                k.c cVar = aVar.f3241b;
                c3.h.X(cVar);
                m mVar = ((s) cVar.f3233b).f979a;
                k.c cVar2 = this.f982e.f3242c;
                c3.h.X(cVar2);
                m mVar2 = ((s) cVar2.f3233b).f979a;
                if (mVar == mVar2 && this.f983f == mVar2) {
                    break;
                }
                this.f987j = false;
                m mVar3 = this.f983f;
                k.c cVar3 = this.f982e.f3241b;
                c3.h.X(cVar3);
                if (mVar3.compareTo(((s) cVar3.f3233b).f979a) < 0) {
                    k.a aVar2 = this.f982e;
                    k.b bVar = new k.b(aVar2.f3242c, aVar2.f3241b, 1);
                    aVar2.f3243d.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f987j) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        c3.h.a0(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f979a.compareTo(this.f983f) > 0 && !this.f987j && this.f982e.f3230f.containsKey(qVar)) {
                            j jVar = l.Companion;
                            m mVar4 = sVar.f979a;
                            jVar.getClass();
                            c3.h.b0(mVar4, "state");
                            int iOrdinal = mVar4.ordinal();
                            if (iOrdinal == 2) {
                                lVar = l.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                lVar = iOrdinal != 4 ? null : l.ON_PAUSE;
                            } else {
                                lVar = l.ON_STOP;
                            }
                            if (lVar == null) {
                                throw new IllegalStateException("no event down from " + sVar.f979a);
                            }
                            this.f988k.add(lVar.a());
                            sVar.a(rVar, lVar);
                            ArrayList arrayList = this.f988k;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                k.c cVar4 = this.f982e.f3242c;
                if (!this.f987j && cVar4 != null && this.f983f.compareTo(((s) cVar4.f3233b).f979a) > 0) {
                    k.a aVar3 = this.f982e;
                    aVar3.getClass();
                    k.d dVar = new k.d(aVar3);
                    aVar3.f3243d.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f987j) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f979a.compareTo(this.f983f) < 0 && !this.f987j && this.f982e.f3230f.containsKey(qVar2)) {
                            this.f988k.add(sVar2.f979a);
                            j jVar2 = l.Companion;
                            m mVar5 = sVar2.f979a;
                            jVar2.getClass();
                            l lVarA = j.a(mVar5);
                            if (lVarA == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f979a);
                            }
                            sVar2.a(rVar, lVarA);
                            ArrayList arrayList2 = this.f988k;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f987j = false;
    }
}
