package w0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f4845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f4847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4849f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c[] f4850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f4851h;

    public b(AssetManager assetManager, j.a aVar, d dVar, String str, File file) {
        this.f4844a = aVar;
        this.f4845b = dVar;
        this.f4848e = str;
        this.f4847d = file;
        int i4 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i4 <= 33) {
            switch (i4) {
                case 26:
                    bArr = e.f4868h;
                    break;
                case 27:
                    bArr = e.f4867g;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f4866f;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = e.f4865e;
                    break;
            }
        }
        this.f4846c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e5) {
            String message = e5.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f4845b.n();
            }
            return null;
        }
    }

    public final void b(int i4, Serializable serializable) {
        this.f4844a.execute(new a(this, i4, serializable, 0));
    }
}
