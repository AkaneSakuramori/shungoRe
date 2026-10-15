package e;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public final class z extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1951c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f1952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, c cVar) {
        super(e0Var);
        this.f1952d = e0Var;
        this.f1953e = cVar;
    }

    @Override // e.b0
    public final IntentFilter c() {
        switch (this.f1951c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
    
        if (r1 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        if (r1 < 22) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return 1;
     */
    @Override // e.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d() {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.z.d():int");
    }

    @Override // e.b0
    public final void f() {
        int i4 = this.f1951c;
        e0 e0Var = this.f1952d;
        switch (i4) {
            case 0:
                e0Var.n(true, true);
                break;
            default:
                e0Var.n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, Context context) {
        super(e0Var);
        this.f1952d = e0Var;
        this.f1953e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
