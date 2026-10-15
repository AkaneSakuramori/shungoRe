package s3;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.j;
import r3.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j {
    @Override // kotlinx.coroutines.internal.j
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.j
    public int b() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.j
    public q0 c(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(d.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
