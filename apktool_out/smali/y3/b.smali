.class public final Ly3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt3/t;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ly3/b;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Ly3/f;)Lt3/b0;
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "Connection"

    const-string v2, "close"

    const-string v3, "call"

    const-string v4, "HTTP "

    iget-object v5, v0, Ly3/f;->d:Lx3/e;

    invoke-static {v5}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v6, v5, Lx3/e;->d:Ly3/d;

    iget-object v7, v5, Lx3/e;->b:Lt3/n;

    iget-object v8, v5, Lx3/e;->a:Lx3/j;

    iget-object v9, v5, Lx3/e;->g:Lx3/l;

    iget-object v10, v0, Ly3/f;->e:Li/w;

    iget-object v0, v10, Li/w;->e:Ljava/lang/Object;

    check-cast v0, Lt3/z;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v10}, Ly3/d;->g(Li/w;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_b

    :try_start_1
    iget-object v14, v10, Li/w;->c:Ljava/io/Serializable;

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Lc3/h;->T1(Ljava/lang/String;)Z

    move-result v14
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_a

    if-eqz v14, :cond_3

    if-eqz v0, :cond_3

    :try_start_2
    const-string v14, "100-continue"

    const-string v15, "Expect"
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    iget-object v13, v10, Li/w;->d:Ljava/lang/Object;

    check-cast v13, Lt3/q;

    invoke-virtual {v13, v15}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6

    :try_start_4
    invoke-static {v14, v13}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v13
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    if-eqz v13, :cond_0

    :try_start_5
    invoke-interface {v6}, Ly3/d;->b()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    const/4 v13, 0x1

    :try_start_6
    invoke-virtual {v5, v13}, Lx3/e;->c(Z)Lt3/a0;

    move-result-object v14
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    :try_start_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    const/4 v13, 0x0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object/from16 v18, v4

    move-object/from16 v16, v14

    const/4 v13, 0x1

    :goto_0
    const/4 v14, 0x0

    goto/16 :goto_7

    :catch_1
    move-exception v0

    :goto_1
    move-object/from16 v18, v4

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/16 v16, 0x0

    goto/16 :goto_7

    :catch_2
    move-exception v0

    move-object v13, v0

    :try_start_8
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v13}, Lx3/e;->d(Ljava/io/IOException;)V

    throw v13
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1

    :cond_0
    const/4 v13, 0x1

    const/4 v14, 0x0

    :goto_2
    if-nez v14, :cond_1

    const/4 v15, 0x0

    :try_start_9
    iput-boolean v15, v5, Lx3/e;->e:Z

    iget-object v15, v10, Li/w;->e:Ljava/lang/Object;

    check-cast v15, Lt3/z;

    invoke-static {v15}, Lc3/h;->X(Ljava/lang/Object;)V

    iget v15, v15, Lt3/z;->b:I
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    move/from16 v17, v13

    move-object/from16 v16, v14

    int-to-long v13, v15

    :try_start_a
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v10, v13, v14}, Ly3/d;->c(Li/w;J)Lf4/u;

    move-result-object v15
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4

    move-object/from16 v18, v4

    :try_start_b
    new-instance v4, Lx3/c;

    invoke-direct {v4, v5, v15, v13, v14}, Lx3/c;-><init>(Lx3/e;Lf4/u;J)V

    new-instance v13, Lf4/p;

    invoke-direct {v13, v4}, Lf4/p;-><init>(Lf4/u;)V

    iget v4, v0, Lt3/z;->b:I

    iget-object v14, v0, Lt3/z;->c:[B

    iget v0, v0, Lt3/z;->d:I

    invoke-virtual {v13, v14, v0, v4}, Lf4/p;->e([BII)Lf4/h;

    invoke-virtual {v13}, Lf4/p;->close()V

    goto :goto_4

    :catch_3
    move-exception v0

    :goto_3
    move/from16 v13, v17

    goto :goto_0

    :catch_4
    move-exception v0

    move-object/from16 v18, v4

    goto :goto_3

    :catch_5
    move-exception v0

    move-object/from16 v18, v4

    move/from16 v17, v13

    move-object/from16 v16, v14

    goto :goto_3

    :cond_1
    move-object/from16 v18, v4

    move/from16 v17, v13

    move-object/from16 v16, v14

    const/4 v4, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual {v8, v5, v4, v14, v13}, Lx3/j;->h(Lx3/e;ZZLjava/io/IOException;)Ljava/io/IOException;

    iget-object v0, v9, Lx3/l;->g:La4/t;

    if-eqz v0, :cond_2

    goto :goto_4

    :cond_2
    invoke-interface {v6}, Ly3/d;->h()Lx3/l;

    move-result-object v0

    invoke-virtual {v0}, Lx3/l;->k()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3

    :goto_4
    move/from16 v13, v17

    const/4 v14, 0x0

    goto :goto_5

    :catch_6
    move-exception v0

    goto :goto_1

    :cond_3
    move-object/from16 v18, v4

    const/4 v4, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    :try_start_c
    invoke-virtual {v8, v5, v4, v13, v14}, Lx3/j;->h(Lx3/e;ZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_9

    move v13, v4

    move-object/from16 v16, v14

    :goto_5
    :try_start_d
    invoke-interface {v6}, Ly3/d;->a()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    move v15, v13

    move-object v13, v14

    goto :goto_8

    :catch_7
    move-exception v0

    move-object v4, v0

    :try_start_e
    invoke-virtual {v5, v4}, Lx3/e;->d(Ljava/io/IOException;)V

    throw v4
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_8

    :catch_8
    move-exception v0

    goto :goto_7

    :catch_9
    move-exception v0

    :goto_6
    move v13, v4

    move-object/from16 v16, v14

    goto :goto_7

    :catch_a
    move-exception v0

    move-object/from16 v18, v4

    const/4 v4, 0x1

    const/4 v14, 0x0

    goto :goto_6

    :catch_b
    move-exception v0

    move-object/from16 v18, v4

    const/4 v4, 0x1

    const/4 v14, 0x0

    :try_start_f
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Lx3/e;->d(Ljava/io/IOException;)V

    throw v0
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9

    :goto_7
    instance-of v4, v0, La4/a;

    if-nez v4, :cond_11

    iget-boolean v4, v5, Lx3/e;->f:Z

    if-eqz v4, :cond_10

    move v15, v13

    move-object v13, v0

    :goto_8
    if-nez v16, :cond_4

    const/4 v4, 0x0

    :try_start_10
    invoke-virtual {v5, v4}, Lx3/e;->c(Z)Lt3/a0;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lc3/h;->X(Ljava/lang/Object;)V

    if-eqz v15, :cond_4

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, v16

    const/4 v15, 0x0

    goto :goto_a

    :goto_9
    move-object/from16 v3, p0

    goto/16 :goto_10

    :cond_4
    move-object/from16 v0, v16

    goto :goto_a

    :catch_c
    move-exception v0

    goto :goto_9

    :goto_a
    iput-object v10, v0, Lt3/a0;->a:Li/w;

    iget-object v4, v9, Lx3/l;->e:Lt3/o;

    iput-object v4, v0, Lt3/a0;->e:Lt3/o;

    iput-wide v11, v0, Lt3/a0;->k:J

    move v4, v15

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    iput-wide v14, v0, Lt3/a0;->l:J

    invoke-virtual {v0}, Lt3/a0;->a()Lt3/b0;

    move-result-object v0

    iget v14, v0, Lt3/b0;->e:I

    const/16 v15, 0x64

    if-ne v14, v15, :cond_5

    :goto_b
    const/4 v14, 0x0

    goto :goto_c

    :cond_5
    const/16 v15, 0x66

    if-gt v15, v14, :cond_7

    const/16 v15, 0xc8

    if-ge v14, v15, :cond_7

    goto :goto_b

    :goto_c
    invoke-virtual {v5, v14}, Lx3/e;->c(Z)Lt3/a0;

    move-result-object v0

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    if-eqz v4, :cond_6

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    iput-object v10, v0, Lt3/a0;->a:Li/w;

    iget-object v4, v9, Lx3/l;->e:Lt3/o;

    iput-object v4, v0, Lt3/a0;->e:Lt3/o;

    iput-wide v11, v0, Lt3/a0;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iput-wide v9, v0, Lt3/a0;->l:J

    invoke-virtual {v0}, Lt3/a0;->a()Lt3/b0;

    move-result-object v0

    iget v14, v0, Lt3/b0;->e:I

    :cond_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_c

    move-object/from16 v3, p0

    :try_start_11
    iget-boolean v4, v3, Ly3/b;->a:Z

    if-eqz v4, :cond_8

    const/16 v4, 0x65

    if-ne v14, v4, :cond_8

    invoke-virtual {v0}, Lt3/b0;->e()Lt3/a0;

    move-result-object v0

    sget-object v4, Lu3/b;->c:Lt3/c0;

    iput-object v4, v0, Lt3/a0;->g:Lt3/d0;

    invoke-virtual {v0}, Lt3/a0;->a()Lt3/b0;

    move-result-object v0

    goto :goto_d

    :catch_d
    move-exception v0

    goto/16 :goto_10

    :cond_8
    invoke-virtual {v0}, Lt3/b0;->e()Lt3/a0;

    move-result-object v4

    invoke-virtual {v5, v0}, Lx3/e;->b(Lt3/b0;)Lt3/c0;

    move-result-object v0

    iput-object v0, v4, Lt3/a0;->g:Lt3/d0;

    invoke-virtual {v4}, Lt3/a0;->a()Lt3/b0;

    move-result-object v0

    :goto_d
    iget-object v4, v0, Lt3/b0;->b:Li/w;

    iget-object v4, v4, Li/w;->d:Ljava/lang/Object;

    check-cast v4, Lt3/q;

    invoke-virtual {v4, v1}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_9

    invoke-static {v0, v1}, Lt3/b0;->a(Lt3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    :cond_9
    invoke-interface {v6}, Ly3/d;->h()Lx3/l;

    move-result-object v1

    invoke-virtual {v1}, Lx3/l;->k()V

    :cond_a
    const/16 v1, 0xcc

    if-eq v14, v1, :cond_b

    const/16 v1, 0xcd

    if-ne v14, v1, :cond_e

    :cond_b
    iget-object v1, v0, Lt3/b0;->h:Lt3/d0;

    if-eqz v1, :cond_c

    check-cast v1, Lt3/c0;

    iget-wide v1, v1, Lt3/c0;->c:J

    goto :goto_e

    :cond_c
    const-wide/16 v1, -0x1

    :goto_e
    const-wide/16 v4, 0x0

    cmp-long v1, v1, v4

    if-lez v1, :cond_e

    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v4, v18

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " had non-zero Content-Length: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lt3/b0;->h:Lt3/d0;

    if-eqz v0, :cond_d

    check-cast v0, Lt3/c0;

    iget-wide v4, v0, Lt3/c0;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    goto :goto_f

    :cond_d
    const/4 v14, 0x0

    :goto_f
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_d

    :cond_e
    return-object v0

    :goto_10
    if-eqz v13, :cond_f

    invoke-static {v13, v0}, Lc3/h;->F(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v13

    :cond_f
    throw v0

    :cond_10
    move-object/from16 v3, p0

    throw v0

    :cond_11
    move-object/from16 v3, p0

    throw v0
.end method
