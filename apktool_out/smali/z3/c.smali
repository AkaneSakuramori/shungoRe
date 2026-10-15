.class public final Lz3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/u;


# instance fields
.field public final b:Lf4/k;

.field public c:Z

.field public final synthetic d:Lz3/h;


# direct methods
.method public constructor <init>(Lz3/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/c;->d:Lz3/h;

    new-instance v0, Lf4/k;

    iget-object p1, p1, Lz3/h;->d:Lf4/h;

    invoke-interface {p1}, Lf4/u;->b()Lf4/y;

    move-result-object p1

    invoke-direct {v0, p1}, Lf4/k;-><init>(Lf4/y;)V

    iput-object v0, p0, Lz3/c;->b:Lf4/k;

    return-void
.end method


# virtual methods
.method public final D(Lf4/g;J)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz3/c;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz3/c;->d:Lz3/h;

    iget-object v1, v0, Lz3/h;->d:Lf4/h;

    invoke-interface {v1, p2, p3}, Lf4/h;->j(J)Lf4/h;

    iget-object v0, v0, Lz3/h;->d:Lf4/h;

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lf4/h;->m(Ljava/lang/String;)Lf4/h;

    invoke-interface {v0, p1, p2, p3}, Lf4/u;->D(Lf4/g;J)V

    invoke-interface {v0, v1}, Lf4/h;->m(Ljava/lang/String;)Lf4/h;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Lf4/y;
    .locals 1

    iget-object v0, p0, Lz3/c;->b:Lf4/k;

    return-object v0
.end method

.method public final declared-synchronized close()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lz3/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lz3/c;->c:Z

    iget-object v0, p0, Lz3/c;->d:Lz3/h;

    iget-object v0, v0, Lz3/h;->d:Lf4/h;

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Lf4/h;->m(Ljava/lang/String;)Lf4/h;

    iget-object v0, p0, Lz3/c;->d:Lz3/h;

    iget-object v1, p0, Lz3/c;->b:Lf4/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Lf4/k;->e:Lf4/y;

    sget-object v2, Lf4/y;->d:Lf4/x;

    iput-object v2, v1, Lf4/k;->e:Lf4/y;

    invoke-virtual {v0}, Lf4/y;->a()Lf4/y;

    invoke-virtual {v0}, Lf4/y;->b()Lf4/y;

    iget-object v0, p0, Lz3/c;->d:Lz3/h;

    const/4 v1, 0x3

    iput v1, v0, Lz3/h;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lz3/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lz3/c;->d:Lz3/h;

    iget-object v0, v0, Lz3/h;->d:Lf4/h;

    invoke-interface {v0}, Lf4/h;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
