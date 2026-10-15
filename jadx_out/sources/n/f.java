package n;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3505e;

    public f(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3503c = i4;
        this.f3501a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f3501a.get(obj);
                if (obj2 != null) {
                    this.f3504d++;
                    return obj2;
                }
                this.f3505e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f3502b++;
                objPut = this.f3501a.put(obj, obj2);
                if (objPut != null) {
                    this.f3502b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i4 = this.f3503c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f3502b < 0 || (this.f3501a.isEmpty() && this.f3502b != 0)) {
                        break;
                    }
                    if (this.f3502b > i4 && !this.f3501a.isEmpty()) {
                        Map.Entry entry = (Map.Entry) this.f3501a.entrySet().iterator().next();
                        Object key = entry.getKey();
                        entry.getValue();
                        this.f3501a.remove(key);
                        this.f3502b--;
                    }
                    return objPut;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i4;
        int i5;
        try {
            i4 = this.f3504d;
            i5 = this.f3505e + i4;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f3503c), Integer.valueOf(this.f3504d), Integer.valueOf(this.f3505e), Integer.valueOf(i5 != 0 ? (i4 * 100) / i5 : 0));
    }
}
