.class public Landroidx/constraintlayout/helper/widget/Flow;
.super Lu/t;
.source "SourceFile"


# instance fields
.field public k:Lr/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x20

    new-array v0, v0, [I

    iput-object v0, p0, Lu/c;->b:[I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu/c;->h:Ljava/util/HashMap;

    iput-object p1, p0, Lu/c;->d:Landroid/content/Context;

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/helper/widget/Flow;->g(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final g(Landroid/util/AttributeSet;)V
    .locals 8

    invoke-super {p0, p1}, Lu/t;->g(Landroid/util/AttributeSet;)V

    new-instance v0, Lr/g;

    invoke-direct {v0}, Lr/j;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Lr/g;->s0:I

    iput v1, v0, Lr/g;->t0:I

    iput v1, v0, Lr/g;->u0:I

    iput v1, v0, Lr/g;->v0:I

    iput v1, v0, Lr/g;->w0:I

    iput v1, v0, Lr/g;->x0:I

    iput-boolean v1, v0, Lr/g;->y0:Z

    iput v1, v0, Lr/g;->z0:I

    iput v1, v0, Lr/g;->A0:I

    new-instance v2, Ls/b;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lr/g;->B0:Ls/b;

    const/4 v2, 0x0

    iput-object v2, v0, Lr/g;->C0:Ls/n;

    const/4 v3, -0x1

    iput v3, v0, Lr/g;->D0:I

    iput v3, v0, Lr/g;->E0:I

    iput v3, v0, Lr/g;->F0:I

    iput v3, v0, Lr/g;->G0:I

    iput v3, v0, Lr/g;->H0:I

    iput v3, v0, Lr/g;->I0:I

    const/high16 v4, 0x3f000000    # 0.5f

    iput v4, v0, Lr/g;->J0:F

    iput v4, v0, Lr/g;->K0:F

    iput v4, v0, Lr/g;->L0:F

    iput v4, v0, Lr/g;->M0:F

    iput v4, v0, Lr/g;->N0:F

    iput v4, v0, Lr/g;->O0:F

    iput v1, v0, Lr/g;->P0:I

    iput v1, v0, Lr/g;->Q0:I

    const/4 v5, 0x2

    iput v5, v0, Lr/g;->R0:I

    iput v5, v0, Lr/g;->S0:I

    iput v1, v0, Lr/g;->T0:I

    iput v3, v0, Lr/g;->U0:I

    iput v1, v0, Lr/g;->V0:I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, Lr/g;->W0:Ljava/util/ArrayList;

    iput-object v2, v0, Lr/g;->X0:[Lr/d;

    iput-object v2, v0, Lr/g;->Y0:[Lr/d;

    iput-object v2, v0, Lr/g;->Z0:[I

    iput v1, v0, Lr/g;->b1:I

    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    if-eqz p1, :cond_1b

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Lu/r;->b:[I

    invoke-virtual {v0, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1a

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v6

    if-nez v6, :cond_0

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->V0:I

    goto/16 :goto_1

    :cond_0
    const/4 v7, 0x1

    if-ne v6, v7, :cond_1

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v7, Lr/g;->s0:I

    iput v6, v7, Lr/g;->t0:I

    iput v6, v7, Lr/g;->u0:I

    iput v6, v7, Lr/g;->v0:I

    goto/16 :goto_1

    :cond_1
    const/16 v7, 0x12

    if-ne v6, v7, :cond_2

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v7, Lr/g;->u0:I

    iput v6, v7, Lr/g;->w0:I

    iput v6, v7, Lr/g;->x0:I

    goto/16 :goto_1

    :cond_2
    const/16 v7, 0x13

    if-ne v6, v7, :cond_3

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v7, Lr/g;->v0:I

    goto/16 :goto_1

    :cond_3
    if-ne v6, v5, :cond_4

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v7, Lr/g;->w0:I

    goto/16 :goto_1

    :cond_4
    const/4 v7, 0x3

    if-ne v6, v7, :cond_5

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v7, Lr/g;->s0:I

    goto/16 :goto_1

    :cond_5
    const/4 v7, 0x4

    if-ne v6, v7, :cond_6

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v7, Lr/g;->x0:I

    goto/16 :goto_1

    :cond_6
    const/4 v7, 0x5

    if-ne v6, v7, :cond_7

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v7, Lr/g;->t0:I

    goto/16 :goto_1

    :cond_7
    const/16 v7, 0x36

    if-ne v6, v7, :cond_8

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->T0:I

    goto/16 :goto_1

    :cond_8
    const/16 v7, 0x2c

    if-ne v6, v7, :cond_9

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->D0:I

    goto/16 :goto_1

    :cond_9
    const/16 v7, 0x35

    if-ne v6, v7, :cond_a

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->E0:I

    goto/16 :goto_1

    :cond_a
    const/16 v7, 0x26

    if-ne v6, v7, :cond_b

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->F0:I

    goto/16 :goto_1

    :cond_b
    const/16 v7, 0x2e

    if-ne v6, v7, :cond_c

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->H0:I

    goto/16 :goto_1

    :cond_c
    const/16 v7, 0x28

    if-ne v6, v7, :cond_d

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->G0:I

    goto/16 :goto_1

    :cond_d
    const/16 v7, 0x30

    if-ne v6, v7, :cond_e

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->I0:I

    goto/16 :goto_1

    :cond_e
    const/16 v7, 0x2a

    if-ne v6, v7, :cond_f

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v7, Lr/g;->J0:F

    goto/16 :goto_1

    :cond_f
    const/16 v7, 0x25

    if-ne v6, v7, :cond_10

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v7, Lr/g;->L0:F

    goto/16 :goto_1

    :cond_10
    const/16 v7, 0x2d

    if-ne v6, v7, :cond_11

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v7, Lr/g;->N0:F

    goto/16 :goto_1

    :cond_11
    const/16 v7, 0x27

    if-ne v6, v7, :cond_12

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v7, Lr/g;->M0:F

    goto :goto_1

    :cond_12
    const/16 v7, 0x2f

    if-ne v6, v7, :cond_13

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v7, Lr/g;->O0:F

    goto :goto_1

    :cond_13
    const/16 v7, 0x33

    if-ne v6, v7, :cond_14

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v7, Lr/g;->K0:F

    goto :goto_1

    :cond_14
    const/16 v7, 0x29

    if-ne v6, v7, :cond_15

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->R0:I

    goto :goto_1

    :cond_15
    const/16 v7, 0x32

    if-ne v6, v7, :cond_16

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->S0:I

    goto :goto_1

    :cond_16
    const/16 v7, 0x2b

    if-ne v6, v7, :cond_17

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v7, Lr/g;->P0:I

    goto :goto_1

    :cond_17
    const/16 v7, 0x34

    if-ne v6, v7, :cond_18

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v7, Lr/g;->Q0:I

    goto :goto_1

    :cond_18
    const/16 v7, 0x31

    if-ne v6, v7, :cond_19

    iget-object v7, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p1, v6, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v7, Lr/g;->U0:I

    :cond_19
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_1a
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1b
    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput-object p1, p0, Lu/c;->e:Lr/j;

    invoke-virtual {p0}, Lu/c;->i()V

    return-void
.end method

.method public final h(Lr/d;Z)V
    .locals 2

    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iget v0, p1, Lr/g;->u0:I

    if-gtz v0, :cond_0

    iget v1, p1, Lr/g;->v0:I

    if-lez v1, :cond_2

    :cond_0
    if-eqz p2, :cond_1

    iget p2, p1, Lr/g;->v0:I

    iput p2, p1, Lr/g;->w0:I

    iput v0, p1, Lr/g;->x0:I

    goto :goto_0

    :cond_1
    iput v0, p1, Lr/g;->w0:I

    iget p2, p1, Lr/g;->v0:I

    iput p2, p1, Lr/g;->x0:I

    :cond_2
    :goto_0
    return-void
.end method

.method public final j(Lr/g;II)V
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v10

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v11

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v12

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v13

    const/4 v14, 0x0

    if-eqz v9, :cond_7a

    iget v1, v9, Lr/j;->r0:I

    const/4 v15, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x1

    if-lez v1, :cond_7

    iget-object v1, v9, Lr/d;->T:Lr/d;

    if-eqz v1, :cond_0

    check-cast v1, Lr/e;

    iget-object v1, v1, Lr/e;->u0:Ls/n;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    iput v14, v9, Lr/g;->z0:I

    iput v14, v9, Lr/g;->A0:I

    iput-boolean v14, v9, Lr/g;->y0:Z

    goto/16 :goto_47

    :cond_1
    move v3, v14

    :goto_1
    iget v4, v9, Lr/j;->r0:I

    if-ge v3, v4, :cond_7

    iget-object v4, v9, Lr/j;->q0:[Lr/d;

    aget-object v4, v4, v3

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    instance-of v5, v4, Lr/h;

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4, v14}, Lr/d;->k(I)I

    move-result v5

    invoke-virtual {v4, v7}, Lr/d;->k(I)I

    move-result v6

    if-ne v5, v15, :cond_4

    iget v2, v4, Lr/d;->r:I

    if-eq v2, v7, :cond_4

    if-ne v6, v15, :cond_4

    iget v2, v4, Lr/d;->s:I

    if-eq v2, v7, :cond_4

    goto :goto_2

    :cond_4
    if-ne v5, v15, :cond_5

    move v5, v8

    :cond_5
    if-ne v6, v15, :cond_6

    move v6, v8

    :cond_6
    iget-object v2, v9, Lr/g;->B0:Ls/b;

    iput v5, v2, Ls/b;->a:I

    iput v6, v2, Ls/b;->b:I

    invoke-virtual {v4}, Lr/d;->r()I

    move-result v5

    iput v5, v2, Ls/b;->c:I

    iget-object v2, v9, Lr/g;->B0:Ls/b;

    invoke-virtual {v4}, Lr/d;->l()I

    move-result v5

    iput v5, v2, Ls/b;->d:I

    iget-object v2, v9, Lr/g;->B0:Ls/b;

    invoke-virtual {v1, v4, v2}, Ls/n;->b(Lr/d;Ls/b;)V

    iget-object v2, v9, Lr/g;->B0:Ls/b;

    iget v2, v2, Ls/b;->e:I

    invoke-virtual {v4, v2}, Lr/d;->P(I)V

    iget-object v2, v9, Lr/g;->B0:Ls/b;

    iget v2, v2, Ls/b;->f:I

    invoke-virtual {v4, v2}, Lr/d;->M(I)V

    iget-object v2, v9, Lr/g;->B0:Ls/b;

    iget v2, v2, Ls/b;->g:I

    invoke-virtual {v4, v2}, Lr/d;->J(I)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    iget v6, v9, Lr/g;->w0:I

    iget v5, v9, Lr/g;->x0:I

    iget v4, v9, Lr/g;->s0:I

    iget v3, v9, Lr/g;->t0:I

    new-array v2, v8, [I

    sub-int v1, v11, v6

    sub-int/2addr v1, v5

    iget v15, v9, Lr/g;->V0:I

    if-ne v15, v7, :cond_8

    sub-int v1, v13, v4

    sub-int/2addr v1, v3

    :cond_8
    const/4 v8, -0x1

    if-nez v15, :cond_a

    iget v15, v9, Lr/g;->D0:I

    if-ne v15, v8, :cond_9

    iput v14, v9, Lr/g;->D0:I

    :cond_9
    iget v15, v9, Lr/g;->E0:I

    if-ne v15, v8, :cond_c

    iput v14, v9, Lr/g;->E0:I

    goto :goto_3

    :cond_a
    iget v15, v9, Lr/g;->D0:I

    if-ne v15, v8, :cond_b

    iput v14, v9, Lr/g;->D0:I

    :cond_b
    iget v15, v9, Lr/g;->E0:I

    if-ne v15, v8, :cond_c

    iput v14, v9, Lr/g;->E0:I

    :cond_c
    :goto_3
    iget-object v8, v9, Lr/j;->q0:[Lr/d;

    move v15, v14

    move/from16 v17, v15

    :goto_4
    iget v14, v9, Lr/j;->r0:I

    const/16 v7, 0x8

    if-ge v15, v14, :cond_e

    iget-object v14, v9, Lr/j;->q0:[Lr/d;

    aget-object v14, v14, v15

    iget v14, v14, Lr/d;->g0:I

    if-ne v14, v7, :cond_d

    add-int/lit8 v17, v17, 0x1

    :cond_d
    add-int/lit8 v15, v15, 0x1

    const/4 v7, 0x1

    goto :goto_4

    :cond_e
    if-lez v17, :cond_11

    sub-int v14, v14, v17

    new-array v8, v14, [Lr/d;

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_5
    iget v7, v9, Lr/j;->r0:I

    if-ge v14, v7, :cond_10

    iget-object v7, v9, Lr/j;->q0:[Lr/d;

    aget-object v7, v7, v14

    move/from16 v19, v1

    iget v1, v7, Lr/d;->g0:I

    move-object/from16 v20, v2

    const/16 v2, 0x8

    if-eq v1, v2, :cond_f

    aput-object v7, v8, v15

    add-int/lit8 v15, v15, 0x1

    :cond_f
    add-int/lit8 v14, v14, 0x1

    move/from16 v1, v19

    move-object/from16 v2, v20

    goto :goto_5

    :cond_10
    move/from16 v19, v1

    move-object/from16 v20, v2

    :goto_6
    move-object v14, v8

    goto :goto_7

    :cond_11
    move/from16 v19, v1

    move-object/from16 v20, v2

    move v15, v14

    goto :goto_6

    :goto_7
    iput-object v14, v9, Lr/g;->a1:[Lr/d;

    iput v15, v9, Lr/g;->b1:I

    iget v1, v9, Lr/g;->T0:I

    iget-object v8, v9, Lr/g;->W0:Ljava/util/ArrayList;

    if-eqz v1, :cond_6f

    iget-object v7, v9, Lr/d;->J:Lr/c;

    iget-object v2, v9, Lr/d;->I:Lr/c;

    iget-object v0, v9, Lr/d;->K:Lr/c;

    move-object/from16 v27, v0

    iget-object v0, v9, Lr/d;->L:Lr/c;

    move-object/from16 v28, v0

    iget-object v0, v9, Lr/d;->p0:[I

    move-object/from16 v17, v7

    const/4 v7, 0x1

    if-eq v1, v7, :cond_54

    move/from16 v29, v13

    const/4 v13, 0x2

    if-eq v1, v13, :cond_2d

    const/4 v7, 0x3

    if-eq v1, v7, :cond_12

    :goto_8
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v40, v5

    move/from16 v34, v6

    move/from16 v39, v10

    move/from16 v38, v11

    move/from16 v35, v12

    move-object/from16 v31, v20

    :goto_9
    const/4 v1, 0x0

    const/4 v2, 0x1

    goto/16 :goto_42

    :cond_12
    iget v7, v9, Lr/g;->V0:I

    if-nez v15, :cond_13

    goto :goto_8

    :cond_13
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    new-instance v1, Lr/f;

    iget-object v13, v9, Lr/d;->I:Lr/c;

    move/from16 v21, v5

    iget-object v5, v9, Lr/d;->J:Lr/c;

    move/from16 v22, v6

    iget-object v6, v9, Lr/d;->K:Lr/c;

    move-object/from16 v23, v8

    iget-object v8, v9, Lr/d;->L:Lr/c;

    move-object/from16 p2, v1

    move/from16 v30, v19

    move-object/from16 v19, v2

    move-object/from16 v31, v20

    move-object/from16 v2, p1

    move/from16 v32, v3

    move v3, v7

    move/from16 v33, v4

    move-object v4, v13

    move/from16 v13, v21

    move/from16 v34, v22

    move/from16 v36, v7

    move/from16 v35, v12

    const/4 v12, 0x1

    move-object v7, v8

    move-object/from16 v12, v23

    move/from16 v8, v30

    invoke-direct/range {v1 .. v8}, Lr/f;-><init>(Lr/g;ILr/c;Lr/c;Lr/c;Lr/c;I)V

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v36, :cond_1b

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    :goto_a
    if-ge v8, v15, :cond_1a

    const/4 v5, 0x1

    add-int/lit8 v7, v2, 0x1

    aget-object v6, v14, v8

    move/from16 v5, v30

    invoke-virtual {v9, v5, v6}, Lr/g;->U(ILr/d;)I

    move-result v16

    iget-object v2, v6, Lr/d;->p0:[I

    const/16 v18, 0x0

    aget v2, v2, v18

    move-object/from16 p2, v6

    const/4 v6, 0x3

    if-ne v2, v6, :cond_14

    add-int/lit8 v3, v3, 0x1

    :cond_14
    move/from16 v18, v3

    if-eq v4, v5, :cond_15

    iget v2, v9, Lr/g;->P0:I

    add-int/2addr v2, v4

    add-int v2, v2, v16

    if-le v2, v5, :cond_16

    :cond_15
    iget-object v2, v1, Lr/f;->b:Lr/d;

    if-eqz v2, :cond_16

    const/4 v2, 0x1

    goto :goto_b

    :cond_16
    const/4 v2, 0x0

    :goto_b
    if-nez v2, :cond_17

    if-lez v8, :cond_17

    iget v3, v9, Lr/g;->U0:I

    if-lez v3, :cond_17

    if-le v7, v3, :cond_17

    goto :goto_c

    :cond_17
    if-eqz v2, :cond_18

    :goto_c
    new-instance v6, Lr/f;

    iget-object v4, v9, Lr/d;->I:Lr/c;

    iget-object v3, v9, Lr/d;->J:Lr/c;

    iget-object v2, v9, Lr/d;->K:Lr/c;

    iget-object v1, v9, Lr/d;->L:Lr/c;

    move-object/from16 v20, v1

    move-object v1, v6

    move-object/from16 v21, v2

    move-object/from16 v2, p1

    move-object/from16 v22, v3

    move/from16 v3, v36

    move/from16 v30, v5

    move-object/from16 v5, v22

    move/from16 v39, v10

    move/from16 v38, v11

    move-object/from16 v11, p2

    move-object v10, v6

    move-object/from16 v6, v21

    move/from16 v21, v7

    move-object/from16 v7, v20

    move/from16 v40, v13

    move v13, v8

    move/from16 v8, v30

    invoke-direct/range {v1 .. v8}, Lr/f;-><init>(Lr/g;ILr/c;Lr/c;Lr/c;Lr/c;I)V

    iput v13, v10, Lr/f;->n:I

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v1, v10

    move/from16 v4, v16

    move/from16 v2, v21

    goto :goto_e

    :cond_18
    move/from16 v30, v5

    move/from16 v39, v10

    move/from16 v38, v11

    move/from16 v40, v13

    move-object/from16 v11, p2

    move v13, v8

    if-lez v13, :cond_19

    iget v2, v9, Lr/g;->P0:I

    add-int v2, v2, v16

    add-int/2addr v2, v4

    move v4, v2

    :goto_d
    const/4 v2, 0x0

    goto :goto_e

    :cond_19
    move/from16 v4, v16

    goto :goto_d

    :goto_e
    invoke-virtual {v1, v11}, Lr/f;->a(Lr/d;)V

    add-int/lit8 v8, v13, 0x1

    move/from16 v3, v18

    move/from16 v11, v38

    move/from16 v10, v39

    move/from16 v13, v40

    goto/16 :goto_a

    :cond_1a
    move/from16 v39, v10

    move/from16 v38, v11

    move/from16 v40, v13

    move/from16 v13, v30

    goto/16 :goto_13

    :cond_1b
    move/from16 v39, v10

    move/from16 v38, v11

    move/from16 v40, v13

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v10, 0x0

    :goto_f
    if-ge v10, v15, :cond_22

    aget-object v11, v14, v10

    move/from16 v13, v30

    invoke-virtual {v9, v13, v11}, Lr/g;->T(ILr/d;)I

    move-result v16

    iget-object v4, v11, Lr/d;->p0:[I

    const/4 v5, 0x1

    aget v4, v4, v5

    const/4 v5, 0x3

    if-ne v4, v5, :cond_1c

    add-int/lit8 v2, v2, 0x1

    :cond_1c
    move/from16 v18, v2

    if-eq v3, v13, :cond_1d

    iget v2, v9, Lr/g;->Q0:I

    add-int/2addr v2, v3

    add-int v2, v2, v16

    if-le v2, v13, :cond_1e

    :cond_1d
    iget-object v2, v1, Lr/f;->b:Lr/d;

    if-eqz v2, :cond_1e

    const/4 v7, 0x1

    goto :goto_10

    :cond_1e
    const/4 v7, 0x0

    :goto_10
    if-nez v7, :cond_1f

    if-lez v10, :cond_1f

    iget v2, v9, Lr/g;->U0:I

    if-lez v2, :cond_1f

    if-gez v2, :cond_1f

    goto :goto_11

    :cond_1f
    if-eqz v7, :cond_21

    :goto_11
    new-instance v8, Lr/f;

    iget-object v4, v9, Lr/d;->I:Lr/c;

    iget-object v5, v9, Lr/d;->J:Lr/c;

    iget-object v6, v9, Lr/d;->K:Lr/c;

    iget-object v7, v9, Lr/d;->L:Lr/c;

    move-object v1, v8

    move-object/from16 v2, p1

    move/from16 v3, v36

    move-object/from16 v30, v14

    move-object v14, v8

    move v8, v13

    invoke-direct/range {v1 .. v8}, Lr/f;-><init>(Lr/g;ILr/c;Lr/c;Lr/c;Lr/c;I)V

    iput v10, v14, Lr/f;->n:I

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v1, v14

    :cond_20
    move/from16 v3, v16

    goto :goto_12

    :cond_21
    move-object/from16 v30, v14

    if-lez v10, :cond_20

    iget v2, v9, Lr/g;->Q0:I

    add-int v2, v2, v16

    add-int/2addr v2, v3

    move v3, v2

    :goto_12
    invoke-virtual {v1, v11}, Lr/f;->a(Lr/d;)V

    add-int/lit8 v10, v10, 0x1

    move/from16 v2, v18

    move-object/from16 v14, v30

    move/from16 v30, v13

    goto :goto_f

    :cond_22
    move/from16 v13, v30

    move v3, v2

    :goto_13
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, v9, Lr/g;->w0:I

    iget v4, v9, Lr/g;->s0:I

    iget v5, v9, Lr/g;->x0:I

    iget v6, v9, Lr/g;->t0:I

    const/4 v7, 0x0

    aget v8, v0, v7

    const/4 v10, 0x2

    if-eq v8, v10, :cond_24

    const/4 v7, 0x1

    aget v0, v0, v7

    if-ne v0, v10, :cond_23

    goto :goto_14

    :cond_23
    const/4 v7, 0x0

    goto :goto_15

    :cond_24
    :goto_14
    const/4 v7, 0x1

    :goto_15
    if-lez v3, :cond_26

    if-eqz v7, :cond_26

    const/4 v0, 0x0

    :goto_16
    if-ge v0, v1, :cond_26

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr/f;

    if-nez v36, :cond_25

    invoke-virtual {v3}, Lr/f;->d()I

    move-result v7

    sub-int v7, v13, v7

    invoke-virtual {v3, v7}, Lr/f;->e(I)V

    goto :goto_17

    :cond_25
    invoke-virtual {v3}, Lr/f;->c()I

    move-result v7

    sub-int v7, v13, v7

    invoke-virtual {v3, v7}, Lr/f;->e(I)V

    :goto_17
    add-int/lit8 v0, v0, 0x1

    goto :goto_16

    :cond_26
    move v3, v2

    move-object/from16 v2, v17

    move-object/from16 v0, v19

    move-object/from16 v14, v27

    move-object/from16 v11, v28

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    :goto_18
    if-ge v7, v1, :cond_2c

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lr/f;

    if-nez v36, :cond_29

    add-int/lit8 v6, v1, -0x1

    if-ge v7, v6, :cond_27

    add-int/lit8 v6, v7, 0x1

    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr/f;

    iget-object v6, v6, Lr/f;->b:Lr/d;

    iget-object v6, v6, Lr/d;->J:Lr/c;

    move-object v11, v6

    move-object/from16 v37, v12

    const/4 v6, 0x0

    goto :goto_19

    :cond_27
    iget v6, v9, Lr/g;->t0:I

    move-object/from16 v37, v12

    move-object/from16 v11, v28

    :goto_19
    iget-object v12, v15, Lr/f;->b:Lr/d;

    iget-object v12, v12, Lr/d;->L:Lr/c;

    move-object/from16 v16, v15

    move/from16 v17, v36

    move-object/from16 v18, v0

    move-object/from16 v19, v2

    move-object/from16 v20, v14

    move-object/from16 v21, v11

    move/from16 v22, v3

    move/from16 v23, v4

    move/from16 v24, v5

    move/from16 v25, v6

    move/from16 v26, v13

    invoke-virtual/range {v16 .. v26}, Lr/f;->f(ILr/c;Lr/c;Lr/c;Lr/c;IIIII)V

    invoke-virtual {v15}, Lr/f;->d()I

    move-result v2

    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v15}, Lr/f;->c()I

    move-result v4

    add-int/2addr v4, v10

    if-lez v7, :cond_28

    iget v8, v9, Lr/g;->Q0:I

    add-int/2addr v4, v8

    :cond_28
    move/from16 p2, v1

    move v8, v2

    move v10, v4

    move-object v2, v12

    move-object/from16 v12, v37

    const/4 v4, 0x0

    goto :goto_1b

    :cond_29
    move-object/from16 v37, v12

    add-int/lit8 v5, v1, -0x1

    if-ge v7, v5, :cond_2a

    add-int/lit8 v5, v7, 0x1

    move-object/from16 v12, v37

    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr/f;

    iget-object v5, v5, Lr/f;->b:Lr/d;

    iget-object v5, v5, Lr/d;->I:Lr/c;

    move/from16 p2, v1

    move-object v14, v5

    const/4 v5, 0x0

    goto :goto_1a

    :cond_2a
    move-object/from16 v12, v37

    iget v5, v9, Lr/g;->x0:I

    move/from16 p2, v1

    move-object/from16 v14, v27

    :goto_1a
    iget-object v1, v15, Lr/f;->b:Lr/d;

    iget-object v1, v1, Lr/d;->K:Lr/c;

    move-object/from16 v16, v15

    move/from16 v17, v36

    move-object/from16 v18, v0

    move-object/from16 v19, v2

    move-object/from16 v20, v14

    move-object/from16 v21, v11

    move/from16 v22, v3

    move/from16 v23, v4

    move/from16 v24, v5

    move/from16 v25, v6

    move/from16 v26, v13

    invoke-virtual/range {v16 .. v26}, Lr/f;->f(ILr/c;Lr/c;Lr/c;Lr/c;IIIII)V

    invoke-virtual {v15}, Lr/f;->d()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v15}, Lr/f;->c()I

    move-result v3

    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-lez v7, :cond_2b

    iget v8, v9, Lr/g;->P0:I

    add-int/2addr v0, v8

    :cond_2b
    move v8, v0

    move-object v0, v1

    move v10, v3

    const/4 v3, 0x0

    :goto_1b
    add-int/lit8 v7, v7, 0x1

    move/from16 v1, p2

    goto/16 :goto_18

    :cond_2c
    const/4 v0, 0x0

    aput v8, v31, v0

    const/4 v0, 0x1

    aput v10, v31, v0

    goto/16 :goto_9

    :cond_2d
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v40, v5

    move/from16 v34, v6

    move/from16 v39, v10

    move/from16 v38, v11

    move/from16 v35, v12

    move v10, v13

    move-object/from16 v30, v14

    move/from16 v13, v19

    move-object/from16 v31, v20

    iget v0, v9, Lr/g;->V0:I

    if-nez v0, :cond_33

    iget v1, v9, Lr/g;->U0:I

    if-gtz v1, :cond_32

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1c
    if-ge v1, v15, :cond_31

    if-lez v1, :cond_2e

    iget v4, v9, Lr/g;->P0:I

    add-int/2addr v2, v4

    :cond_2e
    aget-object v4, v30, v1

    if-nez v4, :cond_2f

    goto :goto_1d

    :cond_2f
    invoke-virtual {v9, v13, v4}, Lr/g;->U(ILr/d;)I

    move-result v4

    add-int/2addr v4, v2

    if-le v4, v13, :cond_30

    goto :goto_1e

    :cond_30
    add-int/lit8 v3, v3, 0x1

    move v2, v4

    :goto_1d
    add-int/lit8 v1, v1, 0x1

    goto :goto_1c

    :cond_31
    :goto_1e
    const/4 v1, 0x0

    goto :goto_22

    :cond_32
    move v3, v1

    goto :goto_1e

    :cond_33
    iget v1, v9, Lr/g;->U0:I

    if-gtz v1, :cond_38

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1f
    if-ge v1, v15, :cond_37

    if-lez v1, :cond_34

    iget v4, v9, Lr/g;->Q0:I

    add-int/2addr v2, v4

    :cond_34
    aget-object v4, v30, v1

    if-nez v4, :cond_35

    goto :goto_20

    :cond_35
    invoke-virtual {v9, v13, v4}, Lr/g;->T(ILr/d;)I

    move-result v4

    add-int/2addr v4, v2

    if-le v4, v13, :cond_36

    goto :goto_21

    :cond_36
    add-int/lit8 v3, v3, 0x1

    move v2, v4

    :goto_20
    add-int/lit8 v1, v1, 0x1

    goto :goto_1f

    :cond_37
    :goto_21
    move v1, v3

    :cond_38
    const/4 v3, 0x0

    :goto_22
    iget-object v2, v9, Lr/g;->Z0:[I

    if-nez v2, :cond_39

    new-array v2, v10, [I

    iput-object v2, v9, Lr/g;->Z0:[I

    :cond_39
    if-nez v1, :cond_3a

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3b

    :cond_3a
    if-nez v3, :cond_3c

    if-nez v0, :cond_3c

    :cond_3b
    const/4 v7, 0x1

    goto :goto_23

    :cond_3c
    const/4 v7, 0x0

    :goto_23
    if-nez v7, :cond_53

    if-nez v0, :cond_3d

    int-to-float v1, v15

    int-to-float v2, v3

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    goto :goto_24

    :cond_3d
    int-to-float v2, v15

    int-to-float v3, v1

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v3, v2

    :goto_24
    iget-object v2, v9, Lr/g;->Y0:[Lr/d;

    if-eqz v2, :cond_3e

    array-length v4, v2

    if-ge v4, v3, :cond_3f

    :cond_3e
    const/4 v4, 0x0

    goto :goto_25

    :cond_3f
    const/4 v4, 0x0

    invoke-static {v2, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_26

    :goto_25
    new-array v2, v3, [Lr/d;

    iput-object v2, v9, Lr/g;->Y0:[Lr/d;

    :goto_26
    iget-object v2, v9, Lr/g;->X0:[Lr/d;

    if-eqz v2, :cond_41

    array-length v5, v2

    if-ge v5, v1, :cond_40

    goto :goto_27

    :cond_40
    invoke-static {v2, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_28

    :cond_41
    :goto_27
    new-array v2, v1, [Lr/d;

    iput-object v2, v9, Lr/g;->X0:[Lr/d;

    :goto_28
    const/4 v2, 0x0

    :goto_29
    if-ge v2, v3, :cond_4a

    const/4 v4, 0x0

    :goto_2a
    if-ge v4, v1, :cond_49

    mul-int v5, v4, v3

    add-int/2addr v5, v2

    const/4 v6, 0x1

    if-ne v0, v6, :cond_42

    mul-int v5, v2, v1

    add-int/2addr v5, v4

    :cond_42
    move-object/from16 v11, v30

    array-length v6, v11

    if-lt v5, v6, :cond_43

    goto :goto_2b

    :cond_43
    aget-object v5, v11, v5

    if-nez v5, :cond_44

    goto :goto_2b

    :cond_44
    invoke-virtual {v9, v13, v5}, Lr/g;->U(ILr/d;)I

    move-result v6

    iget-object v8, v9, Lr/g;->Y0:[Lr/d;

    aget-object v8, v8, v2

    if-eqz v8, :cond_45

    invoke-virtual {v8}, Lr/d;->r()I

    move-result v8

    if-ge v8, v6, :cond_46

    :cond_45
    iget-object v6, v9, Lr/g;->Y0:[Lr/d;

    aput-object v5, v6, v2

    :cond_46
    invoke-virtual {v9, v13, v5}, Lr/g;->T(ILr/d;)I

    move-result v6

    iget-object v8, v9, Lr/g;->X0:[Lr/d;

    aget-object v8, v8, v4

    if-eqz v8, :cond_47

    invoke-virtual {v8}, Lr/d;->l()I

    move-result v8

    if-ge v8, v6, :cond_48

    :cond_47
    iget-object v6, v9, Lr/g;->X0:[Lr/d;

    aput-object v5, v6, v4

    :cond_48
    :goto_2b
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v30, v11

    goto :goto_2a

    :cond_49
    move-object/from16 v11, v30

    add-int/lit8 v2, v2, 0x1

    goto :goto_29

    :cond_4a
    move-object/from16 v11, v30

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_2c
    if-ge v2, v3, :cond_4d

    iget-object v5, v9, Lr/g;->Y0:[Lr/d;

    aget-object v5, v5, v2

    if-eqz v5, :cond_4c

    if-lez v2, :cond_4b

    iget v6, v9, Lr/g;->P0:I

    add-int/2addr v4, v6

    :cond_4b
    invoke-virtual {v9, v13, v5}, Lr/g;->U(ILr/d;)I

    move-result v5

    add-int/2addr v5, v4

    move v4, v5

    :cond_4c
    add-int/lit8 v2, v2, 0x1

    goto :goto_2c

    :cond_4d
    const/4 v2, 0x0

    const/4 v5, 0x0

    :goto_2d
    if-ge v2, v1, :cond_50

    iget-object v6, v9, Lr/g;->X0:[Lr/d;

    aget-object v6, v6, v2

    if-eqz v6, :cond_4f

    if-lez v2, :cond_4e

    iget v8, v9, Lr/g;->Q0:I

    add-int/2addr v5, v8

    :cond_4e
    invoke-virtual {v9, v13, v6}, Lr/g;->T(ILr/d;)I

    move-result v6

    add-int/2addr v6, v5

    move v5, v6

    :cond_4f
    add-int/lit8 v2, v2, 0x1

    goto :goto_2d

    :cond_50
    const/4 v2, 0x0

    aput v4, v31, v2

    const/4 v2, 0x1

    aput v5, v31, v2

    if-nez v0, :cond_52

    if-le v4, v13, :cond_51

    if-le v3, v2, :cond_51

    add-int/lit8 v3, v3, -0x1

    goto :goto_2e

    :cond_51
    move v7, v2

    goto :goto_2e

    :cond_52
    if-le v5, v13, :cond_51

    if-le v1, v2, :cond_51

    add-int/lit8 v1, v1, -0x1

    :goto_2e
    move-object/from16 v30, v11

    goto/16 :goto_23

    :cond_53
    const/4 v2, 0x1

    iget-object v0, v9, Lr/g;->Z0:[I

    const/4 v4, 0x0

    aput v3, v0, v4

    aput v1, v0, v2

    goto/16 :goto_9

    :cond_54
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v40, v5

    move/from16 v34, v6

    move/from16 v39, v10

    move/from16 v38, v11

    move/from16 v35, v12

    move/from16 v29, v13

    move-object v11, v14

    move/from16 v13, v19

    move-object/from16 v31, v20

    const/4 v10, 0x2

    move-object/from16 v19, v2

    move-object v12, v8

    iget v14, v9, Lr/g;->V0:I

    if-nez v15, :cond_55

    goto/16 :goto_9

    :cond_55
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    new-instance v8, Lr/f;

    iget-object v4, v9, Lr/d;->I:Lr/c;

    iget-object v5, v9, Lr/d;->J:Lr/c;

    iget-object v6, v9, Lr/d;->K:Lr/c;

    iget-object v7, v9, Lr/d;->L:Lr/c;

    move-object v1, v8

    move-object/from16 v2, p1

    move v3, v14

    move-object v10, v8

    move v8, v13

    invoke-direct/range {v1 .. v8}, Lr/f;-><init>(Lr/g;ILr/c;Lr/c;Lr/c;Lr/c;I)V

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v14, :cond_5d

    move-object v8, v10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v10, 0x0

    :goto_2f
    if-ge v10, v15, :cond_5c

    aget-object v7, v11, v10

    invoke-virtual {v9, v13, v7}, Lr/g;->U(ILr/d;)I

    move-result v16

    iget-object v3, v7, Lr/d;->p0:[I

    const/4 v4, 0x0

    aget v3, v3, v4

    const/4 v4, 0x3

    if-ne v3, v4, :cond_56

    add-int/lit8 v1, v1, 0x1

    :cond_56
    move/from16 v18, v1

    if-eq v2, v13, :cond_57

    iget v1, v9, Lr/g;->P0:I

    add-int/2addr v1, v2

    add-int v1, v1, v16

    if-le v1, v13, :cond_58

    :cond_57
    iget-object v1, v8, Lr/f;->b:Lr/d;

    if-eqz v1, :cond_58

    const/4 v1, 0x1

    goto :goto_30

    :cond_58
    const/4 v1, 0x0

    :goto_30
    if-nez v1, :cond_59

    if-lez v10, :cond_59

    iget v3, v9, Lr/g;->U0:I

    if-lez v3, :cond_59

    rem-int v3, v10, v3

    if-nez v3, :cond_59

    goto :goto_31

    :cond_59
    if-eqz v1, :cond_5b

    :goto_31
    new-instance v8, Lr/f;

    iget-object v4, v9, Lr/d;->I:Lr/c;

    iget-object v5, v9, Lr/d;->J:Lr/c;

    iget-object v6, v9, Lr/d;->K:Lr/c;

    iget-object v3, v9, Lr/d;->L:Lr/c;

    move-object v1, v8

    move-object/from16 v2, p1

    move-object/from16 v20, v3

    move v3, v14

    move-object/from16 v21, v0

    move-object v0, v7

    move-object/from16 v7, v20

    move/from16 v30, v14

    move-object v14, v8

    move v8, v13

    invoke-direct/range {v1 .. v8}, Lr/f;-><init>(Lr/g;ILr/c;Lr/c;Lr/c;Lr/c;I)V

    iput v10, v14, Lr/f;->n:I

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v8, v14

    :cond_5a
    move/from16 v2, v16

    goto :goto_32

    :cond_5b
    move-object/from16 v21, v0

    move-object v0, v7

    move/from16 v30, v14

    if-lez v10, :cond_5a

    iget v1, v9, Lr/g;->P0:I

    add-int v1, v1, v16

    add-int/2addr v1, v2

    move v2, v1

    :goto_32
    invoke-virtual {v8, v0}, Lr/f;->a(Lr/d;)V

    add-int/lit8 v10, v10, 0x1

    move/from16 v1, v18

    move-object/from16 v0, v21

    move/from16 v14, v30

    goto :goto_2f

    :cond_5c
    move-object/from16 v21, v0

    move/from16 v30, v14

    goto/16 :goto_37

    :cond_5d
    move-object/from16 v21, v0

    move/from16 v30, v14

    move-object v8, v10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_33
    if-ge v0, v15, :cond_64

    aget-object v10, v11, v0

    invoke-virtual {v9, v13, v10}, Lr/g;->T(ILr/d;)I

    move-result v14

    iget-object v3, v10, Lr/d;->p0:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    const/4 v7, 0x3

    if-ne v3, v7, :cond_5e

    add-int/lit8 v1, v1, 0x1

    :cond_5e
    move/from16 v16, v1

    if-eq v2, v13, :cond_5f

    iget v1, v9, Lr/g;->Q0:I

    add-int/2addr v1, v2

    add-int/2addr v1, v14

    if-le v1, v13, :cond_60

    :cond_5f
    iget-object v1, v8, Lr/f;->b:Lr/d;

    if-eqz v1, :cond_60

    const/4 v1, 0x1

    goto :goto_34

    :cond_60
    const/4 v1, 0x0

    :goto_34
    if-nez v1, :cond_61

    if-lez v0, :cond_61

    iget v3, v9, Lr/g;->U0:I

    if-lez v3, :cond_61

    rem-int v3, v0, v3

    if-nez v3, :cond_61

    goto :goto_35

    :cond_61
    if-eqz v1, :cond_63

    :goto_35
    new-instance v8, Lr/f;

    iget-object v4, v9, Lr/d;->I:Lr/c;

    iget-object v5, v9, Lr/d;->J:Lr/c;

    iget-object v6, v9, Lr/d;->K:Lr/c;

    iget-object v3, v9, Lr/d;->L:Lr/c;

    move-object v1, v8

    move-object/from16 v2, p1

    move-object/from16 v18, v3

    move/from16 v3, v30

    move/from16 v20, v7

    move-object/from16 v7, v18

    move-object/from16 v36, v11

    move-object v11, v8

    move v8, v13

    invoke-direct/range {v1 .. v8}, Lr/f;-><init>(Lr/g;ILr/c;Lr/c;Lr/c;Lr/c;I)V

    iput v0, v11, Lr/f;->n:I

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v8, v11

    :cond_62
    move v2, v14

    goto :goto_36

    :cond_63
    move/from16 v20, v7

    move-object/from16 v36, v11

    if-lez v0, :cond_62

    iget v1, v9, Lr/g;->Q0:I

    add-int/2addr v1, v14

    add-int/2addr v1, v2

    move v2, v1

    :goto_36
    invoke-virtual {v8, v10}, Lr/f;->a(Lr/d;)V

    add-int/lit8 v0, v0, 0x1

    move/from16 v1, v16

    move-object/from16 v11, v36

    goto :goto_33

    :cond_64
    :goto_37
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v2, v9, Lr/g;->w0:I

    iget v3, v9, Lr/g;->s0:I

    iget v4, v9, Lr/g;->x0:I

    iget v5, v9, Lr/g;->t0:I

    const/4 v6, 0x0

    aget v7, v21, v6

    const/4 v6, 0x2

    if-eq v7, v6, :cond_66

    const/4 v7, 0x1

    aget v8, v21, v7

    if-ne v8, v6, :cond_65

    goto :goto_38

    :cond_65
    const/4 v7, 0x0

    goto :goto_39

    :cond_66
    :goto_38
    const/4 v7, 0x1

    :goto_39
    if-lez v1, :cond_68

    if-eqz v7, :cond_68

    const/4 v1, 0x0

    :goto_3a
    if-ge v1, v0, :cond_68

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr/f;

    if-nez v30, :cond_67

    invoke-virtual {v6}, Lr/f;->d()I

    move-result v7

    sub-int v7, v13, v7

    invoke-virtual {v6, v7}, Lr/f;->e(I)V

    goto :goto_3b

    :cond_67
    invoke-virtual {v6}, Lr/f;->c()I

    move-result v7

    sub-int v7, v13, v7

    invoke-virtual {v6, v7}, Lr/f;->e(I)V

    :goto_3b
    add-int/lit8 v1, v1, 0x1

    goto :goto_3a

    :cond_68
    move v6, v3

    move-object/from16 v1, v19

    move-object/from16 v14, v27

    move-object/from16 v11, v28

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move v3, v2

    move-object/from16 v2, v17

    :goto_3c
    if-ge v7, v0, :cond_6e

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lr/f;

    if-nez v30, :cond_6b

    add-int/lit8 v5, v0, -0x1

    if-ge v7, v5, :cond_69

    add-int/lit8 v5, v7, 0x1

    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr/f;

    iget-object v5, v5, Lr/f;->b:Lr/d;

    iget-object v5, v5, Lr/d;->J:Lr/c;

    move-object v11, v5

    move-object/from16 v37, v12

    const/4 v5, 0x0

    goto :goto_3d

    :cond_69
    iget v5, v9, Lr/g;->t0:I

    move-object/from16 v37, v12

    move-object/from16 v11, v28

    :goto_3d
    iget-object v12, v15, Lr/f;->b:Lr/d;

    iget-object v12, v12, Lr/d;->L:Lr/c;

    move-object/from16 v16, v15

    move/from16 v17, v30

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v20, v14

    move-object/from16 v21, v11

    move/from16 v22, v3

    move/from16 v23, v6

    move/from16 v24, v4

    move/from16 v25, v5

    move/from16 v26, v13

    invoke-virtual/range {v16 .. v26}, Lr/f;->f(ILr/c;Lr/c;Lr/c;Lr/c;IIIII)V

    invoke-virtual {v15}, Lr/f;->d()I

    move-result v2

    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v15}, Lr/f;->c()I

    move-result v6

    add-int/2addr v6, v10

    if-lez v7, :cond_6a

    iget v8, v9, Lr/g;->Q0:I

    add-int/2addr v6, v8

    :cond_6a
    move/from16 p2, v0

    move v8, v2

    move v10, v6

    move-object v2, v12

    move-object/from16 v12, v37

    const/4 v6, 0x0

    goto :goto_3f

    :cond_6b
    move-object/from16 v37, v12

    add-int/lit8 v4, v0, -0x1

    if-ge v7, v4, :cond_6c

    add-int/lit8 v4, v7, 0x1

    move-object/from16 v12, v37

    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr/f;

    iget-object v4, v4, Lr/f;->b:Lr/d;

    iget-object v4, v4, Lr/d;->I:Lr/c;

    move/from16 p2, v0

    move-object v14, v4

    const/4 v4, 0x0

    goto :goto_3e

    :cond_6c
    move-object/from16 v12, v37

    iget v4, v9, Lr/g;->x0:I

    move/from16 p2, v0

    move-object/from16 v14, v27

    :goto_3e
    iget-object v0, v15, Lr/f;->b:Lr/d;

    iget-object v0, v0, Lr/d;->K:Lr/c;

    move-object/from16 v16, v15

    move/from16 v17, v30

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v20, v14

    move-object/from16 v21, v11

    move/from16 v22, v3

    move/from16 v23, v6

    move/from16 v24, v4

    move/from16 v25, v5

    move/from16 v26, v13

    invoke-virtual/range {v16 .. v26}, Lr/f;->f(ILr/c;Lr/c;Lr/c;Lr/c;IIIII)V

    invoke-virtual {v15}, Lr/f;->d()I

    move-result v1

    add-int/2addr v1, v8

    invoke-virtual {v15}, Lr/f;->c()I

    move-result v3

    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-lez v7, :cond_6d

    iget v8, v9, Lr/g;->P0:I

    add-int/2addr v1, v8

    :cond_6d
    move v8, v1

    move v10, v3

    const/4 v3, 0x0

    move-object v1, v0

    :goto_3f
    add-int/lit8 v7, v7, 0x1

    move/from16 v0, p2

    goto/16 :goto_3c

    :cond_6e
    const/4 v0, 0x0

    aput v8, v31, v0

    const/4 v0, 0x1

    aput v10, v31, v0

    goto/16 :goto_9

    :cond_6f
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v40, v5

    move/from16 v34, v6

    move/from16 v39, v10

    move/from16 v38, v11

    move/from16 v35, v12

    move/from16 v29, v13

    move-object/from16 v36, v14

    move/from16 v13, v19

    move-object/from16 v31, v20

    move-object v12, v8

    iget v0, v9, Lr/g;->V0:I

    if-nez v15, :cond_70

    goto/16 :goto_9

    :cond_70
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_71

    new-instance v10, Lr/f;

    iget-object v4, v9, Lr/d;->I:Lr/c;

    iget-object v5, v9, Lr/d;->J:Lr/c;

    iget-object v6, v9, Lr/d;->K:Lr/c;

    iget-object v7, v9, Lr/d;->L:Lr/c;

    move-object v1, v10

    move-object/from16 v2, p1

    move v3, v0

    move v8, v13

    invoke-direct/range {v1 .. v8}, Lr/f;-><init>(Lr/g;ILr/c;Lr/c;Lr/c;Lr/c;I)V

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_40

    :cond_71
    const/4 v1, 0x0

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lr/f;

    iput v1, v10, Lr/f;->c:I

    const/4 v2, 0x0

    iput-object v2, v10, Lr/f;->b:Lr/d;

    iput v1, v10, Lr/f;->l:I

    iput v1, v10, Lr/f;->m:I

    iput v1, v10, Lr/f;->n:I

    iput v1, v10, Lr/f;->o:I

    iput v1, v10, Lr/f;->p:I

    iget-object v1, v9, Lr/d;->I:Lr/c;

    iget-object v2, v9, Lr/d;->J:Lr/c;

    iget-object v3, v9, Lr/d;->K:Lr/c;

    iget-object v4, v9, Lr/d;->L:Lr/c;

    iget v5, v9, Lr/g;->w0:I

    iget v6, v9, Lr/g;->s0:I

    iget v7, v9, Lr/g;->x0:I

    iget v8, v9, Lr/g;->t0:I

    move-object/from16 v16, v10

    move/from16 v17, v0

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    move/from16 v22, v5

    move/from16 v23, v6

    move/from16 v24, v7

    move/from16 v25, v8

    move/from16 v26, v13

    invoke-virtual/range {v16 .. v26}, Lr/f;->f(ILr/c;Lr/c;Lr/c;Lr/c;IIIII)V

    :goto_40
    const/4 v0, 0x0

    :goto_41
    if-ge v0, v15, :cond_72

    aget-object v1, v36, v0

    invoke-virtual {v10, v1}, Lr/f;->a(Lr/d;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_41

    :cond_72
    invoke-virtual {v10}, Lr/f;->d()I

    move-result v0

    const/4 v1, 0x0

    aput v0, v31, v1

    invoke-virtual {v10}, Lr/f;->c()I

    move-result v0

    const/4 v2, 0x1

    aput v0, v31, v2

    :goto_42
    aget v0, v31, v1

    add-int v0, v0, v34

    add-int v0, v0, v40

    aget v1, v31, v2

    add-int v1, v1, v33

    add-int v1, v1, v32

    const/high16 v3, -0x80000000

    const/high16 v4, 0x40000000    # 2.0f

    move/from16 v5, v39

    if-ne v5, v4, :cond_73

    move/from16 v0, v35

    move/from16 v11, v38

    goto :goto_44

    :cond_73
    if-ne v5, v3, :cond_74

    move/from16 v6, v38

    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v11

    :goto_43
    move/from16 v0, v35

    goto :goto_44

    :cond_74
    if-nez v5, :cond_75

    move v11, v0

    goto :goto_43

    :cond_75
    move/from16 v0, v35

    const/4 v11, 0x0

    :goto_44
    if-ne v0, v4, :cond_76

    move/from16 v13, v29

    goto :goto_45

    :cond_76
    if-ne v0, v3, :cond_77

    move/from16 v3, v29

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v13

    goto :goto_45

    :cond_77
    if-nez v0, :cond_78

    move v13, v1

    goto :goto_45

    :cond_78
    const/4 v13, 0x0

    :goto_45
    iput v11, v9, Lr/g;->z0:I

    iput v13, v9, Lr/g;->A0:I

    invoke-virtual {v9, v11}, Lr/d;->P(I)V

    invoke-virtual {v9, v13}, Lr/d;->M(I)V

    iget v0, v9, Lr/j;->r0:I

    if-lez v0, :cond_79

    move v14, v2

    goto :goto_46

    :cond_79
    const/4 v14, 0x0

    :goto_46
    iput-boolean v14, v9, Lr/g;->y0:Z

    :goto_47
    iget v0, v9, Lr/g;->z0:I

    iget v1, v9, Lr/g;->A0:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_48

    :cond_7a
    move-object v2, v0

    move v0, v14

    invoke-virtual {v2, v0, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    :goto_48
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    invoke-virtual {p0, v0, p1, p2}, Landroidx/constraintlayout/helper/widget/Flow;->j(Lr/g;II)V

    return-void
.end method

.method public setFirstHorizontalBias(F)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->L0:F

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setFirstHorizontalStyle(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->F0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setFirstVerticalBias(F)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->M0:F

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setFirstVerticalStyle(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->G0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalAlign(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->R0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalBias(F)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->J0:F

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalGap(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->P0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalStyle(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->D0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setLastHorizontalBias(F)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->N0:F

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setLastHorizontalStyle(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->H0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setLastVerticalBias(F)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->O0:F

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setLastVerticalStyle(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->I0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setMaxElementsWrap(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->U0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->V0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPadding(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->s0:I

    iput p1, v0, Lr/g;->t0:I

    iput p1, v0, Lr/g;->u0:I

    iput p1, v0, Lr/g;->v0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingBottom(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->t0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingLeft(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->w0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingRight(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->x0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingTop(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->s0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalAlign(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->S0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalBias(F)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->K0:F

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalGap(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->Q0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalStyle(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->E0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setWrapMode(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->k:Lr/g;

    iput p1, v0, Lr/g;->T0:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
