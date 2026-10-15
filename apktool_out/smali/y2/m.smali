.class public final Ly2/m;
.super Lx2/d;
.source "SourceFile"


# instance fields
.field public c:I

.field public final d:Ly2/i;

.field public final e:Z

.field public final f:Ljava/lang/Process;

.field public final g:Ly2/l;

.field public final h:Ly2/k;

.field public final i:Ly2/k;


# direct methods
.method public constructor <init>(Ly2/a;Ljava/lang/Process;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ly2/m;->c:I

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Ly2/a;->c(I)Z

    move-result v0

    iput-boolean v0, p0, Ly2/m;->e:Z

    iput-object p2, p0, Ly2/m;->f:Ljava/lang/Process;

    new-instance v0, Ly2/l;

    invoke-virtual {p2}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    instance-of v2, v1, Ljava/io/BufferedOutputStream;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/io/BufferedOutputStream;

    invoke-direct {v2, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v1, v2

    :goto_0
    invoke-direct {v0, v1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Ly2/m;->g:Ly2/l;

    new-instance v0, Ly2/k;

    invoke-virtual {p2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ly2/k;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ly2/m;->h:Ly2/k;

    new-instance v0, Ly2/k;

    invoke-virtual {p2}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object p2

    invoke-direct {v0, p2}, Ly2/k;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ly2/m;->i:Ly2/k;

    new-instance p2, Ly2/i;

    invoke-direct {p2}, Ljava/util/concurrent/AbstractExecutorService;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p2, Ly2/i;->b:Z

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p2, Ly2/i;->c:Ljava/util/ArrayDeque;

    const/4 v0, 0x0

    iput-object v0, p2, Ly2/i;->d:Ljava/util/concurrent/FutureTask;

    iput-object p2, p0, Ly2/m;->d:Ly2/i;

    new-instance v0, Ly2/j;

    invoke-direct {v0, p0}, Ly2/j;-><init>(Ly2/m;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2

    :try_start_0
    iget-wide v0, p1, Ly2/a;->a:J

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p2, v0, v1, p1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ly2/m;->c:I
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    goto :goto_3

    :goto_1
    :try_start_1
    new-instance p2, Ljava/io/IOException;

    const-string v0, "Shell check interrupted"

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_2
    new-instance p2, Ljava/io/IOException;

    const-string v0, "Shell check timeout"

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p2, p1, Ljava/io/IOException;

    if-eqz p2, :cond_1

    check-cast p1, Ljava/io/IOException;

    throw p1

    :cond_1
    new-instance p2, Ljava/io/IOException;

    const-string v0, "Unknown ExecutionException"

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_4
    iget-object p2, p0, Ly2/m;->d:Ly2/i;

    invoke-virtual {p2}, Ly2/i;->shutdownNow()Ljava/util/List;

    invoke-virtual {p0}, Ly2/m;->t()V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget v0, p0, Ly2/m;->c:I

    if-gez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ly2/m;->d:Ly2/i;

    invoke-virtual {v0}, Ly2/i;->shutdownNow()Ljava/util/List;

    invoke-virtual {p0}, Ly2/m;->t()V

    return-void
.end method

.method public final declared-synchronized h(Lx2/c;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget v0, p0, Ly2/m;->c:I

    if-ltz v0, :cond_0

    iget-object v0, p0, Ly2/m;->h:Ly2/k;

    invoke-static {v0}, Lc3/h;->j0(Ly2/k;)V

    iget-object v0, p0, Ly2/m;->i:Ly2/k;

    invoke-static {v0}, Lc3/h;->j0(Ly2/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Ly2/m;->g:Ly2/l;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    iget-object v0, p0, Ly2/m;->g:Ly2/l;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Ly2/m;->g:Ly2/l;

    iget-object v1, p0, Ly2/m;->h:Ly2/k;

    iget-object v2, p0, Ly2/m;->i:Ly2/k;

    check-cast p1, Ly2/c;

    invoke-virtual {p1, v0, v1, v2}, Ly2/c;->R2(Ly2/l;Ly2/k;Ly2/k;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    :try_start_3
    invoke-virtual {p0}, Ly2/m;->t()V

    new-instance p1, Ly2/n;

    invoke-direct {p1}, Ly2/n;-><init>()V

    throw p1

    :cond_0
    new-instance p1, Ly2/n;

    invoke-direct {p1}, Ly2/n;-><init>()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final t()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Ly2/m;->c:I

    :try_start_0
    iget-object v0, p0, Ly2/m;->g:Ly2/l;

    invoke-virtual {v0}, Ly2/l;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    iget-object v0, p0, Ly2/m;->i:Ly2/k;

    invoke-virtual {v0}, Ly2/k;->a()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    iget-object v0, p0, Ly2/m;->h:Ly2/k;

    invoke-virtual {v0}, Ly2/k;->a()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    iget-object v0, p0, Ly2/m;->f:Ljava/lang/Process;

    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    return-void
.end method
