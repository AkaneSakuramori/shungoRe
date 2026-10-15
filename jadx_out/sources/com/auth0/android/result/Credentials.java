package com.auth0.android.result;

import c3.h;
import defpackage.a;
import java.util.Date;
import n2.b;

/* JADX INFO: loaded from: classes.dex */
public class Credentials {

    @b("access_token")
    private final String accessToken;

    @b("expires_at")
    private final Date expiresAt;

    @b("id_token")
    private final String idToken;

    @b("recovery_code")
    private String recoveryCode;

    @b("refresh_token")
    private final String refreshToken;

    @b("scope")
    private final String scope;

    @b("token_type")
    private final String type;

    public Credentials(String str, String str2, String str3, String str4, Date date, String str5) {
        h.b0(str, "idToken");
        h.b0(str2, "accessToken");
        h.b0(str3, "type");
        h.b0(date, "expiresAt");
        this.idToken = str;
        this.accessToken = str2;
        this.type = str3;
        this.refreshToken = str4;
        this.expiresAt = date;
        this.scope = str5;
    }

    public final String a() {
        return this.accessToken;
    }

    public final Date b() {
        return this.expiresAt;
    }

    public final String c() {
        return this.idToken;
    }

    public final String d() {
        return this.refreshToken;
    }

    public final String e() {
        return this.scope;
    }

    public final String f() {
        return this.type;
    }

    public final void g(String str) {
        this.recoveryCode = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Credentials(idToken='xxxxx', accessToken='xxxxx', type='");
        sb.append(this.type);
        sb.append("', refreshToken='xxxxx', expiresAt='");
        sb.append(this.expiresAt);
        sb.append("', scope='");
        return a.h(sb, this.scope, "')");
    }
}
