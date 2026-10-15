.class public final Lkotlinx/coroutines/internal/c;
.super Lr3/w;
.source "SourceFile"

# interfaces
.implements Le3/d;
.implements Lc3/e;


# instance fields
.field private volatile synthetic _reusableCancellableContinuation:Ljava/lang/Object;

.field public final e:Lr3/k;

.field public final f:Lc3/e;

.field public g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_reusableCancellableContinuation"

    const-class v2, Lkotlinx/coroutines/internal/c;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lr3/k;Le3/c;)V
    .locals 3

    const-wide/16 v0, 0x0

    sget-object v2, Lkotlinx/coroutines/scheduling/j;->f:Lf2/e;

    invoke-direct {p0, v0, v1, v2}, Lkotlinx/coroutines/scheduling/h;-><init>(JLf2/e;)V

    const/4 v0, -0x1

    iput v0, p0, Lr3/w;->d:I

    iput-object p1, p0, Lkotlinx/coroutines/internal/c;->e:Lr3/k;

    iput-object p2, p0, Lkotlinx/coroutines/internal/c;->f:Lc3/e;

    sget-object p1, Lkotlinx/coroutines/internal/a;->b:Lg1/e;

    iput-object p1, p0, Lkotlinx/coroutines/internal/c;->g:Ljava/lang/Object;

    iget-object p1, p2, Le3/c;->c:Lc3/k;

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlinx/coroutines/internal/a;->e(Lc3/k;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lkotlinx/coroutines/internal/c;->h:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lkotlinx/coroutines/internal/c;->_reusableCancellableContinuation:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 10

    iget-object v0, p0, Lkotlinx/coroutines/internal/c;->f:Lc3/e;

    invoke-interface {v0}, Lc3/e;->g()Lc3/k;

    move-result-object v1

    invoke-static {p1}, Lz2/c;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    move-object v3, p1

    goto :goto_0

    :cond_0
    new-instance v3, Lr3/f;

    invoke-direct {v3, v2}, Lr3/f;-><init>(Ljava/lang/Throwable;)V

    :goto_0
    iget-object v2, p0, Lkotlinx/coroutines/internal/c;->e:Lr3/k;

    invoke-virtual {v2}, Lr3/k;->C()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    iput-object v3, p0, Lkotlinx/coroutines/internal/c;->g:Ljava/lang/Object;

    iput v5, p0, Lr3/w;->d:I

    invoke-virtual {v2, v1, p0}, Lr3/k;->z(Lc3/k;Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_1
    sget-object v1, Lr3/w0;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr3/c0;

    if-nez v2, :cond_2

    new-instance v2, Lr3/b;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-direct {v2, v4}, Lr3/b;-><init>(Ljava/lang/Thread;)V

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_2
    iget-wide v6, v2, Lr3/c0;->d:J

    const-wide v8, 0x100000000L

    cmp-long v1, v6, v8

    if-ltz v1, :cond_3

    iput-object v3, p0, Lkotlinx/coroutines/internal/c;->g:Ljava/lang/Object;

    iput v5, p0, Lr3/w;->d:I

    invoke-virtual {v2, p0}, Lr3/c0;->G(Lr3/w;)V

    goto :goto_3

    :cond_3
    add-long/2addr v8, v6

    iput-wide v8, v2, Lr3/c0;->d:J

    :try_start_0
    invoke-interface {v0}, Lc3/e;->g()Lc3/k;

    move-result-object v1

    iget-object v3, p0, Lkotlinx/coroutines/internal/c;->h:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlinx/coroutines/internal/a;->f(Lc3/k;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0, p1}, Lc3/e;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v1, v3}, Lkotlinx/coroutines/internal/a;->c(Lc3/k;Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v2}, Lr3/c0;->I()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_4

    :goto_1
    invoke-virtual {v2}, Lr3/c0;->F()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-static {v1, v3}, Lkotlinx/coroutines/internal/a;->c(Lc3/k;Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    const/4 v0, 0x0

    :try_start_4
    invoke-virtual {p0, p1, v0}, Lr3/w;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :goto_3
    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v2}, Lr3/c0;->F()V

    throw p1
.end method

.method public final f()Le3/d;
    .locals 2

    iget-object v0, p0, Lkotlinx/coroutines/internal/c;->f:Lc3/e;

    instance-of v1, v0, Le3/d;

    if-eqz v1, :cond_0

    check-cast v0, Le3/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final g()Lc3/k;
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/internal/c;->f:Lc3/e;

    invoke-interface {v0}, Lc3/e;->g()Lc3/k;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DispatchedContinuation["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkotlinx/coroutines/internal/c;->e:Lr3/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkotlinx/coroutines/internal/c;->f:Lc3/e;

    instance-of v2, v1, Lkotlinx/coroutines/internal/c;

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_0
    const/16 v2, 0x40

    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lr3/q;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    invoke-static {v3}, Lc3/h;->A0(Ljava/lang/Throwable;)Lz2/b;

    move-result-object v3

    :goto_0
    invoke-static {v3}, Lz2/c;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lr3/q;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_1
    move-object v1, v3

    check-cast v1, Ljava/lang/String;

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
