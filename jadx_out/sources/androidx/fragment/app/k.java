package androidx.fragment.app;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.auth0.android.result.Credentials;
import com.google.gson.reflect.TypeToken;
import com.shungo.app.MainActivity;
import java.security.PublicKey;
import java.util.Map;
import y0.n1;

/* JADX INFO: loaded from: classes.dex */
public final class k implements e0.d, i1.a, n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f785c;

    public /* synthetic */ k(int i4, Object obj) {
        this.f784b = i4;
        this.f785c = obj;
    }

    @Override // i1.a
    public /* bridge */ /* synthetic */ void a(f1.b bVar) {
        switch (this.f784b) {
            case 0:
                g((g1.c) bVar);
                break;
            case 1:
                g((g1.c) bVar);
                break;
            default:
                g((g1.c) bVar);
                break;
        }
    }

    @Override // i1.a
    public void b(Object obj) {
        switch (this.f784b) {
            case 0:
                h((Credentials) obj);
                return;
            case 1:
                System.out.println((Object) "successfull logout");
                MainActivity mainActivity = (MainActivity) this.f785c;
                int i4 = MainActivity.F;
                mainActivity.getClass();
                try {
                    h1.c cVar = mainActivity.B;
                    if (cVar == null) {
                        c3.h.E2("manager");
                        throw null;
                    }
                    cVar.b();
                    SharedPreferences sharedPreferences = mainActivity.A;
                    if (sharedPreferences == null) {
                        c3.h.E2("sharedPreferences");
                        throw null;
                    }
                    sharedPreferences.edit().remove("accessToken").apply();
                    mainActivity.f1649z = null;
                    mainActivity.o().post(new u2.o(mainActivity, 2));
                    return;
                } catch (Exception e5) {
                    Log.e("Shungo", "failed clearing credentials", e5);
                }
                break;
            default:
                h((Credentials) obj);
                return;
        }
    }

    public int c(View view) {
        int i4 = this.f784b;
        Object obj = this.f785c;
        switch (i4) {
            case 0:
                y0.p0 p0Var = (y0.p0) view.getLayoutParams();
                ((y0.o0) obj).getClass();
                return view.getRight() + ((y0.p0) view.getLayoutParams()).f5274b.right + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin;
            default:
                y0.p0 p0Var2 = (y0.p0) view.getLayoutParams();
                ((y0.o0) obj).getClass();
                return view.getBottom() + ((y0.p0) view.getLayoutParams()).f5274b.bottom + ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin;
        }
    }

    public int d(View view) {
        int i4 = this.f784b;
        Object obj = this.f785c;
        switch (i4) {
            case 0:
                y0.p0 p0Var = (y0.p0) view.getLayoutParams();
                ((y0.o0) obj).getClass();
                return (view.getLeft() - ((y0.p0) view.getLayoutParams()).f5274b.left) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin;
            default:
                y0.p0 p0Var2 = (y0.p0) view.getLayoutParams();
                ((y0.o0) obj).getClass();
                return (view.getTop() - ((y0.p0) view.getLayoutParams()).f5274b.top) - ((ViewGroup.MarginLayoutParams) p0Var2).topMargin;
        }
    }

    @Override // e0.d
    public void e() {
        int i4 = this.f784b;
        Object obj = this.f785c;
        switch (i4) {
            case 1:
                q qVar = (q) obj;
                o oVar = qVar.I;
                if ((oVar == null ? null : oVar.f822a) != null) {
                    View view = oVar == null ? null : oVar.f822a;
                    qVar.d().f822a = null;
                    view.clearAnimation();
                }
                qVar.d().f823b = null;
                break;
            default:
                ((c1) obj).a();
                break;
        }
    }

    public void f() {
        ((t) this.f785c).f886m.J();
    }

    public void g(g1.c cVar) {
        int i4 = this.f784b;
        Object obj = this.f785c;
        switch (i4) {
            case 0:
                Toast.makeText((MainActivity) obj, "Something went wrong !", 0).show();
                break;
            case 1:
                System.out.println((Object) ("error logout: " + cVar));
                MainActivity mainActivity = (MainActivity) obj;
                mainActivity.runOnUiThread(new u2.o(mainActivity, 3));
                break;
            default:
                if (c3.h.I("Unauthorized", cVar.a())) {
                    Log.e("h0", "Unable to complete authentication with PKCE. PKCE support can be enabled by setting Application Type to 'Native' and Token Endpoint Authentication Method to 'None' for this app at 'https://manage.auth0.com/#/applications/" + ((j1.c0) obj).f3164p.f2303a.f2025a + "/settings'.");
                }
                ((j1.c0) obj).f3159k.a(cVar);
                break;
        }
    }

    public void h(Credentials credentials) {
        int i4 = this.f784b;
        Object obj = this.f785c;
        switch (i4) {
            case 0:
                c3.h.b0(credentials, "credentials");
                System.out.println((Object) "successfull login");
                MainActivity mainActivity = (MainActivity) obj;
                h1.c cVar = mainActivity.B;
                if (cVar == null) {
                    c3.h.E2("manager");
                    throw null;
                }
                cVar.c(credentials);
                mainActivity.q();
                return;
            default:
                c3.h.b0(credentials, "credentials");
                j1.c0 c0Var = (j1.c0) obj;
                String strC = credentials.c();
                j1.b0 b0Var = new j1.b0(c0Var, 0, credentials);
                String str = j1.c0.f3157t;
                c0Var.getClass();
                if (TextUtils.isEmpty(strC)) {
                    b0Var.a(new j1.r("ID token is required but missing"));
                    return;
                }
                try {
                    c3.h.X(strC);
                    com.auth0.android.request.internal.k kVar = new com.auth0.android.request.internal.k(strC);
                    j1.a0 a0Var = new j1.a0(b0Var, c0Var, kVar);
                    g1.b bVar = c0Var.f3164p;
                    bVar.getClass();
                    char[] cArr = t3.s.f4419j;
                    t3.r rVarF = f2.e.q(String.valueOf(bVar.f2303a.f2026b)).f();
                    rVarF.a(".well-known");
                    rVarF.a("jwks.json");
                    t3.s sVarB = rVarF.b();
                    m2.m mVar = bVar.f2305c;
                    c3.h.b0(mVar, "gson");
                    TypeToken<?> parameterized = TypeToken.getParameterized(Map.class, String.class, PublicKey.class);
                    c3.h.Y(parameterized, "null cannot be cast to non-null type com.google.gson.reflect.TypeToken<kotlin.collections.Map<kotlin.String, T of com.auth0.android.request.internal.GsonAdapter.Companion.forMapOf>>");
                    com.auth0.android.request.internal.e eVar = new com.auth0.android.request.internal.e(mVar.c(parameterized));
                    com.auth0.android.request.internal.l lVar = bVar.f2304b;
                    lVar.getClass();
                    String str2 = sVarB.f4427h;
                    c3.h.b0(str2, "url");
                    lVar.a(k1.c.f3252a, str2, eVar, lVar.f1334b).d(new j1.b0(kVar.f1322c, 1, a0Var));
                    return;
                } catch (Exception e5) {
                    b0Var.a(new j1.m0("ID token could not be decoded", e5));
                    return;
                }
        }
    }
}
