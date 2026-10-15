package v2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import c3.e;
import c3.h;
import com.shungo.app.R;
import e.k0;
import e.o;
import e3.g;
import j3.p;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;
import t3.b0;
import t3.d0;
import t3.u;
import t3.v;
import t3.w;
import t3.y;
import w2.d;
import x3.j;
import z2.f;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g implements p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f4807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f4812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Handler f4813l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, Handler handler, e eVar) {
        super(eVar);
        this.f4812k = context;
        this.f4813l = handler;
    }

    @Override // e3.a
    public final e a(e eVar) {
        return new b(this.f4812k, this.f4813l, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) {
        return ((b) a((e) obj2)).h(f.f5511a);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02a9 A[Catch: Exception -> 0x02e8, TryCatch #5 {Exception -> 0x02e8, blocks: (B:129:0x02a5, B:131:0x02a9, B:133:0x02ac, B:135:0x02c1, B:137:0x02c4, B:126:0x029e), top: B:164:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ac A[Catch: Exception -> 0x02e8, TryCatch #5 {Exception -> 0x02e8, blocks: (B:129:0x02a5, B:131:0x02a9, B:133:0x02ac, B:135:0x02c1, B:137:0x02c4, B:126:0x029e), top: B:164:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02c1 A[Catch: Exception -> 0x02e8, TryCatch #5 {Exception -> 0x02e8, blocks: (B:129:0x02a5, B:131:0x02a9, B:133:0x02ac, B:135:0x02c1, B:137:0x02c4, B:126:0x029e), top: B:164:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02c4 A[Catch: Exception -> 0x02e8, TRY_LEAVE, TryCatch #5 {Exception -> 0x02e8, blocks: (B:129:0x02a5, B:131:0x02a9, B:133:0x02ac, B:135:0x02c1, B:137:0x02c4, B:126:0x029e), top: B:164:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Instruction removed from duplicated block: B:133:0x02ac, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:137:0x02c4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        ?? r11;
        SharedPreferences sharedPreferences;
        boolean zBooleanValue;
        String str;
        Handler handler;
        boolean z4;
        String str2;
        String str3;
        Context context;
        int i4;
        Object objB;
        String str4;
        String str5;
        ?? r4;
        w2.a aVar;
        String str6;
        JSONObject jSONObject;
        ?? OptBoolean;
        ?? r12;
        Context context2;
        String str7;
        String string;
        String str8;
        Boolean bool;
        Context context3;
        Object objA;
        f fVar;
        String str9;
        Context context4;
        w2.a aVar2;
        String str10 = "Error response: ";
        String str11 = "&manufacturer=";
        d3.a aVar3 = d3.a.f1765b;
        int i5 = this.f4811j;
        Context context5 = this.f4812k;
        Handler handler2 = this.f4813l;
        try {
            try {
                try {
                    try {
                        if (i5 != 0) {
                            if (i5 == 1) {
                                int i6 = this.f4810i;
                                String str12 = this.f4809h;
                                String str13 = this.f4808g;
                                SharedPreferences sharedPreferences2 = this.f4807f;
                                h.D2(obj);
                                handler = handler2;
                                str2 = "Shungo";
                                str3 = "injectormd5";
                                context = context5;
                                str4 = str13;
                                i4 = 200;
                                z4 = true;
                                sharedPreferences = sharedPreferences2;
                                str5 = str12;
                                r4 = i6;
                                objB = obj;
                            } else {
                                if (i5 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h.D2(obj);
                                objA = obj;
                                handler = handler2;
                                str6 = "Shungo";
                                context4 = context5;
                                str10 = "Error response: ";
                                i4 = 200;
                            }
                            aVar2 = (w2.a) objA;
                            if (aVar2 == null) {
                                return Boolean.FALSE;
                            }
                            Log.i(str6, "Script fetch: " + aVar2.f4888b);
                            if (aVar2.f4888b == i4) {
                                return Boolean.TRUE;
                            }
                            String str14 = aVar2.f4887a;
                            Log.e(str6, str10 + str14);
                            handler.post(new k0(context4, 8, str14));
                            return Boolean.FALSE;
                        }
                        h.D2(obj);
                        sharedPreferences = context5.getSharedPreferences("shungo", 0);
                        String string2 = sharedPreferences != null ? sharedPreferences.getString("settings", null) : null;
                        if (string2 != null) {
                            try {
                                JSONObject jSONObjectOptJSONObject = new JSONObject(string2).optJSONObject("other");
                                Boolean boolValueOf = jSONObjectOptJSONObject != null ? Boolean.valueOf(jSONObjectOptJSONObject.optBoolean("experimentalInjector")) : null;
                                if (boolValueOf != null) {
                                    zBooleanValue = boolValueOf.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        } else {
                            zBooleanValue = false;
                        }
                        if (h.l1()) {
                            str = zBooleanValue ? "experimental64bit" : "main64bit";
                        } else {
                            str = zBooleanValue ? "experimental32bit" : "main32bit";
                        }
                        try {
                            String string3 = sharedPreferences.getString("injectormd5", "none");
                            u uVar = d.f4898a;
                            String string4 = context5.getString(R.string.injector_path);
                            h.a0(string4, "getString(...)");
                            String str15 = "&injector=" + str + "&md5=" + string3;
                            this.f4807f = sharedPreferences;
                            this.f4808g = str;
                            this.f4809h = string3;
                            this.f4810i = zBooleanValue ? 1 : 0;
                            this.f4811j = 1;
                            handler = handler2;
                            z4 = true;
                            str2 = "Shungo";
                            str3 = "injectormd5";
                            context = context5;
                            String str16 = str;
                            i4 = 200;
                            try {
                                objB = d.b(context5, string4, str15, null, this, 24);
                                if (objB == aVar3) {
                                    return aVar3;
                                }
                                str4 = str16;
                                str5 = string3;
                                r4 = zBooleanValue;
                            } catch (Exception e6) {
                                e = e6;
                                handler2 = handler;
                                r11 = context;
                                handler2.post(new o(r11, 3));
                                e.printStackTrace();
                                return Boolean.FALSE;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            r11 = context5;
                            handler2 = handler2;
                            handler2.post(new o(r11, 3));
                            e.printStackTrace();
                            return Boolean.FALSE;
                        }
                        objA = d.a(context2, string, str8, null, bool, this);
                        context4 = context3;
                        if (objA == aVar3) {
                            return aVar3;
                        }
                        aVar2 = (w2.a) objA;
                        if (aVar2 == null) {
                            return Boolean.FALSE;
                        }
                        Log.i(str6, "Script fetch: " + aVar2.f4888b);
                        if (aVar2.f4888b == i4) {
                            return Boolean.TRUE;
                        }
                        String str17 = aVar2.f4887a;
                        Log.e(str6, str10 + str17);
                        handler.post(new k0(context4, 8, str17));
                        return Boolean.FALSE;
                    } catch (Exception e8) {
                        e = e8;
                        r12 = context3;
                        handler2 = handler;
                        r11 = r12;
                        handler2.post(new o(r11, 3));
                        e.printStackTrace();
                        return Boolean.FALSE;
                    }
                    if (jSONObject == null || OptBoolean == 0) {
                        context2 = context;
                        str7 = r6;
                        if (jSONObject != null) {
                            Log.i(str6, "injector is up to date");
                        } else {
                            if (!new File(context2.getFilesDir(), "injector").exists()) {
                                Handler handler3 = handler;
                                StringBuilder sb = new StringBuilder("Error downloading injector response: ");
                                sb.append(aVar != null ? new Integer(aVar.f4888b) : null);
                                Log.e(str6, sb.toString());
                                handler3.post(new k0(context2, 7, aVar));
                                return Boolean.FALSE;
                            }
                            StringBuilder sb2 = new StringBuilder("injector check failed (");
                            sb2.append(aVar != null ? new Integer(aVar.f4888b) : null);
                            sb2.append("), using cached injector");
                            Log.w(str6, sb2.toString());
                        }
                    } else {
                        try {
                            Log.i(str6, "downloading newest injector");
                            w wVar = new w(new v());
                            y yVar = new y();
                            String string5 = jSONObject.getString("url");
                            str7 = "getString(...)";
                            h.a0(string5, str7);
                            yVar.e(string5);
                            OptBoolean = 0;
                            b0 b0VarE = new j(wVar, yVar.b(), false).e();
                            int i7 = b0VarE.f4310e;
                            try {
                                if (i4 > i7 || i7 >= 300) {
                                    throw new IOException("Failed to download file: " + i7);
                                }
                                try {
                                    d0 d0Var = b0VarE.f4313h;
                                    if (d0Var != null) {
                                        context2 = context;
                                        h.p2(context2, d0Var, "injector");
                                        fVar = f.f5511a;
                                    } else {
                                        context2 = context;
                                        fVar = null;
                                    }
                                    if (fVar == null) {
                                        throw new IOException("Failed to download file: response body is null");
                                    }
                                    h.k0(b0VarE, null);
                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                    editorEdit.putString(str3, jSONObject.getString("md5"));
                                    editorEdit.apply();
                                } catch (Throwable th) {
                                    th = th;
                                    OptBoolean = context;
                                    Throwable th2 = th;
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        h.k0(b0VarE, th2);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            OptBoolean = context;
                            r12 = OptBoolean;
                            handler2 = handler;
                            r11 = r12;
                            handler2.post(new o(r11, 3));
                            e.printStackTrace();
                            return Boolean.FALSE;
                        }
                    }
                    u uVar2 = d.f4898a;
                    string = context2.getString(R.string.agent_path);
                    h.a0(string, str7);
                    str8 = "&manufacturer=" + Build.MANUFACTURER + "&model=" + Build.MODEL;
                    bool = Boolean.TRUE;
                    this.f4807f = null;
                    this.f4808g = null;
                    this.f4809h = null;
                    this.f4811j = 2;
                    context3 = context2;
                } catch (Exception e10) {
                    e = e10;
                }
                aVar = (w2.a) objB;
                StringBuilder sb3 = new StringBuilder("is 64 bits device: ");
                sb3.append(h.l1());
                sb3.append(" - using experimental: ");
                sb3.append(r4 != 0 ? z4 : false);
                sb3.append(", using: ");
                sb3.append(str4);
                sb3.append(", current injector: ");
                sb3.append(str5);
                sb3.append(" - injector req ");
                sb3.append(aVar != null ? new Integer(aVar.f4888b) : null);
                str6 = str2;
                Log.i(str6, sb3.toString());
                if (aVar == null) {
                    jSONObject = null;
                } else {
                    w2.a aVar4 = aVar.f4888b == i4 ? aVar : null;
                    if (aVar4 == null || (str9 = aVar4.f4887a) == null) {
                        jSONObject = null;
                    } else {
                        try {
                            jSONObject = new JSONObject(str9);
                        } catch (Exception unused) {
                            jSONObject = null;
                        }
                    }
                }
                OptBoolean = jSONObject != null ? jSONObject.optBoolean("needUpdate") : 0;
            } catch (Exception e11) {
                e = e11;
                r11 = context5;
                handler2.post(new o(r11, 3));
                e.printStackTrace();
                return Boolean.FALSE;
            }
        } catch (Exception e12) {
            e = e12;
            r11 = str11;
        }
    }
}
