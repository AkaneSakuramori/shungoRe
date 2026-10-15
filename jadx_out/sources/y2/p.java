package y2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f5407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5408c;

    public p(k kVar, List list) {
        this.f5407b = kVar;
        this.f5408c = list;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final String a(boolean z4) throws IOException {
        boolean zStartsWith;
        List list;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f5407b, StandardCharsets.UTF_8));
        do {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            int length = line.length();
            int i4 = length - 36;
            zStartsWith = line.startsWith(c.f5375p, i4);
            if (!zStartsWith) {
                list = this.f5408c;
                if (list != null) {
                    list.add(line);
                }
            } else {
                if (length == 36) {
                    break;
                }
                line = line.substring(0, i4);
                list = this.f5408c;
                if (list != null) {
                    list.add(line);
                }
            }
        } while (!zStartsWith);
        if (z4) {
            return bufferedReader.readLine();
        }
        return null;
    }
}
