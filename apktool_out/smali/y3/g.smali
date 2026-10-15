.class public final Ly3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt3/t;


# instance fields
.field public final a:Lt3/w;


# direct methods
.method public constructor <init>(Lt3/w;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/g;->a:Lt3/w;

    return-void
.end method

.method public static d(Lt3/b0;I)I
    .locals 1

    const-string v0, "Retry-After"

    invoke-static {p0, v0}, Lt3/b0;->a(Lt3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return p1

    :cond_0
    new-instance p1, Lq3/f;

    const-string v0, "\\d+"

    invoke-direct {p1, v0}, Lq3/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lq3/f;->a(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "valueOf(header)"

    invoke-static {p0, p1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0

    :cond_1
    const p0, 0x7fffffff

    return p0
.end method


# virtual methods
.method public final a(Ly3/f;)Lt3/b0;
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget-object v0, v2, Ly3/f;->e:Li/w;

    iget-object v3, v2, Ly3/f;->a:Lx3/j;

    sget-object v4, La3/p;->b:La3/p;

    const/4 v5, 0x1

    move-object v8, v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, v0

    move v0, v5

    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "request"

    invoke-static {v4, v11}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v3, Lx3/j;->m:Lx3/e;

    if-nez v11, :cond_11

    monitor-enter v3

    :try_start_0
    iget-boolean v11, v3, Lx3/j;->o:Z

    xor-int/2addr v11, v5

    if-eqz v11, :cond_10

    iget-boolean v11, v3, Lx3/j;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    xor-int/2addr v11, v5

    if-eqz v11, :cond_f

    monitor-exit v3

    if-eqz v0, :cond_2

    new-instance v0, Lx3/f;

    iget-object v11, v3, Lx3/j;->e:Lx3/m;

    iget-object v12, v4, Li/w;->b:Ljava/lang/Object;

    check-cast v12, Lt3/s;

    iget-boolean v13, v12, Lt3/s;->i:Z

    iget-object v14, v3, Lx3/j;->b:Lt3/w;

    if-eqz v13, :cond_1

    iget-object v13, v14, Lt3/w;->p:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v13, :cond_0

    iget-object v15, v14, Lt3/w;->t:Le4/c;

    iget-object v7, v14, Lt3/w;->u:Lt3/f;

    move-object/from16 v23, v7

    move-object/from16 v21, v13

    move-object/from16 v22, v15

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "CLEARTEXT-only client"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    :goto_1
    new-instance v7, Lt3/a;

    iget-object v13, v12, Lt3/s;->d:Ljava/lang/String;

    iget v12, v12, Lt3/s;->e:I

    iget-object v15, v14, Lt3/w;->l:Lt3/n;

    iget-object v5, v14, Lt3/w;->o:Ljavax/net/SocketFactory;

    iget-object v6, v14, Lt3/w;->n:Lt3/n;

    move-object/from16 v28, v8

    iget-object v8, v14, Lt3/w;->s:Ljava/util/List;

    move/from16 v29, v10

    iget-object v10, v14, Lt3/w;->r:Ljava/util/List;

    iget-object v14, v14, Lt3/w;->m:Ljava/net/ProxySelector;

    move-object/from16 v16, v7

    move-object/from16 v17, v13

    move/from16 v18, v12

    move-object/from16 v19, v15

    move-object/from16 v20, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v8

    move-object/from16 v26, v10

    move-object/from16 v27, v14

    invoke-direct/range {v16 .. v27}, Lt3/a;-><init>(Ljava/lang/String;ILt3/n;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Le4/c;Lt3/f;Lt3/n;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    iget-object v5, v3, Lx3/j;->f:Lt3/n;

    invoke-direct {v0, v11, v7, v3, v5}, Lx3/f;-><init>(Lx3/m;Lt3/a;Lx3/j;Lt3/n;)V

    iput-object v0, v3, Lx3/j;->j:Lx3/f;

    goto :goto_2

    :cond_2
    move-object/from16 v28, v8

    move/from16 v29, v10

    :goto_2
    :try_start_1
    iget-boolean v0, v3, Lx3/j;->q:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_e

    :try_start_2
    invoke-virtual {v2, v4}, Ly3/f;->b(Li/w;)Lt3/b0;

    move-result-object v0
    :try_end_2
    .catch Lx3/n; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v9, :cond_4

    :try_start_3
    invoke-virtual {v0}, Lt3/b0;->e()Lt3/a0;

    move-result-object v0

    invoke-virtual {v9}, Lt3/b0;->e()Lt3/a0;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, v4, Lt3/a0;->g:Lt3/d0;

    invoke-virtual {v4}, Lt3/a0;->a()Lt3/b0;

    move-result-object v4

    iget-object v6, v4, Lt3/b0;->h:Lt3/d0;

    if-nez v6, :cond_3

    iput-object v4, v0, Lt3/a0;->j:Lt3/b0;

    invoke-virtual {v0}, Lt3/a0;->a()Lt3/b0;

    move-result-object v0

    :goto_3
    move-object v9, v0

    goto :goto_4

    :catchall_0
    move-exception v0

    const/4 v2, 0x1

    goto/16 :goto_8

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "priorResponse.body != null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/4 v5, 0x0

    goto :goto_3

    :goto_4
    iget-object v0, v3, Lx3/j;->m:Lx3/e;

    invoke-virtual {v1, v9, v0}, Ly3/g;->b(Lt3/b0;Lx3/e;)Li/w;

    move-result-object v4

    if-nez v4, :cond_7

    if-eqz v0, :cond_5

    iget-boolean v0, v0, Lx3/e;->e:Z

    if-eqz v0, :cond_5

    iget-boolean v0, v3, Lx3/j;->l:Z

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-eqz v0, :cond_6

    iput-boolean v2, v3, Lx3/j;->l:Z

    iget-object v0, v3, Lx3/j;->g:Lx3/i;

    invoke-virtual {v0}, Lf4/e;->i()Z

    :cond_5
    const/4 v2, 0x0

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_5
    invoke-virtual {v3, v2}, Lx3/j;->f(Z)V

    return-object v9

    :cond_7
    :try_start_4
    iget-object v0, v9, Lt3/b0;->h:Lt3/d0;

    if-eqz v0, :cond_8

    invoke-static {v0}, Lu3/b;->c(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_8
    add-int/lit8 v10, v29, 0x1

    const/16 v0, 0x14

    if-gt v10, v0, :cond_9

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Lx3/j;->f(Z)V

    move-object/from16 v8, v28

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto/16 :goto_0

    :cond_9
    :try_start_5
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Too many follow-up requests: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    const/4 v5, 0x0

    move-object v6, v0

    nop

    instance-of v0, v6, La4/a;

    const/4 v7, 0x1

    xor-int/2addr v0, v7

    invoke-virtual {v1, v6, v3, v4, v0}, Ly3/g;->c(Ljava/io/IOException;Lx3/j;Li/w;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    move-object/from16 v8, v28

    invoke-static {v8, v6}, La3/n;->h3(Ljava/util/Collection;Ljava/io/Serializable;)Ljava/util/ArrayList;

    move-result-object v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v3, v7}, Lx3/j;->f(Z)V

    move v5, v7

    move/from16 v10, v29

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_a
    move-object/from16 v8, v28

    :try_start_6
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Exception;

    invoke-static {v6, v2}, Lc3/h;->F(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    throw v6

    :catch_1
    move-exception v0

    move-object/from16 v8, v28

    const/4 v5, 0x0

    move-object v6, v0

    iget-object v0, v6, Lx3/n;->c:Ljava/io/IOException;

    const/4 v7, 0x0

    invoke-virtual {v1, v0, v3, v4, v7}, Ly3/g;->c(Ljava/io/IOException;Lx3/j;Li/w;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, v6, Lx3/n;->b:Ljava/io/IOException;

    invoke-static {v8, v0}, La3/n;->h3(Ljava/util/Collection;Ljava/io/Serializable;)Ljava/util/ArrayList;

    move-result-object v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Lx3/j;->f(Z)V

    move v5, v6

    move v0, v7

    move/from16 v10, v29

    goto/16 :goto_0

    :cond_c
    :try_start_7
    iget-object v0, v6, Lx3/n;->b:Ljava/io/IOException;

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Exception;

    invoke-static {v0, v4}, Lc3/h;->F(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_7

    :cond_d
    throw v0

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_8
    invoke-virtual {v3, v2}, Lx3/j;->f(Z)V

    throw v0

    :cond_f
    :try_start_8
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_1
    move-exception v0

    goto :goto_9

    :cond_10
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_9
    monitor-exit v3

    throw v0

    :cond_11
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final b(Lt3/b0;Lx3/e;)Li/w;
    .locals 10

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object v1, p2, Lx3/e;->g:Lx3/l;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lx3/l;->b:Lt3/e0;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    iget v2, p1, Lt3/b0;->e:I

    iget-object v3, p1, Lt3/b0;->b:Li/w;

    iget-object v3, v3, Li/w;->c:Ljava/io/Serializable;

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    const/16 v5, 0x134

    const/16 v6, 0x133

    const/4 v7, 0x1

    if-eq v2, v6, :cond_e

    if-eq v2, v5, :cond_e

    const/16 v8, 0x191

    if-eq v2, v8, :cond_d

    const/16 v8, 0x1a5

    if-eq v2, v8, :cond_a

    const/16 p2, 0x1f7

    if-eq v2, p2, :cond_7

    const/16 p2, 0x197

    if-eq v2, p2, :cond_5

    const/16 p2, 0x198

    if-eq v2, p2, :cond_1

    packed-switch v2, :pswitch_data_0

    return-object v0

    :cond_1
    iget-object v1, p0, Ly3/g;->a:Lt3/w;

    iget-boolean v1, v1, Lt3/w;->g:Z

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    iget-object v1, p1, Lt3/b0;->k:Lt3/b0;

    if-eqz v1, :cond_3

    iget v1, v1, Lt3/b0;->e:I

    if-ne v1, p2, :cond_3

    return-object v0

    :cond_3
    invoke-static {p1, v4}, Ly3/g;->d(Lt3/b0;I)I

    move-result p2

    if-lez p2, :cond_4

    return-object v0

    :cond_4
    iget-object p1, p1, Lt3/b0;->b:Li/w;

    return-object p1

    :cond_5
    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object p1, v1, Lt3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p1

    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p1, p2, :cond_6

    iget-object p1, p0, Ly3/g;->a:Lt3/w;

    iget-object p1, p1, Lt3/w;->n:Lt3/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    iget-object v1, p1, Lt3/b0;->k:Lt3/b0;

    if-eqz v1, :cond_8

    iget v1, v1, Lt3/b0;->e:I

    if-ne v1, p2, :cond_8

    return-object v0

    :cond_8
    const p2, 0x7fffffff

    invoke-static {p1, p2}, Ly3/g;->d(Lt3/b0;I)I

    move-result p2

    if-nez p2, :cond_9

    iget-object p1, p1, Lt3/b0;->b:Li/w;

    return-object p1

    :cond_9
    return-object v0

    :cond_a
    if-eqz p2, :cond_c

    iget-object v1, p2, Lx3/e;->c:Lx3/f;

    iget-object v1, v1, Lx3/f;->b:Lt3/a;

    iget-object v1, v1, Lt3/a;->i:Lt3/s;

    iget-object v1, v1, Lt3/s;->d:Ljava/lang/String;

    iget-object v2, p2, Lx3/e;->g:Lx3/l;

    iget-object v2, v2, Lx3/l;->b:Lt3/e0;

    iget-object v2, v2, Lt3/e0;->a:Lt3/a;

    iget-object v2, v2, Lt3/a;->i:Lt3/s;

    iget-object v2, v2, Lt3/s;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v7

    if-nez v1, :cond_b

    goto :goto_1

    :cond_b
    iget-object p2, p2, Lx3/e;->g:Lx3/l;

    monitor-enter p2

    :try_start_0
    iput-boolean v7, p2, Lx3/l;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    iget-object p1, p1, Lt3/b0;->b:Li/w;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_c
    :goto_1
    return-object v0

    :cond_d
    iget-object p1, p0, Ly3/g;->a:Lt3/w;

    iget-object p1, p1, Lt3/w;->h:Lt3/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :cond_e
    :pswitch_0
    iget-object p2, p0, Ly3/g;->a:Lt3/w;

    iget-boolean v1, p2, Lt3/w;->i:Z

    if-nez v1, :cond_f

    goto/16 :goto_5

    :cond_f
    const-string v1, "Location"

    invoke-static {p1, v1}, Lt3/b0;->a(Lt3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_10

    goto/16 :goto_5

    :cond_10
    iget-object v2, p1, Lt3/b0;->b:Li/w;

    iget-object v8, v2, Li/w;->b:Ljava/lang/Object;

    check-cast v8, Lt3/s;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    new-instance v9, Lt3/r;

    invoke-direct {v9}, Lt3/r;-><init>()V

    invoke-virtual {v9, v8, v1}, Lt3/r;->c(Lt3/s;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-object v9, v0

    :goto_2
    if-eqz v9, :cond_11

    invoke-virtual {v9}, Lt3/r;->b()Lt3/s;

    move-result-object v1

    goto :goto_3

    :cond_11
    move-object v1, v0

    :goto_3
    if-nez v1, :cond_12

    goto/16 :goto_5

    :cond_12
    iget-object v8, v2, Li/w;->b:Ljava/lang/Object;

    check-cast v8, Lt3/s;

    iget-object v8, v8, Lt3/s;->a:Ljava/lang/String;

    iget-object v9, v1, Lt3/s;->a:Ljava/lang/String;

    invoke-static {v9, v8}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    iget-boolean p2, p2, Lt3/w;->j:Z

    if-nez p2, :cond_13

    goto :goto_5

    :cond_13
    invoke-virtual {v2}, Li/w;->f()Lt3/y;

    move-result-object p2

    invoke-static {v3}, Lc3/h;->T1(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_18

    const-string v8, "PROPFIND"

    invoke-static {v3, v8}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    iget p1, p1, Lt3/b0;->e:I

    if-nez v9, :cond_14

    if-eq p1, v5, :cond_14

    if-ne p1, v6, :cond_15

    :cond_14
    move v4, v7

    :cond_15
    invoke-static {v3, v8}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    xor-int/2addr v7, v8

    if-eqz v7, :cond_16

    if-eq p1, v5, :cond_16

    if-eq p1, v6, :cond_16

    const-string p1, "GET"

    invoke-virtual {p2, p1, v0}, Lt3/y;->d(Ljava/lang/String;Lt3/z;)V

    goto :goto_4

    :cond_16
    if-eqz v4, :cond_17

    iget-object p1, v2, Li/w;->e:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lt3/z;

    :cond_17
    invoke-virtual {p2, v3, v0}, Lt3/y;->d(Ljava/lang/String;Lt3/z;)V

    :goto_4
    if-nez v4, :cond_18

    const-string p1, "Transfer-Encoding"

    iget-object v0, p2, Lt3/y;->c:Lt3/p;

    invoke-virtual {v0, p1}, Lt3/p;->c(Ljava/lang/String;)V

    const-string p1, "Content-Length"

    iget-object v0, p2, Lt3/y;->c:Lt3/p;

    invoke-virtual {v0, p1}, Lt3/p;->c(Ljava/lang/String;)V

    const-string p1, "Content-Type"

    iget-object v0, p2, Lt3/y;->c:Lt3/p;

    invoke-virtual {v0, p1}, Lt3/p;->c(Ljava/lang/String;)V

    :cond_18
    iget-object p1, v2, Li/w;->b:Ljava/lang/Object;

    check-cast p1, Lt3/s;

    invoke-static {p1, v1}, Lu3/b;->a(Lt3/s;Lt3/s;)Z

    move-result p1

    if-nez p1, :cond_19

    const-string p1, "Authorization"

    iget-object v0, p2, Lt3/y;->c:Lt3/p;

    invoke-virtual {v0, p1}, Lt3/p;->c(Ljava/lang/String;)V

    :cond_19
    iput-object v1, p2, Lt3/y;->a:Lt3/s;

    invoke-virtual {p2}, Lt3/y;->b()Li/w;

    move-result-object v0

    :goto_5
    return-object v0

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/io/IOException;Lx3/j;Li/w;Z)Z
    .locals 3

    iget-object p3, p0, Ly3/g;->a:Lt3/w;

    iget-boolean p3, p3, Lt3/w;->g:Z

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    if-eqz p4, :cond_1

    instance-of p3, p1, Ljava/io/FileNotFoundException;

    if-eqz p3, :cond_1

    return v0

    :cond_1
    instance-of p3, p1, Ljava/net/ProtocolException;

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    if-eqz p3, :cond_3

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_5

    if-nez p4, :cond_5

    goto :goto_1

    :cond_3
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p3, :cond_4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    instance-of p3, p3, Ljava/security/cert/CertificateException;

    if-eqz p3, :cond_4

    goto :goto_0

    :cond_4
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_6

    :cond_5
    :goto_0
    return v0

    :cond_6
    :goto_1
    iget-object p1, p2, Lx3/j;->j:Lx3/f;

    invoke-static {p1}, Lc3/h;->X(Ljava/lang/Object;)V

    iget p2, p1, Lx3/f;->g:I

    if-nez p2, :cond_7

    iget p3, p1, Lx3/f;->h:I

    if-nez p3, :cond_7

    iget p3, p1, Lx3/f;->i:I

    if-nez p3, :cond_7

    goto :goto_3

    :cond_7
    iget-object p3, p1, Lx3/f;->j:Lt3/e0;

    const/4 p4, 0x1

    if-eqz p3, :cond_8

    goto :goto_4

    :cond_8
    const/4 p3, 0x0

    if-gt p2, p4, :cond_d

    iget p2, p1, Lx3/f;->h:I

    if-gt p2, p4, :cond_d

    iget p2, p1, Lx3/f;->i:I

    if-lez p2, :cond_9

    goto :goto_2

    :cond_9
    iget-object p2, p1, Lx3/f;->c:Lx3/j;

    iget-object p2, p2, Lx3/j;->k:Lx3/l;

    if-nez p2, :cond_a

    goto :goto_2

    :cond_a
    monitor-enter p2

    :try_start_0
    iget v1, p2, Lx3/l;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_b

    monitor-exit p2

    goto :goto_2

    :cond_b
    :try_start_1
    iget-object v1, p2, Lx3/l;->b:Lt3/e0;

    iget-object v1, v1, Lt3/e0;->a:Lt3/a;

    iget-object v1, v1, Lt3/a;->i:Lt3/s;

    iget-object v2, p1, Lx3/f;->b:Lt3/a;

    iget-object v2, v2, Lt3/a;->i:Lt3/s;

    invoke-static {v1, v2}, Lu3/b;->a(Lt3/s;Lt3/s;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_c

    monitor-exit p2

    goto :goto_2

    :cond_c
    :try_start_2
    iget-object p3, p2, Lx3/l;->b:Lt3/e0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p2

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_d
    :goto_2
    if-eqz p3, :cond_e

    iput-object p3, p1, Lx3/f;->j:Lt3/e0;

    goto :goto_4

    :cond_e
    iget-object p2, p1, Lx3/f;->e:Le/i;

    if-eqz p2, :cond_f

    invoke-virtual {p2}, Le/i;->b()Z

    move-result p2

    if-ne p2, p4, :cond_f

    goto :goto_4

    :cond_f
    iget-object p1, p1, Lx3/f;->f:Lx3/o;

    if-nez p1, :cond_10

    goto :goto_4

    :cond_10
    invoke-virtual {p1}, Lx3/o;->a()Z

    move-result p1

    if-nez p1, :cond_11

    :goto_3
    return v0

    :cond_11
    :goto_4
    return p4
.end method
