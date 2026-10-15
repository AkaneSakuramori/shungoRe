.class public final Lw3/b;
.super Lw3/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/String;)V
    .locals 0

    iput p1, p0, Lw3/b;->e:I

    iput-object p2, p0, Lw3/b;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p3, p1}, Lw3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Lx3/m;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw3/b;->e:I

    iput-object p1, p0, Lw3/b;->f:Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p2, v0}, Lw3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 15

    iget v0, p0, Lw3/b;->e:I

    const/4 v1, 0x0

    const-wide/16 v2, -0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw3/b;->f:Ljava/lang/Object;

    check-cast v0, La4/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v4, v0, La4/t;->z:La4/c0;

    const/4 v5, 0x2

    invoke-virtual {v4, v5, v1, v1}, La4/c0;->x(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v0, v1}, La4/t;->e(Ljava/io/IOException;)V

    :goto_0
    return-wide v2

    :pswitch_0
    iget-object v0, p0, Lw3/b;->f:Ljava/lang/Object;

    check-cast v0, Lx3/m;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    iget-object v6, v0, Lx3/m;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    const-wide/high16 v8, -0x8000000000000000L

    move-wide v9, v8

    move-object v8, v7

    move v7, v1

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lx3/l;

    const-string v12, "connection"

    invoke-static {v11, v12}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v11

    :try_start_1
    invoke-virtual {v0, v11, v4, v5}, Lx3/m;->b(Lx3/l;J)I

    move-result v12

    if-lez v12, :cond_0

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    iget-wide v12, v11, Lx3/l;->q:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-long v12, v4, v12

    cmp-long v14, v12, v9

    if-lez v14, :cond_1

    move-object v8, v11

    move-wide v9, v12

    :cond_1
    :goto_2
    monitor-exit v11

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v11

    throw v0

    :cond_2
    iget-wide v11, v0, Lx3/m;->b:J

    cmp-long v6, v9, v11

    if-gez v6, :cond_5

    iget v6, v0, Lx3/m;->a:I

    if-le v1, v6, :cond_3

    goto :goto_3

    :cond_3
    if-lez v1, :cond_4

    sub-long v2, v11, v9

    goto :goto_5

    :cond_4
    if-lez v7, :cond_9

    move-wide v2, v11

    goto :goto_5

    :cond_5
    :goto_3
    invoke-static {v8}, Lc3/h;->X(Ljava/lang/Object;)V

    monitor-enter v8

    :try_start_2
    iget-object v1, v8, Lx3/l;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const-wide/16 v6, 0x0

    if-eqz v1, :cond_7

    monitor-exit v8

    :cond_6
    :goto_4
    move-wide v2, v6

    goto :goto_5

    :cond_7
    :try_start_3
    iget-wide v11, v8, Lx3/l;->q:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    add-long/2addr v11, v9

    cmp-long v1, v11, v4

    if-eqz v1, :cond_8

    monitor-exit v8

    goto :goto_4

    :cond_8
    :try_start_4
    iput-boolean v2, v8, Lx3/l;->j:Z

    iget-object v1, v0, Lx3/m;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, v8}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v8

    iget-object v1, v8, Lx3/l;->d:Ljava/net/Socket;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-static {v1}, Lu3/b;->d(Ljava/net/Socket;)V

    iget-object v1, v0, Lx3/m;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v0, v0, Lx3/m;->c:Lw3/c;

    invoke-virtual {v0}, Lw3/c;->a()V

    goto :goto_4

    :cond_9
    :goto_5
    return-wide v2

    :catchall_1
    move-exception v0

    monitor-exit v8

    throw v0

    :pswitch_1
    iget-object v0, p0, Lw3/b;->f:Ljava/lang/Object;

    check-cast v0, Lj3/a;

    invoke-interface {v0}, Lj3/a;->a()Ljava/lang/Object;

    return-wide v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
