.class public final Lh1/c;
.super Lh1/a;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lg1/b;Lh1/e;)V
    .locals 3

    new-instance v0, Lz0/c;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lz0/c;-><init>(I)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    const-string v2, "newSingleThreadExecutor()"

    invoke-static {v1, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, v0}, Lh1/a;-><init>(Lg1/b;Lh1/e;Lz0/c;)V

    iput-object v1, p0, Lh1/c;->d:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    const-string v0, "com.auth0.access_token"

    iget-object v1, p0, Lh1/a;->b:Lh1/f;

    move-object v2, v1

    check-cast v2, Lh1/e;

    invoke-virtual {v2, v0}, Lh1/e;->a(Ljava/lang/String;)V

    const-string v0, "com.auth0.refresh_token"

    move-object v2, v1

    check-cast v2, Lh1/e;

    invoke-virtual {v2, v0}, Lh1/e;->a(Ljava/lang/String;)V

    const-string v0, "com.auth0.id_token"

    move-object v2, v1

    check-cast v2, Lh1/e;

    invoke-virtual {v2, v0}, Lh1/e;->a(Ljava/lang/String;)V

    const-string v0, "com.auth0.token_type"

    move-object v2, v1

    check-cast v2, Lh1/e;

    invoke-virtual {v2, v0}, Lh1/e;->a(Ljava/lang/String;)V

    const-string v0, "com.auth0.expires_at"

    move-object v2, v1

    check-cast v2, Lh1/e;

    invoke-virtual {v2, v0}, Lh1/e;->a(Ljava/lang/String;)V

    const-string v0, "com.auth0.scope"

    move-object v2, v1

    check-cast v2, Lh1/e;

    invoke-virtual {v2, v0}, Lh1/e;->a(Ljava/lang/String;)V

    const-string v0, "com.auth0.cache_expires_at"

    check-cast v1, Lh1/e;

    invoke-virtual {v1, v0}, Lh1/e;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final c(Lcom/auth0/android/result/Credentials;)V
    .locals 4

    const-string v0, "credentials"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lh1/d;

    const/4 v0, 0x0

    const-string v1, "Credentials must have a valid date of expiration and a valid access_token or id_token value."

    invoke-direct {p1, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lh1/a;->b:Lh1/f;

    check-cast v1, Lh1/e;

    const-string v2, "com.auth0.access_token"

    invoke-virtual {v1, v2, v0}, Lh1/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->d()Ljava/lang/String;

    move-result-object v0

    const-string v2, "com.auth0.refresh_token"

    invoke-virtual {v1, v2, v0}, Lh1/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->c()Ljava/lang/String;

    move-result-object v0

    const-string v2, "com.auth0.id_token"

    invoke-virtual {v1, v2, v0}, Lh1/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->f()Ljava/lang/String;

    move-result-object v0

    const-string v2, "com.auth0.token_type"

    invoke-virtual {v1, v2, v0}, Lh1/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->b()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v2, "com.auth0.expires_at"

    invoke-virtual {v1, v2, v0}, Lh1/e;->c(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->e()Ljava/lang/String;

    move-result-object v0

    const-string v2, "com.auth0.scope"

    invoke-virtual {v1, v2, v0}, Lh1/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/auth0/android/result/Credentials;->b()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string v0, "com.auth0.cache_expires_at"

    invoke-virtual {v1, v0, p1}, Lh1/e;->c(Ljava/lang/String;Ljava/lang/Long;)V

    return-void
.end method
