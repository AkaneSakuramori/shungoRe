.class public abstract Lkotlinx/coroutines/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg1/e;

.field public static final b:Lg1/e;

.field public static final c:Lg1/e;

.field public static final d:Lg1/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lg1/e;

    const-string v1, "NO_DECISION"

    invoke-direct {v0, v1}, Lg1/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/a;->a:Lg1/e;

    new-instance v0, Lg1/e;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lg1/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/a;->b:Lg1/e;

    new-instance v0, Lg1/e;

    const-string v1, "CONDITION_FALSE"

    invoke-direct {v0, v1}, Lg1/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/a;->c:Lg1/e;

    new-instance v0, Lg1/e;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Lg1/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/a;->d:Lg1/e;

    return-void
.end method

.method public static final c(Lc3/k;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, Lkotlinx/coroutines/internal/a;->d:Lg1/e;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lkotlinx/coroutines/internal/r;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lkotlinx/coroutines/internal/r;

    iget-object p0, p1, Lkotlinx/coroutines/internal/r;->b:[Lr3/v0;

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_1

    return-void

    :cond_1
    aget-object p0, p0, v0

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object p0, p1, Lkotlinx/coroutines/internal/r;->a:[Ljava/lang/Object;

    aget-object p0, p0, v0

    throw v1

    :cond_2
    sget-object p1, Lkotlinx/coroutines/internal/q;->e:Lkotlinx/coroutines/internal/q;

    invoke-interface {p0, v1, p1}, Lc3/k;->h(Ljava/lang/Object;Lj3/p;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0}, La;->n(Ljava/lang/Object;)V

    throw v1

    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(Lc3/e;Ljava/lang/Object;Lj3/l;)V
    .locals 8

    instance-of v0, p0, Lkotlinx/coroutines/internal/c;

    if-eqz v0, :cond_c

    check-cast p0, Lkotlinx/coroutines/internal/c;

    invoke-static {p1}, Lz2/c;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    new-instance v0, Lr3/g;

    invoke-direct {v0, p1, p2}, Lr3/g;-><init>(Ljava/lang/Object;Lj3/l;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    goto :goto_0

    :cond_1
    new-instance p2, Lr3/f;

    invoke-direct {p2, v0}, Lr3/f;-><init>(Ljava/lang/Throwable;)V

    move-object v0, p2

    :goto_0
    iget-object p2, p0, Lkotlinx/coroutines/internal/c;->e:Lr3/k;

    iget-object v1, p0, Lkotlinx/coroutines/internal/c;->f:Lc3/e;

    invoke-interface {v1}, Lc3/e;->g()Lc3/k;

    invoke-virtual {p2}, Lr3/k;->C()Z

    move-result p2

    const/4 v2, 0x1

    if-eqz p2, :cond_2

    iput-object v0, p0, Lkotlinx/coroutines/internal/c;->g:Ljava/lang/Object;

    iput v2, p0, Lr3/w;->d:I

    invoke-interface {v1}, Lc3/e;->g()Lc3/k;

    move-result-object p1

    iget-object p2, p0, Lkotlinx/coroutines/internal/c;->e:Lr3/k;

    invoke-virtual {p2, p1, p0}, Lr3/k;->z(Lc3/k;Ljava/lang/Runnable;)V

    goto/16 :goto_5

    :cond_2
    sget-object p2, Lr3/w0;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr3/c0;

    if-nez v3, :cond_3

    new-instance v3, Lr3/b;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-direct {v3, v4}, Lr3/b;-><init>(Ljava/lang/Thread;)V

    invoke-virtual {p2, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_3
    iget-wide v4, v3, Lr3/c0;->d:J

    const-wide v6, 0x100000000L

    cmp-long p2, v4, v6

    if-ltz p2, :cond_4

    iput-object v0, p0, Lkotlinx/coroutines/internal/c;->g:Ljava/lang/Object;

    iput v2, p0, Lr3/w;->d:I

    invoke-virtual {v3, p0}, Lr3/c0;->G(Lr3/w;)V

    goto/16 :goto_5

    :cond_4
    add-long/2addr v6, v4

    iput-wide v6, v3, Lr3/c0;->d:J

    const/4 p2, 0x0

    :try_start_0
    invoke-interface {v1}, Lc3/e;->g()Lc3/k;

    move-result-object v2

    sget-object v4, Lr3/l;->c:Lr3/l;

    invoke-interface {v2, v4}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object v2

    check-cast v2, Lr3/i0;

    if-eqz v2, :cond_6

    invoke-interface {v2}, Lr3/i0;->a()Z

    move-result v4

    if-nez v4, :cond_6

    check-cast v2, Lr3/p0;

    invoke-virtual {v2}, Lr3/p0;->p()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    instance-of v1, v0, Lr3/g;

    if-eqz v1, :cond_5

    check-cast v0, Lr3/g;

    iget-object v0, v0, Lr3/g;->b:Lj3/l;

    invoke-interface {v0, p1}, Lj3/l;->e(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-static {p1}, Lc3/h;->A0(Ljava/lang/Throwable;)Lz2/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/c;->b(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lkotlinx/coroutines/internal/c;->h:Ljava/lang/Object;

    invoke-interface {v1}, Lc3/e;->g()Lc3/k;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlinx/coroutines/internal/a;->f(Lc3/k;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lkotlinx/coroutines/internal/a;->d:Lg1/e;

    if-eq v0, v4, :cond_7

    invoke-static {v1, v2, v0}, Lc3/h;->J2(Lc3/e;Lc3/k;Ljava/lang/Object;)Lr3/y0;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_7
    move-object v4, p2

    :goto_1
    :try_start_1
    invoke-interface {v1, p1}, Lc3/e;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_8

    :try_start_2
    invoke-virtual {v4}, Lr3/y0;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    :cond_8
    invoke-static {v2, v0}, Lkotlinx/coroutines/internal/a;->c(Lc3/k;Ljava/lang/Object;)V

    :cond_9
    :goto_2
    invoke-virtual {v3}, Lr3/c0;->I()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_9

    :goto_3
    invoke-virtual {v3}, Lr3/c0;->F()V

    goto :goto_5

    :catchall_1
    move-exception p1

    if-eqz v4, :cond_a

    :try_start_3
    invoke-virtual {v4}, Lr3/y0;->H()Z

    move-result v1

    if-eqz v1, :cond_b

    :cond_a
    invoke-static {v2, v0}, Lkotlinx/coroutines/internal/a;->c(Lc3/k;Ljava/lang/Object;)V

    :cond_b
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_4
    :try_start_4
    invoke-virtual {p0, p1, p2}, Lr3/w;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p0

    invoke-virtual {v3}, Lr3/c0;->F()V

    throw p0

    :cond_c
    invoke-interface {p0, p1}, Lc3/e;->b(Ljava/lang/Object;)V

    :goto_5
    return-void
.end method

.method public static final e(Lc3/k;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lkotlinx/coroutines/internal/q;->d:Lkotlinx/coroutines/internal/q;

    invoke-interface {p0, v0, v1}, Lc3/k;->h(Ljava/lang/Object;Lj3/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lc3/h;->X(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final f(Lc3/k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lkotlinx/coroutines/internal/a;->e(Lc3/k;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lkotlinx/coroutines/internal/a;->d:Lg1/e;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lkotlinx/coroutines/internal/r;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/internal/r;-><init>(Lc3/k;I)V

    sget-object p1, Lkotlinx/coroutines/internal/q;->f:Lkotlinx/coroutines/internal/q;

    invoke-interface {p0, v0, p1}, Lc3/k;->h(Ljava/lang/Object;Lj3/p;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_2
    invoke-static {p1}, La;->n(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()V
.end method
