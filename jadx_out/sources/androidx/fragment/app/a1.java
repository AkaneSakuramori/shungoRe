package androidx.fragment.app;

import android.util.Log;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f682b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f684d = new StringBuilder(128);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f683c = "FragmentManager";

    public final void a() {
        if (((StringBuilder) this.f684d).length() > 0) {
            Log.d((String) this.f683c, ((StringBuilder) this.f684d).toString());
            CharSequence charSequence = this.f684d;
            ((StringBuilder) charSequence).delete(0, ((StringBuilder) charSequence).length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f682b) {
            case 0:
                a();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f682b) {
            case 0:
                a();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i4, int i5) throws IOException {
        switch (this.f682b) {
            case 0:
                for (int i6 = 0; i6 < i5; i6++) {
                    char c5 = cArr[i4 + i6];
                    if (c5 == '\n') {
                        a();
                    } else {
                        ((StringBuilder) this.f684d).append(c5);
                    }
                }
                break;
            default:
                o2.o oVar = (o2.o) this.f684d;
                oVar.getClass();
                ((Appendable) this.f683c).append(oVar, i4, i5 + i4);
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(int i4) throws IOException {
        switch (this.f682b) {
            case 1:
                ((Appendable) this.f683c).append((char) i4);
                break;
            default:
                super.write(i4);
                break;
        }
    }
}
