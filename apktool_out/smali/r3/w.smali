.class public abstract Lr3/w;
.super Lkotlinx/coroutines/scheduling/h;
.source "SourceFile"


# instance fields
.field public d:I


# virtual methods
.method public final a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-static {p1, p2}, Lc3/h;->F(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    if-nez p1, :cond_2

    move-object p1, p2

    :cond_2
    new-instance p2, Lr3/p;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fatal exception in coroutines machinery for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-direct {p2, v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p1, p0

    check-cast p1, Lkotlinx/coroutines/internal/c;

    iget-object p1, p1, Lkotlinx/coroutines/internal/c;->f:Lc3/e;

    invoke-interface {p1}, Lc3/e;->g()Lc3/k;

    move-result-object p1

    invoke-static {p1, p2}, Lc3/h;->g1(Lc3/k;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final run()V
    .locals 12

    sget-object v0, Lz2/f;->a:Lz2/f;

    iget-object v1, p0, Lkotlinx/coroutines/scheduling/h;->c:Lf2/e;

    :try_start_0
    move-object v2, p0

    check-cast v2, Lkotlinx/coroutines/internal/c;

    iget-object v3, v2, Lkotlinx/coroutines/internal/c;->f:Lc3/e;

    iget-object v2, v2, Lkotlinx/coroutines/internal/c;->h:Ljava/lang/Object;

    invoke-interface {v3}, Lc3/e;->g()Lc3/k;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlinx/coroutines/internal/a;->f(Lc3/k;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lkotlinx/coroutines/internal/a;->d:Lg1/e;

    const/4 v6, 0x0

    if-eq v2, v5, :cond_0

    invoke-static {v3, v4, v2}, Lc3/h;->J2(Lc3/e;Lc3/k;Ljava/lang/Object;)Lr3/y0;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    goto/16 :goto_7

    :cond_0
    move-object v5, v6

    :goto_0
    :try_start_1
    invoke-interface {v3}, Lc3/e;->g()Lc3/k;

    move-result-object v7

    move-object v8, p0

    check-cast v8, Lkotlinx/coroutines/internal/c;

    iget-object v9, v8, Lkotlinx/coroutines/internal/c;->g:Ljava/lang/Object;

    sget-object v10, Lkotlinx/coroutines/internal/a;->b:Lg1/e;

    iput-object v10, v8, Lkotlinx/coroutines/internal/c;->g:Ljava/lang/Object;

    instance-of v8, v9, Lr3/f;

    if-eqz v8, :cond_1

    move-object v8, v9

    check-cast v8, Lr3/f;

    goto :goto_1

    :cond_1
    move-object v8, v6

    :goto_1
    if-eqz v8, :cond_2

    iget-object v8, v8, Lr3/f;->a:Ljava/lang/Throwable;

    goto :goto_2

    :cond_2
    move-object v8, v6

    :goto_2
    if-nez v8, :cond_4

    iget v10, p0, Lr3/w;->d:I

    const/4 v11, 0x1

    if-eq v10, v11, :cond_3

    const/4 v11, 0x2

    if-ne v10, v11, :cond_4

    :cond_3
    sget-object v10, Lr3/l;->c:Lr3/l;

    invoke-interface {v7, v10}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object v7

    check-cast v7, Lr3/i0;

    goto :goto_3

    :catchall_1
    move-exception v3

    goto :goto_6

    :cond_4
    move-object v7, v6

    :goto_3
    if-eqz v7, :cond_6

    invoke-interface {v7}, Lr3/i0;->a()Z

    move-result v10

    if-nez v10, :cond_6

    check-cast v7, Lr3/p0;

    invoke-virtual {v7}, Lr3/p0;->p()Ljava/util/concurrent/CancellationException;

    move-result-object v7

    instance-of v8, v9, Lr3/g;

    if-eqz v8, :cond_5

    check-cast v9, Lr3/g;

    iget-object v8, v9, Lr3/g;->b:Lj3/l;

    invoke-interface {v8, v7}, Lj3/l;->e(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-static {v7}, Lc3/h;->A0(Ljava/lang/Throwable;)Lz2/b;

    move-result-object v7

    invoke-interface {v3, v7}, Lc3/e;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    if-eqz v8, :cond_7

    invoke-static {v8}, Lc3/h;->A0(Ljava/lang/Throwable;)Lz2/b;

    move-result-object v7

    invoke-interface {v3, v7}, Lc3/e;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    invoke-interface {v3, v9}, Lc3/e;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_4
    if-eqz v5, :cond_8

    :try_start_2
    invoke-virtual {v5}, Lr3/y0;->H()Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_8
    invoke-static {v4, v2}, Lkotlinx/coroutines/internal/a;->c(Lc3/k;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_9
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    invoke-static {v0}, Lc3/h;->A0(Ljava/lang/Throwable;)Lz2/b;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Lz2/c;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v6, v0}, Lr3/w;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_9

    :goto_6
    if-eqz v5, :cond_a

    :try_start_4
    invoke-virtual {v5}, Lr3/y0;->H()Z

    move-result v5

    if-eqz v5, :cond_b

    :cond_a
    invoke-static {v4, v2}, Lkotlinx/coroutines/internal/a;->c(Lc3/k;Ljava/lang/Object;)V

    :cond_b
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_7
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_8

    :catchall_3
    move-exception v0

    invoke-static {v0}, Lc3/h;->A0(Ljava/lang/Throwable;)Lz2/b;

    move-result-object v0

    :goto_8
    invoke-static {v0}, Lz2/c;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lr3/w;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_9
    return-void
.end method
