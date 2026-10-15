.class public abstract Lr3/l0;
.super Lkotlinx/coroutines/internal/f;
.source "SourceFile"

# interfaces
.implements Lr3/y;
.implements Lr3/f0;
.implements Lj3/l;


# instance fields
.field public e:Lr3/p0;


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b()Lr3/r0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()V
    .locals 5

    iget-object v0, p0, Lr3/l0;->e:Lr3/p0;

    if-eqz v0, :cond_5

    :goto_0
    invoke-virtual {v0}, Lr3/p0;->r()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lr3/l0;

    if-eqz v2, :cond_3

    if-eq v1, p0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v2, Lr3/q;->h:Lr3/z;

    :cond_1
    sget-object v3, Lr3/p0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_1

    goto :goto_0

    :cond_3
    instance-of v0, v1, Lr3/f0;

    if-eqz v0, :cond_4

    check-cast v1, Lr3/f0;

    invoke-interface {v1}, Lr3/f0;->b()Lr3/r0;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/f;->l()V

    :cond_4
    :goto_1
    return-void

    :cond_5
    const-string v0, "job"

    invoke-static {v0}, Lc3/h;->E2(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public abstract m(Ljava/lang/Throwable;)V
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lr3/q;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[job@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr3/l0;->e:Lr3/p0;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lr3/q;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "job"

    invoke-static {v0}, Lc3/h;->E2(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
