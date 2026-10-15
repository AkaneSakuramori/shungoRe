.class public final Lkotlinx/coroutines/internal/d;
.super Lr3/k;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lr3/t;


# instance fields
.field public final d:Lr3/k;

.field public final e:I

.field public final f:Lkotlinx/coroutines/internal/g;

.field public final g:Ljava/lang/Object;

.field private volatile runningWorkers:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/scheduling/k;I)V
    .locals 0

    invoke-direct {p0}, Lr3/k;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/internal/d;->d:Lr3/k;

    iput p2, p0, Lkotlinx/coroutines/internal/d;->e:I

    instance-of p2, p1, Lr3/t;

    if-eqz p2, :cond_0

    check-cast p1, Lr3/t;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget p1, Lr3/s;->a:I

    :cond_1
    new-instance p1, Lkotlinx/coroutines/internal/g;

    invoke-direct {p1}, Lkotlinx/coroutines/internal/g;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/internal/d;->f:Lkotlinx/coroutines/internal/g;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/internal/d;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    move v1, v0

    :cond_0
    iget-object v2, p0, Lkotlinx/coroutines/internal/d;->f:Lkotlinx/coroutines/internal/g;

    invoke-virtual {v2}, Lkotlinx/coroutines/internal/g;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    if-eqz v2, :cond_1

    :try_start_0
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    sget-object v3, Lc3/l;->b:Lc3/l;

    invoke-static {v3, v2}, Lc3/h;->g1(Lc3/k;Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0x10

    if-lt v1, v2, :cond_0

    iget-object v2, p0, Lkotlinx/coroutines/internal/d;->d:Lr3/k;

    invoke-virtual {v2}, Lr3/k;->C()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lkotlinx/coroutines/internal/d;->d:Lr3/k;

    invoke-virtual {v0, p0, p0}, Lr3/k;->z(Lc3/k;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    iget-object v1, p0, Lkotlinx/coroutines/internal/d;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget v2, p0, Lkotlinx/coroutines/internal/d;->runningWorkers:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lkotlinx/coroutines/internal/d;->runningWorkers:I

    iget-object v2, p0, Lkotlinx/coroutines/internal/d;->f:Lkotlinx/coroutines/internal/g;

    invoke-virtual {v2}, Lkotlinx/coroutines/internal/g;->c()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v2, :cond_2

    monitor-exit v1

    return-void

    :cond_2
    :try_start_2
    iget v2, p0, Lkotlinx/coroutines/internal/d;->runningWorkers:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lkotlinx/coroutines/internal/d;->runningWorkers:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final z(Lc3/k;Ljava/lang/Runnable;)V
    .locals 1

    iget-object p1, p0, Lkotlinx/coroutines/internal/d;->f:Lkotlinx/coroutines/internal/g;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/internal/g;->a(Ljava/lang/Object;)Z

    iget p1, p0, Lkotlinx/coroutines/internal/d;->runningWorkers:I

    iget p2, p0, Lkotlinx/coroutines/internal/d;->e:I

    if-lt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lkotlinx/coroutines/internal/d;->g:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget p2, p0, Lkotlinx/coroutines/internal/d;->runningWorkers:I

    iget v0, p0, Lkotlinx/coroutines/internal/d;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt p2, v0, :cond_1

    monitor-exit p1

    goto :goto_0

    :cond_1
    :try_start_1
    iget p2, p0, Lkotlinx/coroutines/internal/d;->runningWorkers:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lkotlinx/coroutines/internal/d;->runningWorkers:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    iget-object p1, p0, Lkotlinx/coroutines/internal/d;->d:Lr3/k;

    invoke-virtual {p1, p0, p0}, Lr3/k;->z(Lc3/k;Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method
