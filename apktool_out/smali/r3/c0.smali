.class public abstract Lr3/c0;
.super Lr3/k;
.source "SourceFile"


# instance fields
.field public d:J

.field public e:Z

.field public f:Lr0/b;


# virtual methods
.method public final F()V
    .locals 4

    iget-wide v0, p0, Lr3/c0;->d:J

    const-wide v2, 0x100000000L

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lr3/c0;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lr3/c0;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lr3/c0;->shutdown()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final G(Lr3/w;)V
    .locals 13

    iget-object v0, p0, Lr3/c0;->f:Lr0/b;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    new-instance v0, Lr0/b;

    invoke-direct {v0, v1}, Lr0/b;-><init>(I)V

    iput-object v0, p0, Lr3/c0;->f:Lr0/b;

    :cond_0
    iget-object v2, v0, Lr0/b;->c:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, [Ljava/lang/Object;

    iget v2, v0, Lr0/b;->b:I

    aput-object p1, v3, v2

    add-int/2addr v2, v1

    array-length p1, v3

    sub-int/2addr p1, v1

    and-int/2addr p1, v2

    iput p1, v0, Lr0/b;->b:I

    iget v6, v0, Lr0/b;->a:I

    if-ne p1, v6, :cond_1

    array-length p1, v3

    shl-int/lit8 v1, p1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xa

    move-object v4, v1

    invoke-static/range {v3 .. v8}, La3/j;->U2([Ljava/lang/Object;[Ljava/lang/Object;IIII)V

    iget-object v2, v0, Lr0/b;->c:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, [Ljava/lang/Object;

    array-length v2, v7

    iget v11, v0, Lr0/b;->a:I

    sub-int v9, v2, v11

    const/4 v10, 0x0

    const/4 v12, 0x4

    move-object v8, v1

    invoke-static/range {v7 .. v12}, La3/j;->U2([Ljava/lang/Object;[Ljava/lang/Object;IIII)V

    iput-object v1, v0, Lr0/b;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, v0, Lr0/b;->a:I

    iput p1, v0, Lr0/b;->b:I

    :cond_1
    return-void
.end method

.method public abstract H()Ljava/lang/Thread;
.end method

.method public final I()Z
    .locals 7

    iget-object v0, p0, Lr3/c0;->f:Lr0/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v2, v0, Lr0/b;->a:I

    iget v3, v0, Lr0/b;->b:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lr0/b;->c:Ljava/lang/Object;

    check-cast v3, [Ljava/lang/Object;

    aget-object v6, v3, v2

    aput-object v5, v3, v2

    add-int/2addr v2, v4

    array-length v3, v3

    sub-int/2addr v3, v4

    and-int/2addr v2, v3

    iput v2, v0, Lr0/b;->a:I

    if-eqz v6, :cond_3

    move-object v5, v6

    :goto_0
    check-cast v5, Lr3/w;

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Lr3/w;->run()V

    move v1, v4

    :goto_1
    return v1

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract shutdown()V
.end method
