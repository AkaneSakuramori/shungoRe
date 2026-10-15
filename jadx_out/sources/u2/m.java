package u2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class m extends k3.g implements j3.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f4741c = new m(1);

    @Override // j3.l
    public final Object e(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        File file = (File) obj;
        c3.h.b0(file, "it");
        Charset charset = q3.a.f3886a;
        c3.h.b0(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strD2 = c3.h.d2(inputStreamReader);
            c3.h.k0(inputStreamReader, null);
            return strD2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c3.h.k0(inputStreamReader, th);
                throw th2;
            }
        }
    }
}
