.class public final Lj1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/a;


# instance fields
.field public final synthetic b:Li1/a;

.field public final synthetic c:Lj1/c0;

.field public final synthetic d:Lcom/auth0/android/request/internal/k;


# direct methods
.method public constructor <init>(Lj1/b0;Lj1/c0;Lcom/auth0/android/request/internal/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/a0;->b:Li1/a;

    iput-object p2, p0, Lj1/a0;->c:Lj1/c0;

    iput-object p3, p0, Lj1/a0;->d:Lcom/auth0/android/request/internal/k;

    return-void
.end method


# virtual methods
.method public final a(Lf1/b;)V
    .locals 1

    check-cast p1, Lj1/l0;

    iget-object v0, p0, Lj1/a0;->b:Li1/a;

    invoke-interface {v0, p1}, Li1/a;->a(Lf1/b;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lj1/a;

    iget-object v0, p0, Lj1/a0;->b:Li1/a;

    const-string v1, "result"

    invoke-static {p1, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lj1/s;

    iget-object v2, p0, Lj1/a0;->c:Lj1/c0;

    iget-object v3, v2, Lj1/c0;->s:Ljava/lang/String;

    invoke-static {v3}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v4, v2, Lj1/c0;->p:Lg1/b;

    iget-object v4, v4, Lg1/b;->a:Lf1/a;

    iget-object v4, v4, Lf1/a;->a:Ljava/lang/String;

    invoke-direct {v1, v3, v4, p1}, Lj1/s;-><init>(Ljava/lang/String;Ljava/lang/String;Lj1/a;)V

    iget-object p1, v2, Lj1/c0;->m:Ljava/util/LinkedHashMap;

    const-string v3, "max_age"

    invoke-virtual {p1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v3}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lj1/s;->f:Ljava/lang/Object;

    :cond_0
    iget-object v2, v2, Lj1/c0;->r:Ljava/lang/Integer;

    iput-object v2, v1, Lj1/s;->g:Ljava/lang/Object;

    const-string v2, "nonce"

    invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iput-object v2, v1, Lj1/s;->d:Ljava/lang/Object;

    new-instance v2, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    iput-object v2, v1, Lj1/s;->h:Ljava/lang/Object;

    const-string v2, "organization"

    invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, v1, Lj1/s;->c:Ljava/lang/Object;

    :try_start_0
    iget-object p1, p0, Lj1/a0;->d:Lcom/auth0/android/request/internal/k;

    invoke-static {p1, v1}, Lc3/h;->K2(Lcom/auth0/android/request/internal/k;Lj1/s;)V

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Li1/a;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lj1/l0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-interface {v0, p1}, Li1/a;->a(Lf1/b;)V

    :goto_0
    return-void
.end method
