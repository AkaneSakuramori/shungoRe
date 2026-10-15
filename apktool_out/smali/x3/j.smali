.class public final Lx3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt3/d;


# instance fields
.field public final b:Lt3/w;

.field public final c:Li/w;

.field public final d:Z

.field public final e:Lx3/m;

.field public final f:Lt3/n;

.field public final g:Lx3/i;

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public i:Ljava/lang/Object;

.field public j:Lx3/f;

.field public k:Lx3/l;

.field public l:Z

.field public m:Lx3/e;

.field public n:Z

.field public o:Z

.field public p:Z

.field public volatile q:Z

.field public volatile r:Lx3/e;

.field public volatile s:Lx3/l;


# direct methods
.method public constructor <init>(Lt3/w;Li/w;Z)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalRequest"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/j;->b:Lt3/w;

    iput-object p2, p0, Lx3/j;->c:Li/w;

    iput-boolean p3, p0, Lx3/j;->d:Z

    iget-object p2, p1, Lt3/w;->c:Lc/a;

    iget-object p2, p2, Lc/a;->a:Ljava/lang/Object;

    check-cast p2, Lx3/m;

    iput-object p2, p0, Lx3/j;->e:Lx3/m;

    iget-object p1, p1, Lt3/w;->f:Ll0/b;

    iget-object p1, p1, Ll0/b;->a:Ljava/lang/Object;

    check-cast p1, Lt3/n;

    sget-object p2, Lu3/b;->a:[B

    const-string p2, "$this_asFactory"

    invoke-static {p1, p2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lx3/j;->f:Lt3/n;

    new-instance p1, Lx3/i;

    invoke-direct {p1, p0}, Lx3/i;-><init>(Lx3/j;)V

    const/4 p2, 0x0

    int-to-long p2, p2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2, p3, v0}, Lf4/y;->g(JLjava/util/concurrent/TimeUnit;)Lf4/y;

    iput-object p1, p0, Lx3/j;->g:Lx3/i;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lx3/j;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx3/j;->p:Z

    return-void
.end method

.method public static final a(Lx3/j;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v1, p0, Lx3/j;->q:Z

    if-eqz v1, :cond_0

    const-string v1, "canceled "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lx3/j;->d:Z

    if-eqz v1, :cond_1

    const-string v1, "web socket"

    goto :goto_1

    :cond_1
    const-string v1, "call"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lx3/j;->c:Li/w;

    iget-object p0, p0, Li/w;->b:Ljava/lang/Object;

    check-cast p0, Lt3/s;

    invoke-virtual {p0}, Lt3/s;->g()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lx3/l;)V
    .locals 2

    sget-object v0, Lu3/b;->a:[B

    iget-object v0, p0, Lx3/j;->k:Lx3/l;

    if-nez v0, :cond_0

    iput-object p1, p0, Lx3/j;->k:Lx3/l;

    iget-object p1, p1, Lx3/l;->p:Ljava/util/ArrayList;

    new-instance v0, Lx3/h;

    iget-object v1, p0, Lx3/j;->i:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Lx3/h;-><init>(Lx3/j;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    sget-object v0, Lu3/b;->a:[B

    iget-object v0, p0, Lx3/j;->k:Lx3/l;

    if-eqz v0, :cond_3

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lx3/j;->j()Ljava/net/Socket;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lx3/j;->k:Lx3/l;

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lu3/b;->d(Ljava/net/Socket;)V

    :cond_0
    iget-object v0, p0, Lx3/j;->f:Lt3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_3
    :goto_0
    iget-boolean v0, p0, Lx3/j;->l:Z

    if-eqz v0, :cond_4

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lx3/j;->g:Lx3/i;

    invoke-virtual {v0}, Lf4/e;->i()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_6

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_6
    :goto_2
    if-eqz p1, :cond_7

    iget-object p1, p0, Lx3/j;->f:Lt3/n;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lx3/j;->f:Lt3/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_3
    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lx3/j;

    iget-boolean v1, p0, Lx3/j;->d:Z

    iget-object v2, p0, Lx3/j;->b:Lt3/w;

    iget-object v3, p0, Lx3/j;->c:Li/w;

    invoke-direct {v0, v2, v3, v1}, Lx3/j;-><init>(Lt3/w;Li/w;Z)V

    return-object v0
.end method

.method public final d()V
    .locals 1

    iget-boolean v0, p0, Lx3/j;->q:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lx3/j;->q:Z

    iget-object v0, p0, Lx3/j;->r:Lx3/e;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lx3/e;->d:Ly3/d;

    invoke-interface {v0}, Ly3/d;->cancel()V

    :cond_1
    iget-object v0, p0, Lx3/j;->s:Lx3/l;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lx3/l;->c:Ljava/net/Socket;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lu3/b;->d(Ljava/net/Socket;)V

    :cond_2
    iget-object v0, p0, Lx3/j;->f:Lt3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final e()Lt3/b0;
    .locals 3

    iget-object v0, p0, Lx3/j;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx3/j;->g:Lx3/i;

    invoke-virtual {v0}, Lf4/e;->h()V

    sget-object v0, Lb4/l;->a:Lb4/l;

    sget-object v0, Lb4/l;->a:Lb4/l;

    invoke-virtual {v0}, Lb4/l;->g()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lx3/j;->i:Ljava/lang/Object;

    iget-object v0, p0, Lx3/j;->f:Lt3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Lx3/j;->b:Lt3/w;

    iget-object v0, v0, Lt3/w;->b:Lt3/l;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, v0, Lt3/l;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v0

    invoke-virtual {p0}, Lx3/j;->g()Lt3/b0;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, Lx3/j;->b:Lt3/w;

    iget-object v1, v1, Lt3/w;->b:Lt3/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lt3/l;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v1, v2, p0}, Lt3/l;->a(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object v1, p0, Lx3/j;->b:Lt3/w;

    iget-object v1, v1, Lt3/w;->b:Lt3/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lt3/l;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v1, v2, p0}, Lt3/l;->a(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    throw v0

    :cond_0
    const-string v0, "Already Executed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final f(Z)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lx3/j;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lx3/j;->r:Lx3/e;

    if-eqz p1, :cond_0

    iget-object v1, p1, Lx3/e;->d:Ly3/d;

    invoke-interface {v1}, Ly3/d;->cancel()V

    const/4 v1, 0x1

    iget-object v2, p1, Lx3/e;->a:Lx3/j;

    invoke-virtual {v2, p1, v1, v1, v0}, Lx3/j;->h(Lx3/e;ZZLjava/io/IOException;)Ljava/io/IOException;

    :cond_0
    iput-object v0, p0, Lx3/j;->m:Lx3/e;

    return-void

    :cond_1
    :try_start_1
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final g()Lt3/b0;
    .locals 11

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lx3/j;->b:Lt3/w;

    iget-object v0, v0, Lt3/w;->d:Ljava/util/List;

    invoke-static {v0, v2}, La3/l;->e3(Ljava/util/List;Ljava/util/ArrayList;)V

    new-instance v0, Ly3/g;

    iget-object v1, p0, Lx3/j;->b:Lt3/w;

    invoke-direct {v0, v1}, Ly3/g;-><init>(Lt3/w;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ly3/a;

    iget-object v1, p0, Lx3/j;->b:Lt3/w;

    iget-object v1, v1, Lt3/w;->k:Lt3/n;

    invoke-direct {v0, v1}, Ly3/a;-><init>(Lt3/n;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lv3/a;

    iget-object v1, p0, Lx3/j;->b:Lt3/w;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lx3/a;->a:Lx3/a;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lx3/j;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lx3/j;->b:Lt3/w;

    iget-object v0, v0, Lt3/w;->e:Ljava/util/List;

    invoke-static {v0, v2}, La3/l;->e3(Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_0
    new-instance v0, Ly3/b;

    iget-boolean v1, p0, Lx3/j;->d:Z

    invoke-direct {v0, v1}, Ly3/b;-><init>(Z)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, Ly3/f;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lx3/j;->c:Li/w;

    iget-object v0, p0, Lx3/j;->b:Lt3/w;

    iget v6, v0, Lt3/w;->w:I

    iget v7, v0, Lt3/w;->x:I

    iget v8, v0, Lt3/w;->y:I

    move-object v0, v9

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Ly3/f;-><init>(Lx3/j;Ljava/util/List;ILx3/e;Li/w;III)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lx3/j;->c:Li/w;

    invoke-virtual {v9, v2}, Ly3/f;->b(Li/w;)Lt3/b0;

    move-result-object v2

    iget-boolean v3, p0, Lx3/j;->q:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    invoke-virtual {p0, v0}, Lx3/j;->i(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v2

    :cond_1
    :try_start_1
    invoke-static {v2}, Lu3/b;->c(Ljava/io/Closeable;)V

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v1

    const/4 v2, 0x1

    :try_start_2
    invoke-virtual {p0, v1}, Lx3/j;->i(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type kotlin.Throwable"

    invoke-static {v1, v3}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    move v10, v2

    move-object v2, v1

    move v1, v10

    :goto_0
    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Lx3/j;->i(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_2
    throw v2
.end method

.method public final h(Lx3/e;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    const-string v0, "exchange"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx3/j;->r:Lx3/e;

    invoke-static {p1, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p4

    :cond_0
    monitor-enter p0

    const/4 p1, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    iget-boolean v1, p0, Lx3/j;->n:Z

    if-nez v1, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz p3, :cond_7

    iget-boolean v1, p0, Lx3/j;->o:Z

    if-eqz v1, :cond_7

    :cond_2
    if-eqz p2, :cond_3

    iput-boolean v0, p0, Lx3/j;->n:Z

    :cond_3
    if-eqz p3, :cond_4

    iput-boolean v0, p0, Lx3/j;->o:Z

    :cond_4
    iget-boolean p2, p0, Lx3/j;->n:Z

    if-nez p2, :cond_5

    iget-boolean p3, p0, Lx3/j;->o:Z

    if-nez p3, :cond_5

    move p3, p1

    goto :goto_1

    :cond_5
    move p3, v0

    :goto_1
    if-nez p2, :cond_6

    iget-boolean p2, p0, Lx3/j;->o:Z

    if-nez p2, :cond_6

    iget-boolean p2, p0, Lx3/j;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_6

    move v0, p1

    :cond_6
    move p2, v0

    move v0, p3

    goto :goto_3

    :goto_2
    monitor-exit p0

    throw p1

    :cond_7
    move p2, v0

    :goto_3
    monitor-exit p0

    if-eqz v0, :cond_8

    const/4 p3, 0x0

    iput-object p3, p0, Lx3/j;->r:Lx3/e;

    iget-object p3, p0, Lx3/j;->k:Lx3/l;

    if-eqz p3, :cond_8

    monitor-enter p3

    :try_start_1
    iget v0, p3, Lx3/l;->m:I

    add-int/2addr v0, p1

    iput v0, p3, Lx3/l;->m:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p3

    goto :goto_4

    :catchall_1
    move-exception p1

    monitor-exit p3

    throw p1

    :cond_8
    :goto_4
    if-eqz p2, :cond_9

    invoke-virtual {p0, p4}, Lx3/j;->c(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :cond_9
    return-object p4
.end method

.method public final i(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lx3/j;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lx3/j;->p:Z

    iget-boolean v0, p0, Lx3/j;->n:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lx3/j;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lx3/j;->c(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :cond_1
    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final j()Ljava/net/Socket;
    .locals 7

    iget-object v0, p0, Lx3/j;->k:Lx3/l;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    sget-object v1, Lu3/b;->a:[B

    iget-object v1, v0, Lx3/l;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/Reference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, p0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_1
    if-eq v3, v5, :cond_6

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, Lx3/j;->k:Lx3/l;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    iput-wide v3, v0, Lx3/l;->q:J

    iget-object v1, p0, Lx3/j;->e:Lx3/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lu3/b;->a:[B

    iget-boolean v3, v0, Lx3/l;->j:Z

    iget-object v4, v1, Lx3/m;->c:Lw3/c;

    if-nez v3, :cond_3

    iget v3, v1, Lx3/m;->a:I

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    const-wide/16 v5, 0x0

    iget-object v0, v1, Lx3/m;->d:Lw3/b;

    invoke-virtual {v4, v0, v5, v6}, Lw3/c;->c(Lw3/a;J)V

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v2, 0x1

    iput-boolean v2, v0, Lx3/l;->j:Z

    iget-object v1, v1, Lx3/m;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v4}, Lw3/c;->a()V

    :cond_4
    iget-object v0, v0, Lx3/l;->d:Ljava/net/Socket;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    return-object v0

    :cond_5
    :goto_3
    return-object v2

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
