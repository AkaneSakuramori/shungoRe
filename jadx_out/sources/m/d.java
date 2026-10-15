package m;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3405b;

    public d(byte[] bArr, List list) {
        this.f3404a = bArr;
        this.f3405b = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.f3405b.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public static d a(String str, List list) throws IOException {
        Collections.sort(list, new c(0));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return new d(byteArrayOutputStream.toByteArray(), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3404a, ((d) obj).f3404a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3404a);
    }
}
