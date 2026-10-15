.class public final Ly3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt3/t;


# instance fields
.field public final a:Lt3/k;


# direct methods
.method public constructor <init>(Lt3/n;)V
    .locals 1

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/a;->a:Lt3/k;

    return-void
.end method


# virtual methods
.method public final a(Ly3/f;)Lt3/b0;
    .locals 13

    iget-object v0, p1, Ly3/f;->e:Li/w;

    invoke-virtual {v0}, Li/w;->f()Lt3/y;

    move-result-object v1

    iget-object v2, v0, Li/w;->e:Ljava/lang/Object;

    check-cast v2, Lt3/z;

    const-wide/16 v3, -0x1

    const-string v5, "Content-Type"

    const-string v6, "Content-Length"

    if-eqz v2, :cond_2

    iget-object v7, v2, Lt3/z;->a:Lt3/u;

    if-eqz v7, :cond_0

    iget-object v7, v7, Lt3/u;->a:Ljava/lang/String;

    invoke-virtual {v1, v5, v7}, Lt3/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget v2, v2, Lt3/z;->b:I

    int-to-long v7, v2

    cmp-long v2, v7, v3

    const-string v9, "Transfer-Encoding"

    if-eqz v2, :cond_1

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Lt3/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lt3/y;->c:Lt3/p;

    invoke-virtual {v2, v9}, Lt3/p;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v2, "chunked"

    invoke-virtual {v1, v9, v2}, Lt3/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lt3/y;->c:Lt3/p;

    invoke-virtual {v2, v6}, Lt3/p;->c(Ljava/lang/String;)V

    :cond_2
    :goto_0
    iget-object v2, v0, Li/w;->d:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Lt3/q;

    const-string v8, "Host"

    invoke-virtual {v7, v8}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x0

    iget-object v10, v0, Li/w;->b:Ljava/lang/Object;

    if-nez v7, :cond_3

    move-object v7, v10

    check-cast v7, Lt3/s;

    invoke-static {v7, v9}, Lu3/b;->v(Lt3/s;Z)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v8, v7}, Lt3/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    move-object v7, v2

    check-cast v7, Lt3/q;

    const-string v8, "Connection"

    invoke-virtual {v7, v8}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    const-string v7, "Keep-Alive"

    invoke-virtual {v1, v8, v7}, Lt3/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    move-object v7, v2

    check-cast v7, Lt3/q;

    const-string v8, "Accept-Encoding"

    invoke-virtual {v7, v8}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v11, "gzip"

    if-nez v7, :cond_5

    move-object v7, v2

    check-cast v7, Lt3/q;

    const-string v12, "Range"

    invoke-virtual {v7, v12}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-virtual {v1, v8, v11}, Lt3/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v9, 0x1

    :cond_5
    check-cast v10, Lt3/s;

    iget-object v7, p0, Ly3/a;->a:Lt3/k;

    move-object v8, v7

    check-cast v8, Lt3/n;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "url"

    invoke-static {v10, v8}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lt3/q;

    const-string v8, "User-Agent"

    invoke-virtual {v2, v8}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    const-string v2, "okhttp/4.12.0"

    invoke-virtual {v1, v8, v2}, Lt3/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v1}, Lt3/y;->b()Li/w;

    move-result-object v1

    invoke-virtual {p1, v1}, Ly3/f;->b(Li/w;)Lt3/b0;

    move-result-object p1

    iget-object v1, p1, Lt3/b0;->g:Lt3/q;

    invoke-static {v7, v10, v1}, Ly3/e;->b(Lt3/k;Lt3/s;Lt3/q;)V

    invoke-virtual {p1}, Lt3/b0;->e()Lt3/a0;

    move-result-object v2

    iput-object v0, v2, Lt3/a0;->a:Li/w;

    if-eqz v9, :cond_7

    const-string v0, "Content-Encoding"

    invoke-static {p1, v0}, Lt3/b0;->a(Lt3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-static {p1}, Ly3/e;->a(Lt3/b0;)Z

    move-result v7

    if-eqz v7, :cond_7

    iget-object v7, p1, Lt3/b0;->h:Lt3/d0;

    if-eqz v7, :cond_7

    new-instance v8, Lf4/l;

    check-cast v7, Lt3/c0;

    iget-object v7, v7, Lt3/c0;->d:Lf4/i;

    invoke-direct {v8, v7}, Lf4/l;-><init>(Lf4/w;)V

    invoke-virtual {v1}, Lt3/q;->c()Lt3/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lt3/p;->c(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Lt3/p;->c(Ljava/lang/String;)V

    invoke-virtual {v1}, Lt3/p;->b()Lt3/q;

    move-result-object v0

    invoke-virtual {v0}, Lt3/q;->c()Lt3/p;

    move-result-object v0

    iput-object v0, v2, Lt3/a0;->f:Lt3/p;

    invoke-static {p1, v5}, Lt3/b0;->a(Lt3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lt3/c0;

    new-instance v1, Lf4/q;

    invoke-direct {v1, v8}, Lf4/q;-><init>(Lf4/w;)V

    invoke-direct {v0, p1, v3, v4, v1}, Lt3/c0;-><init>(Ljava/lang/String;JLf4/q;)V

    iput-object v0, v2, Lt3/a0;->g:Lt3/d0;

    :cond_7
    invoke-virtual {v2}, Lt3/a0;->a()Lt3/b0;

    move-result-object p1

    return-object p1
.end method
