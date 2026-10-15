package o2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f3627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f3628b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f3630d;

    public k(m mVar) {
        this.f3630d = mVar;
        this.f3627a = mVar.f3644f.f3634d;
        this.f3629c = mVar.f3643e;
    }

    public final l a() {
        l lVar = this.f3627a;
        m mVar = this.f3630d;
        if (lVar == mVar.f3644f) {
            throw new NoSuchElementException();
        }
        if (mVar.f3643e != this.f3629c) {
            throw new ConcurrentModificationException();
        }
        this.f3627a = lVar.f3634d;
        this.f3628b = lVar;
        return lVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3627a != this.f3630d.f3644f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        l lVar = this.f3628b;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        m mVar = this.f3630d;
        mVar.c(lVar, true);
        this.f3628b = null;
        this.f3629c = mVar.f3643e;
    }
}
