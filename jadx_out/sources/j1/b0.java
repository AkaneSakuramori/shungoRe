package j1;

import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.auth0.android.result.Credentials;
import com.shungo.app.MainActivity;
import com.shungo.app.R;
import java.io.PrintStream;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import y0.d1;
import y0.j1;
import y0.m1;
import y0.n1;
import y0.o1;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements i1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3156d;

    public /* synthetic */ b0(Object obj, int i4, Object obj2) {
        this.f3154b = i4;
        this.f3155c = obj;
        this.f3156d = obj2;
    }

    @Override // i1.a
    public void a(f1.b bVar) {
        switch (this.f3154b) {
            case 0:
                ((c0) this.f3155c).f3159k.a(new g1.c("Could not verify the ID token", bVar));
                break;
            case 1:
                m((g1.c) bVar);
                break;
            case 2:
                m((g1.c) bVar);
                break;
            default:
                System.out.println((Object) "couldn't get user credentials");
                MainActivity mainActivity = (MainActivity) this.f3156d;
                mainActivity.runOnUiThread(new u2.o(mainActivity, 4));
                break;
        }
    }

    @Override // i1.a
    public void b(Object obj) {
        int i4 = this.f3154b;
        Object obj2 = this.f3156d;
        Object obj3 = this.f3155c;
        switch (i4) {
            case 0:
                ((c0) obj3).f3159k.b((Credentials) obj2);
                return;
            case 1:
                String str = (String) obj3;
                try {
                    ((i1.a) obj2).b(new a((PublicKey) ((Map) obj).get(str)));
                    return;
                } catch (InvalidKeyException unused) {
                    ((i1.a) obj2).a(new i0(str));
                    return;
                }
            case 2:
                l1.a aVar = (l1.a) obj;
                c3.h.b0(aVar, "profile");
                MainActivity mainActivity = (MainActivity) obj3;
                mainActivity.f1649z = aVar;
                WebView webViewO = mainActivity.o();
                StringBuilder sb = new StringBuilder("setUserFrom('");
                String str2 = aVar.f3370d;
                if (str2 == null && (str2 = aVar.f3369c) == null) {
                    str2 = aVar.f3374h;
                }
                sb.append(str2);
                sb.append("', '");
                sb.append(aVar.f3371e);
                sb.append("', '");
                sb.append(aVar.f3372f);
                sb.append("', '");
                sb.append(((Credentials) obj2).a());
                sb.append("')");
                webViewO.evaluateJavascript(sb.toString(), null);
                String string = mainActivity.getString(R.string.agent_path);
                c3.h.a0(string, "getString(...)");
                boolean zR2 = q3.l.R2(string, "debug", false);
                mainActivity.o().evaluateJavascript("setAppInfo({\"version\":\"1.7.2\",\"beta\":" + zR2 + "})", null);
                mainActivity.o().evaluateJavascript("setLoading(false)", null);
                SharedPreferences sharedPreferences = mainActivity.A;
                if (sharedPreferences == null) {
                    c3.h.E2("sharedPreferences");
                    throw null;
                }
                String string2 = sharedPreferences.getString("settings", null);
                if (string2 != null) {
                    mainActivity.o().evaluateJavascript("setSettingsFrom(" + string2 + ')', null);
                }
                kotlinx.coroutines.scheduling.d dVar = r3.x.f4128a;
                c3.h.s1(kotlinx.coroutines.internal.k.f3303a, new u2.u(mainActivity, null));
                if (c3.h.I("android.intent.action.VIEW", mainActivity.getIntent().getAction())) {
                    Uri data = mainActivity.getIntent().getData();
                    System.out.println((Object) "app opened from deep link");
                    if (data != null) {
                        List<String> pathSegments = data.getPathSegments();
                        if (pathSegments.isEmpty()) {
                            return;
                        }
                        String str3 = pathSegments.get(pathSegments.size() - 1);
                        Log.d("DeepLink", "Custom Path: " + str3);
                        mainActivity.o().evaluateJavascript("handleDeepLink(\"duplicateConfig\",\"" + str3 + "\")", null);
                        return;
                    }
                    return;
                }
                return;
            default:
                Credentials credentials = (Credentials) obj;
                c3.h.b0(credentials, "credentials");
                g1.b bVar = (g1.b) ((k3.m) obj3).f3276b;
                String strA = credentials.a();
                bVar.getClass();
                c3.h.b0(strA, "accessToken");
                char[] cArr = t3.s.f4419j;
                t3.r rVarF = f2.e.q(String.valueOf(bVar.f2303a.f2026b)).f();
                rVarF.a("userinfo");
                t3.s sVarB = rVarF.b();
                com.auth0.android.request.internal.e eVar = new com.auth0.android.request.internal.e(l1.a.class, bVar.f2305c);
                com.auth0.android.request.internal.l lVar = bVar.f2304b;
                lVar.getClass();
                String str4 = sVarB.f4427h;
                c3.h.b0(str4, "url");
                com.auth0.android.request.internal.a aVarA = lVar.a(k1.c.f3252a, str4, eVar, lVar.f1334b);
                aVarA.a("Authorization", "Bearer ".concat(strA));
                aVarA.d(new b0((MainActivity) obj2, 2, credentials));
                return;
        }
    }

    public void c(d1 d1Var) {
        o1 o1VarA = (o1) ((n.k) this.f3155c).getOrDefault(d1Var, null);
        if (o1VarA == null) {
            o1VarA = o1.a();
            ((n.k) this.f3155c).put(d1Var, o1VarA);
        }
        o1VarA.f5244a |= 1;
    }

    public void d(d1 d1Var, y0.k0 k0Var) {
        o1 o1VarA = (o1) ((n.k) this.f3155c).getOrDefault(d1Var, null);
        if (o1VarA == null) {
            o1VarA = o1.a();
            ((n.k) this.f3155c).put(d1Var, o1VarA);
        }
        o1VarA.f5246c = k0Var;
        o1VarA.f5244a |= 8;
    }

    public void e(d1 d1Var, y0.k0 k0Var) {
        o1 o1VarA = (o1) ((n.k) this.f3155c).getOrDefault(d1Var, null);
        if (o1VarA == null) {
            o1VarA = o1.a();
            ((n.k) this.f3155c).put(d1Var, o1VarA);
        }
        o1VarA.f5245b = k0Var;
        o1VarA.f5244a |= 4;
    }

    public void f() {
        switch (this.f3154b) {
            case 0:
                ((n.k) this.f3155c).clear();
                ((n.e) this.f3156d).a();
                break;
            default:
                int[] iArr = (int[]) this.f3155c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f3156d = null;
                break;
        }
    }

    public void g(int i4) {
        Object obj = this.f3155c;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i4, 10) + 1];
            this.f3155c = iArr;
            Arrays.fill(iArr, -1);
        } else if (i4 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i4) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f3155c = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f3155c;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public View h(int i4, int i5, int i6, int i7) {
        int iC;
        int i8;
        int iD;
        View viewU;
        androidx.fragment.app.k kVar = (androidx.fragment.app.k) ((n1) this.f3155c);
        int i9 = kVar.f784b;
        Object obj = kVar.f785c;
        switch (i9) {
            case 0:
                iC = ((y0.o0) obj).C();
                break;
            default:
                iC = ((y0.o0) obj).E();
                break;
        }
        androidx.fragment.app.k kVar2 = (androidx.fragment.app.k) ((n1) this.f3155c);
        int i10 = kVar2.f784b;
        Object obj2 = kVar2.f785c;
        switch (i10) {
            case 0:
                y0.o0 o0Var = (y0.o0) obj2;
                i8 = o0Var.f5241n;
                iD = o0Var.D();
                break;
            default:
                y0.o0 o0Var2 = (y0.o0) obj2;
                i8 = o0Var2.f5242o;
                iD = o0Var2.B();
                break;
        }
        int i11 = i8 - iD;
        int i12 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            androidx.fragment.app.k kVar3 = (androidx.fragment.app.k) ((n1) this.f3155c);
            int i13 = kVar3.f784b;
            Object obj3 = kVar3.f785c;
            switch (i13) {
                case 0:
                    viewU = ((y0.o0) obj3).u(i4);
                    break;
                default:
                    viewU = ((y0.o0) obj3).u(i4);
                    break;
            }
            int iD2 = ((androidx.fragment.app.k) ((n1) this.f3155c)).d(viewU);
            int iC2 = ((androidx.fragment.app.k) ((n1) this.f3155c)).c(viewU);
            Object obj4 = this.f3156d;
            m1 m1Var = (m1) obj4;
            m1Var.f5216b = iC;
            m1Var.f5217c = i11;
            m1Var.f5218d = iD2;
            m1Var.f5219e = iC2;
            if (i6 != 0) {
                ((m1) obj4).f5215a = i6;
                if (((m1) obj4).a()) {
                    return viewU;
                }
            }
            if (i7 != 0) {
                Object obj5 = this.f3156d;
                ((m1) obj5).f5215a = i7;
                if (((m1) obj5).a()) {
                    view = viewU;
                }
            }
            i4 += i12;
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    public int i(int i4) {
        int i5;
        int[] iArr = (int[]) this.f3155c;
        if (iArr == null || i4 >= iArr.length) {
            return -1;
        }
        Object obj = this.f3156d;
        if (((List) obj) == null) {
            i5 = -1;
        } else {
            List list = (List) obj;
            j1 j1Var = null;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    j1 j1Var2 = (j1) ((List) this.f3156d).get(size);
                    if (j1Var2.f5169b == i4) {
                        j1Var = j1Var2;
                        break;
                    }
                }
            }
            if (j1Var != null) {
                ((List) this.f3156d).remove(j1Var);
            }
            int size2 = ((List) this.f3156d).size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    i6 = -1;
                    break;
                }
                if (((j1) ((List) this.f3156d).get(i6)).f5169b >= i4) {
                    break;
                }
                i6++;
            }
            if (i6 != -1) {
                j1 j1Var3 = (j1) ((List) this.f3156d).get(i6);
                ((List) this.f3156d).remove(i6);
                i5 = j1Var3.f5169b;
            } else {
                i5 = -1;
            }
        }
        if (i5 == -1) {
            int[] iArr2 = (int[]) this.f3155c;
            Arrays.fill(iArr2, i4, iArr2.length, -1);
            return ((int[]) this.f3155c).length;
        }
        int i7 = i5 + 1;
        Arrays.fill((int[]) this.f3155c, i4, i7, -1);
        return i7;
    }

    public boolean j(View view) {
        int iC;
        int i4;
        int iD;
        m1 m1Var = (m1) this.f3156d;
        androidx.fragment.app.k kVar = (androidx.fragment.app.k) ((n1) this.f3155c);
        int i5 = kVar.f784b;
        Object obj = kVar.f785c;
        switch (i5) {
            case 0:
                iC = ((y0.o0) obj).C();
                break;
            default:
                iC = ((y0.o0) obj).E();
                break;
        }
        androidx.fragment.app.k kVar2 = (androidx.fragment.app.k) ((n1) this.f3155c);
        int i6 = kVar2.f784b;
        Object obj2 = kVar2.f785c;
        switch (i6) {
            case 0:
                y0.o0 o0Var = (y0.o0) obj2;
                i4 = o0Var.f5241n;
                iD = o0Var.D();
                break;
            default:
                y0.o0 o0Var2 = (y0.o0) obj2;
                i4 = o0Var2.f5242o;
                iD = o0Var2.B();
                break;
        }
        int i7 = i4 - iD;
        int iD2 = ((androidx.fragment.app.k) ((n1) this.f3155c)).d(view);
        int iC2 = ((androidx.fragment.app.k) ((n1) this.f3155c)).c(view);
        m1Var.f5216b = iC;
        m1Var.f5217c = i7;
        m1Var.f5218d = iD2;
        m1Var.f5219e = iC2;
        Object obj3 = this.f3156d;
        ((m1) obj3).f5215a = 24579;
        return ((m1) obj3).a();
    }

    public void k(int i4, int i5) {
        int[] iArr = (int[]) this.f3155c;
        if (iArr == null || i4 >= iArr.length) {
            return;
        }
        int i6 = i4 + i5;
        g(i6);
        int[] iArr2 = (int[]) this.f3155c;
        System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
        Arrays.fill((int[]) this.f3155c, i4, i6, -1);
        List list = (List) this.f3156d;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            j1 j1Var = (j1) ((List) this.f3156d).get(size);
            int i7 = j1Var.f5169b;
            if (i7 >= i4) {
                j1Var.f5169b = i7 + i5;
            }
        }
    }

    public void l(int i4, int i5) {
        int[] iArr = (int[]) this.f3155c;
        if (iArr == null || i4 >= iArr.length) {
            return;
        }
        int i6 = i4 + i5;
        g(i6);
        int[] iArr2 = (int[]) this.f3155c;
        System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
        int[] iArr3 = (int[]) this.f3155c;
        Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
        List list = (List) this.f3156d;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            j1 j1Var = (j1) ((List) this.f3156d).get(size);
            int i7 = j1Var.f5169b;
            if (i7 >= i4) {
                if (i7 < i6) {
                    ((List) this.f3156d).remove(size);
                } else {
                    j1Var.f5169b = i7 - i5;
                }
            }
        }
    }

    public void m(g1.c cVar) {
        int i4 = this.f3154b;
        Object obj = this.f3155c;
        switch (i4) {
            case 1:
                ((i1.a) this.f3156d).a(new i0((String) obj));
                break;
            default:
                PrintStream printStream = System.out;
                printStream.println(cVar);
                printStream.println((Object) "error getting profile");
                ((MainActivity) obj).o().evaluateJavascript("setLoading(false)", null);
                break;
        }
    }

    public y0.k0 n(d1 d1Var, int i4) {
        o1 o1Var;
        y0.k0 k0Var;
        int iE = ((n.k) this.f3155c).e(d1Var);
        if (iE >= 0 && (o1Var = (o1) ((n.k) this.f3155c).j(iE)) != null) {
            int i5 = o1Var.f5244a;
            if ((i5 & i4) != 0) {
                int i6 = i5 & (~i4);
                o1Var.f5244a = i6;
                if (i4 == 4) {
                    k0Var = o1Var.f5245b;
                } else {
                    if (i4 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    k0Var = o1Var.f5246c;
                }
                if ((i6 & 12) == 0) {
                    ((n.k) this.f3155c).i(iE);
                    o1Var.f5244a = 0;
                    o1Var.f5245b = null;
                    o1Var.f5246c = null;
                    o1.f5243d.b(o1Var);
                }
                return k0Var;
            }
        }
        return null;
    }

    public void o(d1 d1Var) {
        o1 o1Var = (o1) ((n.k) this.f3155c).getOrDefault(d1Var, null);
        if (o1Var == null) {
            return;
        }
        o1Var.f5244a &= -2;
    }

    public void p(d1 d1Var) {
        for (int iF = ((n.e) this.f3156d).f() - 1; iF >= 0; iF--) {
            if (d1Var == ((n.e) this.f3156d).g(iF)) {
                n.e eVar = (n.e) this.f3156d;
                Object[] objArr = eVar.f3499d;
                Object obj = objArr[iF];
                Object obj2 = n.e.f3496f;
                if (obj == obj2) {
                    break;
                }
                objArr[iF] = obj2;
                eVar.f3497b = true;
                break;
            }
        }
        o1 o1Var = (o1) ((n.k) this.f3155c).remove(d1Var);
        if (o1Var != null) {
            o1Var.f5244a = 0;
            o1Var.f5245b = null;
            o1Var.f5246c = null;
            o1.f5243d.b(o1Var);
        }
    }

    public /* synthetic */ b0(int i4) {
        this.f3154b = i4;
        if (i4 != 1) {
            this.f3155c = new n.k();
            this.f3156d = new n.e();
        }
    }

    public /* synthetic */ b0(androidx.fragment.app.k kVar) {
        this.f3154b = 2;
        this.f3155c = kVar;
        m1 m1Var = new m1();
        m1Var.f5215a = 0;
        this.f3156d = m1Var;
    }
}
