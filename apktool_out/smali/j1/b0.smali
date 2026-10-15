.class public final Lj1/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/a;


# instance fields
.field public final synthetic b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 1

    iput p1, p0, Lj1/b0;->b:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ln/k;

    invoke-direct {p1}, Ln/k;-><init>()V

    iput-object p1, p0, Lj1/b0;->c:Ljava/lang/Object;

    .line 4
    new-instance p1, Ln/e;

    invoke-direct {p1}, Ln/e;-><init>()V

    iput-object p1, p0, Lj1/b0;->d:Ljava/lang/Object;

    return-void

    .line 5
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/k;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lj1/b0;->b:I

    iput-object p1, p0, Lj1/b0;->c:Ljava/lang/Object;

    .line 7
    new-instance p1, Ly0/m1;

    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p1, Ly0/m1;->a:I

    iput-object p1, p0, Lj1/b0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lj1/b0;->b:I

    iput-object p1, p0, Lj1/b0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lj1/b0;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lf1/b;)V
    .locals 2

    iget v0, p0, Lj1/b0;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh1/d;

    const-string p1, "couldn\'t get user credentials"

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-object p1, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast p1, Lcom/shungo/app/MainActivity;

    new-instance v0, Lu2/o;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lu2/o;-><init>(Lcom/shungo/app/MainActivity;I)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    check-cast p1, Lg1/c;

    invoke-virtual {p0, p1}, Lj1/b0;->m(Lg1/c;)V

    return-void

    :pswitch_1
    check-cast p1, Lg1/c;

    invoke-virtual {p0, p1}, Lj1/b0;->m(Lg1/c;)V

    return-void

    :pswitch_2
    new-instance v0, Lg1/c;

    const-string v1, "Could not verify the ID token"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast p1, Lj1/c0;

    iget-object p1, p1, Lj1/c0;->k:Li1/a;

    invoke-interface {p1, v0}, Li1/a;->a(Lf1/b;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;)V
    .locals 7

    iget v0, p0, Lj1/b0;->b:I

    iget-object v1, p0, Lj1/b0;->d:Ljava/lang/Object;

    iget-object v2, p0, Lj1/b0;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/auth0/android/result/Credentials;

    const-string v0, "credentials"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lk3/m;

    iget-object v0, v2, Lk3/m;->b:Ljava/lang/Object;

    check-cast v0, Lg1/b;

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "accessToken"

    invoke-static {v2, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lt3/s;->j:[C

    iget-object v3, v0, Lg1/b;->a:Lf1/a;

    iget-object v3, v3, Lf1/a;->b:Lt3/s;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lf2/e;->q(Ljava/lang/String;)Lt3/s;

    move-result-object v3

    invoke-virtual {v3}, Lt3/s;->f()Lt3/r;

    move-result-object v3

    const-string v4, "userinfo"

    invoke-virtual {v3, v4}, Lt3/r;->a(Ljava/lang/String;)V

    invoke-virtual {v3}, Lt3/r;->b()Lt3/s;

    move-result-object v3

    new-instance v4, Lcom/auth0/android/request/internal/e;

    const-class v5, Ll1/a;

    iget-object v6, v0, Lg1/b;->c:Lm2/m;

    invoke-direct {v4, v5, v6}, Lcom/auth0/android/request/internal/e;-><init>(Ljava/lang/Class;Lm2/m;)V

    iget-object v0, v0, Lg1/b;->b:Lcom/auth0/android/request/internal/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "url"

    iget-object v3, v3, Lt3/s;->h:Ljava/lang/String;

    invoke-static {v3, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lk1/c;->a:Lk1/c;

    iget-object v6, v0, Lcom/auth0/android/request/internal/l;->b:Lg1/a;

    invoke-virtual {v0, v5, v3, v4, v6}, Lcom/auth0/android/request/internal/l;->a(Lk1/d;Ljava/lang/String;Lcom/auth0/android/request/internal/e;Lg1/a;)Lcom/auth0/android/request/internal/a;

    move-result-object v0

    const-string v3, "Bearer "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Authorization"

    invoke-virtual {v0, v3, v2}, Lcom/auth0/android/request/internal/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lj1/b0;

    check-cast v1, Lcom/shungo/app/MainActivity;

    const/4 v3, 0x2

    invoke-direct {v2, v1, v3, p1}, Lj1/b0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lcom/auth0/android/request/internal/a;->d(Li1/a;)V

    return-void

    :pswitch_0
    check-cast p1, Ll1/a;

    const-string v0, "profile"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/shungo/app/MainActivity;

    iput-object p1, v2, Lcom/shungo/app/MainActivity;->z:Ll1/a;

    invoke-virtual {v2}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "setUserFrom(\'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p1, Ll1/a;->d:Ljava/lang/String;

    if-nez v4, :cond_0

    iget-object v4, p1, Ll1/a;->c:Ljava/lang/String;

    if-nez v4, :cond_0

    iget-object v4, p1, Ll1/a;->h:Ljava/lang/String;

    :cond_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\', \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p1, Ll1/a;->e:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll1/a;->f:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v1, Lcom/auth0/android/result/Credentials;

    invoke-virtual {v1}, Lcom/auth0/android/result/Credentials;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\')"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    const p1, 0x7f0f001c

    invoke-virtual {v2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const-string v3, "debug"

    invoke-static {p1, v3, v0}, Lq3/l;->R2(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {v2}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "setAppInfo({\"version\":\"1.7.2\",\"beta\":"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "})"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    invoke-virtual {v2}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object p1

    const-string v0, "setLoading(false)"

    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    iget-object p1, v2, Lcom/shungo/app/MainActivity;->A:Landroid/content/SharedPreferences;

    if-eqz p1, :cond_3

    const-string v0, "settings"

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v2}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "setSettingsFrom("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_1
    sget-object p1, Lr3/x;->a:Lkotlinx/coroutines/scheduling/d;

    sget-object p1, Lkotlinx/coroutines/internal/k;->a:Lr3/q0;

    new-instance v0, Lu2/u;

    invoke-direct {v0, v2, v1}, Lu2/u;-><init>(Lcom/shungo/app/MainActivity;Lc3/e;)V

    invoke-static {p1, v0}, Lc3/h;->s1(Lr3/q0;Lj3/p;)V

    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.VIEW"

    invoke-static {v0, p1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    const-string v0, "app opened from deep link"

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Custom Path: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "DeepLink"

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v2}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "handleDeepLink(\"duplicateConfig\",\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\")"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_2
    return-void

    :cond_3
    const-string p1, "sharedPreferences"

    invoke-static {p1}, Lc3/h;->E2(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    check-cast p1, Ljava/util/Map;

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/PublicKey;

    :try_start_0
    move-object v0, v1

    check-cast v0, Li1/a;

    new-instance v3, Lj1/a;

    invoke-direct {v3, p1}, Lj1/a;-><init>(Ljava/security/PublicKey;)V

    invoke-interface {v0, v3}, Li1/a;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    check-cast v1, Li1/a;

    new-instance p1, Lj1/i0;

    invoke-direct {p1, v2}, Lj1/i0;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, p1}, Li1/a;->a(Lf1/b;)V

    :goto_0
    return-void

    :pswitch_2
    check-cast p1, Ljava/lang/Void;

    check-cast v2, Lj1/c0;

    iget-object p1, v2, Lj1/c0;->k:Li1/a;

    check-cast v1, Lcom/auth0/android/result/Credentials;

    invoke-interface {p1, v1}, Li1/a;->b(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ly0/d1;)V
    .locals 2

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/o1;

    if-nez v0, :cond_0

    invoke-static {}, Ly0/o1;->a()Ly0/o1;

    move-result-object v0

    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v1, Ln/k;

    invoke-virtual {v1, p1, v0}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget p1, v0, Ly0/o1;->a:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Ly0/o1;->a:I

    return-void
.end method

.method public d(Ly0/d1;Ly0/k0;)V
    .locals 2

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/o1;

    if-nez v0, :cond_0

    invoke-static {}, Ly0/o1;->a()Ly0/o1;

    move-result-object v0

    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v1, Ln/k;

    invoke-virtual {v1, p1, v0}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p2, v0, Ly0/o1;->c:Ly0/k0;

    iget p1, v0, Ly0/o1;->a:I

    or-int/lit8 p1, p1, 0x8

    iput p1, v0, Ly0/o1;->a:I

    return-void
.end method

.method public e(Ly0/d1;Ly0/k0;)V
    .locals 2

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/o1;

    if-nez v0, :cond_0

    invoke-static {}, Ly0/o1;->a()Ly0/o1;

    move-result-object v0

    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v1, Ln/k;

    invoke-virtual {v1, p1, v0}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p2, v0, Ly0/o1;->b:Ly0/k0;

    iget p1, v0, Ly0/o1;->a:I

    or-int/lit8 p1, p1, 0x4

    iput p1, v0, Ly0/o1;->a:I

    return-void
.end method

.method public f()V
    .locals 2

    iget v0, p0, Lj1/b0;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lj1/b0;->d:Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, Ln/k;

    invoke-virtual {v0}, Ln/k;->clear()V

    iget-object v0, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v0, Ln/e;

    invoke-virtual {v0}, Ln/e;->a()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(I)V
    .locals 4

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, [I

    const/4 v2, -0x1

    if-nez v1, :cond_0

    const/16 v0, 0xa

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    new-array p1, p1, [I

    iput-object p1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast p1, [I

    invoke-static {p1, v2}, Ljava/util/Arrays;->fill([II)V

    goto :goto_1

    :cond_0
    move-object v1, v0

    check-cast v1, [I

    array-length v1, v1

    if-lt p1, v1, :cond_2

    move-object v1, v0

    check-cast v1, [I

    check-cast v0, [I

    array-length v0, v0

    :goto_0
    if-gt v0, p1, :cond_1

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_1
    new-array p1, v0, [I

    iput-object p1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast p1, [I

    array-length v0, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, p1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lj1/b0;->c:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, [I

    array-length v1, v1

    check-cast p1, [I

    array-length p1, p1

    invoke-static {v0, v1, p1, v2}, Ljava/util/Arrays;->fill([IIII)V

    :cond_2
    :goto_1
    return-void
.end method

.method public h(IIII)Landroid/view/View;
    .locals 9

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, Ly0/n1;

    check-cast v0, Landroidx/fragment/app/k;

    iget v1, v0, Landroidx/fragment/app/k;->b:I

    iget-object v0, v0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v0, Ly0/o0;

    invoke-virtual {v0}, Ly0/o0;->E()I

    move-result v0

    goto :goto_0

    :pswitch_0
    check-cast v0, Ly0/o0;

    invoke-virtual {v0}, Ly0/o0;->C()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v1, Ly0/n1;

    check-cast v1, Landroidx/fragment/app/k;

    iget v2, v1, Landroidx/fragment/app/k;->b:I

    iget-object v1, v1, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_1

    check-cast v1, Ly0/o0;

    iget v2, v1, Ly0/o0;->o:I

    invoke-virtual {v1}, Ly0/o0;->B()I

    move-result v1

    :goto_1
    sub-int/2addr v2, v1

    goto :goto_2

    :pswitch_1
    check-cast v1, Ly0/o0;

    iget v2, v1, Ly0/o0;->n:I

    invoke-virtual {v1}, Ly0/o0;->D()I

    move-result v1

    goto :goto_1

    :goto_2
    if-le p2, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_3

    :cond_0
    const/4 v1, -0x1

    :goto_3
    const/4 v3, 0x0

    :goto_4
    if-eq p1, p2, :cond_3

    iget-object v4, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v4, Ly0/n1;

    check-cast v4, Landroidx/fragment/app/k;

    iget v5, v4, Landroidx/fragment/app/k;->b:I

    iget-object v4, v4, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    packed-switch v5, :pswitch_data_2

    check-cast v4, Ly0/o0;

    invoke-virtual {v4, p1}, Ly0/o0;->u(I)Landroid/view/View;

    move-result-object v4

    goto :goto_5

    :pswitch_2
    check-cast v4, Ly0/o0;

    invoke-virtual {v4, p1}, Ly0/o0;->u(I)Landroid/view/View;

    move-result-object v4

    :goto_5
    iget-object v5, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v5, Ly0/n1;

    check-cast v5, Landroidx/fragment/app/k;

    invoke-virtual {v5, v4}, Landroidx/fragment/app/k;->d(Landroid/view/View;)I

    move-result v5

    iget-object v6, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v6, Ly0/n1;

    check-cast v6, Landroidx/fragment/app/k;

    invoke-virtual {v6, v4}, Landroidx/fragment/app/k;->c(Landroid/view/View;)I

    move-result v6

    iget-object v7, p0, Lj1/b0;->d:Ljava/lang/Object;

    move-object v8, v7

    check-cast v8, Ly0/m1;

    iput v0, v8, Ly0/m1;->b:I

    iput v2, v8, Ly0/m1;->c:I

    iput v5, v8, Ly0/m1;->d:I

    iput v6, v8, Ly0/m1;->e:I

    if-eqz p3, :cond_1

    move-object v5, v7

    check-cast v5, Ly0/m1;

    iput p3, v5, Ly0/m1;->a:I

    check-cast v7, Ly0/m1;

    invoke-virtual {v7}, Ly0/m1;->a()Z

    move-result v5

    if-eqz v5, :cond_1

    return-object v4

    :cond_1
    if-eqz p4, :cond_2

    iget-object v5, p0, Lj1/b0;->d:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Ly0/m1;

    iput p4, v6, Ly0/m1;->a:I

    check-cast v5, Ly0/m1;

    invoke-virtual {v5}, Ly0/m1;->a()Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v3, v4

    :cond_2
    add-int/2addr p1, v1

    goto :goto_4

    :cond_3
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method

.method public i(I)I
    .locals 5

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, [I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    array-length v0, v0

    if-lt p1, v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lj1/b0;->d:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_3

    :cond_2
    move v0, v1

    goto :goto_4

    :cond_3
    check-cast v0, Ljava/util/List;

    const/4 v2, 0x0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_6

    iget-object v3, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly0/j1;

    iget v4, v3, Ly0/j1;->b:I

    if-ne v4, p1, :cond_5

    move-object v2, v3

    goto :goto_1

    :cond_5
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_6
    :goto_1
    if-eqz v2, :cond_7

    iget-object v0, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_7
    iget-object v0, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v0, :cond_9

    iget-object v3, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly0/j1;

    iget v3, v3, Ly0/j1;->b:I

    if-lt v3, p1, :cond_8

    goto :goto_3

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    move v2, v1

    :goto_3
    if-eq v2, v1, :cond_2

    iget-object v0, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/j1;

    iget-object v3, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget v0, v0, Ly0/j1;->b:I

    :goto_4
    if-ne v0, v1, :cond_a

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, [I

    array-length v2, v0

    invoke-static {v0, p1, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    iget-object p1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast p1, [I

    array-length p1, p1

    return p1

    :cond_a
    iget-object v2, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v2, [I

    add-int/lit8 v0, v0, 0x1

    invoke-static {v2, p1, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    return v0
.end method

.method public j(Landroid/view/View;)Z
    .locals 5

    iget-object v0, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v0, Ly0/m1;

    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v1, Ly0/n1;

    check-cast v1, Landroidx/fragment/app/k;

    iget v2, v1, Landroidx/fragment/app/k;->b:I

    iget-object v1, v1, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v1, Ly0/o0;

    invoke-virtual {v1}, Ly0/o0;->E()I

    move-result v1

    goto :goto_0

    :pswitch_0
    check-cast v1, Ly0/o0;

    invoke-virtual {v1}, Ly0/o0;->C()I

    move-result v1

    :goto_0
    iget-object v2, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v2, Ly0/n1;

    check-cast v2, Landroidx/fragment/app/k;

    iget v3, v2, Landroidx/fragment/app/k;->b:I

    iget-object v2, v2, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    packed-switch v3, :pswitch_data_1

    check-cast v2, Ly0/o0;

    iget v3, v2, Ly0/o0;->o:I

    invoke-virtual {v2}, Ly0/o0;->B()I

    move-result v2

    :goto_1
    sub-int/2addr v3, v2

    goto :goto_2

    :pswitch_1
    check-cast v2, Ly0/o0;

    iget v3, v2, Ly0/o0;->n:I

    invoke-virtual {v2}, Ly0/o0;->D()I

    move-result v2

    goto :goto_1

    :goto_2
    iget-object v2, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v2, Ly0/n1;

    check-cast v2, Landroidx/fragment/app/k;

    invoke-virtual {v2, p1}, Landroidx/fragment/app/k;->d(Landroid/view/View;)I

    move-result v2

    iget-object v4, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v4, Ly0/n1;

    check-cast v4, Landroidx/fragment/app/k;

    invoke-virtual {v4, p1}, Landroidx/fragment/app/k;->c(Landroid/view/View;)I

    move-result p1

    iput v1, v0, Ly0/m1;->b:I

    iput v3, v0, Ly0/m1;->c:I

    iput v2, v0, Ly0/m1;->d:I

    iput p1, v0, Ly0/m1;->e:I

    iget-object p1, p0, Lj1/b0;->d:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Ly0/m1;

    const/16 v1, 0x6003

    iput v1, v0, Ly0/m1;->a:I

    check-cast p1, Ly0/m1;

    invoke-virtual {p1}, Ly0/m1;->a()Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public k(II)V
    .locals 3

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_3

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int v0, p1, p2

    invoke-virtual {p0, v0}, Lj1/b0;->g(I)V

    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v1, [I

    const/4 v2, -0x1

    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v0, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    iget-object v1, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly0/j1;

    iget v2, v1, Ly0/j1;->b:I

    if-ge v2, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v2, p2

    iput v2, v1, Ly0/j1;->b:I

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public l(II)V
    .locals 5

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_4

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int v0, p1, p2

    invoke-virtual {p0, v0}, Lj1/b0;->g(I)V

    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p2

    array-length v3, v1

    const/4 v4, -0x1

    invoke-static {v1, v2, v3, v4}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v1, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_4

    iget-object v2, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly0/j1;

    iget v3, v2, Ly0/j1;->b:I

    if-ge v3, p1, :cond_2

    goto :goto_1

    :cond_2
    if-ge v3, v0, :cond_3

    iget-object v2, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    sub-int/2addr v3, p2

    iput v3, v2, Ly0/j1;->b:I

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public m(Lg1/c;)V
    .locals 2

    iget v0, p0, Lj1/b0;->b:I

    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string p1, "error getting profile"

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    check-cast v1, Lcom/shungo/app/MainActivity;

    invoke-virtual {v1}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object p1

    const-string v0, "setLoading(false)"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast p1, Li1/a;

    new-instance v0, Lj1/i0;

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lj1/i0;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Li1/a;->a(Lf1/b;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public n(Ly0/d1;I)Ly0/k0;
    .locals 4

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, Ln/k;

    invoke-virtual {v0, p1}, Ln/k;->e(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, 0x0

    if-gez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v1, Ln/k;

    invoke-virtual {v1, p1}, Ln/k;->j(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly0/o1;

    if-eqz v1, :cond_4

    iget v2, v1, Ly0/o1;->a:I

    and-int v3, v2, p2

    if-eqz v3, :cond_4

    not-int v3, p2

    and-int/2addr v2, v3

    iput v2, v1, Ly0/o1;->a:I

    const/4 v3, 0x4

    if-ne p2, v3, :cond_1

    iget-object p2, v1, Ly0/o1;->b:Ly0/k0;

    goto :goto_0

    :cond_1
    const/16 v3, 0x8

    if-ne p2, v3, :cond_3

    iget-object p2, v1, Ly0/o1;->c:Ly0/k0;

    :goto_0
    and-int/lit8 v2, v2, 0xc

    if-nez v2, :cond_2

    iget-object v2, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v2, Ln/k;

    invoke-virtual {v2, p1}, Ln/k;->i(I)Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v1, Ly0/o1;->a:I

    iput-object v0, v1, Ly0/o1;->b:Ly0/k0;

    iput-object v0, v1, Ly0/o1;->c:Ly0/k0;

    sget-object p1, Ly0/o1;->d:Lp/e;

    invoke-virtual {p1, v1}, Lp/e;->b(Ljava/lang/Object;)Z

    :cond_2
    return-object p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must provide flag PRE or POST"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object v0
.end method

.method public o(Ly0/d1;)V
    .locals 2

    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly0/o1;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p1, Ly0/o1;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Ly0/o1;->a:I

    return-void
.end method

.method public p(Ly0/d1;)V
    .locals 6

    iget-object v0, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v0, Ln/e;

    invoke-virtual {v0}, Ln/e;->f()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v2, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v2, Ln/e;

    invoke-virtual {v2, v0}, Ln/e;->g(I)Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_0

    iget-object v2, p0, Lj1/b0;->d:Ljava/lang/Object;

    check-cast v2, Ln/e;

    iget-object v3, v2, Ln/e;->d:[Ljava/lang/Object;

    aget-object v4, v3, v0

    sget-object v5, Ln/e;->f:Ljava/lang/Object;

    if-eq v4, v5, :cond_1

    aput-object v5, v3, v0

    iput-boolean v1, v2, Ln/e;->b:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lj1/b0;->c:Ljava/lang/Object;

    check-cast v0, Ln/k;

    invoke-virtual {v0, p1}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly0/o1;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    iput v0, p1, Ly0/o1;->a:I

    const/4 v0, 0x0

    iput-object v0, p1, Ly0/o1;->b:Ly0/k0;

    iput-object v0, p1, Ly0/o1;->c:Ly0/k0;

    sget-object v0, Ly0/o1;->d:Lp/e;

    invoke-virtual {v0, p1}, Lp/e;->b(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
