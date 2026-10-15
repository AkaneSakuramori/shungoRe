.class public final Lp/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static p:Z = false

.field public static q:I = 0x3e8


# instance fields
.field public a:Z

.field public b:I

.field public final c:Lp/g;

.field public d:I

.field public e:I

.field public f:[Lp/c;

.field public g:Z

.field public h:[Z

.field public i:I

.field public j:I

.field public k:I

.field public final l:Lg/h;

.field public m:[Lp/i;

.field public n:I

.field public o:Lp/c;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp/d;->a:Z

    iput v0, p0, Lp/d;->b:I

    const/16 v1, 0x20

    iput v1, p0, Lp/d;->d:I

    iput v1, p0, Lp/d;->e:I

    const/4 v2, 0x0

    iput-object v2, p0, Lp/d;->f:[Lp/c;

    iput-boolean v0, p0, Lp/d;->g:Z

    new-array v2, v1, [Z

    iput-object v2, p0, Lp/d;->h:[Z

    const/4 v2, 0x1

    iput v2, p0, Lp/d;->i:I

    iput v0, p0, Lp/d;->j:I

    iput v1, p0, Lp/d;->k:I

    sget v2, Lp/d;->q:I

    new-array v2, v2, [Lp/i;

    iput-object v2, p0, Lp/d;->m:[Lp/i;

    iput v0, p0, Lp/d;->n:I

    new-array v1, v1, [Lp/c;

    iput-object v1, p0, Lp/d;->f:[Lp/c;

    invoke-virtual {p0}, Lp/d;->s()V

    new-instance v1, Lg/h;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lg/h;-><init>(I)V

    iput-object v1, p0, Lp/d;->l:Lg/h;

    new-instance v2, Lp/g;

    invoke-direct {v2, v1}, Lp/c;-><init>(Lg/h;)V

    const/16 v3, 0x80

    new-array v4, v3, [Lp/i;

    iput-object v4, v2, Lp/g;->f:[Lp/i;

    new-array v3, v3, [Lp/i;

    iput-object v3, v2, Lp/g;->g:[Lp/i;

    iput v0, v2, Lp/g;->h:I

    new-instance v0, Le/c;

    invoke-direct {v0, v2, v2}, Le/c;-><init>(Lp/g;Lp/g;)V

    iput-object v0, v2, Lp/g;->i:Le/c;

    iput-object v2, p0, Lp/d;->c:Lp/g;

    new-instance v0, Lp/c;

    invoke-direct {v0, v1}, Lp/c;-><init>(Lg/h;)V

    iput-object v0, p0, Lp/d;->o:Lp/c;

    return-void
.end method

.method public static n(Lr/c;)I
    .locals 1

    iget-object p0, p0, Lr/c;->i:Lp/i;

    if-eqz p0, :cond_0

    iget p0, p0, Lp/i;->f:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p0, v0

    float-to-int p0, p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(I)Lp/i;
    .locals 3

    iget-object v0, p0, Lp/d;->l:Lg/h;

    iget-object v0, v0, Lg/h;->d:Ljava/lang/Object;

    check-cast v0, Lp/e;

    invoke-virtual {v0}, Lp/e;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/i;

    if-nez v0, :cond_0

    new-instance v0, Lp/i;

    invoke-direct {v0, p1}, Lp/i;-><init>(I)V

    iput p1, v0, Lp/i;->m:I

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lp/i;->c()V

    iput p1, v0, Lp/i;->m:I

    :goto_0
    iget p1, p0, Lp/d;->n:I

    sget v1, Lp/d;->q:I

    if-lt p1, v1, :cond_1

    mul-int/lit8 v1, v1, 0x2

    sput v1, Lp/d;->q:I

    iget-object p1, p0, Lp/d;->m:[Lp/i;

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lp/i;

    iput-object p1, p0, Lp/d;->m:[Lp/i;

    :cond_1
    iget-object p1, p0, Lp/d;->m:[Lp/i;

    iget v1, p0, Lp/d;->n:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lp/d;->n:I

    aput-object v0, p1, v1

    return-object v0
.end method

.method public final b(Lp/i;Lp/i;IFLp/i;Lp/i;II)V
    .locals 6

    invoke-virtual {p0}, Lp/d;->l()Lp/c;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-ne p2, p5, :cond_0

    iget-object p3, v0, Lp/c;->d:Lp/b;

    invoke-interface {p3, p1, v1}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v0, Lp/c;->d:Lp/b;

    invoke-interface {p1, p6, v1}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v0, Lp/c;->d:Lp/b;

    const/high16 p3, -0x40000000    # -2.0f

    invoke-interface {p1, p2, p3}, Lp/b;->d(Lp/i;F)V

    goto/16 :goto_0

    :cond_0
    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v2, p4, v2

    const/high16 v3, -0x40800000    # -1.0f

    if-nez v2, :cond_2

    iget-object p4, v0, Lp/c;->d:Lp/b;

    invoke-interface {p4, p1, v1}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v0, Lp/c;->d:Lp/b;

    invoke-interface {p1, p2, v3}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v0, Lp/c;->d:Lp/b;

    invoke-interface {p1, p5, v3}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v0, Lp/c;->d:Lp/b;

    invoke-interface {p1, p6, v1}, Lp/b;->d(Lp/i;F)V

    if-gtz p3, :cond_1

    if-lez p7, :cond_6

    :cond_1
    neg-int p1, p3

    add-int/2addr p1, p7

    int-to-float p1, p1

    iput p1, v0, Lp/c;->b:F

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, p4, v2

    if-gtz v2, :cond_3

    iget-object p4, v0, Lp/c;->d:Lp/b;

    invoke-interface {p4, p1, v3}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v0, Lp/c;->d:Lp/b;

    invoke-interface {p1, p2, v1}, Lp/b;->d(Lp/i;F)V

    int-to-float p1, p3

    iput p1, v0, Lp/c;->b:F

    goto :goto_0

    :cond_3
    cmpl-float v2, p4, v1

    if-ltz v2, :cond_4

    iget-object p1, v0, Lp/c;->d:Lp/b;

    invoke-interface {p1, p6, v3}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v0, Lp/c;->d:Lp/b;

    invoke-interface {p1, p5, v1}, Lp/b;->d(Lp/i;F)V

    neg-int p1, p7

    int-to-float p1, p1

    iput p1, v0, Lp/c;->b:F

    goto :goto_0

    :cond_4
    iget-object v2, v0, Lp/c;->d:Lp/b;

    sub-float v4, v1, p4

    mul-float v5, v4, v1

    invoke-interface {v2, p1, v5}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v0, Lp/c;->d:Lp/b;

    mul-float v2, v4, v3

    invoke-interface {p1, p2, v2}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v0, Lp/c;->d:Lp/b;

    mul-float/2addr v3, p4

    invoke-interface {p1, p5, v3}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v0, Lp/c;->d:Lp/b;

    mul-float/2addr v1, p4

    invoke-interface {p1, p6, v1}, Lp/b;->d(Lp/i;F)V

    if-gtz p3, :cond_5

    if-lez p7, :cond_6

    :cond_5
    neg-int p1, p3

    int-to-float p1, p1

    mul-float/2addr p1, v4

    int-to-float p2, p7

    mul-float/2addr p2, p4

    add-float/2addr p2, p1

    iput p2, v0, Lp/c;->b:F

    :cond_6
    :goto_0
    const/16 p1, 0x8

    if-eq p8, p1, :cond_7

    invoke-virtual {v0, p0, p8}, Lp/c;->a(Lp/d;I)V

    :cond_7
    invoke-virtual {p0, v0}, Lp/d;->c(Lp/c;)V

    return-void
.end method

.method public final c(Lp/c;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lp/d;->j:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iget v4, v0, Lp/d;->k:I

    if-ge v2, v4, :cond_0

    iget v2, v0, Lp/d;->i:I

    add-int/2addr v2, v3

    iget v4, v0, Lp/d;->e:I

    if-lt v2, v4, :cond_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lp/d;->o()V

    :cond_1
    iget-boolean v2, v1, Lp/c;->e:Z

    if-nez v2, :cond_20

    iget-object v2, v0, Lp/d;->f:[Lp/c;

    array-length v2, v2

    const/4 v4, -0x1

    if-nez v2, :cond_2

    goto :goto_5

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_8

    iget-object v6, v1, Lp/c;->d:Lp/b;

    invoke-interface {v6}, Lp/b;->k()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    iget-object v8, v1, Lp/c;->c:Ljava/util/ArrayList;

    if-ge v7, v6, :cond_4

    iget-object v9, v1, Lp/c;->d:Lp/b;

    invoke-interface {v9, v7}, Lp/b;->b(I)Lp/i;

    move-result-object v9

    iget v10, v9, Lp/i;->d:I

    if-ne v10, v4, :cond_3

    iget-boolean v10, v9, Lp/i;->g:Z

    if-nez v10, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_7

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v6, :cond_6

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lp/i;

    iget-boolean v10, v9, Lp/i;->g:Z

    if-eqz v10, :cond_5

    invoke-virtual {v1, v0, v9, v3}, Lp/c;->h(Lp/d;Lp/i;Z)V

    goto :goto_4

    :cond_5
    iget-object v10, v0, Lp/d;->f:[Lp/c;

    iget v9, v9, Lp/i;->d:I

    aget-object v9, v10, v9

    invoke-virtual {v1, v0, v9, v3}, Lp/c;->i(Lp/d;Lp/c;Z)V

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    :cond_7
    move v2, v3

    goto :goto_0

    :cond_8
    iget-object v2, v1, Lp/c;->a:Lp/i;

    if-eqz v2, :cond_9

    iget-object v2, v1, Lp/c;->d:Lp/b;

    invoke-interface {v2}, Lp/b;->k()I

    move-result v2

    if-nez v2, :cond_9

    iput-boolean v3, v1, Lp/c;->e:Z

    iput-boolean v3, v0, Lp/d;->a:Z

    :cond_9
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lp/c;->e()Z

    move-result v2

    if-eqz v2, :cond_a

    return-void

    :cond_a
    iget v2, v1, Lp/c;->b:F

    const/4 v6, 0x0

    cmpg-float v7, v2, v6

    if-gez v7, :cond_b

    const/high16 v7, -0x40800000    # -1.0f

    mul-float/2addr v2, v7

    iput v2, v1, Lp/c;->b:F

    iget-object v2, v1, Lp/c;->d:Lp/b;

    invoke-interface {v2}, Lp/b;->j()V

    :cond_b
    iget-object v2, v1, Lp/c;->d:Lp/b;

    invoke-interface {v2}, Lp/b;->k()I

    move-result v2

    const/4 v7, 0x0

    move v11, v6

    move v13, v11

    move-object v9, v7

    move-object v10, v9

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_6
    if-ge v8, v2, :cond_14

    iget-object v15, v1, Lp/c;->d:Lp/b;

    invoke-interface {v15, v8}, Lp/b;->a(I)F

    move-result v15

    iget-object v5, v1, Lp/c;->d:Lp/b;

    invoke-interface {v5, v8}, Lp/b;->b(I)Lp/i;

    move-result-object v5

    iget v4, v5, Lp/i;->m:I

    if-ne v4, v3, :cond_f

    if-nez v9, :cond_d

    iget v4, v5, Lp/i;->l:I

    if-gt v4, v3, :cond_c

    goto :goto_8

    :cond_c
    const/4 v12, 0x0

    :goto_7
    move-object v9, v5

    move v11, v15

    goto :goto_b

    :cond_d
    cmpl-float v4, v11, v15

    if-lez v4, :cond_e

    iget v4, v5, Lp/i;->l:I

    if-gt v4, v3, :cond_c

    goto :goto_8

    :cond_e
    if-nez v12, :cond_13

    iget v4, v5, Lp/i;->l:I

    if-gt v4, v3, :cond_13

    :goto_8
    move v12, v3

    goto :goto_7

    :cond_f
    if-nez v9, :cond_13

    cmpg-float v4, v15, v6

    if-gez v4, :cond_13

    if-nez v10, :cond_11

    iget v4, v5, Lp/i;->l:I

    if-gt v4, v3, :cond_10

    goto :goto_a

    :cond_10
    const/4 v14, 0x0

    :goto_9
    move-object v10, v5

    move v13, v15

    goto :goto_b

    :cond_11
    cmpl-float v4, v13, v15

    if-lez v4, :cond_12

    iget v4, v5, Lp/i;->l:I

    if-gt v4, v3, :cond_10

    goto :goto_a

    :cond_12
    if-nez v14, :cond_13

    iget v4, v5, Lp/i;->l:I

    if-gt v4, v3, :cond_13

    :goto_a
    move v14, v3

    goto :goto_9

    :cond_13
    :goto_b
    add-int/lit8 v8, v8, 0x1

    const/4 v4, -0x1

    goto :goto_6

    :cond_14
    if-eqz v9, :cond_15

    goto :goto_c

    :cond_15
    move-object v9, v10

    :goto_c
    if-nez v9, :cond_16

    move v2, v3

    goto :goto_d

    :cond_16
    invoke-virtual {v1, v9}, Lp/c;->g(Lp/i;)V

    const/4 v2, 0x0

    :goto_d
    iget-object v4, v1, Lp/c;->d:Lp/b;

    invoke-interface {v4}, Lp/b;->k()I

    move-result v4

    if-nez v4, :cond_17

    iput-boolean v3, v1, Lp/c;->e:Z

    :cond_17
    if-eqz v2, :cond_1d

    iget v2, v0, Lp/d;->i:I

    add-int/2addr v2, v3

    iget v4, v0, Lp/d;->e:I

    if-lt v2, v4, :cond_18

    invoke-virtual/range {p0 .. p0}, Lp/d;->o()V

    :cond_18
    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lp/d;->a(I)Lp/i;

    move-result-object v2

    iget v4, v0, Lp/d;->b:I

    add-int/2addr v4, v3

    iput v4, v0, Lp/d;->b:I

    iget v5, v0, Lp/d;->i:I

    add-int/2addr v5, v3

    iput v5, v0, Lp/d;->i:I

    iput v4, v2, Lp/i;->c:I

    iget-object v5, v0, Lp/d;->l:Lg/h;

    iget-object v8, v5, Lg/h;->e:Ljava/lang/Object;

    check-cast v8, [Lp/i;

    aput-object v2, v8, v4

    iput-object v2, v1, Lp/c;->a:Lp/i;

    iget v4, v0, Lp/d;->j:I

    invoke-virtual/range {p0 .. p1}, Lp/d;->h(Lp/c;)V

    iget v8, v0, Lp/d;->j:I

    add-int/2addr v4, v3

    if-ne v8, v4, :cond_1d

    iget-object v4, v0, Lp/d;->o:Lp/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v7, v4, Lp/c;->a:Lp/i;

    iget-object v8, v4, Lp/c;->d:Lp/b;

    invoke-interface {v8}, Lp/b;->clear()V

    const/4 v8, 0x0

    :goto_e
    iget-object v9, v1, Lp/c;->d:Lp/b;

    invoke-interface {v9}, Lp/b;->k()I

    move-result v9

    if-ge v8, v9, :cond_19

    iget-object v9, v1, Lp/c;->d:Lp/b;

    invoke-interface {v9, v8}, Lp/b;->b(I)Lp/i;

    move-result-object v9

    iget-object v10, v1, Lp/c;->d:Lp/b;

    invoke-interface {v10, v8}, Lp/b;->a(I)F

    move-result v10

    iget-object v11, v4, Lp/c;->d:Lp/b;

    invoke-interface {v11, v9, v10, v3}, Lp/b;->i(Lp/i;FZ)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_e

    :cond_19
    iget-object v4, v0, Lp/d;->o:Lp/c;

    invoke-virtual {v0, v4}, Lp/d;->r(Lp/c;)V

    iget v4, v2, Lp/i;->d:I

    const/4 v8, -0x1

    if-ne v4, v8, :cond_1c

    iget-object v4, v1, Lp/c;->a:Lp/i;

    if-ne v4, v2, :cond_1a

    invoke-virtual {v1, v7, v2}, Lp/c;->f([ZLp/i;)Lp/i;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-virtual {v1, v2}, Lp/c;->g(Lp/i;)V

    :cond_1a
    iget-boolean v2, v1, Lp/c;->e:Z

    if-nez v2, :cond_1b

    iget-object v2, v1, Lp/c;->a:Lp/i;

    invoke-virtual {v2, v0, v1}, Lp/i;->e(Lp/d;Lp/c;)V

    :cond_1b
    iget-object v2, v5, Lg/h;->b:Ljava/lang/Object;

    check-cast v2, Lp/e;

    invoke-virtual {v2, v1}, Lp/e;->b(Ljava/lang/Object;)Z

    iget v2, v0, Lp/d;->j:I

    sub-int/2addr v2, v3

    iput v2, v0, Lp/d;->j:I

    :cond_1c
    move v5, v3

    goto :goto_f

    :cond_1d
    const/4 v5, 0x0

    :goto_f
    iget-object v2, v1, Lp/c;->a:Lp/i;

    if-eqz v2, :cond_1f

    iget v2, v2, Lp/i;->m:I

    if-eq v2, v3, :cond_1e

    iget v2, v1, Lp/c;->b:F

    cmpg-float v2, v2, v6

    if-ltz v2, :cond_1f

    :cond_1e
    if-nez v5, :cond_21

    goto :goto_10

    :cond_1f
    return-void

    :cond_20
    :goto_10
    invoke-virtual/range {p0 .. p1}, Lp/d;->h(Lp/c;)V

    :cond_21
    return-void
.end method

.method public final d(Lp/i;I)V
    .locals 4

    iget v0, p1, Lp/i;->d:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    int-to-float p2, p2

    invoke-virtual {p1, p0, p2}, Lp/i;->d(Lp/d;F)V

    const/4 p1, 0x0

    :goto_0
    iget p2, p0, Lp/d;->b:I

    add-int/2addr p2, v2

    if-ge p1, p2, :cond_0

    iget-object p2, p0, Lp/d;->l:Lg/h;

    iget-object p2, p2, Lg/h;->e:Ljava/lang/Object;

    check-cast p2, [Lp/i;

    aget-object p2, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    if-eq v0, v1, :cond_5

    iget-object v3, p0, Lp/d;->f:[Lp/c;

    aget-object v0, v3, v0

    iget-boolean v3, v0, Lp/c;->e:Z

    if-eqz v3, :cond_2

    int-to-float p1, p2

    iput p1, v0, Lp/c;->b:F

    goto :goto_2

    :cond_2
    iget-object v3, v0, Lp/c;->d:Lp/b;

    invoke-interface {v3}, Lp/b;->k()I

    move-result v3

    if-nez v3, :cond_3

    iput-boolean v2, v0, Lp/c;->e:Z

    int-to-float p1, p2

    iput p1, v0, Lp/c;->b:F

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lp/d;->l()Lp/c;

    move-result-object v0

    if-gez p2, :cond_4

    mul-int/2addr p2, v1

    int-to-float p2, p2

    iput p2, v0, Lp/c;->b:F

    iget-object p2, v0, Lp/c;->d:Lp/b;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {p2, p1, v1}, Lp/b;->d(Lp/i;F)V

    goto :goto_1

    :cond_4
    int-to-float p2, p2

    iput p2, v0, Lp/c;->b:F

    iget-object p2, v0, Lp/c;->d:Lp/b;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-interface {p2, p1, v1}, Lp/b;->d(Lp/i;F)V

    :goto_1
    invoke-virtual {p0, v0}, Lp/d;->c(Lp/c;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lp/d;->l()Lp/c;

    move-result-object v0

    iput-object p1, v0, Lp/c;->a:Lp/i;

    int-to-float p2, p2

    iput p2, p1, Lp/i;->f:F

    iput p2, v0, Lp/c;->b:F

    iput-boolean v2, v0, Lp/c;->e:Z

    invoke-virtual {p0, v0}, Lp/d;->c(Lp/c;)V

    :goto_2
    return-void
.end method

.method public final e(Lp/i;Lp/i;II)V
    .locals 5

    const/16 v0, 0x8

    if-ne p4, v0, :cond_0

    iget-boolean v1, p2, Lp/i;->g:Z

    if-eqz v1, :cond_0

    iget v1, p1, Lp/i;->d:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    iget p2, p2, Lp/i;->f:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p0, p2}, Lp/i;->d(Lp/d;F)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lp/d;->l()Lp/c;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, -0x40800000    # -1.0f

    if-eqz p3, :cond_3

    if-gez p3, :cond_1

    mul-int/lit8 p3, p3, -0x1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    int-to-float p3, p3

    iput p3, v1, Lp/c;->b:F

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object p3, v1, Lp/c;->d:Lp/b;

    invoke-interface {p3, p1, v2}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v1, Lp/c;->d:Lp/b;

    invoke-interface {p1, p2, v3}, Lp/b;->d(Lp/i;F)V

    goto :goto_2

    :cond_3
    :goto_1
    iget-object p3, v1, Lp/c;->d:Lp/b;

    invoke-interface {p3, p1, v3}, Lp/b;->d(Lp/i;F)V

    iget-object p1, v1, Lp/c;->d:Lp/b;

    invoke-interface {p1, p2, v2}, Lp/b;->d(Lp/i;F)V

    :goto_2
    if-eq p4, v0, :cond_4

    invoke-virtual {v1, p0, p4}, Lp/c;->a(Lp/d;I)V

    :cond_4
    invoke-virtual {p0, v1}, Lp/d;->c(Lp/c;)V

    return-void
.end method

.method public final f(Lp/i;Lp/i;II)V
    .locals 3

    invoke-virtual {p0}, Lp/d;->l()Lp/c;

    move-result-object v0

    invoke-virtual {p0}, Lp/d;->m()Lp/i;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Lp/i;->e:I

    invoke-virtual {v0, p1, p2, v1, p3}, Lp/c;->b(Lp/i;Lp/i;Lp/i;I)V

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Lp/c;->d:Lp/b;

    invoke-interface {p1, v1}, Lp/b;->c(Lp/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, p4}, Lp/d;->j(I)Lp/i;

    move-result-object p2

    iget-object p3, v0, Lp/c;->d:Lp/b;

    int-to-float p1, p1

    invoke-interface {p3, p2, p1}, Lp/b;->d(Lp/i;F)V

    :cond_0
    invoke-virtual {p0, v0}, Lp/d;->c(Lp/c;)V

    return-void
.end method

.method public final g(Lp/i;Lp/i;II)V
    .locals 3

    invoke-virtual {p0}, Lp/d;->l()Lp/c;

    move-result-object v0

    invoke-virtual {p0}, Lp/d;->m()Lp/i;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Lp/i;->e:I

    invoke-virtual {v0, p1, p2, v1, p3}, Lp/c;->c(Lp/i;Lp/i;Lp/i;I)V

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Lp/c;->d:Lp/b;

    invoke-interface {p1, v1}, Lp/b;->c(Lp/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, p4}, Lp/d;->j(I)Lp/i;

    move-result-object p2

    iget-object p3, v0, Lp/c;->d:Lp/b;

    int-to-float p1, p1

    invoke-interface {p3, p2, p1}, Lp/b;->d(Lp/i;F)V

    :cond_0
    invoke-virtual {p0, v0}, Lp/d;->c(Lp/c;)V

    return-void
.end method

.method public final h(Lp/c;)V
    .locals 7

    iget-boolean v0, p1, Lp/c;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lp/c;->a:Lp/i;

    iget p1, p1, Lp/c;->b:F

    invoke-virtual {v0, p0, p1}, Lp/i;->d(Lp/d;F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp/d;->f:[Lp/c;

    iget v1, p0, Lp/d;->j:I

    aput-object p1, v0, v1

    iget-object v0, p1, Lp/c;->a:Lp/i;

    iput v1, v0, Lp/i;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lp/d;->j:I

    invoke-virtual {v0, p0, p1}, Lp/i;->e(Lp/d;Lp/c;)V

    :goto_0
    iget-boolean p1, p0, Lp/d;->a:Z

    if-eqz p1, :cond_7

    const/4 p1, 0x0

    move v0, p1

    :goto_1
    iget v1, p0, Lp/d;->j:I

    if-ge v0, v1, :cond_6

    iget-object v1, p0, Lp/d;->f:[Lp/c;

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "WTF"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, Lp/d;->f:[Lp/c;

    aget-object v1, v1, v0

    if-eqz v1, :cond_5

    iget-boolean v2, v1, Lp/c;->e:Z

    if-eqz v2, :cond_5

    iget-object v2, v1, Lp/c;->a:Lp/i;

    iget v3, v1, Lp/c;->b:F

    invoke-virtual {v2, p0, v3}, Lp/i;->d(Lp/d;F)V

    iget-object v2, p0, Lp/d;->l:Lg/h;

    iget-object v2, v2, Lg/h;->b:Ljava/lang/Object;

    check-cast v2, Lp/e;

    invoke-virtual {v2, v1}, Lp/e;->b(Ljava/lang/Object;)Z

    iget-object v1, p0, Lp/d;->f:[Lp/c;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v1, v0, 0x1

    move v3, v1

    :goto_2
    iget v4, p0, Lp/d;->j:I

    if-ge v1, v4, :cond_3

    iget-object v3, p0, Lp/d;->f:[Lp/c;

    add-int/lit8 v4, v1, -0x1

    aget-object v5, v3, v1

    aput-object v5, v3, v4

    iget-object v3, v5, Lp/c;->a:Lp/i;

    iget v5, v3, Lp/i;->d:I

    if-ne v5, v1, :cond_2

    iput v4, v3, Lp/i;->d:I

    :cond_2
    add-int/lit8 v3, v1, 0x1

    move v6, v3

    move v3, v1

    move v1, v6

    goto :goto_2

    :cond_3
    if-ge v3, v4, :cond_4

    iget-object v1, p0, Lp/d;->f:[Lp/c;

    aput-object v2, v1, v3

    :cond_4
    add-int/lit8 v4, v4, -0x1

    iput v4, p0, Lp/d;->j:I

    add-int/lit8 v0, v0, -0x1

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    iput-boolean p1, p0, Lp/d;->a:Z

    :cond_7
    return-void
.end method

.method public final i()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lp/d;->j:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lp/d;->f:[Lp/c;

    aget-object v1, v1, v0

    iget-object v2, v1, Lp/c;->a:Lp/i;

    iget v1, v1, Lp/c;->b:F

    iput v1, v2, Lp/i;->f:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j(I)Lp/i;
    .locals 4

    iget v0, p0, Lp/d;->i:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lp/d;->e:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lp/d;->o()V

    :cond_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lp/d;->a(I)Lp/i;

    move-result-object v0

    iget v1, p0, Lp/d;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lp/d;->b:I

    iget v2, p0, Lp/d;->i:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lp/d;->i:I

    iput v1, v0, Lp/i;->c:I

    iput p1, v0, Lp/i;->e:I

    iget-object p1, p0, Lp/d;->l:Lg/h;

    iget-object p1, p1, Lg/h;->e:Ljava/lang/Object;

    check-cast p1, [Lp/i;

    aput-object v0, p1, v1

    iget-object p1, p0, Lp/d;->c:Lp/g;

    iget-object v1, p1, Lp/g;->i:Le/c;

    iput-object v0, v1, Le/c;->c:Ljava/lang/Object;

    iget-object v1, v0, Lp/i;->i:[F

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([FF)V

    iget v2, v0, Lp/i;->e:I

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v1, v2

    invoke-virtual {p1, v0}, Lp/g;->j(Lp/i;)V

    return-object v0
.end method

.method public final k(Ljava/lang/Object;)Lp/i;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, Lp/d;->i:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iget v3, p0, Lp/d;->e:I

    if-lt v1, v3, :cond_1

    invoke-virtual {p0}, Lp/d;->o()V

    :cond_1
    instance-of v1, p1, Lr/c;

    if-eqz v1, :cond_5

    check-cast p1, Lr/c;

    iget-object v0, p1, Lr/c;->i:Lp/i;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lr/c;->k()V

    iget-object p1, p1, Lr/c;->i:Lp/i;

    move-object v0, p1

    :cond_2
    iget p1, v0, Lp/i;->c:I

    iget-object v1, p0, Lp/d;->l:Lg/h;

    const/4 v3, -0x1

    if-eq p1, v3, :cond_3

    iget v4, p0, Lp/d;->b:I

    if-gt p1, v4, :cond_3

    iget-object v4, v1, Lg/h;->e:Ljava/lang/Object;

    check-cast v4, [Lp/i;

    aget-object v4, v4, p1

    if-nez v4, :cond_5

    :cond_3
    if-eq p1, v3, :cond_4

    invoke-virtual {v0}, Lp/i;->c()V

    :cond_4
    iget p1, p0, Lp/d;->b:I

    add-int/2addr p1, v2

    iput p1, p0, Lp/d;->b:I

    iget v3, p0, Lp/d;->i:I

    add-int/2addr v3, v2

    iput v3, p0, Lp/d;->i:I

    iput p1, v0, Lp/i;->c:I

    iput v2, v0, Lp/i;->m:I

    iget-object v1, v1, Lg/h;->e:Ljava/lang/Object;

    check-cast v1, [Lp/i;

    aput-object v0, v1, p1

    :cond_5
    return-object v0
.end method

.method public final l()Lp/c;
    .locals 2

    iget-object v0, p0, Lp/d;->l:Lg/h;

    iget-object v1, v0, Lg/h;->b:Ljava/lang/Object;

    check-cast v1, Lp/e;

    invoke-virtual {v1}, Lp/e;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/c;

    if-nez v1, :cond_0

    new-instance v1, Lp/c;

    invoke-direct {v1, v0}, Lp/c;-><init>(Lg/h;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, v1, Lp/c;->a:Lp/i;

    iget-object v0, v1, Lp/c;->d:Lp/b;

    invoke-interface {v0}, Lp/b;->clear()V

    const/4 v0, 0x0

    iput v0, v1, Lp/c;->b:F

    const/4 v0, 0x0

    iput-boolean v0, v1, Lp/c;->e:Z

    :goto_0
    return-object v1
.end method

.method public final m()Lp/i;
    .locals 3

    iget v0, p0, Lp/d;->i:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lp/d;->e:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lp/d;->o()V

    :cond_0
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lp/d;->a(I)Lp/i;

    move-result-object v0

    iget v1, p0, Lp/d;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lp/d;->b:I

    iget v2, p0, Lp/d;->i:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lp/d;->i:I

    iput v1, v0, Lp/i;->c:I

    iget-object v2, p0, Lp/d;->l:Lg/h;

    iget-object v2, v2, Lg/h;->e:Ljava/lang/Object;

    check-cast v2, [Lp/i;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public final o()V
    .locals 3

    iget v0, p0, Lp/d;->d:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lp/d;->d:I

    iget-object v1, p0, Lp/d;->f:[Lp/c;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp/c;

    iput-object v0, p0, Lp/d;->f:[Lp/c;

    iget-object v0, p0, Lp/d;->l:Lg/h;

    iget-object v1, v0, Lg/h;->e:Ljava/lang/Object;

    check-cast v1, [Lp/i;

    iget v2, p0, Lp/d;->d:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lp/i;

    iput-object v1, v0, Lg/h;->e:Ljava/lang/Object;

    iget v0, p0, Lp/d;->d:I

    new-array v1, v0, [Z

    iput-object v1, p0, Lp/d;->h:[Z

    iput v0, p0, Lp/d;->e:I

    iput v0, p0, Lp/d;->k:I

    return-void
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Lp/d;->c:Lp/g;

    invoke-virtual {v0}, Lp/g;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lp/d;->i()V

    return-void

    :cond_0
    iget-boolean v1, p0, Lp/d;->g:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lp/d;->j:I

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lp/d;->f:[Lp/c;

    aget-object v2, v2, v1

    iget-boolean v2, v2, Lp/c;->e:Z

    if-nez v2, :cond_1

    invoke-virtual {p0, v0}, Lp/d;->q(Lp/g;)V

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lp/d;->i()V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v0}, Lp/d;->q(Lp/g;)V

    :goto_1
    return-void
.end method

.method public final q(Lp/g;)V
    .locals 18

    move-object/from16 v0, p0

    const/4 v2, 0x0

    :goto_0
    iget v3, v0, Lp/d;->j:I

    if-ge v2, v3, :cond_d

    iget-object v3, v0, Lp/d;->f:[Lp/c;

    aget-object v3, v3, v2

    iget-object v4, v3, Lp/c;->a:Lp/i;

    iget v4, v4, Lp/i;->m:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    goto/16 :goto_8

    :cond_0
    iget v3, v3, Lp/c;->b:F

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-gez v3, :cond_c

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-nez v2, :cond_d

    add-int/2addr v3, v5

    const/4 v6, -0x1

    const v7, 0x7f7fffff    # Float.MAX_VALUE

    move v9, v6

    move v10, v9

    const/4 v8, 0x0

    const/4 v11, 0x0

    :goto_2
    iget v12, v0, Lp/d;->j:I

    if-ge v8, v12, :cond_9

    iget-object v12, v0, Lp/d;->f:[Lp/c;

    aget-object v12, v12, v8

    iget-object v13, v12, Lp/c;->a:Lp/i;

    iget v13, v13, Lp/i;->m:I

    if-ne v13, v5, :cond_1

    goto :goto_6

    :cond_1
    iget-boolean v13, v12, Lp/c;->e:Z

    if-eqz v13, :cond_2

    goto :goto_6

    :cond_2
    iget v13, v12, Lp/c;->b:F

    cmpg-float v13, v13, v4

    if-gez v13, :cond_8

    iget-object v13, v12, Lp/c;->d:Lp/b;

    invoke-interface {v13}, Lp/b;->k()I

    move-result v13

    const/4 v14, 0x0

    :goto_3
    if-ge v14, v13, :cond_8

    iget-object v15, v12, Lp/c;->d:Lp/b;

    invoke-interface {v15, v14}, Lp/b;->b(I)Lp/i;

    move-result-object v15

    iget-object v1, v12, Lp/c;->d:Lp/b;

    invoke-interface {v1, v15}, Lp/b;->c(Lp/i;)F

    move-result v1

    cmpg-float v16, v1, v4

    if-gtz v16, :cond_3

    goto :goto_5

    :cond_3
    const/4 v4, 0x0

    :goto_4
    const/16 v5, 0x9

    if-ge v4, v5, :cond_7

    iget-object v5, v15, Lp/i;->h:[F

    aget v5, v5, v4

    div-float/2addr v5, v1

    cmpg-float v17, v5, v7

    if-gez v17, :cond_4

    if-eq v4, v11, :cond_5

    :cond_4
    if-le v4, v11, :cond_6

    :cond_5
    iget v7, v15, Lp/i;->c:I

    move v11, v4

    move v10, v7

    move v9, v8

    move v7, v5

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    add-int/lit8 v14, v14, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    goto :goto_3

    :cond_8
    :goto_6
    add-int/lit8 v8, v8, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    goto :goto_2

    :cond_9
    if-eq v9, v6, :cond_a

    iget-object v1, v0, Lp/d;->f:[Lp/c;

    aget-object v1, v1, v9

    iget-object v4, v1, Lp/c;->a:Lp/i;

    iput v6, v4, Lp/i;->d:I

    iget-object v4, v0, Lp/d;->l:Lg/h;

    iget-object v4, v4, Lg/h;->e:Ljava/lang/Object;

    check-cast v4, [Lp/i;

    aget-object v4, v4, v10

    invoke-virtual {v1, v4}, Lp/c;->g(Lp/i;)V

    iget-object v4, v1, Lp/c;->a:Lp/i;

    iput v9, v4, Lp/i;->d:I

    invoke-virtual {v4, v0, v1}, Lp/i;->e(Lp/d;Lp/c;)V

    goto :goto_7

    :cond_a
    const/4 v2, 0x1

    :goto_7
    iget v1, v0, Lp/d;->i:I

    div-int/lit8 v1, v1, 0x2

    if-le v3, v1, :cond_b

    const/4 v2, 0x1

    :cond_b
    const/4 v4, 0x0

    const/4 v5, 0x1

    goto/16 :goto_1

    :cond_c
    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_d
    invoke-virtual/range {p0 .. p1}, Lp/d;->r(Lp/c;)V

    invoke-virtual/range {p0 .. p0}, Lp/d;->i()V

    return-void
.end method

.method public final r(Lp/c;)V
    .locals 12

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lp/d;->i:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lp/d;->h:[Z

    aput-boolean v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    move v2, v1

    :cond_1
    :goto_1
    if-nez v1, :cond_b

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iget v4, p0, Lp/d;->i:I

    mul-int/lit8 v4, v4, 0x2

    if-lt v2, v4, :cond_2

    return-void

    :cond_2
    iget-object v4, p1, Lp/c;->a:Lp/i;

    if-eqz v4, :cond_3

    iget-object v5, p0, Lp/d;->h:[Z

    iget v4, v4, Lp/i;->c:I

    aput-boolean v3, v5, v4

    :cond_3
    iget-object v4, p0, Lp/d;->h:[Z

    invoke-virtual {p1, v4}, Lp/c;->d([Z)Lp/i;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v5, p0, Lp/d;->h:[Z

    iget v6, v4, Lp/i;->c:I

    aget-boolean v7, v5, v6

    if-eqz v7, :cond_4

    return-void

    :cond_4
    aput-boolean v3, v5, v6

    :cond_5
    if-eqz v4, :cond_a

    const/4 v5, -0x1

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    move v7, v0

    move v8, v5

    :goto_2
    iget v9, p0, Lp/d;->j:I

    if-ge v7, v9, :cond_9

    iget-object v9, p0, Lp/d;->f:[Lp/c;

    aget-object v9, v9, v7

    iget-object v10, v9, Lp/c;->a:Lp/i;

    iget v10, v10, Lp/i;->m:I

    if-ne v10, v3, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v10, v9, Lp/c;->e:Z

    if-eqz v10, :cond_7

    goto :goto_3

    :cond_7
    iget-object v10, v9, Lp/c;->d:Lp/b;

    invoke-interface {v10, v4}, Lp/b;->f(Lp/i;)Z

    move-result v10

    if-eqz v10, :cond_8

    iget-object v10, v9, Lp/c;->d:Lp/b;

    invoke-interface {v10, v4}, Lp/b;->c(Lp/i;)F

    move-result v10

    const/4 v11, 0x0

    cmpg-float v11, v10, v11

    if-gez v11, :cond_8

    iget v9, v9, Lp/c;->b:F

    neg-float v9, v9

    div-float/2addr v9, v10

    cmpg-float v10, v9, v6

    if-gez v10, :cond_8

    move v8, v7

    move v6, v9

    :cond_8
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_9
    if-le v8, v5, :cond_1

    iget-object v3, p0, Lp/d;->f:[Lp/c;

    aget-object v3, v3, v8

    iget-object v6, v3, Lp/c;->a:Lp/i;

    iput v5, v6, Lp/i;->d:I

    invoke-virtual {v3, v4}, Lp/c;->g(Lp/i;)V

    iget-object v4, v3, Lp/c;->a:Lp/i;

    iput v8, v4, Lp/i;->d:I

    invoke-virtual {v4, p0, v3}, Lp/i;->e(Lp/d;Lp/c;)V

    goto :goto_1

    :cond_a
    move v1, v3

    goto :goto_1

    :cond_b
    return-void
.end method

.method public final s()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lp/d;->j:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lp/d;->f:[Lp/c;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    iget-object v2, p0, Lp/d;->l:Lg/h;

    iget-object v2, v2, Lg/h;->b:Ljava/lang/Object;

    check-cast v2, Lp/e;

    invoke-virtual {v2, v1}, Lp/e;->b(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lp/d;->f:[Lp/c;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final t()V
    .locals 10

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lp/d;->l:Lg/h;

    iget-object v3, v2, Lg/h;->e:Ljava/lang/Object;

    check-cast v3, [Lp/i;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lp/i;->c()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v2, Lg/h;->d:Ljava/lang/Object;

    check-cast v1, Lp/e;

    iget-object v3, p0, Lp/d;->m:[Lp/i;

    iget v4, p0, Lp/d;->n:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v5, v3

    if-le v4, v5, :cond_2

    array-length v4, v3

    :cond_2
    move v5, v0

    :goto_1
    if-ge v5, v4, :cond_4

    aget-object v6, v3, v5

    iget v7, v1, Lp/e;->c:I

    iget-object v8, v1, Lp/e;->b:[Ljava/lang/Object;

    array-length v9, v8

    if-ge v7, v9, :cond_3

    aput-object v6, v8, v7

    add-int/lit8 v7, v7, 0x1

    iput v7, v1, Lp/e;->c:I

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    iput v0, p0, Lp/d;->n:I

    iget-object v1, v2, Lg/h;->e:Ljava/lang/Object;

    check-cast v1, [Lp/i;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iput v0, p0, Lp/d;->b:I

    iget-object v1, p0, Lp/d;->c:Lp/g;

    iput v0, v1, Lp/g;->h:I

    const/4 v3, 0x0

    iput v3, v1, Lp/c;->b:F

    const/4 v1, 0x1

    iput v1, p0, Lp/d;->i:I

    move v1, v0

    :goto_2
    iget v3, p0, Lp/d;->j:I

    if-ge v1, v3, :cond_5

    iget-object v3, p0, Lp/d;->f:[Lp/c;

    aget-object v3, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lp/d;->s()V

    iput v0, p0, Lp/d;->j:I

    new-instance v0, Lp/c;

    invoke-direct {v0, v2}, Lp/c;-><init>(Lg/h;)V

    iput-object v0, p0, Lp/d;->o:Lp/c;

    return-void
.end method
