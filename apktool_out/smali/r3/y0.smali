.class public final Lr3/y0;
.super Lkotlinx/coroutines/internal/o;
.source "SourceFile"


# instance fields
.field public final e:Ljava/lang/ThreadLocal;


# direct methods
.method public constructor <init>(Lc3/e;Lc3/k;)V
    .locals 2

    sget-object v0, Lr3/z0;->b:Lr3/z0;

    invoke-interface {p2, v0}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p2, v0}, Lc3/k;->x(Lc3/k;)Lc3/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    invoke-direct {p0, p1, v0}, Lkotlinx/coroutines/internal/o;-><init>(Lc3/e;Lc3/k;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lr3/y0;->e:Ljava/lang/ThreadLocal;

    invoke-interface {p1}, Lc3/e;->g()Lc3/k;

    move-result-object p1

    sget-object v0, Lc3/f;->b:Lc3/f;

    invoke-interface {p1, v0}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object p1

    instance-of p1, p1, Lr3/k;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-static {p2, p1}, Lkotlinx/coroutines/internal/a;->f(Lc3/k;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlinx/coroutines/internal/a;->c(Lc3/k;Ljava/lang/Object;)V

    new-instance v0, Lz2/a;

    invoke-direct {v0, p2, p1}, Lz2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lr3/y0;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {p1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final H()Z
    .locals 2

    iget-object v0, p0, Lr3/y0;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lr3/y0;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v3, v1, Lz2/a;->b:Ljava/lang/Object;

    check-cast v3, Lc3/k;

    iget-object v1, v1, Lz2/a;->c:Ljava/lang/Object;

    invoke-static {v3, v1}, Lkotlinx/coroutines/internal/a;->c(Lc3/k;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    invoke-static {p1}, Lc3/h;->f2(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lkotlinx/coroutines/internal/o;->d:Lc3/e;

    invoke-interface {v0}, Lc3/e;->g()Lc3/k;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlinx/coroutines/internal/a;->f(Lc3/k;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lkotlinx/coroutines/internal/a;->d:Lg1/e;

    if-eq v3, v4, :cond_1

    invoke-static {v0, v1, v3}, Lc3/h;->J2(Lc3/e;Lc3/k;Ljava/lang/Object;)Lr3/y0;

    move-result-object v2

    :cond_1
    :try_start_0
    invoke-interface {v0, p1}, Lc3/e;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lr3/y0;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-static {v1, v3}, Lkotlinx/coroutines/internal/a;->c(Lc3/k;Ljava/lang/Object;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lr3/y0;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-static {v1, v3}, Lkotlinx/coroutines/internal/a;->c(Lc3/k;Ljava/lang/Object;)V

    :cond_5
    throw p1
.end method
