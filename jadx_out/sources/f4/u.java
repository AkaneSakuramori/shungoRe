package f4;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface u extends Closeable, Flushable {
    void D(g gVar, long j4);

    y b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
