.class public final La4/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p0;
.implements Lo2/n;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La4/x;->b:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p1, p0, La4/x;->b:I

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_0
    const/16 p1, 0x18

    .line 3
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_1
    const/16 p1, 0x17

    .line 4
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_2
    const/16 p1, 0x16

    .line 5
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_3
    const/16 p1, 0x15

    .line 6
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_4
    const/16 p1, 0x14

    .line 7
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_5
    const/16 p1, 0x13

    .line 8
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_6
    const/16 p1, 0x12

    .line 9
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_7
    const/16 p1, 0x11

    .line 10
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_8
    const/16 p1, 0x10

    .line 11
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_9
    const/16 p1, 0xf

    .line 12
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_a
    const/16 p1, 0xe

    .line 13
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_b
    const/16 p1, 0xd

    .line 14
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_c
    const/16 p1, 0xc

    .line 15
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_d
    const/16 p1, 0xb

    .line 16
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_e
    const/16 p1, 0xa

    .line 17
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_f
    const/16 p1, 0x9

    .line 18
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_10
    const/16 p1, 0x8

    .line 19
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_11
    const/4 p1, 0x7

    .line 20
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_12
    const/4 p1, 0x6

    .line 21
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_13
    const/4 p1, 0x5

    .line 22
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_14
    const/4 p1, 0x4

    .line 23
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_15
    const/4 p1, 0x3

    .line 24
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_16
    const/4 p1, 0x2

    .line 25
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    :pswitch_17
    const/4 p1, 0x1

    .line 26
    invoke-direct {p0, p1}, La4/x;-><init>(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final c([B[[BI)Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->e:[B

    array-length v2, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_b

    add-int v5, v4, v2

    div-int/lit8 v5, v5, 0x2

    :goto_1
    const/4 v6, -0x1

    const/16 v7, 0xa

    if-le v5, v6, :cond_0

    aget-byte v8, v0, v5

    if-eq v8, v7, :cond_0

    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v5, 0x1

    const/4 v9, 0x1

    move v10, v9

    :goto_2
    add-int v11, v8, v10

    aget-byte v12, v0, v11

    if-eq v12, v7, :cond_1

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_1
    sub-int v7, v11, v8

    move/from16 v12, p2

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_3
    if-eqz v10, :cond_2

    const/16 v10, 0x2e

    const/4 v15, 0x0

    goto :goto_4

    :cond_2
    aget-object v15, v1, v12

    aget-byte v15, v15, v13

    sget-object v16, Lu3/b;->a:[B

    and-int/lit16 v15, v15, 0xff

    move/from16 v17, v15

    move v15, v10

    move/from16 v10, v17

    :goto_4
    add-int v16, v8, v14

    aget-byte v3, v0, v16

    sget-object v16, Lu3/b;->a:[B

    and-int/lit16 v3, v3, 0xff

    sub-int/2addr v10, v3

    if-nez v10, :cond_5

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v13, v13, 0x1

    if-eq v14, v7, :cond_5

    aget-object v3, v1, v12

    array-length v3, v3

    if-ne v3, v13, :cond_4

    array-length v3, v1

    sub-int/2addr v3, v9

    if-ne v12, v3, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v12, v12, 0x1

    move v13, v6

    move v10, v9

    goto :goto_3

    :cond_4
    move v10, v15

    goto :goto_3

    :cond_5
    :goto_5
    if-gez v10, :cond_6

    :goto_6
    move v2, v5

    goto :goto_0

    :cond_6
    if-lez v10, :cond_7

    :goto_7
    add-int/lit8 v4, v11, 0x1

    goto :goto_0

    :cond_7
    sub-int v3, v7, v14

    aget-object v6, v1, v12

    array-length v6, v6

    sub-int/2addr v6, v13

    add-int/lit8 v12, v12, 0x1

    array-length v9, v1

    :goto_8
    if-ge v12, v9, :cond_8

    aget-object v10, v1, v12

    array-length v10, v10

    add-int/2addr v6, v10

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_8
    if-ge v6, v3, :cond_9

    goto :goto_6

    :cond_9
    if-le v6, v3, :cond_a

    goto :goto_7

    :cond_a
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "UTF_8"

    invoke-static {v1, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, v8, v7, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_9

    :cond_b
    const/4 v2, 0x0

    :goto_9
    return-object v2
.end method

.method public static e(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    const-string v0, "protocols"

    invoke-static {p0, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lt3/x;

    sget-object v3, Lt3/x;->c:Lt3/x;

    if-eq v2, v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-static {v0}, La3/j;->R2(Ljava/lang/Iterable;)I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt3/x;

    iget-object v1, v1, Lt3/x;->b:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p0
.end method

.method public static f()Lf4/e;
    .locals 7

    sget-object v0, Lf4/e;->l:Lf4/e;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v0, v0, Lf4/e;->f:Lf4/e;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sget-object v0, Lf4/e;->i:Ljava/util/concurrent/locks/Condition;

    sget-wide v4, Lf4/e;->j:J

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v4, v5, v6}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    sget-object v0, Lf4/e;->l:Lf4/e;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v0, v0, Lf4/e;->f:Lf4/e;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    sget-wide v2, Lf4/e;->k:J

    cmp-long v0, v4, v2

    if-ltz v0, :cond_0

    sget-object v1, Lf4/e;->l:Lf4/e;

    :cond_0
    return-object v1

    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iget-wide v4, v0, Lf4/e;->g:J

    sub-long/2addr v4, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v4, v2

    if-lez v2, :cond_2

    sget-object v0, Lf4/e;->i:Ljava/util/concurrent/locks/Condition;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v4, v5, v2}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    return-object v1

    :cond_2
    sget-object v2, Lf4/e;->l:Lf4/e;

    invoke-static {v2}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v3, v0, Lf4/e;->f:Lf4/e;

    iput-object v3, v2, Lf4/e;->f:Lf4/e;

    iput-object v1, v0, Lf4/e;->f:Lf4/e;

    return-object v0
.end method

.method public static h(JLf4/g;ILjava/util/ArrayList;IILjava/util/ArrayList;)V
    .locals 19

    move-object/from16 v0, p2

    move/from16 v1, p3

    move-object/from16 v10, p4

    move/from16 v2, p5

    move/from16 v11, p6

    move-object/from16 v12, p7

    const-string v3, "Failed requirement."

    if-ge v2, v11, :cond_11

    move v4, v2

    :goto_0
    if-ge v4, v11, :cond_1

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4/j;

    invoke-virtual {v5}, Lf4/j;->c()I

    move-result v5

    if-lt v5, v1, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual/range {p4 .. p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/j;

    add-int/lit8 v4, v11, -0x1

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf4/j;

    invoke-virtual {v3}, Lf4/j;->c()I

    move-result v5

    const/4 v13, -0x1

    if-ne v1, v5, :cond_2

    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4/j;

    move v6, v2

    move v2, v3

    move-object v3, v5

    goto :goto_1

    :cond_2
    move v6, v2

    move v2, v13

    :goto_1
    invoke-virtual {v3, v1}, Lf4/j;->f(I)B

    move-result v5

    invoke-virtual {v4, v1}, Lf4/j;->f(I)B

    move-result v7

    const/4 v9, 0x4

    if-eq v5, v7, :cond_c

    add-int/lit8 v3, v6, 0x1

    const/4 v4, 0x1

    :goto_2
    if-ge v3, v11, :cond_4

    add-int/lit8 v5, v3, -0x1

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4/j;

    invoke-virtual {v5, v1}, Lf4/j;->f(I)B

    move-result v5

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf4/j;

    invoke-virtual {v7, v1}, Lf4/j;->f(I)B

    move-result v7

    if-eq v5, v7, :cond_3

    add-int/lit8 v4, v4, 0x1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    iget-wide v14, v0, Lf4/g;->c:J

    int-to-long v8, v9

    div-long/2addr v14, v8

    add-long v14, v14, p0

    move-wide/from16 v16, v8

    const/4 v3, 0x2

    int-to-long v7, v3

    add-long/2addr v14, v7

    mul-int/lit8 v3, v4, 0x2

    int-to-long v7, v3

    add-long/2addr v14, v7

    invoke-virtual {v0, v4}, Lf4/g;->M(I)V

    invoke-virtual {v0, v2}, Lf4/g;->M(I)V

    move v2, v6

    :goto_3
    if-ge v2, v11, :cond_7

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/j;

    invoke-virtual {v3, v1}, Lf4/j;->f(I)B

    move-result v3

    if-eq v2, v6, :cond_5

    add-int/lit8 v4, v2, -0x1

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf4/j;

    invoke-virtual {v4, v1}, Lf4/j;->f(I)B

    move-result v4

    if-eq v3, v4, :cond_6

    :cond_5
    and-int/lit16 v3, v3, 0xff

    invoke-virtual {v0, v3}, Lf4/g;->M(I)V

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    new-instance v9, Lf4/g;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    move v7, v6

    :goto_4
    if-ge v7, v11, :cond_b

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf4/j;

    invoke-virtual {v2, v1}, Lf4/j;->f(I)B

    move-result v2

    add-int/lit8 v3, v7, 0x1

    move v4, v3

    :goto_5
    if-ge v4, v11, :cond_9

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4/j;

    invoke-virtual {v5, v1}, Lf4/j;->f(I)B

    move-result v5

    if-eq v2, v5, :cond_8

    move v8, v4

    goto :goto_6

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_9
    move v8, v11

    :goto_6
    if-ne v3, v8, :cond_a

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/j;

    invoke-virtual {v3}, Lf4/j;->c()I

    move-result v3

    if-ne v2, v3, :cond_a

    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lf4/g;->M(I)V

    move/from16 v18, v8

    move-object v13, v9

    goto :goto_7

    :cond_a
    iget-wide v2, v9, Lf4/g;->c:J

    div-long v2, v2, v16

    add-long/2addr v2, v14

    long-to-int v2, v2

    mul-int/2addr v2, v13

    invoke-virtual {v0, v2}, Lf4/g;->M(I)V

    add-int/lit8 v5, v1, 0x1

    move-wide v2, v14

    move-object v4, v9

    move-object/from16 v6, p4

    move/from16 v18, v8

    move-object v13, v9

    move-object/from16 v9, p7

    invoke-static/range {v2 .. v9}, La4/x;->h(JLf4/g;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    :goto_7
    move-object v9, v13

    move/from16 v7, v18

    const/4 v13, -0x1

    goto :goto_4

    :cond_b
    move-object v13, v9

    invoke-virtual {v0, v13}, Lf4/g;->J(Lf4/w;)V

    goto/16 :goto_a

    :cond_c
    invoke-virtual {v3}, Lf4/j;->c()I

    move-result v5

    invoke-virtual {v4}, Lf4/j;->c()I

    move-result v7

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v7, 0x0

    move v8, v1

    :goto_8
    if-ge v8, v5, :cond_d

    invoke-virtual {v3, v8}, Lf4/j;->f(I)B

    move-result v13

    invoke-virtual {v4, v8}, Lf4/j;->f(I)B

    move-result v14

    if-ne v13, v14, :cond_d

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    :cond_d
    iget-wide v4, v0, Lf4/g;->c:J

    int-to-long v8, v9

    div-long/2addr v4, v8

    add-long v4, v4, p0

    const/4 v13, 0x2

    int-to-long v13, v13

    add-long/2addr v4, v13

    int-to-long v13, v7

    add-long/2addr v4, v13

    const-wide/16 v13, 0x1

    add-long/2addr v4, v13

    neg-int v13, v7

    invoke-virtual {v0, v13}, Lf4/g;->M(I)V

    invoke-virtual {v0, v2}, Lf4/g;->M(I)V

    add-int/2addr v7, v1

    :goto_9
    if-ge v1, v7, :cond_e

    invoke-virtual {v3, v1}, Lf4/j;->f(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v0, v2}, Lf4/g;->M(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_e
    add-int/lit8 v1, v6, 0x1

    if-ne v1, v11, :cond_10

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/j;

    invoke-virtual {v1}, Lf4/j;->c()I

    move-result v1

    if-ne v7, v1, :cond_f

    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lf4/g;->M(I)V

    goto :goto_a

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    new-instance v13, Lf4/g;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    iget-wide v1, v13, Lf4/g;->c:J

    div-long/2addr v1, v8

    add-long/2addr v1, v4

    long-to-int v1, v1

    const/4 v2, -0x1

    mul-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lf4/g;->M(I)V

    move-wide v1, v4

    move-object v3, v13

    move v4, v7

    move-object/from16 v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-static/range {v1 .. v8}, La4/x;->h(JLf4/g;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    invoke-virtual {v0, v13}, Lf4/g;->J(Lf4/w;)V

    :goto_a
    return-void

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static i(Ljava/util/List;)[B
    .locals 3

    const-string v0, "protocols"

    invoke-static {p0, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf4/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, La4/x;->e(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2}, Lf4/g;->K(I)V

    invoke-virtual {v0, v1}, Lf4/g;->P(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-wide v1, v0, Lf4/g;->c:J

    invoke-virtual {v0, v1, v2}, Lf4/g;->z(J)[B

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/String;)Lf4/j;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v3, v2, 0x2

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lg4/b;->a(C)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lg4/b;->a(C)I

    move-result v3

    add-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Lf4/j;

    invoke-direct {p0, v1}, Lf4/j;-><init>([B)V

    return-object p0

    :cond_1
    const-string v0, "Unexpected hex string: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(Ljava/lang/String;)Lf4/j;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf4/j;

    sget-object v1, Lq3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "this as java.lang.String).getBytes(charset)"

    invoke-static {v1, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lf4/j;-><init>([B)V

    iput-object p0, v0, Lf4/j;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static m([B)Lf4/j;
    .locals 8

    sget-object v0, Lf4/j;->e:Lf4/j;

    array-length v0, p0

    array-length v1, p0

    int-to-long v2, v1

    const/4 v1, 0x0

    int-to-long v4, v1

    int-to-long v6, v0

    invoke-static/range {v2 .. v7}, Lc3/h;->c0(JJJ)V

    new-instance v2, Lf4/j;

    invoke-static {p0, v1, v0}, La3/j;->V2([BII)[B

    move-result-object p0

    invoke-direct {v2, p0}, Lf4/j;-><init>([B)V

    return-object v2
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroidx/lifecycle/n0;
    .locals 1

    iget p1, p0, La4/x;->b:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lv0/a;

    invoke-direct {p1}, Lv0/a;-><init>()V

    return-object p1

    :pswitch_0
    new-instance p1, Landroidx/fragment/app/k0;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroidx/fragment/app/k0;-><init>(Z)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget v0, p0, La4/x;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    return-object v0

    :pswitch_2
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0

    :pswitch_3
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    return-object v0

    :pswitch_4
    new-instance v0, Lo2/m;

    invoke-direct {v0}, Lo2/m;-><init>()V

    return-object v0

    :pswitch_5
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0

    :pswitch_6
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    return-object v0

    :pswitch_7
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g()Lb4/l;
    .locals 12

    iget v0, p0, La4/x;->b:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    const-class v0, Ljavax/net/ssl/SSLSocket;

    const-string v2, "java.specification.version"

    const-string v3, "unknown"

    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :try_start_0
    const-string v3, "jvmVersion"

    invoke-static {v2, v3}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v3, 0x9

    if-lt v2, v3, :cond_0

    goto :goto_0

    :catch_0
    :cond_0
    const-string v2, "org.eclipse.jetty.alpn.ALPN"

    const/4 v3, 0x1

    :try_start_1
    invoke-static {v2, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const-string v4, "org.eclipse.jetty.alpn.ALPN$Provider"

    invoke-static {v4, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "org.eclipse.jetty.alpn.ALPN$ClientProvider"

    invoke-static {v5, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v10

    const-string v5, "org.eclipse.jetty.alpn.ALPN$ServerProvider"

    invoke-static {v5, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v11

    const-string v5, "put"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    aput-object v4, v6, v3

    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "get"

    new-array v6, v3, [Ljava/lang/Class;

    aput-object v0, v6, v7

    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const-string v5, "remove"

    new-array v3, v3, [Ljava/lang/Class;

    aput-object v0, v3, v7

    invoke-virtual {v2, v5, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    new-instance v0, Lb4/i;

    const-string v2, "putMethod"

    invoke-static {v4, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "getMethod"

    invoke-static {v8, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "removeMethod"

    invoke-static {v9, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "clientProviderClass"

    invoke-static {v10, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "serverProviderClass"

    invoke-static {v11, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    move-object v7, v4

    invoke-direct/range {v6 .. v11}, Lb4/i;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, v0

    :catch_1
    :goto_0
    return-object v1

    :pswitch_0
    invoke-virtual {p0}, La4/x;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Lb4/c;

    invoke-direct {v1}, Lb4/c;-><init>()V

    :cond_1
    return-object v1

    :pswitch_1
    invoke-virtual {p0}, La4/x;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v1, Lb4/a;

    invoke-direct {v1}, Lb4/a;-><init>()V

    :cond_2
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l()Z
    .locals 2

    iget v0, p0, La4/x;->b:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    sget-object v0, Lb4/l;->a:Lb4/l;

    const-string v0, "java.vm.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Dalvik"

    invoke-static {v1, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_1
    sget-boolean v0, Lb4/k;->e:Z

    return v0

    :pswitch_2
    sget-boolean v0, Lb4/d;->e:Z

    return v0

    :pswitch_3
    sget-boolean v0, Lb4/c;->f:Z

    return v0

    :pswitch_4
    sget-boolean v0, Lb4/a;->e:Z

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
