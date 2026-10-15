package com.auth0.android.request.internal;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import e.k0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f1312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Handler f1313b;

    public d() {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
        c3.h.a0(executorServiceNewFixedThreadPool, "newFixedThreadPool(MAX_CONCURRENT_THREADS)");
        this.f1312a = executorServiceNewFixedThreadPool;
    }

    public static Handler c(Looper looper) {
        Handler handler;
        Handler handlerA;
        if (Build.VERSION.SDK_INT >= 28) {
            handlerA = j.d.a(looper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException e5) {
                e = e5;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(looper);
            } catch (InstantiationException e6) {
                e = e6;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(looper);
            } catch (NoSuchMethodException e7) {
                e = e7;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(looper);
            } catch (InvocationTargetException e8) {
                Throwable cause = e8.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            handlerA = handler;
        }
        c3.h.a0(handlerA, "createAsync(looper)");
        return handlerA;
    }

    @Override // com.auth0.android.request.internal.m
    public final void a(Runnable runnable) {
        this.f1312a.execute(runnable);
    }

    @Override // com.auth0.android.request.internal.m
    public final void b(k0 k0Var) {
        if (this.f1313b == null) {
            synchronized (this) {
                if (this.f1313b == null) {
                    Looper mainLooper = Looper.getMainLooper();
                    c3.h.a0(mainLooper, "getMainLooper()");
                    this.f1313b = c(mainLooper);
                }
            }
        }
        Handler handler = this.f1313b;
        if (handler != null) {
            handler.post(k0Var);
        }
    }
}
