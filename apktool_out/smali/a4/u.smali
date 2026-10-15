.class public final La4/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/d;


# static fields
.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;


# instance fields
.field public final a:Lx3/l;

.field public final b:Ly3/f;

.field public final c:La4/t;

.field public volatile d:La4/b0;

.field public final e:Lt3/x;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v8, ":method"

    const-string v9, ":path"

    const-string v10, ":scheme"

    const-string v11, ":authority"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu3/b;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, La4/u;->g:Ljava/util/List;

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    const-string v7, "encoding"

    const-string v8, "upgrade"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu3/b;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, La4/u;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lt3/w;Lx3/l;Ly3/f;La4/t;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La4/u;->a:Lx3/l;

    iput-object p3, p0, La4/u;->b:Ly3/f;

    iput-object p4, p0, La4/u;->c:La4/t;

    sget-object p2, Lt3/x;->g:Lt3/x;

    iget-object p1, p1, Lt3/w;->s:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lt3/x;->f:Lt3/x;

    :goto_0
    iput-object p2, p0, La4/u;->e:Lt3/x;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, La4/u;->d:La4/b0;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v0}, La4/b0;->f()La4/y;

    move-result-object v0

    invoke-virtual {v0}, La4/y;->close()V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, La4/u;->c:La4/t;

    invoke-virtual {v0}, La4/t;->flush()V

    return-void
.end method

.method public final c(Li/w;J)Lf4/u;
    .locals 0

    iget-object p1, p0, La4/u;->d:La4/b0;

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {p1}, La4/b0;->f()La4/y;

    move-result-object p1

    return-object p1
.end method

.method public final cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, La4/u;->f:Z

    iget-object v0, p0, La4/u;->d:La4/b0;

    if-eqz v0, :cond_0

    sget-object v1, La4/b;->h:La4/b;

    invoke-virtual {v0, v1}, La4/b0;->e(La4/b;)V

    :cond_0
    return-void
.end method

.method public final d(Lt3/b0;)Lf4/w;
    .locals 0

    iget-object p1, p0, La4/u;->d:La4/b0;

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object p1, p1, La4/b0;->i:La4/z;

    return-object p1
.end method

