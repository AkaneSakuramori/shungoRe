package y2;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class m extends x2.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f5400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Process f5402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f5403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f5404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f5405i;

    public m(a aVar, Process process) throws IOException {
        this.f5399c = -1;
        this.f5401e = aVar.c(8);
        this.f5402f = process;
        OutputStream outputStream = process.getOutputStream();
        this.f5403g = new l(outputStream instanceof BufferedOutputStream ? outputStream : new BufferedOutputStream(outputStream));
        this.f5404h = new k(process.getInputStream());
        this.f5405i = new k(process.getErrorStream());
        i iVar = new i();
        iVar.f5395b = false;
        iVar.f5396c = new ArrayDeque();
        iVar.f5397d = null;
        this.f5400d = iVar;
        try {
            try {
                try {
                    try {
                        this.f5399c = ((Integer) iVar.submit(new Callable() { // from class: y2.j
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws IOException {
                                m mVar = this.f5398b;
                                mVar.getClass();
                                try {
                                    mVar.f5402f.exitValue();
                                    throw new IOException("Created process has terminated");
                                } catch (IllegalThreadStateException unused) {
                                    c3.h.j0(mVar.f5404h);
                                    c3.h.j0(mVar.f5405i);
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(mVar.f5404h));
                                    try {
                                        l lVar = mVar.f5403g;
                                        Charset charset = StandardCharsets.UTF_8;
                                        lVar.write("echo SHELL_TEST\n".getBytes(charset));
                                        mVar.f5403g.flush();
                                        String line = bufferedReader.readLine();
                                        if (TextUtils.isEmpty(line) || !line.contains("SHELL_TEST")) {
                                            throw new IOException("Created process is not a shell");
                                        }
                                        mVar.f5403g.write("id\n".getBytes(charset));
                                        mVar.f5403g.flush();
                                        String line2 = bufferedReader.readLine();
                                        int i4 = 0;
                                        if (!TextUtils.isEmpty(line2) && line2.contains("uid=0")) {
                                            synchronized (r.class) {
                                                String property = System.getProperty("user.dir");
                                                StringBuilder sb = new StringBuilder("'");
                                                int length = property.length();
                                                while (i4 < length) {
                                                    char cCharAt = property.charAt(i4);
                                                    if (cCharAt == '\'') {
                                                        sb.append("'\\''");
                                                    } else {
                                                        sb.append(cCharAt);
                                                    }
                                                    i4++;
                                                }
                                                sb.append('\'');
                                                String string = sb.toString();
                                                mVar.f5403g.write(("cd " + string + "\n").getBytes(StandardCharsets.UTF_8));
                                                mVar.f5403g.flush();
                                                i4 = 1;
                                            }
                                        }
                                        bufferedReader.close();
                                        return Integer.valueOf(i4);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }).get(aVar.f5371a, TimeUnit.SECONDS)).intValue();
                    } catch (InterruptedException e5) {
                        throw new IOException("Shell check interrupted", e5);
                    }
                } catch (TimeoutException e6) {
                    throw new IOException("Shell check timeout", e6);
                }
            } catch (ExecutionException e7) {
                Throwable cause = e7.getCause();
                if (!(cause instanceof IOException)) {
                    throw new IOException("Unknown ExecutionException", cause);
                }
                throw ((IOException) cause);
            }
        } catch (IOException e8) {
            this.f5400d.shutdownNow();
            t();
            throw e8;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5399c < 0) {
            return;
        }
        this.f5400d.shutdownNow();
        t();
    }

    public final synchronized void h(x2.c cVar) {
        if (this.f5399c < 0) {
            throw new n();
        }
        c3.h.j0(this.f5404h);
        c3.h.j0(this.f5405i);
        try {
            this.f5403g.write(10);
            this.f5403g.flush();
            ((c) cVar).R2(this.f5403g, this.f5404h, this.f5405i);
        } catch (IOException unused) {
            t();
            throw new n();
        }
    }

    public final void t() {
        this.f5399c = -1;
        try {
            this.f5403g.a();
        } catch (IOException unused) {
        }
        try {
            this.f5405i.a();
        } catch (IOException unused2) {
        }
        try {
            this.f5404h.a();
        } catch (IOException unused3) {
        }
        this.f5402f.destroy();
    }
}
