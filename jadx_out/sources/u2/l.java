package u2;

import com.shungo.app.InjectorService;
import java.io.PrintStream;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class l extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InjectorService f4740c;

    public l(InjectorService injectorService, InjectorService injectorService2) {
        this.f4739b = injectorService;
        this.f4740c = injectorService2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        PrintStream printStream = System.out;
        printStream.println((Object) ("verify ping task - executed at " + jCurrentTimeMillis));
        InjectorService injectorService = this.f4739b;
        Long l4 = injectorService.f1641i;
        if (l4 == null) {
            printStream.println((Object) "verify ping task - no last ping");
            return;
        }
        long jLongValue = jCurrentTimeMillis - l4.longValue();
        printStream.println((Object) ("verify ping task - last ping at " + injectorService.f1641i + ", " + jLongValue + " ms ago"));
        if (jLongValue > 300000) {
            printStream.println((Object) "you pinged too long ago, restarting...");
            injectorService.f1643k.cancel();
            injectorService.f1642j = true;
            c3.h.B2(this.f4740c);
        }
    }
}
