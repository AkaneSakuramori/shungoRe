package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class u implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.r f640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2.e f641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c3.h f646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n0.a f647i;

    public u(Context context, i.r rVar) {
        f2.e eVar = v.f648d;
        this.f642d = new Object();
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        this.f639a = context.getApplicationContext();
        this.f640b = rVar;
        this.f641c = eVar;
    }

    @Override // androidx.emoji2.text.l
    public final void a(c3.h hVar) {
        synchronized (this.f642d) {
            this.f646h = hVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f642d) {
            try {
                this.f646h = null;
                n0.a aVar = this.f647i;
                if (aVar != null) {
                    f2.e eVar = this.f641c;
                    Context context = this.f639a;
                    eVar.getClass();
                    context.getContentResolver().unregisterContentObserver(aVar);
                    this.f647i = null;
                }
                Handler handler = this.f643e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f643e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f645g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f644f = null;
                this.f645g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f642d) {
            try {
                if (this.f646h == null) {
                    return;
                }
                if (this.f644f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f645g = threadPoolExecutor;
                    this.f644f = threadPoolExecutor;
                }
                final int i4 = 0;
                this.f644f.execute(new Runnable(this) { // from class: androidx.emoji2.text.t

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ u f638c;

                    {
                        this.f638c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                u uVar = this.f638c;
                                synchronized (uVar.f642d) {
                                    try {
                                        if (uVar.f646h == null) {
                                            return;
                                        }
                                        try {
                                            f0.h hVarD = uVar.d();
                                            int i5 = hVarD.f2021e;
                                            if (i5 == 2) {
                                                synchronized (uVar.f642d) {
                                                }
                                            }
                                            if (i5 != 0) {
                                                throw new RuntimeException("fetchFonts result is not OK. (" + i5 + ")");
                                            }
                                            try {
                                                int i6 = e0.l.f1962a;
                                                e0.k.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                f2.e eVar = uVar.f641c;
                                                Context context = uVar.f639a;
                                                eVar.getClass();
                                                Typeface typefaceX = b0.g.f1088a.x(context, new f0.h[]{hVarD}, 0);
                                                MappedByteBuffer mappedByteBufferB1 = c3.h.B1(uVar.f639a, hVarD.f2017a);
                                                if (mappedByteBufferB1 == null || typefaceX == null) {
                                                    throw new RuntimeException("Unable to open file.");
                                                }
                                                try {
                                                    e0.k.a("EmojiCompat.MetadataRepo.create");
                                                    g.h hVar = new g.h(typefaceX, c3.h.Z1(mappedByteBufferB1));
                                                    e0.k.b();
                                                    e0.k.b();
                                                    synchronized (uVar.f642d) {
                                                        try {
                                                            c3.h hVar2 = uVar.f646h;
                                                            if (hVar2 != null) {
                                                                hVar2.K1(hVar);
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                    uVar.b();
                                                    return;
                                                } catch (Throwable th2) {
                                                    int i7 = e0.l.f1962a;
                                                    e0.k.b();
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                int i8 = e0.l.f1962a;
                                                e0.k.b();
                                                throw th3;
                                            }
                                            break;
                                        } catch (Throwable th4) {
                                            synchronized (uVar.f642d) {
                                                try {
                                                    c3.h hVar3 = uVar.f646h;
                                                    if (hVar3 != null) {
                                                        hVar3.E1(th4);
                                                    }
                                                    uVar.b();
                                                    return;
                                                } catch (Throwable th5) {
                                                    throw th5;
                                                }
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                            default:
                                this.f638c.c();
                                return;
                        }
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final f0.h d() throws Throwable {
        try {
            f2.e eVar = this.f641c;
            Context context = this.f639a;
            i.r rVar = this.f640b;
            eVar.getClass();
            e.i iVarA = f0.c.a(context, rVar);
            if (iVarA.f1878b != 0) {
                throw new RuntimeException("fetchFonts failed (" + iVarA.f1878b + ")");
            }
            f0.h[] hVarArr = (f0.h[]) iVarA.f1879c;
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e5) {
            throw new RuntimeException("provider not found", e5);
        }
    }
}
