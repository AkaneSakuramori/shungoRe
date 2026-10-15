.class public final Landroidx/fragment/app/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/d;
.implements Li1/a;
.implements Ly0/n1;


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Landroidx/fragment/app/k;->b:I

    iput-object p2, p0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lf1/b;)V
    .locals 1

    iget v0, p0, Landroidx/fragment/app/k;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg1/c;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/k;->g(Lg1/c;)V

    return-void

    :pswitch_0
    check-cast p1, Lg1/c;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/k;->g(Lg1/c;)V

    return-void

    :pswitch_1
    check-cast p1, Lg1/c;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/k;->g(Lg1/c;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Landroidx/fragment/app/k;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/auth0/android/result/Credentials;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/k;->h(Lcom/auth0/android/result/Credentials;)V

    return-void

    :pswitch_0
    check-cast p1, Ljava/lang/Void;

    const-string p1, "successfull logout"

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast p1, Lcom/shungo/app/MainActivity;

    sget v0, Lcom/shungo/app/MainActivity;->F:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p1, Lcom/shungo/app/MainActivity;->B:Lh1/c;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lh1/c;->b()V

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    const-string v1, "manager"

    invoke-static {v1}, Lc3/h;->E2(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const-string v2, "Shungo"

    const-string v3, "failed clearing credentials"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    iget-object v1, p1, Lcom/shungo/app/MainActivity;->A:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "accessToken"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    iput-object v0, p1, Lcom/shungo/app/MainActivity;->z:Ll1/a;

    invoke-virtual {p1}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Lu2/o;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lu2/o;-><init>(Lcom/shungo/app/MainActivity;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    const-string p1, "sharedPreferences"

    invoke-static {p1}, Lc3/h;->E2(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    check-cast p1, Lcom/auth0/android/result/Credentials;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/k;->h(Lcom/auth0/android/result/Credentials;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroid/view/View;)I
    .locals 2

    iget v0, p0, Landroidx/fragment/app/k;->b:I

    iget-object v1, p0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ly0/p0;

    check-cast v1, Ly0/o0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ly0/p0;

    iget-object p1, p1, Ly0/p0;->b:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, p1

    return v1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ly0/p0;

    check-cast v1, Ly0/o0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ly0/p0;

    iget-object p1, p1, Ly0/p0;->b:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, p1

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(Landroid/view/View;)I
    .locals 2

    iget v0, p0, Landroidx/fragment/app/k;->b:I

    iget-object v1, p0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ly0/p0;

    check-cast v1, Ly0/o0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ly0/p0;

    iget-object p1, p1, Ly0/p0;->b:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v1, p1

    return v1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ly0/p0;

    check-cast v1, Ly0/o0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ly0/p0;

    iget-object p1, p1, Ly0/p0;->b:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v1, p1

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e()V
    .locals 4

    iget v0, p0, Landroidx/fragment/app/k;->b:I

    iget-object v1, p0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Landroidx/fragment/app/c1;

    invoke-virtual {v1}, Landroidx/fragment/app/c1;->a()V

    return-void

    :pswitch_0
    check-cast v1, Landroidx/fragment/app/q;

    iget-object v0, v1, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v3, v2

    goto :goto_0

    :cond_0
    iget-object v3, v0, Landroidx/fragment/app/o;->a:Landroid/view/View;

    :goto_0
    if-eqz v3, :cond_2

    if-nez v0, :cond_1

    move-object v0, v2

    goto :goto_1

    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/o;->a:Landroid/view/View;

    :goto_1
    invoke-virtual {v1}, Landroidx/fragment/app/q;->d()Landroidx/fragment/app/o;

    move-result-object v3

    iput-object v2, v3, Landroidx/fragment/app/o;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    :cond_2
    invoke-virtual {v1}, Landroidx/fragment/app/q;->d()Landroidx/fragment/app/o;

    move-result-object v0

    iput-object v2, v0, Landroidx/fragment/app/o;->b:Landroid/animation/Animator;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->m:Landroidx/fragment/app/i0;

    invoke-virtual {v0}, Landroidx/fragment/app/i0;->J()V

    return-void
.end method

.method public g(Lg1/c;)V
    .locals 3

    iget v0, p0, Landroidx/fragment/app/k;->b:I

    iget-object v1, p0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lg1/c;->a()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Unauthorized"

    invoke-static {v2, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unable to complete authentication with PKCE. PKCE support can be enabled by setting Application Type to \'Native\' and Token Endpoint Authentication Method to \'None\' for this app at \'https://manage.auth0.com/#/applications/"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Lj1/c0;

    iget-object v2, v2, Lj1/c0;->p:Lg1/b;

    iget-object v2, v2, Lg1/b;->a:Lf1/a;

    iget-object v2, v2, Lf1/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/settings\'."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "h0"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    check-cast v1, Lj1/c0;

    iget-object v0, v1, Lj1/c0;->k:Li1/a;

    invoke-interface {v0, p1}, Li1/a;->a(Lf1/b;)V

    return-void

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "error logout: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    check-cast v1, Lcom/shungo/app/MainActivity;

    new-instance p1, Lu2/o;

    const/4 v0, 0x3

    invoke-direct {p1, v1, v0}, Lu2/o;-><init>(Lcom/shungo/app/MainActivity;I)V

    invoke-virtual {v1, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :pswitch_1
    check-cast v1, Lcom/shungo/app/MainActivity;

    const-string p1, "Something went wrong !"

    const/4 v0, 0x0

    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lcom/auth0/android/result/Credentials;)V
    .locals 7

    iget v0, p0, Landroidx/fragment/app/k;->b:I

    iget-object v1, p0, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    const-string v2, "credentials"

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lj1/c0;

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lj1/b0;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3, p1}, Lj1/b0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p1, Lj1/c0;->t:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lj1/r;

    const-string v0, "ID token is required but missing"

    invoke-direct {p1, v0}, Lj1/l0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lj1/b0;->a(Lf1/b;)V

    goto/16 :goto_0

    :cond_0
    :try_start_0
    new-instance p1, Lcom/auth0/android/request/internal/k;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-direct {p1, v0}, Lcom/auth0/android/request/internal/k;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lj1/a0;

    invoke-direct {v0, v2, v1, p1}, Lj1/a0;-><init>(Lj1/b0;Lj1/c0;Lcom/auth0/android/request/internal/k;)V

    iget-object v1, v1, Lj1/c0;->p:Lg1/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lt3/s;->j:[C

    iget-object v2, v1, Lg1/b;->a:Lf1/a;

    iget-object v2, v2, Lf1/a;->b:Lt3/s;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lf2/e;->q(Ljava/lang/String;)Lt3/s;

    move-result-object v2

    invoke-virtual {v2}, Lt3/s;->f()Lt3/r;

    move-result-object v2

    const-string v4, ".well-known"

    invoke-virtual {v2, v4}, Lt3/r;->a(Ljava/lang/String;)V

    const-string v4, "jwks.json"

    invoke-virtual {v2, v4}, Lt3/r;->a(Ljava/lang/String;)V

    invoke-virtual {v2}, Lt3/r;->b()Lt3/s;

    move-result-object v2

    const-string v4, "gson"

    iget-object v5, v1, Lg1/b;->c:Lm2/m;

    invoke-static {v5, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/reflect/Type;

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v3

    const/4 v3, 0x1

    const-class v6, Ljava/security/PublicKey;

    aput-object v6, v4, v3

    const-class v6, Ljava/util/Map;

    invoke-static {v6, v4}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v4

    const-string v6, "null cannot be cast to non-null type com.google.gson.reflect.TypeToken<kotlin.collections.Map<kotlin.String, T of com.auth0.android.request.internal.GsonAdapter.Companion.forMapOf>>"

    invoke-static {v4, v6}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lcom/auth0/android/request/internal/e;

    invoke-virtual {v5, v4}, Lm2/m;->c(Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v4

    invoke-direct {v6, v4}, Lcom/auth0/android/request/internal/e;-><init>(Lm2/b0;)V

    iget-object v1, v1, Lg1/b;->b:Lcom/auth0/android/request/internal/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "url"

    iget-object v2, v2, Lt3/s;->h:Ljava/lang/String;

    invoke-static {v2, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lk1/c;->a:Lk1/c;

    iget-object v5, v1, Lcom/auth0/android/request/internal/l;->b:Lg1/a;

    invoke-virtual {v1, v4, v2, v6, v5}, Lcom/auth0/android/request/internal/l;->a(Lk1/d;Ljava/lang/String;Lcom/auth0/android/request/internal/e;Lg1/a;)Lcom/auth0/android/request/internal/a;

    move-result-object v1

    new-instance v2, Lj1/b0;

    iget-object p1, p1, Lcom/auth0/android/request/internal/k;->c:Ljava/lang/String;

    invoke-direct {v2, p1, v3, v0}, Lj1/b0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Lcom/auth0/android/request/internal/a;->d(Li1/a;)V

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Lj1/m0;

    const-string v1, "ID token could not be decoded"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v0}, Lj1/b0;->a(Lf1/b;)V

    :goto_0
    return-void

    :pswitch_0
    invoke-static {p1, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successfull login"

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    check-cast v1, Lcom/shungo/app/MainActivity;

    iget-object v0, v1, Lcom/shungo/app/MainActivity;->B:Lh1/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lh1/c;->c(Lcom/auth0/android/result/Credentials;)V

    invoke-virtual {v1}, Lcom/shungo/app/MainActivity;->q()V

    return-void

    :cond_1
    const-string p1, "manager"

    invoke-static {p1}, Lc3/h;->E2(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
