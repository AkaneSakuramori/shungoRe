.class public final Lt3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/ArrayList;

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lt3/r;->b:Ljava/lang/String;

    iput-object v0, p0, Lt3/r;->c:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, p0, Lt3/r;->e:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lt3/r;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 6

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lt3/r;->d(Ljava/lang/String;IIZZ)V

    return-void
.end method

.method public final b()Lt3/s;
    .locals 14

    iget-object v1, p0, Lt3/r;->a:Ljava/lang/String;

    if-eqz v1, :cond_7

    sget-object v0, Lt3/s;->j:[C

    iget-object v0, p0, Lt3/r;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v0, v2, v2, v2, v3}, Lf2/e;->J(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lt3/r;->c:Ljava/lang/String;

    invoke-static {v0, v2, v2, v2, v3}, Lf2/e;->J(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lt3/r;->d:Ljava/lang/String;

    if-eqz v6, :cond_6

    iget v0, p0, Lt3/r;->e:I

    const/4 v7, -0x1

    if-eq v0, v7, :cond_0

    :goto_0
    move v7, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lt3/r;->a:Ljava/lang/String;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-static {v0}, Lf2/e;->j(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lt3/r;->f:Ljava/util/ArrayList;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v0}, La3/j;->R2(Ljava/lang/Iterable;)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    sget-object v10, Lt3/s;->j:[C

    invoke-static {v9, v2, v2, v2, v3}, Lf2/e;->J(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lt3/r;->g:Ljava/util/ArrayList;

    const/4 v9, 0x0

    if-eqz v0, :cond_3

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v0}, La3/j;->R2(Ljava/lang/Iterable;)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_2

    sget-object v12, Lt3/s;->j:[C

    const/4 v12, 0x1

    const/4 v13, 0x3

    invoke-static {v11, v2, v2, v12, v13}, Lf2/e;->J(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v11

    goto :goto_4

    :cond_2
    move-object v11, v9

    :goto_4
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    move-object v10, v9

    :cond_4
    iget-object v0, p0, Lt3/r;->h:Ljava/lang/String;

    if-eqz v0, :cond_5

    sget-object v9, Lt3/s;->j:[C

    invoke-static {v0, v2, v2, v2, v3}, Lf2/e;->J(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    :cond_5
    invoke-virtual {p0}, Lt3/r;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lt3/s;

    move-object v0, v12

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move v5, v7

    move-object v6, v8

    move-object v7, v10

    move-object v8, v9

    move-object v9, v11

    invoke-direct/range {v0 .. v9}, Lt3/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-object v12

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "host == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scheme == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lt3/s;Ljava/lang/String;)V
    .locals 28

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v5, p2

    const-string v1, "input"

    invoke-static {v5, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lu3/b;->a:[B

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v4, 0x0

    invoke-static {v4, v1, v5}, Lu3/b;->m(IILjava/lang/String;)I

    move-result v1

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2, v5}, Lu3/b;->n(IILjava/lang/String;)I

    move-result v3

    sub-int v2, v3, v1

    const/16 v15, 0x5b

    const/4 v7, 0x2

    const/16 v14, 0x3a

    const/4 v13, -0x1

    if-ge v2, v7, :cond_1

    :cond_0
    :goto_0
    move v2, v13

    goto :goto_3

    :cond_1
    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v8, 0x61

    invoke-static {v2, v8}, Lc3/h;->n0(II)I

    move-result v9

    const/16 v10, 0x41

    if-ltz v9, :cond_2

    const/16 v9, 0x7a

    invoke-static {v2, v9}, Lc3/h;->n0(II)I

    move-result v9

    if-lez v9, :cond_3

    :cond_2
    invoke-static {v2, v10}, Lc3/h;->n0(II)I

    move-result v9

    if-ltz v9, :cond_0

    const/16 v9, 0x5a

    invoke-static {v2, v9}, Lc3/h;->n0(II)I

    move-result v2

    if-lez v2, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v2, v1, 0x1

    :goto_1
    if-ge v2, v3, :cond_0

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-gt v8, v9, :cond_4

    const/16 v11, 0x7b

    if-ge v9, v11, :cond_4

    goto :goto_2

    :cond_4
    if-gt v10, v9, :cond_5

    if-ge v9, v15, :cond_5

    goto :goto_2

    :cond_5
    const/16 v11, 0x30

    if-gt v11, v9, :cond_6

    if-ge v9, v14, :cond_6

    goto :goto_2

    :cond_6
    const/16 v11, 0x2b

    if-ne v9, v11, :cond_7

    goto :goto_2

    :cond_7
    const/16 v11, 0x2d

    if-ne v9, v11, :cond_8

    goto :goto_2

    :cond_8
    const/16 v11, 0x2e

    if-ne v9, v11, :cond_9

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_9
    if-ne v9, v14, :cond_0

    :goto_3
    const/4 v12, 0x1

    const-string v11, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    if-eq v2, v13, :cond_c

    const-string v8, "https:"

    invoke-static {v5, v8, v1, v12}, Lq3/l;->n3(Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v8

    if-eqz v8, :cond_a

    const-string v2, "https"

    iput-object v2, v6, Lt3/r;->a:Ljava/lang/String;

    add-int/lit8 v1, v1, 0x6

    goto :goto_4

    :cond_a
    const-string v8, "http:"

    invoke-static {v5, v8, v1, v12}, Lq3/l;->n3(Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v8

    if-eqz v8, :cond_b

    const-string v2, "http"

    iput-object v2, v6, Lt3/r;->a:Ljava/lang/String;

    add-int/lit8 v1, v1, 0x5

    goto :goto_4

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Expected URL scheme \'http\' or \'https\' but was \'"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v11}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    if-eqz v0, :cond_2b

    iget-object v2, v0, Lt3/s;->a:Ljava/lang/String;

    iput-object v2, v6, Lt3/r;->a:Ljava/lang/String;

    :goto_4
    move v2, v1

    move v8, v4

    :goto_5
    const/16 v10, 0x2f

    const/16 v9, 0x5c

    if-ge v2, v3, :cond_e

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-eq v12, v9, :cond_d

    if-ne v12, v10, :cond_e

    :cond_d
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v2, v2, 0x1

    const/4 v12, 0x1

    goto :goto_5

    :cond_e
    iget-object v2, v6, Lt3/r;->f:Ljava/util/ArrayList;

    const/16 v12, 0x3f

    const/16 v4, 0x23

    if-ge v8, v7, :cond_13

    if-eqz v0, :cond_13

    iget-object v7, v6, Lt3/r;->a:Ljava/lang/String;

    iget-object v15, v0, Lt3/s;->a:Ljava/lang/String;

    invoke-static {v15, v7}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    goto :goto_7

    :cond_f
    invoke-virtual/range {p1 .. p1}, Lt3/s;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lt3/r;->b:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lt3/s;->a()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lt3/r;->c:Ljava/lang/String;

    iget-object v7, v0, Lt3/s;->d:Ljava/lang/String;

    iput-object v7, v6, Lt3/r;->d:Ljava/lang/String;

    iget v7, v0, Lt3/s;->e:I

    iput v7, v6, Lt3/r;->e:I

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {p1 .. p1}, Lt3/s;->c()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eq v1, v3, :cond_10

    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v4, :cond_12

    :cond_10
    invoke-virtual/range {p1 .. p1}, Lt3/s;->d()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_11

    sget-object v0, Lt3/s;->j:[C

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v20, " \"\'<>#"

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0xd3

    invoke-static/range {v17 .. v25}, Lf2/e;->e(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf2/e;->R(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_6

    :cond_11
    const/4 v0, 0x0

    :goto_6
    iput-object v0, v6, Lt3/r;->g:Ljava/util/ArrayList;

    :cond_12
    move-object/from16 v17, v2

    const/4 v4, 0x1

    const/4 v9, 0x0

    goto/16 :goto_11

    :cond_13
    :goto_7
    add-int/2addr v1, v8

    const/4 v0, 0x0

    const/16 v18, 0x0

    :goto_8
    const-string v7, "@/\\?#"

    invoke-static {v5, v7, v1, v3}, Lu3/b;->f(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v15

    if-eq v15, v3, :cond_14

    invoke-virtual {v5, v15}, Ljava/lang/String;->charAt(I)C

    move-result v7

    goto :goto_9

    :cond_14
    move v7, v13

    :goto_9
    if-eq v7, v13, :cond_19

    if-eq v7, v4, :cond_19

    if-eq v7, v10, :cond_19

    if-eq v7, v9, :cond_19

    if-eq v7, v12, :cond_19

    const/16 v8, 0x40

    if-eq v7, v8, :cond_15

    goto :goto_8

    :cond_15
    const-string v8, "%40"

    if-nez v0, :cond_18

    invoke-static {v5, v14, v1, v15}, Lu3/b;->e(Ljava/lang/String;CII)I

    move-result v7

    sget-object v19, Lt3/s;->j:[C

    const-string v19, " \"\':;<=>@[]^`{}|/\\?#"

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xf0

    move/from16 p1, v7

    move-object/from16 v7, p2

    move-object v4, v8

    move v8, v1

    move v1, v9

    move/from16 v9, p1

    move-object/from16 v10, v19

    move-object/from16 v26, v11

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move/from16 v14, v23

    move/from16 v16, v0

    move-object/from16 v17, v2

    move v0, v15

    const/16 v2, 0x5b

    move/from16 v15, v24

    invoke-static/range {v7 .. v15}, Lf2/e;->e(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v7

    if-eqz v18, :cond_16

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v6, Lt3/r;->b:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_16
    iput-object v7, v6, Lt3/r;->b:Ljava/lang/String;

    move/from16 v4, p1

    if-eq v4, v0, :cond_17

    add-int/lit8 v8, v4, 0x1

    const-string v10, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xf0

    move-object/from16 v7, p2

    move v9, v0

    invoke-static/range {v7 .. v15}, Lf2/e;->e(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v6, Lt3/r;->c:Ljava/lang/String;

    const/4 v12, 0x1

    goto :goto_a

    :cond_17
    move/from16 v12, v16

    :goto_a
    move v4, v1

    move/from16 v16, v12

    const/16 v18, 0x1

    goto :goto_b

    :cond_18
    move/from16 v16, v0

    move-object/from16 v17, v2

    move-object v4, v8

    move-object/from16 v26, v11

    move v0, v15

    const/16 v2, 0x5b

    move v15, v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v6, Lt3/r;->c:Ljava/lang/String;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lt3/s;->j:[C

    const-string v10, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/16 v19, 0xf0

    move-object/from16 v7, p2

    move v8, v1

    move v9, v0

    move-object v1, v14

    move v14, v4

    move v4, v15

    move/from16 v15, v19

    invoke-static/range {v7 .. v15}, Lf2/e;->e(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v6, Lt3/r;->c:Ljava/lang/String;

    :goto_b
    add-int/lit8 v1, v0, 0x1

    move v9, v4

    move/from16 v0, v16

    move-object/from16 v2, v17

    move-object/from16 v11, v26

    const/16 v4, 0x23

    const/16 v10, 0x2f

    const/16 v12, 0x3f

    const/4 v13, -0x1

    const/16 v14, 0x3a

    goto/16 :goto_8

    :cond_19
    move-object/from16 v17, v2

    move v4, v9

    move-object/from16 v26, v11

    move v0, v15

    const/16 v2, 0x5b

    move v15, v1

    :goto_c
    if-ge v15, v0, :cond_1e

    invoke-virtual {v5, v15}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v2, :cond_1c

    const/4 v14, 0x1

    :cond_1a
    add-int/2addr v15, v14

    if-ge v15, v0, :cond_1b

    invoke-virtual {v5, v15}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x5d

    if-ne v7, v8, :cond_1a

    :cond_1b
    const/16 v8, 0x3a

    goto :goto_d

    :cond_1c
    const/16 v8, 0x3a

    const/4 v14, 0x1

    if-ne v7, v8, :cond_1d

    move v2, v15

    goto :goto_e

    :cond_1d
    :goto_d
    add-int/2addr v15, v14

    goto :goto_c

    :cond_1e
    const/4 v14, 0x1

    move v2, v0

    :goto_e
    add-int/lit8 v15, v2, 0x1

    const/4 v7, 0x4

    const/16 v13, 0x22

    if-ge v15, v0, :cond_21

    sget-object v8, Lt3/s;->j:[C

    const/4 v8, 0x0

    invoke-static {v5, v1, v2, v8, v7}, Lf2/e;->J(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lr3/q;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lt3/r;->d:Ljava/lang/String;

    :try_start_0
    const-string v10, ""
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xf8

    move-object/from16 v7, p2

    move v8, v15

    move v9, v0

    move v4, v13

    move/from16 v13, v16

    move v4, v14

    move/from16 v14, v18

    move/from16 v27, v15

    move/from16 v15, v19

    :try_start_1
    invoke-static/range {v7 .. v15}, Lf2/e;->e(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v13
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    if-gt v4, v13, :cond_1f

    const/high16 v7, 0x10000

    if-ge v13, v7, :cond_1f

    goto :goto_f

    :catch_0
    move v4, v14

    move/from16 v27, v15

    :catch_1
    :cond_1f
    const/4 v13, -0x1

    :goto_f
    iput v13, v6, Lt3/r;->e:I

    const/4 v7, -0x1

    if-eq v13, v7, :cond_20

    move-object/from16 v8, v26

    const/4 v9, 0x0

    goto :goto_10

    :cond_20
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid URL port: \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v2, v27

    invoke-virtual {v5, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v8, v26

    invoke-static {v0, v8}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x22

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_21
    move v4, v14

    move-object/from16 v8, v26

    sget-object v9, Lt3/s;->j:[C

    const/4 v9, 0x0

    invoke-static {v5, v1, v2, v9, v7}, Lf2/e;->J(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lr3/q;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lt3/r;->d:Ljava/lang/String;

    iget-object v7, v6, Lt3/r;->a:Ljava/lang/String;

    invoke-static {v7}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-static {v7}, Lf2/e;->j(Ljava/lang/String;)I

    move-result v7

    iput v7, v6, Lt3/r;->e:I

    :goto_10
    iget-object v7, v6, Lt3/r;->d:Ljava/lang/String;

    if-eqz v7, :cond_2a

    move v1, v0

    :goto_11
    const-string v0, "?#"

    invoke-static {v5, v0, v1, v3}, Lu3/b;->f(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v7

    if-ne v1, v7, :cond_23

    :cond_22
    move v15, v3

    move/from16 v16, v4

    move-object v13, v5

    const/16 v14, 0x23

    goto :goto_17

    :cond_23
    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const-string v2, ""

    const/16 v8, 0x2f

    if-eq v0, v8, :cond_24

    const/16 v8, 0x5c

    if-ne v0, v8, :cond_25

    :cond_24
    move-object/from16 v8, v17

    goto :goto_12

    :cond_25
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v4

    move-object/from16 v8, v17

    invoke-virtual {v8, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_13

    :goto_12
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    :goto_13
    move v2, v1

    :goto_14
    if-ge v2, v7, :cond_22

    const-string v0, "/\\"

    invoke-static {v5, v0, v2, v7}, Lu3/b;->f(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v8

    if-ge v8, v7, :cond_26

    move v12, v4

    goto :goto_15

    :cond_26
    move v12, v9

    :goto_15
    const/4 v10, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move v15, v3

    move v3, v8

    move/from16 v16, v4

    const/16 v14, 0x23

    move v4, v12

    move-object v13, v5

    move v5, v10

    invoke-virtual/range {v0 .. v5}, Lt3/r;->d(Ljava/lang/String;IIZZ)V

    if-eqz v12, :cond_27

    add-int/lit8 v2, v8, 0x1

    :goto_16
    move-object v5, v13

    move v3, v15

    move/from16 v4, v16

    goto :goto_14

    :cond_27
    move v2, v8

    goto :goto_16

    :goto_17
    if-ge v7, v15, :cond_28

    invoke-virtual {v13, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3f

    if-ne v0, v1, :cond_28

    invoke-static {v13, v14, v7, v15}, Lu3/b;->e(Ljava/lang/String;CII)I

    move-result v0

    sget-object v1, Lt3/s;->j:[C

    add-int/lit8 v8, v7, 0x1

    const-string v10, " \"\'<>#"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0xd0

    move-object/from16 v7, p2

    move v9, v0

    move-object v4, v13

    move v13, v1

    move v1, v14

    move v14, v2

    move v2, v15

    move v15, v3

    invoke-static/range {v7 .. v15}, Lf2/e;->e(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lf2/e;->R(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v6, Lt3/r;->g:Ljava/util/ArrayList;

    move v7, v0

    goto :goto_18

    :cond_28
    move-object v4, v13

    move v1, v14

    move v2, v15

    :goto_18
    if-ge v7, v2, :cond_29

    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v1, :cond_29

    sget-object v0, Lt3/s;->j:[C

    add-int/lit8 v8, v7, 0x1

    const-string v10, ""

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/16 v15, 0xb0

    move-object/from16 v7, p2

    move v9, v2

    invoke-static/range {v7 .. v15}, Lf2/e;->e(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lt3/r;->h:Ljava/lang/String;

    :cond_29
    return-void

    :cond_2a
    move-object v4, v5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Invalid URL host: \""

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2b
    move-object v4, v5

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-le v0, v1, :cond_2c

    invoke-static {v4, v1}, Lq3/m;->u3(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_19

    :cond_2c
    move-object v0, v4

    :goto_19
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final d(Ljava/lang/String;IIZZ)V
    .locals 10

    sget-object v0, Lt3/s;->j:[C

    const-string v4, " \"<>^`{}|/\\?#"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xf0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v5, p5

    invoke-static/range {v1 .. v9}, Lf2/e;->e(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object p1

    const-string p2, "."

    invoke-static {p1, p2}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    const-string p2, "%2e"

    invoke-static {p1, p2}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string p2, ".."

    invoke-static {p1, p2}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    iget-object p3, p0, Lt3/r;->f:Ljava/util/ArrayList;

    const-string p5, ""

    if-nez p2, :cond_4

    const-string p2, "%2e."

    invoke-static {p1, p2}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    const-string p2, ".%2e"

    invoke-static {p1, p2}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    const-string p2, "%2e%2e"

    invoke-static {p1, p2}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p3, p2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    if-eqz p4, :cond_3

    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void

    :cond_4
    :goto_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_5

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p3, p1, p5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lt3/r;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "//"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    iget-object v1, p0, Lt3/r;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x3a

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lt3/r;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lt3/r;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt3/r;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt3/r;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lt3/r;->d:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-static {v1, v2}, Lq3/l;->S2(Ljava/lang/CharSequence;C)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt3/r;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lt3/r;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    :goto_2
    iget v1, p0, Lt3/r;->e:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_6

    iget-object v4, p0, Lt3/r;->a:Ljava/lang/String;

    if-eqz v4, :cond_9

    :cond_6
    if-eq v1, v3, :cond_7

    goto :goto_3

    :cond_7
    sget-object v1, Lt3/s;->j:[C

    iget-object v1, p0, Lt3/r;->a:Ljava/lang/String;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-static {v1}, Lf2/e;->j(Ljava/lang/String;)I

    move-result v1

    :goto_3
    iget-object v3, p0, Lt3/r;->a:Ljava/lang/String;

    if-eqz v3, :cond_8

    sget-object v4, Lt3/s;->j:[C

    invoke-static {v3}, Lf2/e;->j(Ljava/lang/String;)I

    move-result v3

    if-eq v1, v3, :cond_9

    :cond_8
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_9
    sget-object v1, Lt3/s;->j:[C

    iget-object v1, p0, Lt3/r;->f:Ljava/util/ArrayList;

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v2, :cond_a

    const/16 v4, 0x2f

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_a
    iget-object v1, p0, Lt3/r;->g:Ljava/util/ArrayList;

    if-eqz v1, :cond_b

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v1, Lt3/s;->j:[C

    iget-object v1, p0, Lt3/r;->g:Ljava/util/ArrayList;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-static {v1, v0}, Lf2/e;->S(Ljava/util/List;Ljava/lang/StringBuilder;)V

    :cond_b
    iget-object v1, p0, Lt3/r;->h:Ljava/lang/String;

    if-eqz v1, :cond_c

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt3/r;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
