.class public final Lc1/j;
.super Lc3/h;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public C1(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot allocate "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public R(Lo/f;Lo/c;)Z
    .locals 2

    sget-object v0, Lo/c;->b:Lo/c;

    monitor-enter p1

    :try_start_0
    iget-object v1, p1, Lo/f;->b:Lo/c;

    if-ne v1, p2, :cond_0

    iput-object v0, p1, Lo/f;->b:Lo/c;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public S(Lo/f;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lo/f;->a:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lo/f;->a:Ljava/lang/Object;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public T(Lo/f;Lo/e;Lo/e;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lo/f;->c:Lo/e;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lo/f;->c:Lo/e;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public X1(Lo/e;Lo/e;)V
    .locals 0

    iput-object p2, p1, Lo/e;->b:Lo/e;

    return-void
.end method

.method public Y1(Lo/e;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lo/e;->a:Ljava/lang/Thread;

    return-void
.end method
