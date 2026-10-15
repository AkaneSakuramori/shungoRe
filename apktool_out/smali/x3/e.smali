.class public final Lx3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lx3/j;

.field public final b:Lt3/n;

.field public final c:Lx3/f;

.field public final d:Ly3/d;

.field public e:Z

.field public f:Z

.field public final g:Lx3/l;


# direct methods
.method public constructor <init>(Lx3/j;Lt3/n;Lx3/f;Ly3/d;)V
    .locals 1

    const-string v0, "eventListener"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/e;->a:Lx3/j;

    iput-object p2, p0, Lx3/e;->b:Lt3/n;

    iput-object p3, p0, Lx3/e;->c:Lx3/f;

    iput-object p4, p0, Lx3/e;->d:Ly3/d;

    invoke-interface {p4}, Ly3/d;->h()Lx3/l;

    move-result-object p1

    iput-object p1, p0, Lx3/e;->g:Lx3/l;

    return-void
.end method


# virtual methods
.method public final a(ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    if-eqz p3, :cond_0

    invoke-virtual {p0, p3}, Lx3/e;->d(Ljava/io/IOException;)V

    :cond_0
    const-string v0, "call"

    iget-object v1, p0, Lx3/e;->b:Lt3/n;

    iget-object v2, p0, Lx3/e;->a:Lx3/j;

    if-eqz p2, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    if-eqz p1, :cond_4

    if-eqz p3, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    :goto_1
    invoke-virtual {v2, p0, p2, p1, p3}, Lx3/j;->h(Lx3/e;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lt3/b0;)Lt3/c0;
    .locals 5

    iget-object v0, p0, Lx3/e;->d:Ly3/d;

    :try_start_0
    const-string v1, "Content-Type"

    invoke-static {p1, v1}, Lt3/b0;->a(Lt3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1}, Ly3/d;->f(Lt3/b0;)J

    move-result-wide v2

    invoke-interface {v0, p1}, Ly3/d;->d(Lt3/b0;)Lf4/w;

    move-result-object p1

    new-instance v0, Lx3/d;

    invoke-direct {v0, p0, p1, v2, v3}, Lx3/d;-><init>(Lx3/e;Lf4/w;J)V

    new-instance p1, Lt3/c0;

    new-instance v4, Lf4/q;

    invoke-direct {v4, v0}, Lf4/q;-><init>(Lf4/w;)V

    invoke-direct {p1, v1, v2, v3, v4}, Lt3/c0;-><init>(Ljava/lang/String;JLf4/q;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lx3/e;->b:Lt3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "call"

    iget-object v1, p0, Lx3/e;->a:Lx3/j;

    invoke-static {v1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lx3/e;->d(Ljava/io/IOException;)V

    throw p1
.end method

.method public final c(Z)Lt3/a0;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx3/e;->d:Ly3/d;

    invoke-interface {v0, p1}, Ly3/d;->e(Z)Lt3/a0;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p0, p1, Lt3/a0;->m:Lx3/e;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lx3/e;->b:Lt3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "call"

    iget-object v1, p0, Lx3/e;->a:Lx3/j;

    invoke-static {v1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lx3/e;->d(Ljava/io/IOException;)V

    throw p1
.end method

.method public final d(Ljava/io/IOException;)V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx3/e;->f:Z

    iget-object v1, p0, Lx3/e;->c:Lx3/f;

    invoke-virtual {v1, p1}, Lx3/f;->c(Ljava/io/IOException;)V

    iget-object v1, p0, Lx3/e;->d:Ly3/d;

    invoke-interface {v1}, Ly3/d;->h()Lx3/l;

    move-result-object v1

    iget-object v2, p0, Lx3/e;->a:Lx3/j;

    monitor-enter v1

    :try_start_0
    const-string v3, "call"

    invoke-static {v2, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, p1, La4/h0;

    if-eqz v3, :cond_2

    move-object v3, p1

    check-cast v3, La4/h0;

    iget-object v3, v3, La4/h0;->b:La4/b;

    sget-object v4, La4/b;->g:La4/b;

    if-ne v3, v4, :cond_0

    iget p1, v1, Lx3/l;->n:I

    add-int/2addr p1, v0

    iput p1, v1, Lx3/l;->n:I

    if-le p1, v0, :cond_4

    iput-boolean v0, v1, Lx3/l;->j:Z

    iget p1, v1, Lx3/l;->l:I

    add-int/2addr p1, v0

    iput p1, v1, Lx3/l;->l:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    check-cast p1, La4/h0;

    iget-object p1, p1, La4/h0;->b:La4/b;

    sget-object v3, La4/b;->h:La4/b;

    if-ne p1, v3, :cond_1

    iget-boolean p1, v2, Lx3/j;->q:Z

    if-nez p1, :cond_4

    :cond_1
    iput-boolean v0, v1, Lx3/l;->j:Z

    iget p1, v1, Lx3/l;->l:I

    add-int/2addr p1, v0

    iput p1, v1, Lx3/l;->l:I

    goto :goto_0

    :cond_2
    iget-object v3, v1, Lx3/l;->g:La4/t;

    if-eqz v3, :cond_3

    instance-of v3, p1, La4/a;

    if-eqz v3, :cond_4

    :cond_3
    iput-boolean v0, v1, Lx3/l;->j:Z

    iget v3, v1, Lx3/l;->m:I

    if-nez v3, :cond_4

    iget-object v2, v2, Lx3/j;->b:Lt3/w;

    iget-object v3, v1, Lx3/l;->b:Lt3/e0;

    invoke-static {v2, v3, p1}, Lx3/l;->d(Lt3/w;Lt3/e0;Ljava/io/IOException;)V

    iget p1, v1, Lx3/l;->l:I

    add-int/2addr p1, v0

    iput p1, v1, Lx3/l;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw p1
.end method
