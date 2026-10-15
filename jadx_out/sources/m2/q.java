package m2;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public final t a() {
        if (this instanceof t) {
            return (t) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            t2.c cVar = new t2.c(stringWriter);
            cVar.f4278g = true;
            c3.h.N2(this, cVar);
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
