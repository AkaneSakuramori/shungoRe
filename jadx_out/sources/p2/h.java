package p2;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Writer {
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new AssertionError();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        throw new AssertionError();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i4, int i5) {
        throw new AssertionError();
    }
}
