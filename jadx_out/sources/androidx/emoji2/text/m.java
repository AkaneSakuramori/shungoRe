package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f608i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile m f609j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n.c f611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f617h;

    public m(v vVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f610a = reentrantReadWriteLock;
        this.f612c = 3;
        this.f615f = vVar.f605a;
        int i4 = vVar.f606b;
        this.f616g = i4;
        this.f617h = vVar.f607c;
        this.f613d = new Handler(Looper.getMainLooper());
        this.f611b = new n.c(0);
        h hVar = new h(18, this);
        this.f614e = hVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i4 == 0) {
            try {
                this.f612c = 0;
            } catch (Throwable th) {
                this.f610a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            hVar.F();
        }
    }

    public static m a() {
        m mVar;
        synchronized (f608i) {
            try {
                mVar = f609j;
                if (!(mVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    public final int b() {
        this.f610a.readLock().lock();
        try {
            return this.f612c;
        } finally {
            this.f610a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f616g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f610a.writeLock().lock();
        try {
            if (this.f612c == 0) {
                this.f610a.writeLock().unlock();
                return;
            }
            this.f612c = 0;
            this.f610a.writeLock().unlock();
            this.f614e.F();
        } catch (Throwable th) {
            this.f610a.writeLock().unlock();
            throw th;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f610a.writeLock().lock();
        try {
            this.f612c = 2;
            arrayList.addAll(this.f611b);
            this.f611b.clear();
            this.f610a.writeLock().unlock();
            this.f613d.post(new androidx.activity.h(arrayList, this.f612c, th));
        } catch (Throwable th2) {
            this.f610a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f610a.writeLock().lock();
        try {
            this.f612c = 1;
            arrayList.addAll(this.f611b);
            this.f611b.clear();
            this.f610a.writeLock().unlock();
            this.f613d.post(new androidx.activity.h(this.f612c, arrayList));
        } catch (Throwable th) {
            this.f610a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(int i4, int i5, CharSequence charSequence) {
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        c3.h.U("start should be <= than end", i4 <= i5);
        if (charSequence == null) {
            return null;
        }
        c3.h.U("start should be < than charSequence length", i4 <= charSequence.length());
        c3.h.U("end should be < than charSequence length", i5 <= charSequence.length());
        return (charSequence.length() == 0 || i4 == i5) ? charSequence : this.f614e.G(charSequence, i4, i5, false);
    }

    public final void g(k kVar) {
        if (kVar == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        this.f610a.writeLock().lock();
        try {
            if (this.f612c == 1 || this.f612c == 2) {
                this.f613d.post(new androidx.activity.h(kVar, this.f612c));
            } else {
                this.f611b.add(kVar);
            }
        } finally {
            this.f610a.writeLock().unlock();
        }
    }
}
