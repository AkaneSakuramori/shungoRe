.class public final Lj1/c0;
.super Lc3/h;
.source "SourceFile"


# static fields
.field public static final t:Ljava/lang/String;


# instance fields
.field public final j:Lf1/a;

.field public final k:Li1/a;

.field public final l:Z

.field public final m:Ljava/util/LinkedHashMap;

.field public final n:Ljava/util/HashMap;

.field public final o:Lj1/m;

.field public final p:Lg1/b;

.field public q:Lj1/h0;

.field public r:Ljava/lang/Integer;

.field public s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lj1/c0;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lj1/c0;->t:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lf1/a;Landroidx/fragment/app/k;Ljava/util/LinkedHashMap;Lj1/m;)V
    .locals 1

    const-string v0, "account"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p3, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctOptions"

    invoke-static {p4, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/c0;->j:Lf1/a;

    iput-object p2, p0, Lj1/c0;->k:Li1/a;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lj1/c0;->l:Z

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lj1/c0;->n:Ljava/util/HashMap;

    invoke-static {p3}, La3/j;->d3(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    iput-object p2, p0, Lj1/c0;->m:Ljava/util/LinkedHashMap;

    const-string p3, "response_type"

    const-string v0, "code"

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lg1/b;

    invoke-direct {p2, p1}, Lg1/b;-><init>(Lf1/a;)V

    iput-object p2, p0, Lj1/c0;->p:Lg1/b;

    iput-object p4, p0, Lj1/c0;->o:Lj1/m;

    return-void
.end method

.method public static Q2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lj1/c0;->t:Ljava/lang/String;

    const-string v1, "Error, access denied. Check that the required Permissions are granted and that the Application has this Connection configured in Auth0 Dashboard."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "access_denied"

    invoke-static {v0, p0}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p0, Lg1/c;

    if-nez p1, :cond_1

    const-string p1, "Permissions were not granted. Try again."

    :cond_1
    invoke-direct {p0, v0, p1}, Lg1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    :cond_2
    const-string v0, "unauthorized"

    invoke-static {v0, p0}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    const-string v2, "An unexpected error occurred."

    if-eqz v1, :cond_4

    new-instance p0, Lg1/c;

    if-nez p1, :cond_3

    move-object p1, v2

    :cond_3
    invoke-direct {p0, v0, p1}, Lg1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    :cond_4
    const-string v0, "login_required"

    invoke-static {v0, p0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lg1/c;

    if-nez p1, :cond_5

    move-object p1, v2

    :cond_5
    invoke-direct {v0, p0, p1}, Lg1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Lg1/c;

    if-nez p1, :cond_7

    move-object p1, v2

    :cond_7
    invoke-direct {v0, p0, p1}, Lg1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final J0(Lg1/c;)V
    .locals 1

    iget-object v0, p0, Lj1/c0;->k:Li1/a;

    invoke-interface {v0, p1}, Li1/a;->a(Lf1/b;)V

    return-void
.end method

.method public final n2(Lj1/g;)Z
    .locals 13

    const-string v0, "state"

    invoke-virtual {p1}, Lj1/g;->a()Z

    move-result v1

    sget-object v2, Lj1/c0;->t:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v1, :cond_1

    iget v1, p1, Lj1/g;->a:I

    const/4 v4, -0x1

    if-ne v1, v4, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "g"

    const-string v0, "Result is invalid: Either the received Intent is null or the Request Code doesn\'t match the expected one."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "The Authorize Result is invalid."

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lj1/g;->a()Z

    move-result v1

    const/4 v4, 0x1

    iget-object v5, p0, Lj1/c0;->k:Li1/a;

    if-eqz v1, :cond_2

    new-instance p1, Lg1/c;

    const-string v0, "a0.authentication_canceled"

    const-string v1, "The user closed the browser app and the authentication was canceled."

    invoke-direct {p1, v0, v1}, Lg1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, p1}, Li1/a;->a(Lf1/b;)V

    return v4

    :cond_2
    const/4 v1, 0x0

    iget-object p1, p1, Lj1/g;->b:Landroid/content/Intent;

    if-nez p1, :cond_3

    move-object p1, v1

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    :goto_1
    if-nez p1, :cond_4

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    goto :goto_7

    :cond_4
    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object p1

    :goto_2
    if-nez p1, :cond_6

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    goto :goto_7

    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_7

    const-string v6, "&"

    invoke-virtual {p1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_7
    new-array p1, v3, [Ljava/lang/String;

    :goto_3
    new-instance v6, Ljava/util/HashMap;

    array-length v7, p1

    invoke-direct {v6, v7}, Ljava/util/HashMap;-><init>(I)V

    array-length v7, p1

    move v8, v3

    :goto_4
    if-ge v8, v7, :cond_b

    aget-object v9, p1, v8

    const-string v10, "="

    invoke-virtual {v9, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    if-lez v10, :cond_8

    invoke-virtual {v9, v3, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    goto :goto_5

    :cond_8
    move-object v11, v9

    :goto_5
    if-lez v10, :cond_9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v12

    add-int/lit8 v10, v10, 0x1

    if-le v12, v10, :cond_9

    invoke-virtual {v9, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_6

    :cond_9
    move-object v9, v1

    :goto_6
    if-eqz v9, :cond_a

    invoke-virtual {v6, v11, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_b
    move-object p1, v6

    :goto_7
    const-string v1, "getValuesFromUri(result.intentData)"

    invoke-static {p1, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_c

    const-string p1, "The response didn\'t contain any of these values: code, state"

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_c
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "The parsed CallbackURI contains the following parameters: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    const-string v1, "error"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "error_description"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2}, Lj1/c0;->Q2(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lj1/c0;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lj1/y;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lg1/c; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lj1/c0;->q:Lj1/h0;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    const-string v1, "code"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v2, Landroidx/fragment/app/k;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p0}, Landroidx/fragment/app/k;-><init>(ILjava/lang/Object;)V

    iget-object v3, v0, Lj1/h0;->a:Lg1/b;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "authorizationCode"

    invoke-static {p1, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "codeVerifier"

    iget-object v6, v0, Lj1/h0;->b:Ljava/lang/String;

    invoke-static {v6, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "redirectUri"

    iget-object v7, v0, Lj1/h0;->c:Ljava/lang/String;

    invoke-static {v7, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget v5, Lg1/d;->b:I

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v8, Lg1/d;

    invoke-direct {v8, v5}, Lg1/d;-><init>(Ljava/util/Map;)V

    iget-object v5, v3, Lg1/b;->a:Lf1/a;

    iget-object v9, v5, Lf1/a;->a:Ljava/lang/String;

    const-string v10, "clientId"

    invoke-static {v9, v10}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "client_id"

    invoke-virtual {v8, v10, v9}, Lg1/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "grant_type"

    const-string v10, "authorization_code"

    invoke-virtual {v8, v9, v10}, Lg1/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v1, p1}, Lg1/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "redirect_uri"

    invoke-virtual {v8, p1, v7}, Lg1/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "code_verifier"

    invoke-virtual {v8, p1, v6}, Lg1/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v8, Lg1/d;->a:Ljava/util/LinkedHashMap;

    invoke-static {p1}, La3/j;->b3(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    sget-object v1, Lt3/s;->j:[C

    iget-object v1, v5, Lf1/a;->b:Lt3/s;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lf2/e;->q(Ljava/lang/String;)Lt3/s;

    move-result-object v1

    invoke-virtual {v1}, Lt3/s;->f()Lt3/r;

    move-result-object v1

    const-string v5, "oauth"

    invoke-virtual {v1, v5}, Lt3/r;->a(Ljava/lang/String;)V

    const-string v5, "token"

    invoke-virtual {v1, v5}, Lt3/r;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lt3/r;->b()Lt3/s;

    move-result-object v1

    new-instance v5, Lcom/auth0/android/request/internal/e;

    const-class v6, Lcom/auth0/android/result/Credentials;

    iget-object v7, v3, Lg1/b;->c:Lm2/m;

    invoke-direct {v5, v6, v7}, Lcom/auth0/android/request/internal/e;-><init>(Ljava/lang/Class;Lm2/m;)V

    iget-object v3, v3, Lg1/b;->b:Lcom/auth0/android/request/internal/l;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "url"

    iget-object v1, v1, Lt3/s;->h:Ljava/lang/String;

    invoke-static {v1, v6}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lk1/b;->c:Lk1/b;

    iget-object v7, v3, Lcom/auth0/android/request/internal/l;->b:Lg1/a;

    invoke-virtual {v3, v6, v1, v5, v7}, Lcom/auth0/android/request/internal/l;->a(Lk1/d;Ljava/lang/String;Lcom/auth0/android/request/internal/e;Lg1/a;)Lcom/auth0/android/request/internal/a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/auth0/android/request/internal/a;->b(Ljava/util/Map;)V

    iget-object p1, v0, Lj1/h0;->e:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v3, v0}, Lcom/auth0/android/request/internal/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v1, v2}, Lcom/auth0/android/request/internal/a;->d(Li1/a;)V

    return v4

    :catch_0
    move-exception p1

    invoke-interface {v5, p1}, Li1/a;->a(Lf1/b;)V

    return v4
.end method