.method public final e(Z)Lt3/a0;
    .locals 10

    iget-object v0, p0, La4/u;->d:La4/b0;

    if-eqz v0, :cond_8

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, La4/b0;->k:La4/a0;

    invoke-virtual {v1}, Lf4/e;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-object v1, v0, La4/b0;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, La4/b0;->m:La4/b;

    if-nez v1, :cond_0

    invoke-virtual {v0}, La4/b0;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :try_start_2
    iget-object v1, v0, La4/b0;->k:La4/a0;

    invoke-virtual {v1}, La4/a0;->l()V

    iget-object v1, v0, La4/b0;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_6

    iget-object v1, v0, La4/b0;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "headersQueue.removeFirst()"

    invoke-static {v1, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lt3/q;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    iget-object v0, p0, La4/u;->e:Lt3/x;

    const-string v2, "protocol"

    invoke-static {v0, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lt3/p;

    invoke-direct {v2}, Lt3/p;-><init>()V

    invoke-virtual {v1}, Lt3/q;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v4

    :goto_1
    if-ge v5, v3, :cond_3

    invoke-virtual {v1, v5}, Lt3/q;->b(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v5}, Lt3/q;->d(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, ":status"

    invoke-static {v7, v9}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "HTTP/1.1 "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lf2/e;->H(Ljava/lang/String;)Ly3/h;

    move-result-object v6

    goto :goto_2

    :cond_1
    sget-object v9, La4/u;->h:Ljava/util/List;

    invoke-interface {v9, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v2, v7, v8}, Lt3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    if-eqz v6, :cond_5

    new-instance v1, Lt3/a0;

    invoke-direct {v1}, Lt3/a0;-><init>()V

    iput-object v0, v1, Lt3/a0;->b:Lt3/x;

    iget v0, v6, Ly3/h;->b:I

    iput v0, v1, Lt3/a0;->c:I

    iget-object v0, v6, Ly3/h;->c:Ljava/lang/String;

    const-string v3, "message"

    invoke-static {v0, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v1, Lt3/a0;->d:Ljava/lang/String;

    invoke-virtual {v2}, Lt3/p;->b()Lt3/q;

    move-result-object v0

    invoke-virtual {v0}, Lt3/q;->c()Lt3/p;

    move-result-object v0

    iput-object v0, v1, Lt3/a0;->f:Lt3/p;

    if-eqz p1, :cond_4

    iget p1, v1, Lt3/a0;->c:I

    const/16 v0, 0x64

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v1

    :goto_3
    return-object v4

    :cond_5
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Expected \':status\' header not present"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_6

    :cond_6
    :try_start_3
    iget-object p1, v0, La4/b0;->n:Ljava/io/IOException;

    if-eqz p1, :cond_7

    goto :goto_4

    :cond_7
    new-instance p1, La4/h0;

    iget-object v1, v0, La4/b0;->m:La4/b;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-direct {p1, v1}, La4/h0;-><init>(La4/b;)V

    :goto_4
    throw p1

    :goto_5
    iget-object v1, v0, La4/b0;->k:La4/a0;

    invoke-virtual {v1}, La4/a0;->l()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_6
    monitor-exit v0

    throw p1

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "stream wasn\'t created"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Lt3/b0;)J
    .locals 2

    invoke-static {p1}, Ly3/e;->a(Lt3/b0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lu3/b;->j(Lt3/b0;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final g(Li/w;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, La4/u;->d:La4/b0;

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, Li/w;->e:Ljava/lang/Object;

    check-cast v2, Lt3/z;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    iget-object v5, v0, Li/w;->d:Ljava/lang/Object;

    check-cast v5, Lt3/q;

    new-instance v6, Ljava/util/ArrayList;

    invoke-virtual {v5}, Lt3/q;->size()I

    move-result v7

    const/4 v8, 0x4

    add-int/2addr v7, v8

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v7, La4/c;

    sget-object v9, La4/c;->f:Lf4/j;

    iget-object v10, v0, Li/w;->c:Ljava/io/Serializable;

    check-cast v10, Ljava/lang/String;

    invoke-direct {v7, v9, v10}, La4/c;-><init>(Lf4/j;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v7, La4/c;

    sget-object v9, La4/c;->g:Lf4/j;

    iget-object v10, v0, Li/w;->b:Ljava/lang/Object;

    check-cast v10, Lt3/s;

    invoke-static {v10}, Lc3/h;->h2(Lt3/s;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v7, v9, v11}, La4/c;-><init>(Lf4/j;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "Host"

    iget-object v0, v0, Li/w;->d:Ljava/lang/Object;

    check-cast v0, Lt3/q;

    invoke-virtual {v0, v7}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v7, La4/c;

    sget-object v9, La4/c;->i:Lf4/j;

    invoke-direct {v7, v9, v0}, La4/c;-><init>(Lf4/j;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance v0, La4/c;

    sget-object v7, La4/c;->h:Lf4/j;

    iget-object v9, v10, Lt3/s;->a:Ljava/lang/String;

    invoke-direct {v0, v7, v9}, La4/c;-><init>(Lf4/j;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Lt3/q;->size()I

    move-result v0

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v0, :cond_5

    invoke-virtual {v5, v7}, Lt3/q;->b(I)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v11, "US"

    invoke-static {v10, v11}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v9, v10}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v10, La4/u;->g:Ljava/util/List;

    invoke-interface {v10, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    const-string v10, "te"

    invoke-static {v9, v10}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v5, v7}, Lt3/q;->d(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "trailers"

    invoke-static {v10, v11}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    :cond_3
    new-instance v10, La4/c;

    invoke-virtual {v5, v7}, Lt3/q;->d(I)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v9, v11}, La4/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    iget-object v5, v1, La4/u;->c:La4/t;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    xor-int/lit8 v0, v2, 0x1

    const/4 v13, 0x0

    iget-object v7, v5, La4/t;->z:La4/c0;

    monitor-enter v7

    :try_start_0
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget v9, v5, La4/t;->g:I

    const v10, 0x3fffffff    # 1.9999999f

    if-le v9, v10, :cond_6

    sget-object v9, La4/b;->g:La4/b;

    invoke-virtual {v5, v9}, La4/t;->x(La4/b;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_6
    :goto_2
    iget-boolean v9, v5, La4/t;->h:Z

    if-nez v9, :cond_10

    iget v15, v5, La4/t;->g:I

    add-int/lit8 v9, v15, 0x2

    iput v9, v5, La4/t;->g:I

    new-instance v14, La4/b0;

    const/16 v16, 0x0

    move-object v9, v14

    move v10, v15

    move-object v11, v5

    move v12, v0

    move-object v3, v14

    move-object/from16 v14, v16

    invoke-direct/range {v9 .. v14}, La4/b0;-><init>(ILa4/t;ZZLt3/q;)V

    if-eqz v2, :cond_8

    iget-wide v9, v5, La4/t;->w:J

    iget-wide v11, v5, La4/t;->x:J

    cmp-long v2, v9, v11

    if-gez v2, :cond_8

    iget-wide v9, v3, La4/b0;->e:J

    iget-wide v11, v3, La4/b0;->f:J

    cmp-long v2, v9, v11

    if-ltz v2, :cond_7

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    goto :goto_4

    :cond_8
    :goto_3
    move v2, v4

    :goto_4
    invoke-virtual {v3}, La4/b0;->h()Z

    move-result v9

    if-eqz v9, :cond_9

    iget-object v9, v5, La4/t;->d:Ljava/util/LinkedHashMap;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_9
    :try_start_2
    monitor-exit v5

    iget-object v9, v5, La4/t;->z:La4/c0;

    monitor-enter v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-boolean v10, v9, La4/c0;->f:Z

    if-nez v10, :cond_f

    iget-object v10, v9, La4/c0;->g:La4/e;

    invoke-virtual {v10, v6}, La4/e;->d(Ljava/util/ArrayList;)V

    iget-object v6, v9, La4/c0;->d:Lf4/g;

    iget-wide v10, v6, Lf4/g;->c:J

    iget v6, v9, La4/c0;->e:I

    int-to-long v12, v6

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    cmp-long v6, v10, v12

    if-nez v6, :cond_a

    move/from16 v17, v8

    goto :goto_5

    :cond_a
    const/16 v17, 0x0

    :goto_5
    if-eqz v0, :cond_b

    or-int/lit8 v17, v17, 0x1

    :cond_b
    move/from16 v0, v17

    long-to-int v8, v12

    invoke-virtual {v9, v15, v8, v4, v0}, La4/c0;->h(IIII)V

    iget-object v0, v9, La4/c0;->b:Lf4/h;

    iget-object v4, v9, La4/c0;->d:Lf4/g;

    invoke-interface {v0, v4, v12, v13}, Lf4/u;->D(Lf4/g;J)V

    if-lez v6, :cond_c

    sub-long/2addr v10, v12

    invoke-virtual {v9, v15, v10, v11}, La4/c0;->F(IJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_c
    :goto_6
    :try_start_4
    monitor-exit v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v7

    if-eqz v2, :cond_d

    iget-object v0, v5, La4/t;->z:La4/c0;

    invoke-virtual {v0}, La4/c0;->flush()V

    :cond_d
    iput-object v3, v1, La4/u;->d:La4/b0;

    iget-boolean v0, v1, La4/u;->f:Z

    if-nez v0, :cond_e

    iget-object v0, v1, La4/u;->d:La4/b0;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v0, v0, La4/b0;->k:La4/a0;

    iget-object v2, v1, La4/u;->b:Ly3/f;

    iget v2, v2, Ly3/f;->g:I

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v4}, Lf4/y;->g(JLjava/util/concurrent/TimeUnit;)Lf4/y;

    iget-object v0, v1, La4/u;->d:La4/b0;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v0, v0, La4/b0;->l:La4/a0;

    iget-object v2, v1, La4/u;->b:Ly3/f;

    iget v2, v2, Ly3/f;->h:I

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3, v4}, Lf4/y;->g(JLjava/util/concurrent/TimeUnit;)Lf4/y;

    return-void

    :cond_e
    iget-object v0, v1, La4/u;->d:La4/b0;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    sget-object v2, La4/b;->h:La4/b;

    invoke-virtual {v0, v2}, La4/b0;->e(La4/b;)V

    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_7
    :try_start_6
    monitor-exit v9

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_9

    :cond_10
    :try_start_7
    new-instance v0, La4/a;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_8
    :try_start_8
    monitor-exit v5

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_9
    monitor-exit v7

    throw v0
.end method

.method public final h()Lx3/l;
    .locals 1

    iget-object v0, p0, La4/u;->a:Lx3/l;

    return-object v0
.end method
