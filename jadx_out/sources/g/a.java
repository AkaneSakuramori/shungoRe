package g;

import android.content.Context;
import android.content.res.Configuration;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.emoji2.text.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2207a;

    public a(Context context, int i4) {
        if (i4 == 1) {
            this.f2207a = context.getApplicationContext();
        } else if (i4 != 2) {
            this.f2207a = context;
        } else {
            this.f2207a = context.getApplicationContext();
        }
    }

    @Override // androidx.emoji2.text.l
    public final void a(c3.h hVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.emoji2.text.n(this, hVar, threadPoolExecutor, 0));
    }

    public final int b() {
        Configuration configuration = this.f2207a.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600) {
            return 5;
        }
        if (i4 > 960 && i5 > 720) {
            return 5;
        }
        if (i4 > 720 && i5 > 960) {
            return 5;
        }
        if (i4 >= 500) {
            return 4;
        }
        if (i4 > 640 && i5 > 480) {
            return 4;
        }
        if (i4 <= 480 || i5 <= 640) {
            return i4 >= 360 ? 3 : 2;
        }
        return 4;
    }
}
