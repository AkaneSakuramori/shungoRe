.class public Lr3/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr3/i0;
.implements Lr3/e;
.implements Lr3/t0;


# static fields
.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle:Ljava/lang/Object;

.field private volatile synthetic _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_state"

    const-class v2, Lr3/p0;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lr3/p0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    sget-object p1, Lr3/q;->h:Lr3/z;

    goto :goto_0

    :cond_0
    sget-object p1, Lr3/q;->g:Lr3/z;

    :goto_0
    iput-object p1, p0, Lr3/p0;->_state:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lr3/p0;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method public static A(Lkotlinx/coroutines/internal/f;)Lr3/d;
    .locals 1

    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/f;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/f;->j()Lkotlinx/coroutines/internal/f;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/f;->i()Lkotlinx/coroutines/internal/f;

    move-result-object p0

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/f;->k()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p0, Lr3/d;

    if-eqz v0, :cond_1

    check-cast p0, Lr3/d;

    return-object p0

    :cond_1
    instance-of v0, p0, Lr3/r0;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0
.end method

.method public static F(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p0, Lr3/n0;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p0, Lr3/n0;

    invoke-virtual {p0}, Lr3/n0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lr3/n0;->f()Z

    move-result p0

    if-eqz p0, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lr3/f0;

    if-eqz v0, :cond_3

    check-cast p0, Lr3/f0;

    invoke-interface {p0}, Lr3/f0;->a()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p0, p0, Lr3/f;

    if-eqz p0, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method


# virtual methods
.method public final B(Lr3/r0;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/f;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/f;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lr3/k0;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lr3/l0;

    :try_start_0
    invoke-virtual {v2, p2}, Lr3/l0;->m(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lc3/h;->F(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Landroidx/fragment/app/p;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Exception in completion handler "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/f;->i()Lkotlinx/coroutines/internal/f;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lr3/p0;->u(Landroidx/fragment/app/p;)V

    :cond_3
    invoke-virtual {p0, p2}, Lr3/p0;->k(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public C(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public D()V
    .locals 0

    return-void
.end method

.method public final E(Lr3/l0;)V
    .locals 3

    new-instance v0, Lr3/r0;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/f;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lkotlinx/coroutines/internal/f;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/coroutines/internal/f;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/f;->h()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p1, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/f;->g(Lkotlinx/coroutines/internal/f;)V

    :goto_1
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/f;->i()Lkotlinx/coroutines/internal/f;

    move-result-object v2

    :cond_1
    sget-object v0, Lr3/p0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_1

    :goto_2
    return-void

    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_0
.end method

.method public final G(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lr3/f0;

    if-nez v0, :cond_0

    sget-object p1, Lr3/q;->b:Lg1/e;

    return-object p1

    :cond_0
    instance-of v0, p1, Lr3/z;

    if-nez v0, :cond_1

    instance-of v0, p1, Lr3/l0;

    if-eqz v0, :cond_5

    :cond_1
    instance-of v0, p1, Lr3/d;

    if-nez v0, :cond_5

    instance-of v0, p2, Lr3/f;

    if-nez v0, :cond_5

    move-object v0, p1

    check-cast v0, Lr3/f0;

    instance-of p1, p2, Lr3/f0;

    if-eqz p1, :cond_2

    new-instance p1, Lr3/g0;

    move-object v1, p2

    check-cast v1, Lr3/f0;

    invoke-direct {p1, v1}, Lr3/g0;-><init>(Lr3/f0;)V

    move-object v1, p1

    goto :goto_0

    :cond_2
    move-object v1, p2

    :cond_3
    :goto_0
    sget-object p1, Lr3/p0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, p2}, Lr3/p0;->C(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p2}, Lr3/p0;->m(Lr3/f0;Ljava/lang/Object;)V

    return-object p2

    :cond_4
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v0, :cond_3

    sget-object p1, Lr3/q;->d:Lg1/e;

    return-object p1

    :cond_5
    check-cast p1, Lr3/f0;

    invoke-virtual {p0, p1}, Lr3/p0;->q(Lr3/f0;)Lr3/r0;

    move-result-object v0

    if-nez v0, :cond_6

    sget-object p1, Lr3/q;->d:Lg1/e;

    goto/16 :goto_7

    :cond_6
    instance-of v1, p1, Lr3/n0;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    move-object v1, p1

    check-cast v1, Lr3/n0;

    goto :goto_1

    :cond_7
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_8

    new-instance v1, Lr3/n0;

    invoke-direct {v1, v0, v2}, Lr3/n0;-><init>(Lr3/r0;Ljava/lang/Throwable;)V

    :cond_8
    new-instance v3, Lk3/m;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Lr3/n0;->f()Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object p1, Lr3/q;->b:Lg1/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto/16 :goto_7

    :cond_9
    :try_start_1
    invoke-virtual {v1}, Lr3/n0;->i()V

    if-eq v1, p1, :cond_c

    sget-object v4, Lr3/p0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_a
    invoke-virtual {v4, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, p1, :cond_a

    sget-object p1, Lr3/q;->d:Lg1/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto/16 :goto_7

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_c
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Lr3/n0;->e()Z

    move-result v4

    instance-of v5, p2, Lr3/f;

    if-eqz v5, :cond_d

    move-object v5, p2

    check-cast v5, Lr3/f;

    goto :goto_3

    :cond_d
    move-object v5, v2

    :goto_3
    if-eqz v5, :cond_e

    iget-object v5, v5, Lr3/f;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v5}, Lr3/n0;->c(Ljava/lang/Throwable;)V

    :cond_e
    invoke-virtual {v1}, Lr3/n0;->d()Ljava/lang/Throwable;

    move-result-object v5

    const/4 v6, 0x1

    xor-int/2addr v4, v6

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_f

    goto :goto_4

    :cond_f
    move-object v5, v2

    :goto_4
    iput-object v5, v3, Lk3/m;->b:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    if-eqz v5, :cond_10

    invoke-virtual {p0, v0, v5}, Lr3/p0;->B(Lr3/r0;Ljava/lang/Throwable;)V

    :cond_10
    instance-of v0, p1, Lr3/d;

    if-eqz v0, :cond_11

    move-object v0, p1

    check-cast v0, Lr3/d;

    goto :goto_5

    :cond_11
    move-object v0, v2

    :goto_5
    if-nez v0, :cond_12

    invoke-interface {p1}, Lr3/f0;->b()Lr3/r0;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-static {p1}, Lr3/p0;->A(Lkotlinx/coroutines/internal/f;)Lr3/d;

    move-result-object v2

    goto :goto_6

    :cond_12
    move-object v2, v0

    :cond_13
    :goto_6
    if-eqz v2, :cond_16

    :cond_14
    new-instance p1, Lr3/m0;

    invoke-direct {p1, p0, v1, v2, p2}, Lr3/m0;-><init>(Lr3/p0;Lr3/n0;Lr3/d;Ljava/lang/Object;)V

    iget-object v0, v2, Lr3/d;->f:Lr3/e;

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v6}, Lr3/q;->l(Lr3/i0;ZLr3/l0;I)Lr3/y;

    move-result-object p1

    sget-object v0, Lr3/s0;->b:Lr3/s0;

    if-eq p1, v0, :cond_15

    sget-object p1, Lr3/q;->c:Lg1/e;

    goto :goto_7

    :cond_15
    invoke-static {v2}, Lr3/p0;->A(Lkotlinx/coroutines/internal/f;)Lr3/d;

    move-result-object v2

    if-nez v2, :cond_14

    :cond_16
    invoke-virtual {p0, v1, p2}, Lr3/p0;->o(Lr3/n0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_7
    return-object p1

    :goto_8
    monitor-exit v1

    throw p1
.end method

.method public a()Z
    .locals 2

    invoke-virtual {p0}, Lr3/p0;->r()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lr3/f0;

    if-eqz v1, :cond_0

    check-cast v0, Lr3/f0;

    invoke-interface {v0}, Lr3/f0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final c(Ljava/lang/Object;Lr3/r0;Lr3/l0;)Z
    .locals 6

    new-instance v0, Lr3/o0;

    invoke-direct {v0, p3, p0, p1}, Lr3/o0;-><init>(Lkotlinx/coroutines/internal/f;Lr3/p0;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Lkotlinx/coroutines/internal/f;->j()Lkotlinx/coroutines/internal/f;

    move-result-object p1

    sget-object v1, Lkotlinx/coroutines/internal/f;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/coroutines/internal/f;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p3, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, v0, Lr3/o0;->c:Lkotlinx/coroutines/internal/f;

    :cond_0
    invoke-virtual {v1, p1, p2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    move p1, v5

    goto :goto_1

    :cond_1
    move p1, v4

    goto :goto_1

    :cond_2
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p2, :cond_0

    move p1, v3

    :goto_1
    if-eq p1, v5, :cond_3

    if-eq p1, v4, :cond_4

    goto :goto_0

    :cond_3
    move v3, v5

    :cond_4
    return v3
.end method

.method public d(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final e(Lc3/j;)Lc3/i;
    .locals 0

    invoke-static {p0, p1}, Lc3/h;->L0(Lc3/i;Lc3/j;)Lc3/i;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lc3/j;
    .locals 1

    sget-object v0, Lr3/l;->c:Lr3/l;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;Lj3/p;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lj3/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lr3/p0;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public final j(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lr3/p0;->r()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lr3/n0;

    const/4 v4, 0x1

    if-eqz v3, :cond_5

    monitor-enter v2

    :try_start_0
    move-object v3, v2

    check-cast v3, Lr3/n0;

    invoke-virtual {v3}, Lr3/n0;->g()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object p1, Lr3/q;->e:Lg1/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    goto/16 :goto_3

    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, Lr3/n0;

    invoke-virtual {v3}, Lr3/n0;->e()Z

    move-result v3

    if-nez v1, :cond_2

    invoke-virtual {p0, p1}, Lr3/p0;->n(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    move-object p1, v2

    check-cast p1, Lr3/n0;

    invoke-virtual {p1, v1}, Lr3/n0;->c(Ljava/lang/Throwable;)V

    move-object p1, v2

    check-cast p1, Lr3/n0;

    invoke-virtual {p1}, Lr3/n0;->d()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_3

    move-object v0, p1

    :cond_3
    monitor-exit v2

    if-eqz v0, :cond_4

    check-cast v2, Lr3/n0;

    iget-object p1, v2, Lr3/n0;->b:Lr3/r0;

    invoke-virtual {p0, p1, v0}, Lr3/p0;->B(Lr3/r0;Ljava/lang/Throwable;)V

    :cond_4
    sget-object p1, Lr3/q;->b:Lg1/e;

    goto :goto_3

    :goto_2
    monitor-exit v2

    throw p1

    :cond_5
    instance-of v3, v2, Lr3/f0;

    if-eqz v3, :cond_c

    if-nez v1, :cond_6

    invoke-virtual {p0, p1}, Lr3/p0;->n(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_6
    move-object v3, v2

    check-cast v3, Lr3/f0;

    invoke-interface {v3}, Lr3/f0;->a()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {p0, v3}, Lr3/p0;->q(Lr3/f0;)Lr3/r0;

    move-result-object v5

    if-nez v5, :cond_7

    goto :goto_0

    :cond_7
    new-instance v6, Lr3/n0;

    invoke-direct {v6, v5, v1}, Lr3/n0;-><init>(Lr3/r0;Ljava/lang/Throwable;)V

    :cond_8
    sget-object v2, Lr3/p0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v3, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {p0, v5, v1}, Lr3/p0;->B(Lr3/r0;Ljava/lang/Throwable;)V

    sget-object p1, Lr3/q;->b:Lg1/e;

    goto :goto_3

    :cond_9
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v3, :cond_8

    goto :goto_0

    :cond_a
    new-instance v3, Lr3/f;

    invoke-direct {v3, v1}, Lr3/f;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2, v3}, Lr3/p0;->G(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lr3/q;->b:Lg1/e;

    if-eq v3, v5, :cond_b

    sget-object v2, Lr3/q;->d:Lg1/e;

    if-eq v3, v2, :cond_0

    move-object p1, v3

    goto :goto_3

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot happen in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    sget-object p1, Lr3/q;->e:Lg1/e;

    :goto_3
    sget-object v0, Lr3/q;->b:Lg1/e;

    if-ne p1, v0, :cond_d

    goto :goto_4

    :cond_d
    sget-object v0, Lr3/q;->c:Lg1/e;

    if-ne p1, v0, :cond_e

    goto :goto_4

    :cond_e
    sget-object v0, Lr3/q;->e:Lg1/e;

    if-ne p1, v0, :cond_f

    const/4 v4, 0x0

    goto :goto_4

    :cond_f
    invoke-virtual {p0, p1}, Lr3/p0;->d(Ljava/lang/Object;)V

    :goto_4
    return v4
.end method

.method public final k(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Lr3/p0;->w()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    iget-object v2, p0, Lr3/p0;->_parentHandle:Ljava/lang/Object;

    check-cast v2, Lr3/c;

    if-eqz v2, :cond_4

    sget-object v3, Lr3/s0;->b:Lr3/s0;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Lr3/c;->d(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public final m(Lr3/f0;Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lr3/p0;->_parentHandle:Ljava/lang/Object;

    check-cast v0, Lr3/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lr3/y;->c()V

    sget-object v0, Lr3/s0;->b:Lr3/s0;

    iput-object v0, p0, Lr3/p0;->_parentHandle:Ljava/lang/Object;

    :cond_0
    instance-of v0, p2, Lr3/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lr3/f;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object p2, p2, Lr3/f;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_2
    move-object p2, v1

    :goto_1
    instance-of v0, p1, Lr3/l0;

    const-string v2, " for "

    const-string v3, "Exception in completion handler "

    if-eqz v0, :cond_3

    :try_start_0
    move-object v0, p1

    check-cast v0, Lr3/l0;

    invoke-virtual {v0, p2}, Lr3/l0;->m(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p2

    new-instance v0, Landroidx/fragment/app/p;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lr3/p0;->u(Landroidx/fragment/app/p;)V

    goto :goto_4

    :cond_3
    invoke-interface {p1}, Lr3/f0;->b()Lr3/r0;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/f;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/f;

    :goto_2
    invoke-static {v0, p1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    instance-of v4, v0, Lr3/l0;

    if-eqz v4, :cond_5

    move-object v4, v0

    check-cast v4, Lr3/l0;

    :try_start_1
    invoke-virtual {v4, p2}, Lr3/l0;->m(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v5

    if-eqz v1, :cond_4

    invoke-static {v1, v5}, Lc3/h;->F(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    new-instance v1, Landroidx/fragment/app/p;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/f;->i()Lkotlinx/coroutines/internal/f;

    move-result-object v0

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {p0, v1}, Lr3/p0;->u(Landroidx/fragment/app/p;)V

    :cond_7
    :goto_4
    return-void
.end method

.method public final n(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 4

    instance-of v0, p1, Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Throwable;

    goto :goto_1

    :cond_0
    check-cast p1, Lr3/t0;

    check-cast p1, Lr3/p0;

    invoke-virtual {p1}, Lr3/p0;->r()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lr3/n0;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lr3/n0;

    invoke-virtual {v1}, Lr3/n0;->d()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lr3/f;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lr3/f;

    iget-object v1, v1, Lr3/f;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lr3/f0;

    if-nez v1, :cond_5

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_3

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_3
    if-nez v2, :cond_4

    new-instance v2, Lr3/j0;

    invoke-static {v0}, Lr3/p0;->F(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Parent job is "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p1}, Lr3/j0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lr3/i0;)V

    :cond_4
    move-object p1, v2

    :goto_1
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot be cancelling child in this state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o(Lr3/n0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lr3/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lr3/f;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lr3/f;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lr3/n0;->e()Z

    invoke-virtual {p1, v0}, Lr3/n0;->h(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lr3/n0;->e()Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v3, Lr3/j0;

    invoke-virtual {p0}, Lr3/p0;->l()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v1, p0}, Lr3/j0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lr3/i0;)V

    move-object v1, v3

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/Throwable;

    instance-of v7, v7, Ljava/util/concurrent/CancellationException;

    xor-int/2addr v7, v5

    if-eqz v7, :cond_3

    move-object v1, v6

    :cond_4
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    :cond_6
    :goto_2
    if-eqz v1, :cond_9

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-gt v3, v5, :cond_7

    goto :goto_4

    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-instance v6, Ljava/util/IdentityHashMap;

    invoke-direct {v6, v3}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v6}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Throwable;

    if-eq v6, v1, :cond_8

    if-eq v6, v1, :cond_8

    instance-of v7, v6, Ljava/util/concurrent/CancellationException;

    if-nez v7, :cond_8

    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-static {v1, v6}, Lc3/h;->F(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_9
    :goto_4
    monitor-exit p1

    if-nez v1, :cond_a

    goto :goto_5

    :cond_a
    if-ne v1, v0, :cond_b

    goto :goto_5

    :cond_b
    new-instance p2, Lr3/f;

    invoke-direct {p2, v1}, Lr3/f;-><init>(Ljava/lang/Throwable;)V

    :goto_5
    if-eqz v1, :cond_e

    invoke-virtual {p0, v1}, Lr3/p0;->k(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {p0, v1}, Lr3/p0;->s(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_c
    if-eqz p2, :cond_d

    move-object v0, p2

    check-cast v0, Lr3/f;

    sget-object v1, Lr3/f;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    goto :goto_6

    :cond_d
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_6
    invoke-virtual {p0, p2}, Lr3/p0;->C(Ljava/lang/Object;)V

    sget-object v0, Lr3/p0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    instance-of v1, p2, Lr3/f0;

    if-eqz v1, :cond_f

    new-instance v1, Lr3/g0;

    move-object v2, p2

    check-cast v2, Lr3/f0;

    invoke-direct {v1, v2}, Lr3/g0;-><init>(Lr3/f0;)V

    goto :goto_7

    :cond_f
    move-object v1, p2

    :cond_10
    :goto_7
    invoke-virtual {v0, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_8

    :cond_11
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_10

    :goto_8
    invoke-virtual {p0, p1, p2}, Lr3/p0;->m(Lr3/f0;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public final p()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lr3/p0;->r()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lr3/n0;

    const/4 v2, 0x0

    const-string v3, "Job is still new or active: "

    if-eqz v1, :cond_3

    check-cast v0, Lr3/n0;

    invoke-virtual {v0}, Lr3/n0;->d()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez v2, :cond_6

    new-instance v2, Lr3/j0;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lr3/p0;->l()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {v2, v1, v0, p0}, Lr3/j0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lr3/i0;)V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    instance-of v1, v0, Lr3/f0;

    if-nez v1, :cond_7

    instance-of v1, v0, Lr3/f;

    if-eqz v1, :cond_5

    check-cast v0, Lr3/f;

    iget-object v0, v0, Lr3/f;->a:Ljava/lang/Throwable;

    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_4

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_4
    if-nez v2, :cond_6

    new-instance v1, Lr3/j0;

    invoke-virtual {p0}, Lr3/p0;->l()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, p0}, Lr3/j0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lr3/i0;)V

    move-object v2, v1

    goto :goto_0

    :cond_5
    new-instance v0, Lr3/j0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lr3/j0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lr3/i0;)V

    move-object v2, v0

    :cond_6
    :goto_0
    return-object v2

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q(Lr3/f0;)Lr3/r0;
    .locals 3

    invoke-interface {p1}, Lr3/f0;->b()Lr3/r0;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lr3/z;

    if-eqz v0, :cond_0

    new-instance v0, Lr3/r0;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/f;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lr3/l0;

    if-eqz v0, :cond_1

    check-cast p1, Lr3/l0;

    invoke-virtual {p0, p1}, Lr3/p0;->E(Lr3/l0;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State should have list: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final r()Ljava/lang/Object;
    .locals 2

    :goto_0
    iget-object v0, p0, Lr3/p0;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lkotlinx/coroutines/internal/l;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, Lkotlinx/coroutines/internal/l;

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public s(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final t(Lc3/j;)Lc3/k;
    .locals 0

    invoke-static {p0, p1}, Lc3/h;->A1(Lc3/i;Lc3/j;)Lc3/k;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lr3/p0;->z()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr3/p0;->r()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lr3/p0;->F(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lr3/q;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Landroidx/fragment/app/p;)V
    .locals 0

    throw p1
.end method

.method public final v(Lr3/i0;)V
    .locals 7

    sget-object v0, Lr3/s0;->b:Lr3/s0;

    if-nez p1, :cond_0

    iput-object v0, p0, Lr3/p0;->_parentHandle:Ljava/lang/Object;

    return-void

    :cond_0
    check-cast p1, Lr3/p0;

    :goto_0
    invoke-virtual {p1}, Lr3/p0;->r()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lr3/z;

    sget-object v3, Lr3/p0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    if-eqz v2, :cond_4

    move-object v2, v1

    check-cast v2, Lr3/z;

    iget-boolean v2, v2, Lr3/z;->b:Z

    if-eqz v2, :cond_1

    goto :goto_3

    :cond_1
    sget-object v2, Lr3/q;->h:Lr3/z;

    :cond_2
    invoke-virtual {v3, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p1}, Lr3/p0;->D()V

    :goto_1
    move v5, v4

    goto :goto_3

    :cond_3
    invoke-virtual {v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v1, :cond_2

    :goto_2
    move v5, v6

    goto :goto_3

    :cond_4
    instance-of v2, v1, Lr3/e0;

    if-eqz v2, :cond_7

    move-object v2, v1

    check-cast v2, Lr3/e0;

    iget-object v2, v2, Lr3/e0;->b:Lr3/r0;

    :cond_5
    invoke-virtual {v3, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {p1}, Lr3/p0;->D()V

    goto :goto_1

    :cond_6
    invoke-virtual {v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v1, :cond_5

    goto :goto_2

    :cond_7
    :goto_3
    if-eqz v5, :cond_8

    if-eq v5, v4, :cond_8

    goto :goto_0

    :cond_8
    new-instance v1, Lr3/d;

    move-object v2, p0

    check-cast v2, Lr3/a;

    invoke-direct {v1, v2}, Lr3/d;-><init>(Lr3/a;)V

    const/4 v2, 0x2

    invoke-static {p1, v4, v1, v2}, Lr3/q;->l(Lr3/i0;ZLr3/l0;I)Lr3/y;

    move-result-object p1

    check-cast p1, Lr3/c;

    iput-object p1, p0, Lr3/p0;->_parentHandle:Ljava/lang/Object;

    invoke-virtual {p0}, Lr3/p0;->r()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lr3/f0;

    xor-int/2addr v1, v4

    if-eqz v1, :cond_9

    invoke-interface {p1}, Lr3/y;->c()V

    iput-object v0, p0, Lr3/p0;->_parentHandle:Ljava/lang/Object;

    :cond_9
    return-void
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final x(Lc3/k;)Lc3/k;
    .locals 0

    invoke-static {p0, p1}, Lc3/h;->V1(Lc3/i;Lc3/k;)Lc3/k;

    move-result-object p1

    return-object p1
.end method

.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    :cond_0
    invoke-virtual {p0}, Lr3/p0;->r()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lr3/p0;->G(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lr3/q;->b:Lg1/e;

    if-ne v0, v1, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Job "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    instance-of v2, p1, Lr3/f;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast p1, Lr3/f;

    goto :goto_0

    :cond_1
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_2

    iget-object v3, p1, Lr3/f;->a:Ljava/lang/Throwable;

    :cond_2
    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    sget-object v1, Lr3/q;->d:Lg1/e;

    if-eq v0, v1, :cond_0

    return-object v0
.end method

.method public z()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
