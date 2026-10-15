package w0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4876d;

    public j(int i4, int i5, long j4, long j5) {
        this.f4873a = i4;
        this.f4874b = i5;
        this.f4875c = j4;
        this.f4876d = j5;
    }

    public static j a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f4873a);
            dataOutputStream.writeInt(this.f4874b);
            dataOutputStream.writeLong(this.f4875c);
            dataOutputStream.writeLong(this.f4876d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f4874b == jVar.f4874b && this.f4875c == jVar.f4875c && this.f4873a == jVar.f4873a && this.f4876d == jVar.f4876d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4874b), Long.valueOf(this.f4875c), Integer.valueOf(this.f4873a), Long.valueOf(this.f4876d));
    }
}
