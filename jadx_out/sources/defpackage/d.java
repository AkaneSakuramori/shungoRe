package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import c3.e;
import c3.h;
import com.shungo.app.InjectorService;
import com.shungo.app.MainActivity;
import d3.a;
import e3.g;
import j3.p;
import kotlinx.coroutines.scheduling.c;
import r3.x;
import v2.b;
import z2.f;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g implements p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f1653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, e eVar2) {
        super(eVar2);
        this.f1653g = eVar;
    }

    @Override // e3.a
    public final e a(e eVar) {
        return new d(this.f1653g, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((d) a((e) obj2)).h(f.f5511a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8 A[Catch: all -> 0x0020, Exception -> 0x0023, Merged into TryCatch #0 {all -> 0x0020, Exception -> 0x0023, blocks: (B:7:0x001b, B:39:0x00af, B:41:0x00c8, B:50:0x0106, B:15:0x002e, B:36:0x0094, B:16:0x0032, B:22:0x0049, B:24:0x0051, B:27:0x0062, B:29:0x0066, B:30:0x0071, B:31:0x0078, B:33:0x007f, B:44:0x00ea, B:47:0x00f9, B:19:0x0039), top: B:55:0x0013 }, TRY_LEAVE] */
    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        Context context;
        boolean zBooleanValue;
        a aVar = a.f1765b;
        int i4 = this.f1652f;
        f fVar = f.f5511a;
        e eVar = this.f1653g;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    h.D2(obj);
                } else if (i4 == 2) {
                    h.D2(obj);
                    Context context2 = eVar.f1770a;
                    Handler handler = new Handler(Looper.getMainLooper());
                    this.f1652f = 3;
                    obj = h.L2(x.f4129b, new b(context2, handler, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h.D2(obj);
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
                System.out.println((Object) ("stored: " + zBooleanValue));
                if (zBooleanValue) {
                    Toast.makeText(eVar.f1770a, "Injecting !", 0).show();
                    Context context3 = eVar.f1770a;
                    h.b0(context3, "context");
                    context3.startForegroundService(new Intent(context3, (Class<?>) InjectorService.class));
                }
                context = eVar.f1770a;
                MainActivity mainActivity = (MainActivity) context;
                return fVar;
            }
            h.D2(obj);
            c cVar = x.f4129b;
            c cVar2 = new c(null);
            this.f1652f = 1;
            obj = h.L2(cVar, cVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            if (!((Boolean) obj).booleanValue()) {
                h.y2(eVar.f1770a, "Your device is not rooted!", "You need a rooted device to use this application! If you are, give permission to Shungo inside Magisk");
                ((MainActivity) eVar.f1770a).p(false);
                return fVar;
            }
            Context context4 = eVar.f1770a;
            Context context5 = eVar.f1770a;
            ((MainActivity) context4).getClass();
            h.b0(context4, "context");
            try {
                context4.getPackageManager().getPackageInfo("com.nianticlabs.pokemongo", 0);
                if (((MainActivity) context5).f1649z == null) {
                    Toast.makeText(context5, "Login required", 0).show();
                    ((MainActivity) context5).p(false);
                    return fVar;
                }
                ((MainActivity) context5).p(true);
                c cVar3 = x.f4129b;
                b bVar = new b(eVar, null);
                this.f1652f = 2;
                if (h.L2(cVar3, bVar, this) == aVar) {
                    return aVar;
                }
                Context context6 = eVar.f1770a;
                Handler handler2 = new Handler(Looper.getMainLooper());
                this.f1652f = 3;
                obj = h.L2(x.f4129b, new b(context6, handler2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
                System.out.println((Object) ("stored: " + zBooleanValue));
                if (zBooleanValue) {
                    Toast.makeText(eVar.f1770a, "Injecting !", 0).show();
                    Context context7 = eVar.f1770a;
                    h.b0(context7, "context");
                    context7.startForegroundService(new Intent(context7, (Class<?>) InjectorService.class));
                }
                context = eVar.f1770a;
                MainActivity mainActivity2 = (MainActivity) context;
                return fVar;
            } catch (PackageManager.NameNotFoundException unused) {
                h.y2(context5, "Pokémon GO not installed", "Pokémon GO was not found on your device, please install it before injecting.");
                ((MainActivity) context5).p(false);
                return fVar;
            }
        } catch (Exception e5) {
            Log.e("Shungo", "start failed", e5);
            Toast.makeText(eVar.f1770a, "Start failed: " + e5.getMessage(), 1).show();
            context = eVar.f1770a;
        } finally {
            ((MainActivity) eVar.f1770a).p(false);
        }
    }
}
