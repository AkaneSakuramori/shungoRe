package a3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f61c;

    public c(Object[] objArr) {
        c3.h.b0(objArr, "array");
        this.f61c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4 = this.f59a;
        Object obj = this.f61c;
        switch (i4) {
            case 0:
                return this.f60b < ((f) obj).a();
            case 1:
                return this.f60b < ((Object[]) obj).length;
        }
        while (this.f60b > 0) {
            Iterator it = (Iterator) obj;
            if (!it.hasNext()) {
                return ((Iterator) obj).hasNext();
            }
            it.next();
            this.f60b--;
        }
        return ((Iterator) obj).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.f59a;
        Object obj = this.f61c;
        switch (i4) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i5 = this.f60b;
                this.f60b = i5 + 1;
                return ((f) obj).get(i5);
            case 1:
                try {
                    int i6 = this.f60b;
                    this.f60b = i6 + 1;
                    return ((Object[]) obj)[i6];
                } catch (ArrayIndexOutOfBoundsException e5) {
                    this.f60b--;
                    throw new NoSuchElementException(e5.getMessage());
                }
        }
        while (this.f60b > 0) {
            Iterator it = (Iterator) obj;
            if (!it.hasNext()) {
                return ((Iterator) obj).next();
            }
            it.next();
            this.f60b--;
        }
        return ((Iterator) obj).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f59a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(f fVar) {
        this.f61c = fVar;
    }

    public c(p3.b bVar) {
        this.f61c = bVar.f3868a.iterator();
        this.f60b = bVar.f3869b;
    }
}
