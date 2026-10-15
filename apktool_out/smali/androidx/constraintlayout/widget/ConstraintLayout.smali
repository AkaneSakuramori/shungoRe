.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static s:Lu/s;


# instance fields
.field public final b:Landroid/util/SparseArray;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lr/e;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Z

.field public j:I

.field public k:Lu/n;

.field public l:Lu/g;

.field public m:I

.field public n:Ljava/util/HashMap;

.field public final o:Landroid/util/SparseArray;

.field public final p:Ls/n;

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    .line 4
    new-instance p1, Lr/e;

    invoke-direct {p1}, Lr/e;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    const v0, 0x7fffffff

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    const/16 v0, 0x101

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lu/n;

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lu/g;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    .line 6
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    .line 7
    new-instance v0, Ls/n;

    invoke-direct {v0, p0, p0}, Ls/n;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Ls/n;

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    .line 8
    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->i(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    .line 11
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    .line 12
    new-instance p1, Lr/e;

    invoke-direct {p1}, Lr/e;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    const v0, 0x7fffffff

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    const/16 v0, 0x101

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lu/n;

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lu/g;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    .line 14
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    .line 15
    new-instance v0, Ls/n;

    invoke-direct {v0, p0, p0}, Ls/n;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Ls/n;

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    .line 16
    invoke-virtual {p0, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;->i(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static g()Lu/e;
    .locals 8

    new-instance v0, Lu/e;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 v1, -0x1

    iput v1, v0, Lu/e;->a:I

    iput v1, v0, Lu/e;->b:I

    const/high16 v2, -0x40800000    # -1.0f

    iput v2, v0, Lu/e;->c:F

    const/4 v3, 0x1

    iput-boolean v3, v0, Lu/e;->d:Z

    iput v1, v0, Lu/e;->e:I

    iput v1, v0, Lu/e;->f:I

    iput v1, v0, Lu/e;->g:I

    iput v1, v0, Lu/e;->h:I

    iput v1, v0, Lu/e;->i:I

    iput v1, v0, Lu/e;->j:I

    iput v1, v0, Lu/e;->k:I

    iput v1, v0, Lu/e;->l:I

    iput v1, v0, Lu/e;->m:I

    iput v1, v0, Lu/e;->n:I

    iput v1, v0, Lu/e;->o:I

    iput v1, v0, Lu/e;->p:I

    const/4 v4, 0x0

    iput v4, v0, Lu/e;->q:I

    const/4 v5, 0x0

    iput v5, v0, Lu/e;->r:F

    iput v1, v0, Lu/e;->s:I

    iput v1, v0, Lu/e;->t:I

    iput v1, v0, Lu/e;->u:I

    iput v1, v0, Lu/e;->v:I

    const/high16 v5, -0x80000000

    iput v5, v0, Lu/e;->w:I

    iput v5, v0, Lu/e;->x:I

    iput v5, v0, Lu/e;->y:I

    iput v5, v0, Lu/e;->z:I

    iput v5, v0, Lu/e;->A:I

    iput v5, v0, Lu/e;->B:I

    iput v5, v0, Lu/e;->C:I

    iput v4, v0, Lu/e;->D:I

    const/high16 v6, 0x3f000000    # 0.5f

    iput v6, v0, Lu/e;->E:F

    iput v6, v0, Lu/e;->F:F

    const/4 v7, 0x0

    iput-object v7, v0, Lu/e;->G:Ljava/lang/String;

    iput v2, v0, Lu/e;->H:F

    iput v2, v0, Lu/e;->I:F

    iput v4, v0, Lu/e;->J:I

    iput v4, v0, Lu/e;->K:I

    iput v4, v0, Lu/e;->L:I

    iput v4, v0, Lu/e;->M:I

    iput v4, v0, Lu/e;->N:I

    iput v4, v0, Lu/e;->O:I

    iput v4, v0, Lu/e;->P:I

    iput v4, v0, Lu/e;->Q:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lu/e;->R:F

    iput v2, v0, Lu/e;->S:F

    iput v1, v0, Lu/e;->T:I

    iput v1, v0, Lu/e;->U:I

    iput v1, v0, Lu/e;->V:I

    iput-boolean v4, v0, Lu/e;->W:Z

    iput-boolean v4, v0, Lu/e;->X:Z

    iput-object v7, v0, Lu/e;->Y:Ljava/lang/String;

    iput v4, v0, Lu/e;->Z:I

    iput-boolean v3, v0, Lu/e;->a0:Z

    iput-boolean v3, v0, Lu/e;->b0:Z

    iput-boolean v4, v0, Lu/e;->c0:Z

    iput-boolean v4, v0, Lu/e;->d0:Z

    iput-boolean v4, v0, Lu/e;->e0:Z

    iput v1, v0, Lu/e;->f0:I

    iput v1, v0, Lu/e;->g0:I

    iput v1, v0, Lu/e;->h0:I

    iput v1, v0, Lu/e;->i0:I

    iput v5, v0, Lu/e;->j0:I

    iput v5, v0, Lu/e;->k0:I

    iput v6, v0, Lu/e;->l0:F

    new-instance v1, Lr/d;

    invoke-direct {v1}, Lr/d;-><init>()V

    iput-object v1, v0, Lu/e;->p0:Lr/d;

    return-object v0
.end method

.method private getPaddingWidth()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    if-lez v1, :cond_0

    move v2, v1

    :cond_0
    return v2
.end method

.method public static getSharedValues()Lu/s;
    .locals 2

    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:Lu/s;

    if-nez v0, :cond_0

    new-instance v0, Lu/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:Lu/s;

    :cond_0
    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:Lu/s;

    return-object v0
.end method


# virtual methods
.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Lu/e;

    return p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_0

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu/c;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    move v5, v1

    :goto_1
    if-ge v5, v4, :cond_3

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_2

    check-cast v6, Ljava/lang/String;

    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x4

    if-ne v7, v8, :cond_2

    aget-object v7, v6, v1

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    aget-object v8, v6, v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x2

    aget-object v9, v6, v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x3

    aget-object v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    int-to-float v7, v7

    const/high16 v10, 0x44870000    # 1080.0f

    div-float/2addr v7, v10

    mul-float/2addr v7, v2

    float-to-int v7, v7

    int-to-float v8, v8

    const/high16 v11, 0x44f00000    # 1920.0f

    div-float/2addr v8, v11

    mul-float/2addr v8, v3

    float-to-int v8, v8

    int-to-float v9, v9

    div-float/2addr v9, v10

    mul-float/2addr v9, v2

    float-to-int v9, v9

    int-to-float v6, v6

    div-float/2addr v6, v11

    mul-float/2addr v6, v3

    float-to-int v6, v6

    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v10, -0x10000

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v14, v7

    int-to-float v13, v8

    add-int/2addr v7, v9

    int-to-float v7, v7

    move-object/from16 v10, p1

    move v11, v14

    move v12, v13

    move v9, v13

    move v13, v7

    move/from16 v16, v14

    move v14, v9

    move-object/from16 v17, v15

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v8, v6

    int-to-float v6, v8

    move v11, v7

    move v12, v9

    move v14, v6

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v12, v6

    move/from16 v13, v16

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v11, v16

    move v14, v9

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const v8, -0xff0100

    invoke-virtual {v15, v8}, Landroid/graphics/Paint;->setColor(I)V

    move v12, v9

    move v13, v7

    move v14, v6

    move-object v8, v15

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v12, v6

    move v14, v9

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_3
    return-void
.end method

.method public final forceLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    invoke-super {p0}, Landroid/view/View;->forceLayout()V

    return-void
.end method

.method public final bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->g()Lu/e;

    move-result-object v0

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 12

    .line 1
    new-instance v0, Lu/e;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 2
    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v2, -0x1

    iput v2, v0, Lu/e;->a:I

    iput v2, v0, Lu/e;->b:I

    const/high16 v3, -0x40800000    # -1.0f

    iput v3, v0, Lu/e;->c:F

    const/4 v4, 0x1

    iput-boolean v4, v0, Lu/e;->d:Z

    iput v2, v0, Lu/e;->e:I

    iput v2, v0, Lu/e;->f:I

    iput v2, v0, Lu/e;->g:I

    iput v2, v0, Lu/e;->h:I

    iput v2, v0, Lu/e;->i:I

    iput v2, v0, Lu/e;->j:I

    iput v2, v0, Lu/e;->k:I

    iput v2, v0, Lu/e;->l:I

    iput v2, v0, Lu/e;->m:I

    iput v2, v0, Lu/e;->n:I

    iput v2, v0, Lu/e;->o:I

    iput v2, v0, Lu/e;->p:I

    const/4 v5, 0x0

    iput v5, v0, Lu/e;->q:I

    const/4 v6, 0x0

    iput v6, v0, Lu/e;->r:F

    iput v2, v0, Lu/e;->s:I

    iput v2, v0, Lu/e;->t:I

    iput v2, v0, Lu/e;->u:I

    iput v2, v0, Lu/e;->v:I

    const/high16 v7, -0x80000000

    iput v7, v0, Lu/e;->w:I

    iput v7, v0, Lu/e;->x:I

    iput v7, v0, Lu/e;->y:I

    iput v7, v0, Lu/e;->z:I

    iput v7, v0, Lu/e;->A:I

    iput v7, v0, Lu/e;->B:I

    iput v7, v0, Lu/e;->C:I

    iput v5, v0, Lu/e;->D:I

    const/high16 v8, 0x3f000000    # 0.5f

    iput v8, v0, Lu/e;->E:F

    iput v8, v0, Lu/e;->F:F

    const/4 v9, 0x0

    iput-object v9, v0, Lu/e;->G:Ljava/lang/String;

    iput v3, v0, Lu/e;->H:F

    iput v3, v0, Lu/e;->I:F

    iput v5, v0, Lu/e;->J:I

    iput v5, v0, Lu/e;->K:I

    iput v5, v0, Lu/e;->L:I

    iput v5, v0, Lu/e;->M:I

    iput v5, v0, Lu/e;->N:I

    iput v5, v0, Lu/e;->O:I

    iput v5, v0, Lu/e;->P:I

    iput v5, v0, Lu/e;->Q:I

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v0, Lu/e;->R:F

    iput v3, v0, Lu/e;->S:F

    iput v2, v0, Lu/e;->T:I

    iput v2, v0, Lu/e;->U:I

    iput v2, v0, Lu/e;->V:I

    iput-boolean v5, v0, Lu/e;->W:Z

    iput-boolean v5, v0, Lu/e;->X:Z

    iput-object v9, v0, Lu/e;->Y:Ljava/lang/String;

    iput v5, v0, Lu/e;->Z:I

    iput-boolean v4, v0, Lu/e;->a0:Z

    iput-boolean v4, v0, Lu/e;->b0:Z

    iput-boolean v5, v0, Lu/e;->c0:Z

    iput-boolean v5, v0, Lu/e;->d0:Z

    iput-boolean v5, v0, Lu/e;->e0:Z

    iput v2, v0, Lu/e;->f0:I

    iput v2, v0, Lu/e;->g0:I

    iput v2, v0, Lu/e;->h0:I

    iput v2, v0, Lu/e;->i0:I

    iput v7, v0, Lu/e;->j0:I

    iput v7, v0, Lu/e;->k0:I

    iput v8, v0, Lu/e;->l0:F

    .line 3
    new-instance v3, Lr/d;

    invoke-direct {v3}, Lr/d;-><init>()V

    iput-object v3, v0, Lu/e;->p0:Lr/d;

    sget-object v3, Lu/r;->b:[I

    .line 4
    invoke-virtual {v1, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    move v3, v5

    :goto_0
    if-ge v3, v1, :cond_1

    .line 6
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v7

    .line 7
    sget-object v8, Lu/d;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v8, v7}, Landroid/util/SparseIntArray;->get(I)I

    move-result v8

    const-string v9, "ConstraintLayout"

    const/4 v10, 0x2

    const/4 v11, -0x2

    packed-switch v8, :pswitch_data_0

    packed-switch v8, :pswitch_data_1

    packed-switch v8, :pswitch_data_2

    goto/16 :goto_1

    :pswitch_0
    iget-boolean v8, v0, Lu/e;->d:Z

    .line 8
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lu/e;->d:Z

    goto/16 :goto_1

    :pswitch_1
    iget v8, v0, Lu/e;->Z:I

    .line 9
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->Z:I

    goto/16 :goto_1

    .line 10
    :pswitch_2
    invoke-static {v0, p1, v7, v4}, Lu/n;->g(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_1

    .line 11
    :pswitch_3
    invoke-static {v0, p1, v7, v5}, Lu/n;->g(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_1

    :pswitch_4
    iget v8, v0, Lu/e;->C:I

    .line 12
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lu/e;->C:I

    goto/16 :goto_1

    :pswitch_5
    iget v8, v0, Lu/e;->D:I

    .line 13
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lu/e;->D:I

    goto/16 :goto_1

    :pswitch_6
    iget v8, v0, Lu/e;->o:I

    .line 14
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->o:I

    if-ne v8, v2, :cond_0

    .line 15
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->o:I

    goto/16 :goto_1

    :pswitch_7
    iget v8, v0, Lu/e;->n:I

    .line 16
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->n:I

    if-ne v8, v2, :cond_0

    .line 17
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->n:I

    goto/16 :goto_1

    .line 18
    :pswitch_8
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lu/e;->Y:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_9
    iget v8, v0, Lu/e;->U:I

    .line 19
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lu/e;->U:I

    goto/16 :goto_1

    :pswitch_a
    iget v8, v0, Lu/e;->T:I

    .line 20
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lu/e;->T:I

    goto/16 :goto_1

    .line 21
    :pswitch_b
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->K:I

    goto/16 :goto_1

    .line 22
    :pswitch_c
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->J:I

    goto/16 :goto_1

    :pswitch_d
    iget v8, v0, Lu/e;->I:F

    .line 23
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lu/e;->I:F

    goto/16 :goto_1

    :pswitch_e
    iget v8, v0, Lu/e;->H:F

    .line 24
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lu/e;->H:F

    goto/16 :goto_1

    .line 25
    :pswitch_f
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lu/n;->h(Lu/e;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_10
    iget v8, v0, Lu/e;->S:F

    .line 26
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v0, Lu/e;->S:F

    iput v10, v0, Lu/e;->M:I

    goto/16 :goto_1

    :pswitch_11
    :try_start_0
    iget v8, v0, Lu/e;->Q:I

    .line 27
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lu/e;->Q:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    iget v8, v0, Lu/e;->Q:I

    .line 28
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    iput v11, v0, Lu/e;->Q:I

    goto/16 :goto_1

    :pswitch_12
    :try_start_1
    iget v8, v0, Lu/e;->O:I

    .line 29
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lu/e;->O:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_1

    :catch_1
    iget v8, v0, Lu/e;->O:I

    .line 30
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    iput v11, v0, Lu/e;->O:I

    goto/16 :goto_1

    :pswitch_13
    iget v8, v0, Lu/e;->R:F

    .line 31
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v0, Lu/e;->R:F

    iput v10, v0, Lu/e;->L:I

    goto/16 :goto_1

    :pswitch_14
    :try_start_2
    iget v8, v0, Lu/e;->P:I

    .line 32
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lu/e;->P:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_1

    :catch_2
    iget v8, v0, Lu/e;->P:I

    .line 33
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    iput v11, v0, Lu/e;->P:I

    goto/16 :goto_1

    :pswitch_15
    :try_start_3
    iget v8, v0, Lu/e;->N:I

    .line 34
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lu/e;->N:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_1

    :catch_3
    iget v8, v0, Lu/e;->N:I

    .line 35
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    iput v11, v0, Lu/e;->N:I

    goto/16 :goto_1

    .line 36
    :pswitch_16
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->M:I

    if-ne v7, v4, :cond_0

    const-string v7, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."

    .line 37
    invoke-static {v9, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 38
    :pswitch_17
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->L:I

    if-ne v7, v4, :cond_0

    const-string v7, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."

    .line 39
    invoke-static {v9, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    :pswitch_18
    iget v8, v0, Lu/e;->F:F

    .line 40
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lu/e;->F:F

    goto/16 :goto_1

    :pswitch_19
    iget v8, v0, Lu/e;->E:F

    .line 41
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lu/e;->E:F

    goto/16 :goto_1

    :pswitch_1a
    iget-boolean v8, v0, Lu/e;->X:Z

    .line 42
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lu/e;->X:Z

    goto/16 :goto_1

    :pswitch_1b
    iget-boolean v8, v0, Lu/e;->W:Z

    .line 43
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lu/e;->W:Z

    goto/16 :goto_1

    :pswitch_1c
    iget v8, v0, Lu/e;->B:I

    .line 44
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lu/e;->B:I

    goto/16 :goto_1

    :pswitch_1d
    iget v8, v0, Lu/e;->A:I

    .line 45
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lu/e;->A:I

    goto/16 :goto_1

    :pswitch_1e
    iget v8, v0, Lu/e;->z:I

    .line 46
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lu/e;->z:I

    goto/16 :goto_1

    :pswitch_1f
    iget v8, v0, Lu/e;->y:I

    .line 47
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lu/e;->y:I

    goto/16 :goto_1

    :pswitch_20
    iget v8, v0, Lu/e;->x:I

    .line 48
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lu/e;->x:I

    goto/16 :goto_1

    :pswitch_21
    iget v8, v0, Lu/e;->w:I

    .line 49
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lu/e;->w:I

    goto/16 :goto_1

    :pswitch_22
    iget v8, v0, Lu/e;->v:I

    .line 50
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->v:I

    if-ne v8, v2, :cond_0

    .line 51
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->v:I

    goto/16 :goto_1

    :pswitch_23
    iget v8, v0, Lu/e;->u:I

    .line 52
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->u:I

    if-ne v8, v2, :cond_0

    .line 53
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->u:I

    goto/16 :goto_1

    :pswitch_24
    iget v8, v0, Lu/e;->t:I

    .line 54
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->t:I

    if-ne v8, v2, :cond_0

    .line 55
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->t:I

    goto/16 :goto_1

    :pswitch_25
    iget v8, v0, Lu/e;->s:I

    .line 56
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->s:I

    if-ne v8, v2, :cond_0

    .line 57
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->s:I

    goto/16 :goto_1

    :pswitch_26
    iget v8, v0, Lu/e;->m:I

    .line 58
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->m:I

    if-ne v8, v2, :cond_0

    .line 59
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->m:I

    goto/16 :goto_1

    :pswitch_27
    iget v8, v0, Lu/e;->l:I

    .line 60
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->l:I

    if-ne v8, v2, :cond_0

    .line 61
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->l:I

    goto/16 :goto_1

    :pswitch_28
    iget v8, v0, Lu/e;->k:I

    .line 62
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->k:I

    if-ne v8, v2, :cond_0

    .line 63
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->k:I

    goto/16 :goto_1

    :pswitch_29
    iget v8, v0, Lu/e;->j:I

    .line 64
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->j:I

    if-ne v8, v2, :cond_0

    .line 65
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->j:I

    goto/16 :goto_1

    :pswitch_2a
    iget v8, v0, Lu/e;->i:I

    .line 66
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->i:I

    if-ne v8, v2, :cond_0

    .line 67
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->i:I

    goto/16 :goto_1

    :pswitch_2b
    iget v8, v0, Lu/e;->h:I

    .line 68
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->h:I

    if-ne v8, v2, :cond_0

    .line 69
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->h:I

    goto/16 :goto_1

    :pswitch_2c
    iget v8, v0, Lu/e;->g:I

    .line 70
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->g:I

    if-ne v8, v2, :cond_0

    .line 71
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->g:I

    goto/16 :goto_1

    :pswitch_2d
    iget v8, v0, Lu/e;->f:I

    .line 72
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->f:I

    if-ne v8, v2, :cond_0

    .line 73
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->f:I

    goto :goto_1

    :pswitch_2e
    iget v8, v0, Lu/e;->e:I

    .line 74
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->e:I

    if-ne v8, v2, :cond_0

    .line 75
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->e:I

    goto :goto_1

    :pswitch_2f
    iget v8, v0, Lu/e;->c:F

    .line 76
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lu/e;->c:F

    goto :goto_1

    :pswitch_30
    iget v8, v0, Lu/e;->b:I

    .line 77
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lu/e;->b:I

    goto :goto_1

    :pswitch_31
    iget v8, v0, Lu/e;->a:I

    .line 78
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lu/e;->a:I

    goto :goto_1

    :pswitch_32
    iget v8, v0, Lu/e;->r:F

    .line 79
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    const/high16 v8, 0x43b40000    # 360.0f

    rem-float/2addr v7, v8

    iput v7, v0, Lu/e;->r:F

    cmpg-float v9, v7, v6

    if-gez v9, :cond_0

    sub-float v7, v8, v7

    rem-float/2addr v7, v8

    iput v7, v0, Lu/e;->r:F

    goto :goto_1

    :pswitch_33
    iget v8, v0, Lu/e;->q:I

    .line 80
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lu/e;->q:I

    goto :goto_1

    :pswitch_34
    iget v8, v0, Lu/e;->p:I

    .line 81
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lu/e;->p:I

    if-ne v8, v2, :cond_0

    .line 82
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->p:I

    goto :goto_1

    :pswitch_35
    iget v8, v0, Lu/e;->V:I

    .line 83
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lu/e;->V:I

    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 84
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 85
    invoke-virtual {v0}, Lu/e;->a()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2c
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
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x40
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 7

    .line 86
    new-instance v0, Lu/e;

    .line 87
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, -0x1

    iput p1, v0, Lu/e;->a:I

    iput p1, v0, Lu/e;->b:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, Lu/e;->c:F

    const/4 v2, 0x1

    iput-boolean v2, v0, Lu/e;->d:Z

    iput p1, v0, Lu/e;->e:I

    iput p1, v0, Lu/e;->f:I

    iput p1, v0, Lu/e;->g:I

    iput p1, v0, Lu/e;->h:I

    iput p1, v0, Lu/e;->i:I

    iput p1, v0, Lu/e;->j:I

    iput p1, v0, Lu/e;->k:I

    iput p1, v0, Lu/e;->l:I

    iput p1, v0, Lu/e;->m:I

    iput p1, v0, Lu/e;->n:I

    iput p1, v0, Lu/e;->o:I

    iput p1, v0, Lu/e;->p:I

    const/4 v3, 0x0

    iput v3, v0, Lu/e;->q:I

    const/4 v4, 0x0

    iput v4, v0, Lu/e;->r:F

    iput p1, v0, Lu/e;->s:I

    iput p1, v0, Lu/e;->t:I

    iput p1, v0, Lu/e;->u:I

    iput p1, v0, Lu/e;->v:I

    const/high16 v4, -0x80000000

    iput v4, v0, Lu/e;->w:I

    iput v4, v0, Lu/e;->x:I

    iput v4, v0, Lu/e;->y:I

    iput v4, v0, Lu/e;->z:I

    iput v4, v0, Lu/e;->A:I

    iput v4, v0, Lu/e;->B:I

    iput v4, v0, Lu/e;->C:I

    iput v3, v0, Lu/e;->D:I

    const/high16 v5, 0x3f000000    # 0.5f

    iput v5, v0, Lu/e;->E:F

    iput v5, v0, Lu/e;->F:F

    const/4 v6, 0x0

    iput-object v6, v0, Lu/e;->G:Ljava/lang/String;

    iput v1, v0, Lu/e;->H:F

    iput v1, v0, Lu/e;->I:F

    iput v3, v0, Lu/e;->J:I

    iput v3, v0, Lu/e;->K:I

    iput v3, v0, Lu/e;->L:I

    iput v3, v0, Lu/e;->M:I

    iput v3, v0, Lu/e;->N:I

    iput v3, v0, Lu/e;->O:I

    iput v3, v0, Lu/e;->P:I

    iput v3, v0, Lu/e;->Q:I

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lu/e;->R:F

    iput v1, v0, Lu/e;->S:F

    iput p1, v0, Lu/e;->T:I

    iput p1, v0, Lu/e;->U:I

    iput p1, v0, Lu/e;->V:I

    iput-boolean v3, v0, Lu/e;->W:Z

    iput-boolean v3, v0, Lu/e;->X:Z

    iput-object v6, v0, Lu/e;->Y:Ljava/lang/String;

    iput v3, v0, Lu/e;->Z:I

    iput-boolean v2, v0, Lu/e;->a0:Z

    iput-boolean v2, v0, Lu/e;->b0:Z

    iput-boolean v3, v0, Lu/e;->c0:Z

    iput-boolean v3, v0, Lu/e;->d0:Z

    iput-boolean v3, v0, Lu/e;->e0:Z

    iput p1, v0, Lu/e;->f0:I

    iput p1, v0, Lu/e;->g0:I

    iput p1, v0, Lu/e;->h0:I

    iput p1, v0, Lu/e;->i0:I

    iput v4, v0, Lu/e;->j0:I

    iput v4, v0, Lu/e;->k0:I

    iput v5, v0, Lu/e;->l0:F

    .line 88
    new-instance p1, Lr/d;

    invoke-direct {p1}, Lr/d;-><init>()V

    iput-object p1, v0, Lu/e;->p0:Lr/d;

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iget v0, v0, Lr/e;->D0:I

    return v0
.end method

.method public getSceneString()Ljava/lang/String;
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iget-object v2, v1, Lr/d;->j:Ljava/lang/String;

    const/4 v3, -0x1

    if-nez v2, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    if-eq v2, v3, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lr/d;->j:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, "parent"

    iput-object v2, v1, Lr/d;->j:Ljava/lang/String;

    :cond_1
    :goto_0
    iget-object v2, v1, Lr/d;->h0:Ljava/lang/String;

    const-string v4, " setDebugName "

    const-string v5, "ConstraintLayout"

    if-nez v2, :cond_2

    iget-object v2, v1, Lr/d;->j:Ljava/lang/String;

    iput-object v2, v1, Lr/d;->h0:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v1, Lr/d;->h0:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v2, v1, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr/d;

    iget-object v7, v6, Lr/d;->f0:Ljava/lang/Object;

    check-cast v7, Landroid/view/View;

    if-eqz v7, :cond_3

    iget-object v8, v6, Lr/d;->j:Ljava/lang/String;

    if-nez v8, :cond_4

    invoke-virtual {v7}, Landroid/view/View;->getId()I

    move-result v7

    if-eq v7, v3, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lr/d;->j:Ljava/lang/String;

    :cond_4
    iget-object v7, v6, Lr/d;->h0:Ljava/lang/String;

    if-nez v7, :cond_3

    iget-object v7, v6, Lr/d;->j:Ljava/lang/String;

    iput-object v7, v6, Lr/d;->h0:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v6, Lr/d;->h0:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_5
    invoke-virtual {v1, v0}, Lr/e;->o(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h(Landroid/view/View;)Lr/d;
    .locals 1

    if-ne p1, p0, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Lu/e;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Lu/e;

    iget-object p1, p1, Lu/e;->p0:Lr/d;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Lu/e;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Lu/e;

    iget-object p1, p1, Lu/e;->p0:Lr/d;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final i(Landroid/util/AttributeSet;I)V
    .locals 7

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iput-object p0, v0, Lr/d;->f0:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Ls/n;

    iput-object v1, v0, Lr/e;->u0:Ls/n;

    iget-object v2, v0, Lr/e;->s0:Ls/e;

    iput-object v1, v2, Ls/e;->f:Ls/n;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lu/n;

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lu/r;->b:[I

    const/4 v4, 0x0

    invoke-virtual {v2, p1, v3, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    move v2, v4

    :goto_0
    if-ge v2, p2, :cond_7

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    const/16 v5, 0x10

    if-ne v3, v5, :cond_0

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    goto :goto_2

    :cond_0
    const/16 v5, 0x11

    if-ne v3, v5, :cond_1

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    goto :goto_2

    :cond_1
    const/16 v5, 0xe

    if-ne v3, v5, :cond_2

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    goto :goto_2

    :cond_2
    const/16 v5, 0xf

    if-ne v3, v5, :cond_3

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    goto :goto_2

    :cond_3
    const/16 v5, 0x71

    if-ne v3, v5, :cond_4

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    goto :goto_2

    :cond_4
    const/16 v5, 0x38

    if-ne v3, v5, :cond_5

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_6

    :try_start_0
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->j(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lu/g;

    goto :goto_2

    :cond_5
    const/16 v5, 0x22

    if-ne v3, v5, :cond_6

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    :try_start_1
    new-instance v5, Lu/n;

    invoke-direct {v5}, Lu/n;-><init>()V

    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lu/n;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v5, v6, v3}, Lu/n;->e(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lu/n;

    :goto_1
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_8
    iget p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    iput p1, v0, Lr/e;->D0:I

    const/16 p1, 0x200

    invoke-virtual {v0, p1}, Lr/e;->X(I)Z

    move-result p1

    sput-boolean p1, Lp/d;->p:Z

    return-void
.end method

.method public final j(I)V
    .locals 9

    new-instance v0, Lu/g;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, v0, Lu/g;->a:Landroid/util/SparseArray;

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, v0, Lu/g;->b:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-eq v2, v4, :cond_7

    if-eqz v2, :cond_5

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, 0x4

    const/4 v8, 0x3

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v4, "Variant"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v4, v8

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    goto :goto_5

    :sswitch_1
    const-string v4, "layoutDescription"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v4, 0x0

    goto :goto_2

    :sswitch_2
    const-string v6, "StateSet"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :sswitch_3
    const-string v4, "State"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v4, v5

    goto :goto_2

    :sswitch_4
    const-string v4, "ConstraintSet"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v4, v7

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v4, -0x1

    :goto_2
    if-eq v4, v5, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0, v1, p1}, Lu/g;->a(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    goto :goto_3

    :cond_3
    new-instance v2, Lu/f;

    invoke-direct {v2, v1, p1}, Lu/f;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    if-eqz v3, :cond_6

    iget-object v4, v3, Landroidx/activity/result/i;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance v3, Landroidx/activity/result/i;

    invoke-direct {v3, v1, p1}, Landroidx/activity/result/i;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    iget-object v2, v0, Lu/g;->a:Landroid/util/SparseArray;

    iget v4, v3, Landroidx/activity/result/i;->b:I

    invoke-virtual {v2, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :cond_6
    :goto_3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_6

    :goto_5
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_7
    :goto_6
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lu/g;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_4
        0x4c7d471 -> :sswitch_3
        0x526c4e31 -> :sswitch_2
        0x62ce7272 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method

.method public final k(Lr/e;III)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    add-int v10, v7, v9

    invoke-direct/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingWidth()I

    move-result v11

    iget-object v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Ls/n;

    iput v7, v12, Ls/n;->a:I

    iput v9, v12, Ls/n;->b:I

    iput v11, v12, Ls/n;->c:I

    iput v10, v12, Ls/n;->d:I

    move/from16 v9, p3

    iput v9, v12, Ls/n;->e:I

    move/from16 v9, p4

    iput v9, v12, Ls/n;->f:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingStart()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v13

    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    const/4 v14, 0x1

    if-gtz v9, :cond_1

    if-lez v13, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v15

    iget v15, v15, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v16, 0x400000

    and-int v15, v15, v16

    if-eqz v15, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v15

    if-ne v14, v15, :cond_2

    move v9, v13

    :cond_2
    :goto_1
    sub-int/2addr v4, v11

    sub-int/2addr v6, v10

    iget v10, v12, Ls/n;->d:I

    iget v11, v12, Ls/n;->c:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v12

    const/high16 v15, 0x40000000    # 2.0f

    const/high16 v13, -0x80000000

    if-eq v3, v13, :cond_6

    if-eqz v3, :cond_4

    if-eq v3, v15, :cond_3

    move/from16 v17, v8

    goto :goto_4

    :cond_3
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr v14, v11

    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    move-result v14

    move/from16 v17, v14

    const/4 v14, 0x1

    goto :goto_4

    :cond_4
    if-nez v12, :cond_5

    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    :goto_2
    move/from16 v17, v14

    :goto_3
    const/4 v14, 0x2

    goto :goto_4

    :cond_5
    move/from16 v17, v8

    goto :goto_3

    :cond_6
    if-nez v12, :cond_7

    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_2

    :cond_7
    move/from16 v17, v4

    goto :goto_3

    :goto_4
    if-eq v5, v13, :cond_b

    if-eqz v5, :cond_9

    if-eq v5, v15, :cond_8

    move v13, v8

    :goto_5
    const/4 v12, 0x1

    goto :goto_8

    :cond_8
    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    sub-int/2addr v12, v10

    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    move-result v12

    move v13, v12

    goto :goto_5

    :cond_9
    if-nez v12, :cond_a

    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    :goto_6
    move v13, v12

    :goto_7
    const/4 v12, 0x2

    goto :goto_8

    :cond_a
    move v13, v8

    goto :goto_7

    :cond_b
    if-nez v12, :cond_c

    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    goto :goto_6

    :cond_c
    move v13, v6

    goto :goto_7

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lr/d;->r()I

    move-result v15

    iget-object v8, v1, Lr/e;->s0:Ls/e;

    move/from16 v19, v6

    move/from16 v6, v17

    if-ne v6, v15, :cond_d

    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v15

    if-eq v13, v15, :cond_e

    :cond_d
    const/4 v15, 0x1

    goto :goto_a

    :cond_e
    :goto_9
    const/4 v15, 0x0

    goto :goto_b

    :goto_a
    iput-boolean v15, v8, Ls/e;->c:Z

    goto :goto_9

    :goto_b
    iput v15, v1, Lr/d;->Y:I

    iput v15, v1, Lr/d;->Z:I

    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr v15, v11

    move-object/from16 v17, v8

    iget-object v8, v1, Lr/d;->C:[I

    move/from16 v20, v4

    const/4 v4, 0x0

    aput v15, v8, v4

    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    sub-int/2addr v15, v10

    const/16 v18, 0x1

    aput v15, v8, v18

    iput v4, v1, Lr/d;->b0:I

    iput v4, v1, Lr/d;->c0:I

    invoke-virtual {v1, v14}, Lr/d;->N(I)V

    invoke-virtual {v1, v6}, Lr/d;->P(I)V

    invoke-virtual {v1, v12}, Lr/d;->O(I)V

    invoke-virtual {v1, v13}, Lr/d;->M(I)V

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    sub-int/2addr v6, v11

    if-gez v6, :cond_f

    iput v4, v1, Lr/d;->b0:I

    goto :goto_c

    :cond_f
    iput v6, v1, Lr/d;->b0:I

    :goto_c
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int/2addr v6, v10

    if-gez v6, :cond_10

    iput v4, v1, Lr/d;->c0:I

    goto :goto_d

    :cond_10
    iput v6, v1, Lr/d;->c0:I

    :goto_d
    iput v9, v1, Lr/e;->x0:I

    iput v7, v1, Lr/e;->y0:I

    iget-object v4, v1, Lr/e;->r0:Le/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v1, Lr/e;->u0:Ls/n;

    iget-object v7, v1, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lr/d;->r()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v10

    const/16 v11, 0x80

    invoke-static {v2, v11}, Lr/k;->b(II)Z

    move-result v11

    const/16 v12, 0x40

    if-nez v11, :cond_12

    invoke-static {v2, v12}, Lr/k;->b(II)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_e

    :cond_11
    const/4 v2, 0x0

    goto :goto_f

    :cond_12
    :goto_e
    const/4 v2, 0x1

    :goto_f
    const/4 v13, 0x3

    if-eqz v2, :cond_1b

    const/4 v15, 0x0

    :goto_10
    if-ge v15, v7, :cond_1b

    iget-object v12, v1, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lr/d;

    iget-object v14, v12, Lr/d;->p0:[I

    const/16 v18, 0x0

    aget v0, v14, v18

    if-ne v0, v13, :cond_13

    const/4 v0, 0x1

    :goto_11
    const/16 v21, 0x1

    goto :goto_12

    :cond_13
    const/4 v0, 0x0

    goto :goto_11

    :goto_12
    aget v14, v14, v21

    if-ne v14, v13, :cond_14

    const/4 v14, 0x1

    goto :goto_13

    :cond_14
    const/4 v14, 0x0

    :goto_13
    if-eqz v0, :cond_15

    if-eqz v14, :cond_15

    iget v0, v12, Lr/d;->W:F

    const/4 v14, 0x0

    cmpl-float v0, v0, v14

    if-lez v0, :cond_15

    const/4 v0, 0x1

    goto :goto_14

    :cond_15
    const/4 v0, 0x0

    :goto_14
    invoke-virtual {v12}, Lr/d;->y()Z

    move-result v14

    if-eqz v14, :cond_17

    if-eqz v0, :cond_17

    :cond_16
    :goto_15
    const/high16 v0, 0x40000000    # 2.0f

    const/4 v2, 0x0

    goto :goto_16

    :cond_17
    invoke-virtual {v12}, Lr/d;->z()Z

    move-result v14

    if-eqz v14, :cond_18

    if-eqz v0, :cond_18

    goto :goto_15

    :cond_18
    instance-of v0, v12, Lr/g;

    if-eqz v0, :cond_19

    goto :goto_15

    :cond_19
    invoke-virtual {v12}, Lr/d;->y()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual {v12}, Lr/d;->z()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_15

    :cond_1a
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    const/16 v12, 0x40

    goto :goto_10

    :cond_1b
    const/high16 v0, 0x40000000    # 2.0f

    :goto_16
    if-ne v3, v0, :cond_1c

    if-eq v5, v0, :cond_1d

    :cond_1c
    if-eqz v11, :cond_1e

    :cond_1d
    const/4 v0, 0x1

    goto :goto_17

    :cond_1e
    const/4 v0, 0x0

    :goto_17
    and-int/2addr v0, v2

    if-eqz v0, :cond_3d

    const/4 v12, 0x0

    aget v14, v8, v12

    move/from16 v12, v20

    invoke-static {v14, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    const/4 v14, 0x1

    aget v8, v8, v14

    move/from16 v15, v19

    invoke-static {v8, v15}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/high16 v15, 0x40000000    # 2.0f

    if-ne v3, v15, :cond_1f

    invoke-virtual/range {p1 .. p1}, Lr/d;->r()I

    move-result v13

    if-eq v13, v12, :cond_1f

    invoke-virtual {v1, v12}, Lr/d;->P(I)V

    iget-object v12, v1, Lr/e;->s0:Ls/e;

    iput-boolean v14, v12, Ls/e;->b:Z

    :cond_1f
    if-ne v5, v15, :cond_20

    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v12

    if-eq v12, v8, :cond_20

    invoke-virtual {v1, v8}, Lr/d;->M(I)V

    iget-object v8, v1, Lr/e;->s0:Ls/e;

    iput-boolean v14, v8, Ls/e;->b:Z

    :cond_20
    if-ne v3, v15, :cond_36

    if-ne v5, v15, :cond_36

    and-int/lit8 v8, v11, 0x1

    move-object/from16 v12, v17

    iget-boolean v11, v12, Ls/e;->b:Z

    iget-object v13, v12, Ls/e;->a:Lr/e;

    if-nez v11, :cond_22

    iget-boolean v11, v12, Ls/e;->c:Z

    if-eqz v11, :cond_21

    goto :goto_18

    :cond_21
    const/4 v15, 0x0

    goto :goto_1a

    :cond_22
    :goto_18
    iget-object v11, v13, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_19
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_23

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lr/d;

    invoke-virtual {v14}, Lr/d;->i()V

    const/4 v15, 0x0

    iput-boolean v15, v14, Lr/d;->a:Z

    iget-object v2, v14, Lr/d;->d:Ls/k;

    invoke-virtual {v2}, Ls/k;->n()V

    iget-object v2, v14, Lr/d;->e:Ls/m;

    invoke-virtual {v2}, Ls/m;->m()V

    goto :goto_19

    :cond_23
    const/4 v15, 0x0

    invoke-virtual {v13}, Lr/d;->i()V

    iput-boolean v15, v13, Lr/d;->a:Z

    iget-object v2, v13, Lr/d;->d:Ls/k;

    invoke-virtual {v2}, Ls/k;->n()V

    iget-object v2, v13, Lr/d;->e:Ls/m;

    invoke-virtual {v2}, Ls/m;->m()V

    iput-boolean v15, v12, Ls/e;->c:Z

    :goto_1a
    iget-object v2, v12, Ls/e;->d:Lr/e;

    invoke-virtual {v12, v2}, Ls/e;->b(Lr/e;)V

    iput v15, v13, Lr/d;->Y:I

    iput v15, v13, Lr/d;->Z:I

    invoke-virtual {v13, v15}, Lr/d;->k(I)I

    move-result v2

    const/4 v11, 0x1

    invoke-virtual {v13, v11}, Lr/d;->k(I)I

    move-result v14

    iget-boolean v11, v12, Ls/e;->b:Z

    if-eqz v11, :cond_24

    invoke-virtual {v12}, Ls/e;->c()V

    :cond_24
    invoke-virtual {v13}, Lr/d;->s()I

    move-result v11

    invoke-virtual {v13}, Lr/d;->t()I

    move-result v15

    move/from16 v20, v0

    iget-object v0, v13, Lr/d;->d:Ls/k;

    iget-object v0, v0, Ls/p;->h:Ls/f;

    invoke-virtual {v0, v11}, Ls/f;->d(I)V

    iget-object v0, v13, Lr/d;->e:Ls/m;

    iget-object v0, v0, Ls/p;->h:Ls/f;

    invoke-virtual {v0, v15}, Ls/f;->d(I)V

    invoke-virtual {v12}, Ls/e;->g()V

    iget-object v0, v12, Ls/e;->e:Ljava/util/ArrayList;

    move-object/from16 v21, v6

    const/4 v6, 0x2

    if-eq v2, v6, :cond_27

    if-ne v14, v6, :cond_25

    goto :goto_1b

    :cond_25
    move/from16 v22, v9

    :cond_26
    const/4 v6, 0x1

    goto :goto_1d

    :cond_27
    :goto_1b
    if-eqz v8, :cond_29

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_28
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_29

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Ls/p;

    invoke-virtual/range {v22 .. v22}, Ls/p;->k()Z

    move-result v22

    if-nez v22, :cond_28

    const/4 v8, 0x0

    :cond_29
    if-eqz v8, :cond_2a

    const/4 v6, 0x2

    if-ne v2, v6, :cond_2a

    const/4 v6, 0x1

    invoke-virtual {v13, v6}, Lr/d;->N(I)V

    move/from16 v22, v9

    const/4 v6, 0x0

    invoke-virtual {v12, v13, v6}, Ls/e;->d(Lr/e;I)I

    move-result v9

    invoke-virtual {v13, v9}, Lr/d;->P(I)V

    iget-object v6, v13, Lr/d;->d:Ls/k;

    iget-object v6, v6, Ls/p;->e:Ls/g;

    invoke-virtual {v13}, Lr/d;->r()I

    move-result v9

    invoke-virtual {v6, v9}, Ls/g;->d(I)V

    goto :goto_1c

    :cond_2a
    move/from16 v22, v9

    :goto_1c
    if-eqz v8, :cond_26

    const/4 v6, 0x2

    if-ne v14, v6, :cond_26

    const/4 v6, 0x1

    invoke-virtual {v13, v6}, Lr/d;->O(I)V

    invoke-virtual {v12, v13, v6}, Ls/e;->d(Lr/e;I)I

    move-result v8

    invoke-virtual {v13, v8}, Lr/d;->M(I)V

    iget-object v8, v13, Lr/d;->e:Ls/m;

    iget-object v8, v8, Ls/p;->e:Ls/g;

    invoke-virtual {v13}, Lr/d;->l()I

    move-result v9

    invoke-virtual {v8, v9}, Ls/g;->d(I)V

    :goto_1d
    iget-object v8, v13, Lr/d;->p0:[I

    move/from16 v23, v10

    const/4 v9, 0x0

    aget v10, v8, v9

    if-eq v10, v6, :cond_2c

    const/4 v6, 0x4

    if-ne v10, v6, :cond_2b

    goto :goto_1e

    :cond_2b
    const/4 v6, 0x0

    goto :goto_1f

    :cond_2c
    :goto_1e
    invoke-virtual {v13}, Lr/d;->r()I

    move-result v6

    add-int/2addr v6, v11

    iget-object v9, v13, Lr/d;->d:Ls/k;

    iget-object v9, v9, Ls/p;->i:Ls/f;

    invoke-virtual {v9, v6}, Ls/f;->d(I)V

    iget-object v9, v13, Lr/d;->d:Ls/k;

    iget-object v9, v9, Ls/p;->e:Ls/g;

    sub-int/2addr v6, v11

    invoke-virtual {v9, v6}, Ls/g;->d(I)V

    invoke-virtual {v12}, Ls/e;->g()V

    const/4 v6, 0x1

    aget v8, v8, v6

    if-eq v8, v6, :cond_2d

    const/4 v6, 0x4

    if-ne v8, v6, :cond_2e

    :cond_2d
    invoke-virtual {v13}, Lr/d;->l()I

    move-result v6

    add-int/2addr v6, v15

    iget-object v8, v13, Lr/d;->e:Ls/m;

    iget-object v8, v8, Ls/p;->i:Ls/f;

    invoke-virtual {v8, v6}, Ls/f;->d(I)V

    iget-object v8, v13, Lr/d;->e:Ls/m;

    iget-object v8, v8, Ls/p;->e:Ls/g;

    sub-int/2addr v6, v15

    invoke-virtual {v8, v6}, Ls/g;->d(I)V

    :cond_2e
    invoke-virtual {v12}, Ls/e;->g()V

    const/4 v6, 0x1

    :goto_1f
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_20
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_30

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ls/p;

    iget-object v10, v9, Ls/p;->b:Lr/d;

    if-ne v10, v13, :cond_2f

    iget-boolean v10, v9, Ls/p;->g:Z

    if-nez v10, :cond_2f

    goto :goto_20

    :cond_2f
    invoke-virtual {v9}, Ls/p;->e()V

    goto :goto_20

    :cond_30
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_31
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_35

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ls/p;

    if-nez v6, :cond_32

    iget-object v9, v8, Ls/p;->b:Lr/d;

    if-ne v9, v13, :cond_32

    goto :goto_21

    :cond_32
    iget-object v9, v8, Ls/p;->h:Ls/f;

    iget-boolean v9, v9, Ls/f;->j:Z

    if-nez v9, :cond_33

    :goto_22
    const/4 v0, 0x0

    goto :goto_23

    :cond_33
    iget-object v9, v8, Ls/p;->i:Ls/f;

    iget-boolean v9, v9, Ls/f;->j:Z

    if-nez v9, :cond_34

    instance-of v9, v8, Ls/i;

    if-nez v9, :cond_34

    goto :goto_22

    :cond_34
    iget-object v9, v8, Ls/p;->e:Ls/g;

    iget-boolean v9, v9, Ls/f;->j:Z

    if-nez v9, :cond_31

    instance-of v9, v8, Ls/c;

    if-nez v9, :cond_31

    instance-of v8, v8, Ls/i;

    if-nez v8, :cond_31

    goto :goto_22

    :cond_35
    const/4 v0, 0x1

    :goto_23
    invoke-virtual {v13, v2}, Lr/d;->N(I)V

    invoke-virtual {v13, v14}, Lr/d;->O(I)V

    move v6, v0

    const/high16 v0, 0x40000000    # 2.0f

    const/4 v2, 0x2

    goto/16 :goto_27

    :cond_36
    move/from16 v20, v0

    move-object/from16 v21, v6

    move/from16 v22, v9

    move/from16 v23, v10

    move-object/from16 v12, v17

    iget-boolean v0, v12, Ls/e;->b:Z

    iget-object v2, v12, Ls/e;->a:Lr/e;

    if-eqz v0, :cond_38

    iget-object v0, v2, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_37

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr/d;

    invoke-virtual {v6}, Lr/d;->i()V

    const/4 v8, 0x0

    iput-boolean v8, v6, Lr/d;->a:Z

    iget-object v9, v6, Lr/d;->d:Ls/k;

    iget-object v10, v9, Ls/p;->e:Ls/g;

    iput-boolean v8, v10, Ls/f;->j:Z

    iput-boolean v8, v9, Ls/p;->g:Z

    invoke-virtual {v9}, Ls/k;->n()V

    iget-object v6, v6, Lr/d;->e:Ls/m;

    iget-object v9, v6, Ls/p;->e:Ls/g;

    iput-boolean v8, v9, Ls/f;->j:Z

    iput-boolean v8, v6, Ls/p;->g:Z

    invoke-virtual {v6}, Ls/m;->m()V

    goto :goto_24

    :cond_37
    const/4 v8, 0x0

    invoke-virtual {v2}, Lr/d;->i()V

    iput-boolean v8, v2, Lr/d;->a:Z

    iget-object v0, v2, Lr/d;->d:Ls/k;

    iget-object v6, v0, Ls/p;->e:Ls/g;

    iput-boolean v8, v6, Ls/f;->j:Z

    iput-boolean v8, v0, Ls/p;->g:Z

    invoke-virtual {v0}, Ls/k;->n()V

    iget-object v0, v2, Lr/d;->e:Ls/m;

    iget-object v6, v0, Ls/p;->e:Ls/g;

    iput-boolean v8, v6, Ls/f;->j:Z

    iput-boolean v8, v0, Ls/p;->g:Z

    invoke-virtual {v0}, Ls/m;->m()V

    invoke-virtual {v12}, Ls/e;->c()V

    goto :goto_25

    :cond_38
    const/4 v8, 0x0

    :goto_25
    iget-object v0, v12, Ls/e;->d:Lr/e;

    invoke-virtual {v12, v0}, Ls/e;->b(Lr/e;)V

    iput v8, v2, Lr/d;->Y:I

    iput v8, v2, Lr/d;->Z:I

    iget-object v0, v2, Lr/d;->d:Ls/k;

    iget-object v0, v0, Ls/p;->h:Ls/f;

    invoke-virtual {v0, v8}, Ls/f;->d(I)V

    iget-object v0, v2, Lr/d;->e:Ls/m;

    iget-object v0, v0, Ls/p;->h:Ls/f;

    invoke-virtual {v0, v8}, Ls/f;->d(I)V

    const/high16 v0, 0x40000000    # 2.0f

    if-ne v3, v0, :cond_39

    invoke-virtual {v1, v8, v11}, Lr/e;->V(IZ)Z

    move-result v2

    const/4 v6, 0x1

    and-int/2addr v2, v6

    move v8, v2

    move v2, v6

    goto :goto_26

    :cond_39
    const/4 v6, 0x1

    move v8, v6

    const/4 v2, 0x0

    :goto_26
    if-ne v5, v0, :cond_3a

    invoke-virtual {v1, v6, v11}, Lr/e;->V(IZ)Z

    move-result v9

    and-int v6, v8, v9

    add-int/lit8 v2, v2, 0x1

    goto :goto_27

    :cond_3a
    move v6, v8

    :goto_27
    if-eqz v6, :cond_3e

    if-ne v3, v0, :cond_3b

    const/4 v3, 0x1

    goto :goto_28

    :cond_3b
    const/4 v3, 0x0

    :goto_28
    if-ne v5, v0, :cond_3c

    const/4 v0, 0x1

    goto :goto_29

    :cond_3c
    const/4 v0, 0x0

    :goto_29
    invoke-virtual {v1, v3, v0}, Lr/e;->Q(ZZ)V

    goto :goto_2a

    :cond_3d
    move/from16 v20, v0

    move-object/from16 v21, v6

    move/from16 v22, v9

    move/from16 v23, v10

    const/4 v2, 0x0

    const/4 v6, 0x0

    :cond_3e
    :goto_2a
    if-eqz v6, :cond_3f

    const/4 v0, 0x2

    if-eq v2, v0, :cond_68

    :cond_3f
    iget v0, v1, Lr/e;->D0:I

    if-lez v7, :cond_4e

    iget-object v2, v1, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x40

    invoke-virtual {v1, v3}, Lr/e;->X(I)Z

    move-result v3

    iget-object v5, v1, Lr/e;->u0:Ls/n;

    const/4 v15, 0x0

    :goto_2b
    if-ge v15, v2, :cond_4c

    iget-object v6, v1, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr/d;

    instance-of v8, v6, Lr/h;

    if-eqz v8, :cond_40

    :goto_2c
    const/4 v8, 0x3

    const/4 v10, 0x0

    goto/16 :goto_31

    :cond_40
    instance-of v8, v6, Lr/a;

    if-eqz v8, :cond_41

    goto :goto_2c

    :cond_41
    iget-boolean v8, v6, Lr/d;->F:Z

    if-eqz v8, :cond_42

    goto :goto_2c

    :cond_42
    if-eqz v3, :cond_43

    iget-object v8, v6, Lr/d;->d:Ls/k;

    if-eqz v8, :cond_43

    iget-object v9, v6, Lr/d;->e:Ls/m;

    if-eqz v9, :cond_43

    iget-object v8, v8, Ls/p;->e:Ls/g;

    iget-boolean v8, v8, Ls/f;->j:Z

    if-eqz v8, :cond_43

    iget-object v8, v9, Ls/p;->e:Ls/g;

    iget-boolean v8, v8, Ls/f;->j:Z

    if-eqz v8, :cond_43

    goto :goto_2c

    :cond_43
    const/4 v8, 0x0

    invoke-virtual {v6, v8}, Lr/d;->k(I)I

    move-result v9

    const/4 v8, 0x1

    invoke-virtual {v6, v8}, Lr/d;->k(I)I

    move-result v10

    const/4 v11, 0x3

    if-ne v9, v11, :cond_44

    iget v12, v6, Lr/d;->r:I

    if-eq v12, v8, :cond_44

    if-ne v10, v11, :cond_44

    iget v11, v6, Lr/d;->s:I

    if-eq v11, v8, :cond_44

    move v11, v8

    goto :goto_2d

    :cond_44
    const/4 v11, 0x0

    :goto_2d
    if-nez v11, :cond_49

    invoke-virtual {v1, v8}, Lr/e;->X(I)Z

    move-result v12

    if-eqz v12, :cond_49

    instance-of v8, v6, Lr/g;

    if-nez v8, :cond_49

    const/4 v8, 0x3

    if-ne v9, v8, :cond_45

    iget v12, v6, Lr/d;->r:I

    if-nez v12, :cond_45

    if-eq v10, v8, :cond_45

    invoke-virtual {v6}, Lr/d;->y()Z

    move-result v12

    if-nez v12, :cond_45

    const/4 v11, 0x1

    :cond_45
    if-ne v10, v8, :cond_46

    iget v12, v6, Lr/d;->s:I

    if-nez v12, :cond_46

    if-eq v9, v8, :cond_46

    invoke-virtual {v6}, Lr/d;->y()Z

    move-result v12

    if-nez v12, :cond_46

    const/4 v11, 0x1

    :cond_46
    if-eq v9, v8, :cond_48

    if-ne v10, v8, :cond_47

    goto :goto_2f

    :cond_47
    :goto_2e
    const/4 v10, 0x0

    goto :goto_30

    :cond_48
    :goto_2f
    iget v9, v6, Lr/d;->W:F

    const/4 v10, 0x0

    cmpl-float v9, v9, v10

    if-lez v9, :cond_4a

    goto :goto_31

    :cond_49
    const/4 v8, 0x3

    goto :goto_2e

    :cond_4a
    :goto_30
    if-eqz v11, :cond_4b

    goto :goto_31

    :cond_4b
    const/4 v9, 0x0

    invoke-virtual {v4, v9, v6, v5}, Le/c;->t(ILr/d;Ls/n;)Z

    :goto_31
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_2b

    :cond_4c
    iget-object v2, v5, Ls/n;->g:Ljava/lang/Object;

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v15, 0x0

    :goto_32
    if-ge v15, v3, :cond_4d

    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v15, v15, 0x1

    goto :goto_32

    :cond_4d
    iget-object v2, v2, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_4e

    const/4 v15, 0x0

    :goto_33
    if-ge v15, v3, :cond_4e

    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu/c;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v15, v15, 0x1

    goto :goto_33

    :cond_4e
    invoke-virtual {v4, v1}, Le/c;->x(Lr/e;)V

    iget-object v2, v4, Le/c;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    move/from16 v3, v22

    move/from16 v5, v23

    const/4 v15, 0x0

    if-lez v7, :cond_4f

    invoke-virtual {v4, v1, v15, v3, v5}, Le/c;->w(Lr/e;III)V

    :cond_4f
    if-lez v2, :cond_67

    iget-object v6, v1, Lr/d;->p0:[I

    aget v7, v6, v15

    const/4 v8, 0x2

    if-ne v7, v8, :cond_50

    const/4 v7, 0x1

    :goto_34
    const/4 v9, 0x1

    goto :goto_35

    :cond_50
    move v7, v15

    goto :goto_34

    :goto_35
    aget v6, v6, v9

    if-ne v6, v8, :cond_51

    const/4 v6, 0x1

    goto :goto_36

    :cond_51
    move v6, v15

    :goto_36
    invoke-virtual/range {p1 .. p1}, Lr/d;->r()I

    move-result v8

    iget-object v9, v4, Le/c;->e:Ljava/lang/Object;

    check-cast v9, Lr/e;

    iget v9, v9, Lr/d;->b0:I

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v9

    iget-object v10, v4, Le/c;->e:Ljava/lang/Object;

    check-cast v10, Lr/e;

    iget v10, v10, Lr/d;->c0:I

    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    move v10, v15

    move v11, v10

    :goto_37
    if-ge v10, v2, :cond_57

    iget-object v13, v4, Le/c;->c:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lr/d;

    instance-of v14, v13, Lr/g;

    if-nez v14, :cond_52

    move/from16 v16, v0

    move-object/from16 v0, v21

    goto/16 :goto_39

    :cond_52
    invoke-virtual {v13}, Lr/d;->r()I

    move-result v14

    invoke-virtual {v13}, Lr/d;->l()I

    move-result v15

    move/from16 v16, v0

    move-object/from16 v0, v21

    const/4 v12, 0x1

    invoke-virtual {v4, v12, v13, v0}, Le/c;->t(ILr/d;Ls/n;)Z

    move-result v19

    or-int v11, v11, v19

    invoke-virtual {v13}, Lr/d;->r()I

    move-result v12

    move/from16 v19, v11

    invoke-virtual {v13}, Lr/d;->l()I

    move-result v11

    if-eq v12, v14, :cond_54

    invoke-virtual {v13, v12}, Lr/d;->P(I)V

    if-eqz v7, :cond_53

    invoke-virtual {v13}, Lr/d;->s()I

    move-result v12

    iget v14, v13, Lr/d;->U:I

    add-int/2addr v12, v14

    if-le v12, v8, :cond_53

    invoke-virtual {v13}, Lr/d;->s()I

    move-result v12

    iget v14, v13, Lr/d;->U:I

    add-int/2addr v12, v14

    const/4 v14, 0x4

    invoke-virtual {v13, v14}, Lr/d;->j(I)Lr/c;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lr/c;->e()I

    move-result v14

    add-int/2addr v14, v12

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v8

    :cond_53
    const/16 v19, 0x1

    :cond_54
    if-eq v11, v15, :cond_56

    invoke-virtual {v13, v11}, Lr/d;->M(I)V

    if-eqz v6, :cond_55

    invoke-virtual {v13}, Lr/d;->t()I

    move-result v11

    iget v12, v13, Lr/d;->V:I

    add-int/2addr v11, v12

    if-le v11, v9, :cond_55

    invoke-virtual {v13}, Lr/d;->t()I

    move-result v11

    iget v12, v13, Lr/d;->V:I

    add-int/2addr v11, v12

    const/4 v12, 0x5

    invoke-virtual {v13, v12}, Lr/d;->j(I)Lr/c;

    move-result-object v12

    invoke-virtual {v12}, Lr/c;->e()I

    move-result v12

    add-int/2addr v12, v11

    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_55
    const/4 v15, 0x1

    goto :goto_38

    :cond_56
    move/from16 v15, v19

    :goto_38
    check-cast v13, Lr/g;

    iget-boolean v11, v13, Lr/g;->y0:Z

    or-int/2addr v11, v15

    :goto_39
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v21, v0

    move/from16 v0, v16

    const/4 v15, 0x0

    goto/16 :goto_37

    :cond_57
    move/from16 v16, v0

    move-object/from16 v0, v21

    const/4 v10, 0x0

    :goto_3a
    const/4 v15, 0x2

    if-ge v10, v15, :cond_66

    move v12, v11

    const/4 v11, 0x0

    :goto_3b
    if-ge v11, v2, :cond_64

    iget-object v13, v4, Le/c;->c:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lr/d;

    instance-of v14, v13, Lr/i;

    if-eqz v14, :cond_58

    instance-of v14, v13, Lr/g;

    if-eqz v14, :cond_5c

    :cond_58
    instance-of v14, v13, Lr/h;

    if-eqz v14, :cond_59

    goto :goto_3c

    :cond_59
    iget v14, v13, Lr/d;->g0:I

    const/16 v15, 0x8

    if-ne v14, v15, :cond_5a

    goto :goto_3c

    :cond_5a
    if-eqz v20, :cond_5b

    iget-object v14, v13, Lr/d;->d:Ls/k;

    iget-object v14, v14, Ls/p;->e:Ls/g;

    iget-boolean v14, v14, Ls/f;->j:Z

    if-eqz v14, :cond_5b

    iget-object v14, v13, Lr/d;->e:Ls/m;

    iget-object v14, v14, Ls/p;->e:Ls/g;

    iget-boolean v14, v14, Ls/f;->j:Z

    if-eqz v14, :cond_5b

    goto :goto_3c

    :cond_5b
    instance-of v14, v13, Lr/g;

    if-eqz v14, :cond_5d

    :cond_5c
    :goto_3c
    move-object/from16 v21, v0

    move/from16 v19, v2

    const/4 v14, 0x4

    const/4 v15, 0x5

    goto/16 :goto_41

    :cond_5d
    invoke-virtual {v13}, Lr/d;->r()I

    move-result v14

    invoke-virtual {v13}, Lr/d;->l()I

    move-result v15

    move/from16 v19, v2

    iget v2, v13, Lr/d;->a0:I

    const/4 v1, 0x1

    if-ne v10, v1, :cond_5e

    const/4 v1, 0x2

    :cond_5e
    invoke-virtual {v4, v1, v13, v0}, Le/c;->t(ILr/d;Ls/n;)Z

    move-result v1

    or-int/2addr v1, v12

    invoke-virtual {v13}, Lr/d;->r()I

    move-result v12

    move-object/from16 v21, v0

    invoke-virtual {v13}, Lr/d;->l()I

    move-result v0

    if-eq v12, v14, :cond_60

    invoke-virtual {v13, v12}, Lr/d;->P(I)V

    if-eqz v7, :cond_5f

    invoke-virtual {v13}, Lr/d;->s()I

    move-result v1

    iget v12, v13, Lr/d;->U:I

    add-int/2addr v1, v12

    if-le v1, v8, :cond_5f

    invoke-virtual {v13}, Lr/d;->s()I

    move-result v1

    iget v12, v13, Lr/d;->U:I

    add-int/2addr v1, v12

    const/4 v14, 0x4

    invoke-virtual {v13, v14}, Lr/d;->j(I)Lr/c;

    move-result-object v12

    invoke-virtual {v12}, Lr/c;->e()I

    move-result v12

    add-int/2addr v12, v1

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v8

    goto :goto_3d

    :cond_5f
    const/4 v14, 0x4

    :goto_3d
    const/4 v1, 0x1

    goto :goto_3e

    :cond_60
    const/4 v14, 0x4

    :goto_3e
    if-eq v0, v15, :cond_62

    invoke-virtual {v13, v0}, Lr/d;->M(I)V

    if-eqz v6, :cond_61

    invoke-virtual {v13}, Lr/d;->t()I

    move-result v0

    iget v1, v13, Lr/d;->V:I

    add-int/2addr v0, v1

    if-le v0, v9, :cond_61

    invoke-virtual {v13}, Lr/d;->t()I

    move-result v0

    iget v1, v13, Lr/d;->V:I

    add-int/2addr v0, v1

    const/4 v15, 0x5

    invoke-virtual {v13, v15}, Lr/d;->j(I)Lr/c;

    move-result-object v1

    invoke-virtual {v1}, Lr/c;->e()I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_3f

    :cond_61
    const/4 v15, 0x5

    :goto_3f
    const/4 v1, 0x1

    goto :goto_40

    :cond_62
    const/4 v15, 0x5

    :goto_40
    iget-boolean v0, v13, Lr/d;->E:Z

    if-eqz v0, :cond_63

    iget v0, v13, Lr/d;->a0:I

    if-eq v2, v0, :cond_63

    const/4 v12, 0x1

    goto :goto_41

    :cond_63
    move v12, v1

    :goto_41
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, p1

    move/from16 v2, v19

    move-object/from16 v0, v21

    const/4 v15, 0x2

    goto/16 :goto_3b

    :cond_64
    move-object/from16 v21, v0

    move/from16 v19, v2

    const/4 v14, 0x4

    const/4 v15, 0x5

    if-eqz v12, :cond_65

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v10, v3, v5}, Le/c;->w(Lr/e;III)V

    move-object v1, v0

    move/from16 v2, v19

    move-object/from16 v0, v21

    const/4 v11, 0x0

    goto/16 :goto_3a

    :cond_65
    move-object/from16 v0, p1

    :goto_42
    move/from16 v1, v16

    goto :goto_44

    :cond_66
    :goto_43
    move-object v0, v1

    goto :goto_42

    :cond_67
    move/from16 v16, v0

    goto :goto_43

    :goto_44
    iput v1, v0, Lr/e;->D0:I

    const/16 v1, 0x200

    invoke-virtual {v0, v1}, Lr/e;->X(I)Z

    move-result v0

    sput-boolean v0, Lp/d;->p:Z

    :cond_68
    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 2

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_2

    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    :cond_0
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final m(Lr/d;Lu/e;Landroid/util/SparseArray;II)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p3, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lr/d;

    if-eqz p3, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    instance-of p4, p4, Lu/e;

    if-eqz p4, :cond_1

    const/4 p4, 0x1

    iput-boolean p4, p2, Lu/e;->c0:Z

    const/4 v1, 0x6

    if-ne p5, v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lu/e;

    iput-boolean p4, v0, Lu/e;->c0:Z

    iget-object v0, v0, Lu/e;->p0:Lr/d;

    iput-boolean p4, v0, Lr/d;->E:Z

    :cond_0
    invoke-virtual {p1, v1}, Lr/d;->j(I)Lr/c;

    move-result-object v0

    invoke-virtual {p3, p5}, Lr/d;->j(I)Lr/c;

    move-result-object p3

    iget p5, p2, Lu/e;->D:I

    iget p2, p2, Lu/e;->C:I

    invoke-virtual {v0, p3, p5, p2, p4}, Lr/c;->b(Lr/c;IIZ)Z

    iput-boolean p4, p1, Lr/d;->E:Z

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lr/d;->j(I)Lr/c;

    move-result-object p2

    invoke-virtual {p2}, Lr/c;->j()V

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Lr/d;->j(I)Lr/c;

    move-result-object p1

    invoke-virtual {p1}, Lr/c;->j()V

    :cond_1
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    move p4, p3

    :goto_0
    if-ge p4, p1, :cond_1

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lu/e;

    iget-object v1, v0, Lu/e;->p0:Lr/d;

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Lu/e;->d0:Z

    if-nez v2, :cond_0

    iget-boolean v0, v0, Lu/e;->e0:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lr/d;->s()I

    move-result v0

    invoke-virtual {v1}, Lr/d;->t()I

    move-result v2

    invoke-virtual {v1}, Lr/d;->r()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1}, Lr/d;->l()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_2

    :goto_2
    if-ge p3, p2, :cond_2

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lu/c;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public onMeasure(II)V
    .locals 25

    move-object/from16 v6, p0

    move/from16 v7, p1

    move/from16 v8, p2

    iget v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    if-ne v0, v7, :cond_0

    iget v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    :cond_0
    iget-boolean v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-nez v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v1, v9

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-boolean v10, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iput v7, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    iput v8, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    if-ne v10, v0, :cond_3

    move v0, v10

    goto :goto_2

    :cond_3
    move v0, v9

    :goto_2
    iget-object v11, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iput-boolean v0, v11, Lr/e;->v0:Z

    iget-boolean v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    if-eqz v0, :cond_4b

    iput-boolean v9, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v1, v9

    :goto_3
    if-ge v1, v0, :cond_5

    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    move-result v2

    if-eqz v2, :cond_4

    move v12, v10

    goto :goto_4

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    move v12, v9

    :goto_4
    if-eqz v12, :cond_4a

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v14

    move v0, v9

    :goto_5
    if-ge v0, v14, :cond_7

    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lr/d;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lr/d;->D()V

    :goto_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    const/4 v15, -0x1

    if-eqz v13, :cond_d

    move v1, v9

    :goto_7
    if-ge v1, v14, :cond_d

    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v3, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(Ljava/lang/String;Ljava/lang/Integer;)V

    const/16 v4, 0x2f

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-eq v4, v15, :cond_8

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    :cond_8
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    if-nez v2, :cond_9

    :goto_8
    move-object v2, v11

    goto :goto_9

    :cond_9
    iget-object v4, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-nez v4, :cond_a

    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_a

    if-eq v4, v6, :cond_a

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-ne v2, v6, :cond_a

    invoke-virtual {v6, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_a
    if-ne v4, v6, :cond_b

    goto :goto_8

    :cond_b
    if-nez v4, :cond_c

    move-object v2, v0

    goto :goto_9

    :cond_c
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Lu/e;

    iget-object v2, v2, Lu/e;->p0:Lr/d;

    :goto_9
    iput-object v3, v2, Lr/d;->h0:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_d
    iget v1, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    if-eq v1, v15, :cond_e

    move v1, v9

    :goto_a
    if-ge v1, v14, :cond_e

    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_e
    iget-object v1, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lu/n;

    if-eqz v1, :cond_f

    invoke-virtual {v1, v6}, Lu/n;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_f
    iget-object v1, v11, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_17

    move v3, v9

    :goto_b
    if-ge v3, v2, :cond_17

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu/c;

    invoke-virtual {v4}, Landroid/view/View;->isInEditMode()Z

    move-result v16

    if-eqz v16, :cond_10

    iget-object v15, v4, Lu/c;->f:Ljava/lang/String;

    invoke-virtual {v4, v15}, Lu/c;->setIds(Ljava/lang/String;)V

    :cond_10
    iget-object v15, v4, Lu/c;->e:Lr/j;

    if-nez v15, :cond_11

    move-object/from16 v19, v1

    const/4 v9, 0x2

    goto/16 :goto_10

    :cond_11
    iput v9, v15, Lr/j;->r0:I

    iget-object v15, v15, Lr/j;->q0:[Lr/d;

    invoke-static {v15, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    move v15, v9

    :goto_c
    iget v0, v4, Lu/c;->c:I

    if-ge v15, v0, :cond_16

    iget-object v0, v4, Lu/c;->b:[I

    aget v0, v0, v15

    iget-object v9, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    if-nez v9, :cond_12

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v5, v4, Lu/c;->h:Ljava/util/HashMap;

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v6, v0}, Lu/c;->f(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I

    move-result v10

    if-eqz v10, :cond_12

    iget-object v9, v4, Lu/c;->b:[I

    aput v10, v9, v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v5, v9, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/view/View;

    :cond_12
    if-eqz v9, :cond_15

    iget-object v0, v4, Lu/c;->e:Lr/j;

    invoke-virtual {v6, v9}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lr/d;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq v5, v0, :cond_15

    if-nez v5, :cond_13

    goto :goto_e

    :cond_13
    iget v9, v0, Lr/j;->r0:I

    const/4 v10, 0x1

    add-int/2addr v9, v10

    iget-object v10, v0, Lr/j;->q0:[Lr/d;

    move-object/from16 v19, v1

    array-length v1, v10

    if-le v9, v1, :cond_14

    array-length v1, v10

    const/4 v9, 0x2

    mul-int/2addr v1, v9

    invoke-static {v10, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lr/d;

    iput-object v1, v0, Lr/j;->q0:[Lr/d;

    goto :goto_d

    :cond_14
    const/4 v9, 0x2

    :goto_d
    iget-object v1, v0, Lr/j;->q0:[Lr/d;

    iget v10, v0, Lr/j;->r0:I

    aput-object v5, v1, v10

    const/4 v1, 0x1

    add-int/2addr v10, v1

    iput v10, v0, Lr/j;->r0:I

    goto :goto_f

    :cond_15
    :goto_e
    move-object/from16 v19, v1

    const/4 v9, 0x2

    :goto_f
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v1, v19

    const/4 v9, 0x0

    const/4 v10, 0x1

    goto :goto_c

    :cond_16
    move-object/from16 v19, v1

    const/4 v9, 0x2

    iget-object v0, v4, Lu/c;->e:Lr/j;

    invoke-interface {v0}, Lr/i;->a()V

    :goto_10
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v1, v19

    const/4 v0, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v15, -0x1

    goto/16 :goto_b

    :cond_17
    const/4 v9, 0x2

    const/4 v0, 0x0

    :goto_11
    if-ge v0, v14, :cond_18

    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v0, v0, 0x1

    goto :goto_11

    :cond_18
    iget-object v10, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    invoke-virtual {v10}, Landroid/util/SparseArray;->clear()V

    const/4 v0, 0x0

    invoke-virtual {v10, v0, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {v10, v0, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    :goto_12
    if-ge v0, v14, :cond_19

    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lr/d;

    move-result-object v2

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v10, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_12

    :cond_19
    const/4 v15, 0x0

    :goto_13
    if-ge v15, v14, :cond_4a

    invoke-virtual {v6, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lr/d;

    move-result-object v5

    if-nez v5, :cond_1b

    :cond_1a
    :goto_14
    move v6, v9

    move/from16 v17, v14

    const/4 v4, 0x1

    const/4 v5, -0x1

    goto/16 :goto_2a

    :cond_1b
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lu/e;

    iget-object v1, v11, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v5, Lr/d;->T:Lr/d;

    if-eqz v1, :cond_1c

    check-cast v1, Lr/l;

    iget-object v1, v1, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Lr/d;->D()V

    :cond_1c
    iput-object v11, v5, Lr/d;->T:Lr/d;

    invoke-virtual {v4}, Lu/e;->a()V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    iput v1, v5, Lr/d;->g0:I

    iput-object v0, v5, Lr/d;->f0:Ljava/lang/Object;

    instance-of v1, v0, Lu/c;

    if-eqz v1, :cond_1d

    check-cast v0, Lu/c;

    iget-boolean v1, v11, Lr/e;->v0:Z

    invoke-virtual {v0, v5, v1}, Lu/c;->h(Lr/d;Z)V

    :cond_1d
    iget-boolean v0, v4, Lu/e;->d0:Z

    if-eqz v0, :cond_21

    check-cast v5, Lr/h;

    iget v0, v4, Lu/e;->m0:I

    iget v1, v4, Lu/e;->n0:I

    iget v2, v4, Lu/e;->o0:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v4, v2, v3

    if-eqz v4, :cond_1f

    if-lez v4, :cond_1e

    iput v2, v5, Lr/h;->q0:F

    const/4 v2, -0x1

    iput v2, v5, Lr/h;->r0:I

    iput v2, v5, Lr/h;->s0:I

    goto :goto_14

    :cond_1e
    const/4 v2, -0x1

    goto :goto_14

    :cond_1f
    const/4 v2, -0x1

    if-eq v0, v2, :cond_20

    if-le v0, v2, :cond_1a

    iput v3, v5, Lr/h;->q0:F

    iput v0, v5, Lr/h;->r0:I

    iput v2, v5, Lr/h;->s0:I

    goto :goto_14

    :cond_20
    if-eq v1, v2, :cond_1a

    if-le v1, v2, :cond_1a

    iput v3, v5, Lr/h;->q0:F

    iput v2, v5, Lr/h;->r0:I

    iput v1, v5, Lr/h;->s0:I

    goto :goto_14

    :cond_21
    iget v0, v4, Lu/e;->f0:I

    iget v1, v4, Lu/e;->g0:I

    iget v2, v4, Lu/e;->h0:I

    iget v3, v4, Lu/e;->i0:I

    iget v9, v4, Lu/e;->j0:I

    move/from16 v17, v14

    iget v14, v4, Lu/e;->k0:I

    iget v7, v4, Lu/e;->l0:F

    iget v8, v4, Lu/e;->p:I

    const/4 v6, -0x1

    if-eq v8, v6, :cond_23

    invoke-virtual {v10, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lr/d;

    if-eqz v21, :cond_22

    iget v0, v4, Lu/e;->r:F

    iget v1, v4, Lu/e;->q:I

    const/16 v22, 0x7

    const/16 v24, 0x0

    move-object/from16 v19, v5

    move/from16 v20, v22

    move/from16 v23, v1

    invoke-virtual/range {v19 .. v24}, Lr/d;->w(ILr/d;III)V

    iput v0, v5, Lr/d;->D:F

    :cond_22
    move-object v14, v4

    move-object v1, v5

    const/4 v6, 0x2

    goto/16 :goto_1d

    :cond_23
    if-eq v0, v6, :cond_25

    invoke-virtual {v10, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lr/d;

    if-eqz v21, :cond_24

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v19, v5

    const/4 v1, 0x2

    move/from16 v20, v1

    move/from16 v22, v1

    move/from16 v23, v0

    move/from16 v24, v9

    invoke-virtual/range {v19 .. v24}, Lr/d;->w(ILr/d;III)V

    :cond_24
    :goto_15
    const/4 v0, -0x1

    goto :goto_16

    :cond_25
    move v0, v6

    if-eq v1, v0, :cond_26

    invoke-virtual {v10, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lr/d;

    if-eqz v21, :cond_24

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v19, v5

    const/4 v1, 0x2

    move/from16 v20, v1

    const/4 v1, 0x4

    move/from16 v22, v1

    move/from16 v23, v0

    move/from16 v24, v9

    invoke-virtual/range {v19 .. v24}, Lr/d;->w(ILr/d;III)V

    goto :goto_15

    :cond_26
    :goto_16
    if-eq v2, v0, :cond_27

    invoke-virtual {v10, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lr/d;

    if-eqz v21, :cond_28

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v19, v5

    const/4 v1, 0x4

    move/from16 v20, v1

    const/4 v1, 0x2

    move/from16 v22, v1

    move/from16 v23, v0

    move/from16 v24, v14

    invoke-virtual/range {v19 .. v24}, Lr/d;->w(ILr/d;III)V

    goto :goto_17

    :cond_27
    if-eq v3, v0, :cond_28

    invoke-virtual {v10, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lr/d;

    if-eqz v21, :cond_28

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v19, v5

    const/4 v1, 0x4

    move/from16 v20, v1

    move/from16 v22, v1

    move/from16 v23, v0

    move/from16 v24, v14

    invoke-virtual/range {v19 .. v24}, Lr/d;->w(ILr/d;III)V

    :cond_28
    :goto_17
    iget v0, v4, Lu/e;->i:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_29

    invoke-virtual {v10, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lr/d;

    if-eqz v21, :cond_2a

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v4, Lu/e;->x:I

    move-object/from16 v19, v5

    const/4 v2, 0x3

    move/from16 v20, v2

    move/from16 v22, v2

    move/from16 v23, v0

    move/from16 v24, v1

    invoke-virtual/range {v19 .. v24}, Lr/d;->w(ILr/d;III)V

    goto :goto_18

    :cond_29
    iget v0, v4, Lu/e;->j:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2a

    invoke-virtual {v10, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lr/d;

    if-eqz v21, :cond_2a

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v4, Lu/e;->x:I

    move-object/from16 v19, v5

    const/4 v2, 0x3

    move/from16 v20, v2

    const/4 v2, 0x5

    move/from16 v22, v2

    move/from16 v23, v0

    move/from16 v24, v1

    invoke-virtual/range {v19 .. v24}, Lr/d;->w(ILr/d;III)V

    :cond_2a
    :goto_18
    iget v0, v4, Lu/e;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2b

    invoke-virtual {v10, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lr/d;

    if-eqz v21, :cond_2c

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v4, Lu/e;->z:I

    move-object/from16 v19, v5

    const/4 v2, 0x5

    move/from16 v20, v2

    const/4 v2, 0x3

    move/from16 v22, v2

    move/from16 v23, v0

    move/from16 v24, v1

    invoke-virtual/range {v19 .. v24}, Lr/d;->w(ILr/d;III)V

    goto :goto_19

    :cond_2b
    iget v0, v4, Lu/e;->l:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2c

    invoke-virtual {v10, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lr/d;

    if-eqz v21, :cond_2c

    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v4, Lu/e;->z:I

    move-object/from16 v19, v5

    const/4 v2, 0x5

    move/from16 v20, v2

    move/from16 v22, v2

    move/from16 v23, v0

    move/from16 v24, v1

    invoke-virtual/range {v19 .. v24}, Lr/d;->w(ILr/d;III)V

    :cond_2c
    :goto_19
    iget v6, v4, Lu/e;->m:I

    const/4 v8, -0x1

    if-eq v6, v8, :cond_2e

    const/4 v9, 0x6

    move-object/from16 v0, p0

    move-object v1, v5

    move-object v2, v4

    move-object v3, v10

    move-object v14, v4

    move v4, v6

    move-object/from16 v18, v5

    const/4 v6, 0x2

    move v5, v9

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(Lr/d;Lu/e;Landroid/util/SparseArray;II)V

    :cond_2d
    :goto_1a
    const/4 v0, 0x0

    goto :goto_1b

    :cond_2e
    move-object v14, v4

    move-object/from16 v18, v5

    const/4 v6, 0x2

    iget v4, v14, Lu/e;->n:I

    if-eq v4, v8, :cond_2f

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object v2, v14

    move-object v3, v10

    const/4 v9, 0x3

    move v5, v9

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(Lr/d;Lu/e;Landroid/util/SparseArray;II)V

    goto :goto_1a

    :cond_2f
    iget v4, v14, Lu/e;->o:I

    if-eq v4, v8, :cond_2d

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object v2, v14

    move-object v3, v10

    const/4 v8, 0x5

    move v5, v8

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(Lr/d;Lu/e;Landroid/util/SparseArray;II)V

    goto :goto_1a

    :goto_1b
    cmpl-float v1, v7, v0

    if-ltz v1, :cond_30

    move-object/from16 v1, v18

    iput v7, v1, Lr/d;->d0:F

    goto :goto_1c

    :cond_30
    move-object/from16 v1, v18

    :goto_1c
    iget v2, v14, Lu/e;->F:F

    cmpl-float v3, v2, v0

    if-ltz v3, :cond_31

    iput v2, v1, Lr/d;->e0:F

    :cond_31
    :goto_1d
    if-eqz v13, :cond_33

    iget v0, v14, Lu/e;->T:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_32

    iget v3, v14, Lu/e;->U:I

    if-eq v3, v2, :cond_33

    :cond_32
    iget v2, v14, Lu/e;->U:I

    iput v0, v1, Lr/d;->Y:I

    iput v2, v1, Lr/d;->Z:I

    :cond_33
    iget-boolean v0, v14, Lu/e;->a0:Z

    const/4 v2, 0x3

    const/4 v3, 0x4

    const/4 v4, -0x2

    if-nez v0, :cond_36

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v5, -0x1

    if-ne v0, v5, :cond_35

    iget-boolean v0, v14, Lu/e;->W:Z

    if-eqz v0, :cond_34

    invoke-virtual {v1, v2}, Lr/d;->N(I)V

    :goto_1e
    const/4 v0, 0x2

    goto :goto_1f

    :cond_34
    invoke-virtual {v1, v3}, Lr/d;->N(I)V

    goto :goto_1e

    :goto_1f
    invoke-virtual {v1, v0}, Lr/d;->j(I)Lr/c;

    move-result-object v0

    iget v5, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v5, v0, Lr/c;->g:I

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Lr/d;->j(I)Lr/c;

    move-result-object v0

    iget v5, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v5, v0, Lr/c;->g:I

    goto :goto_20

    :cond_35
    invoke-virtual {v1, v2}, Lr/d;->N(I)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lr/d;->P(I)V

    goto :goto_20

    :cond_36
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lr/d;->N(I)V

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v1, v0}, Lr/d;->P(I)V

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v0, v4, :cond_37

    invoke-virtual {v1, v6}, Lr/d;->N(I)V

    :cond_37
    :goto_20
    iget-boolean v0, v14, Lu/e;->b0:Z

    if-nez v0, :cond_3a

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v5, -0x1

    if-ne v0, v5, :cond_39

    iget-boolean v0, v14, Lu/e;->X:Z

    if-eqz v0, :cond_38

    invoke-virtual {v1, v2}, Lr/d;->O(I)V

    :goto_21
    const/4 v0, 0x3

    goto :goto_22

    :cond_38
    invoke-virtual {v1, v3}, Lr/d;->O(I)V

    goto :goto_21

    :goto_22
    invoke-virtual {v1, v0}, Lr/d;->j(I)Lr/c;

    move-result-object v0

    iget v3, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v3, v0, Lr/c;->g:I

    const/4 v0, 0x5

    invoke-virtual {v1, v0}, Lr/d;->j(I)Lr/c;

    move-result-object v0

    iget v3, v14, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v3, v0, Lr/c;->g:I

    goto :goto_23

    :cond_39
    invoke-virtual {v1, v2}, Lr/d;->O(I)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lr/d;->M(I)V

    goto :goto_23

    :cond_3a
    const/4 v0, 0x1

    const/4 v5, -0x1

    invoke-virtual {v1, v0}, Lr/d;->O(I)V

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v1, v0}, Lr/d;->M(I)V

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v0, v4, :cond_3b

    invoke-virtual {v1, v6}, Lr/d;->O(I)V

    :cond_3b
    :goto_23
    iget-object v0, v14, Lu/e;->G:Ljava/lang/String;

    if-eqz v0, :cond_3c

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_3d

    :cond_3c
    const/4 v3, 0x0

    goto/16 :goto_28

    :cond_3d
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x2c

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-lez v4, :cond_40

    add-int/lit8 v7, v3, -0x1

    if-ge v4, v7, :cond_40

    const/4 v7, 0x0

    invoke-virtual {v0, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    const-string v7, "W"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3e

    const/4 v7, 0x0

    goto :goto_24

    :cond_3e
    const-string v7, "H"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3f

    const/4 v7, 0x1

    goto :goto_24

    :cond_3f
    move v7, v5

    :goto_24
    add-int/lit8 v4, v4, 0x1

    goto :goto_25

    :cond_40
    move v7, v5

    const/4 v4, 0x0

    :goto_25
    const/16 v8, 0x3a

    invoke-virtual {v0, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-ltz v8, :cond_42

    add-int/lit8 v3, v3, -0x1

    if-ge v8, v3, :cond_42

    invoke-virtual {v0, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_43

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_43

    :try_start_1
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/4 v4, 0x0

    cmpl-float v8, v3, v4

    if-lez v8, :cond_43

    cmpl-float v8, v0, v4

    if-lez v8, :cond_43

    const/4 v4, 0x1

    if-ne v7, v4, :cond_41

    div-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    goto :goto_26

    :cond_41
    div-float/2addr v3, v0

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_26
    const/4 v3, 0x0

    goto :goto_27

    :cond_42
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_43

    :try_start_2
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_26

    :catch_1
    :cond_43
    const/4 v0, 0x0

    goto :goto_26

    :goto_27
    cmpl-float v4, v0, v3

    if-lez v4, :cond_44

    iput v0, v1, Lr/d;->W:F

    iput v7, v1, Lr/d;->X:I

    goto :goto_29

    :goto_28
    iput v3, v1, Lr/d;->W:F

    :cond_44
    :goto_29
    iget v0, v14, Lu/e;->H:F

    iget-object v3, v1, Lr/d;->k0:[F

    const/4 v4, 0x0

    aput v0, v3, v4

    iget v0, v14, Lu/e;->I:F

    const/4 v4, 0x1

    aput v0, v3, v4

    iget v0, v14, Lu/e;->J:I

    iput v0, v1, Lr/d;->i0:I

    iget v0, v14, Lu/e;->K:I

    iput v0, v1, Lr/d;->j0:I

    iget v0, v14, Lu/e;->Z:I

    if-ltz v0, :cond_45

    if-gt v0, v2, :cond_45

    iput v0, v1, Lr/d;->q:I

    :cond_45
    iget v0, v14, Lu/e;->L:I

    iget v2, v14, Lu/e;->N:I

    iget v3, v14, Lu/e;->P:I

    iget v7, v14, Lu/e;->R:F

    iput v0, v1, Lr/d;->r:I

    iput v2, v1, Lr/d;->u:I

    const v2, 0x7fffffff

    if-ne v3, v2, :cond_46

    const/4 v3, 0x0

    :cond_46
    iput v3, v1, Lr/d;->v:I

    iput v7, v1, Lr/d;->w:F

    const/4 v3, 0x0

    cmpl-float v8, v7, v3

    const/high16 v3, 0x3f800000    # 1.0f

    if-lez v8, :cond_47

    cmpg-float v7, v7, v3

    if-gez v7, :cond_47

    if-nez v0, :cond_47

    iput v6, v1, Lr/d;->r:I

    :cond_47
    iget v0, v14, Lu/e;->M:I

    iget v7, v14, Lu/e;->O:I

    iget v8, v14, Lu/e;->Q:I

    iget v9, v14, Lu/e;->S:F

    iput v0, v1, Lr/d;->s:I

    iput v7, v1, Lr/d;->x:I

    if-ne v8, v2, :cond_48

    const/4 v8, 0x0

    :cond_48
    iput v8, v1, Lr/d;->y:I

    iput v9, v1, Lr/d;->z:F

    const/4 v2, 0x0

    cmpl-float v2, v9, v2

    if-lez v2, :cond_49

    cmpg-float v2, v9, v3

    if-gez v2, :cond_49

    if-nez v0, :cond_49

    iput v6, v1, Lr/d;->s:I

    :cond_49
    :goto_2a
    add-int/lit8 v15, v15, 0x1

    move/from16 v7, p1

    move/from16 v8, p2

    move v9, v6

    move/from16 v14, v17

    move-object/from16 v6, p0

    goto/16 :goto_13

    :cond_4a
    if-eqz v12, :cond_4b

    iget-object v0, v11, Lr/e;->r0:Le/c;

    invoke-virtual {v0, v11}, Le/c;->x(Lr/e;)V

    :cond_4b
    move-object/from16 v0, p0

    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-virtual {v0, v11, v1, v2, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->k(Lr/e;III)V

    invoke-virtual {v11}, Lr/d;->r()I

    move-result v1

    invoke-virtual {v11}, Lr/d;->l()I

    move-result v4

    iget-boolean v5, v11, Lr/e;->E0:Z

    iget-boolean v6, v11, Lr/e;->F0:Z

    iget-object v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Ls/n;

    iget v8, v7, Ls/n;->d:I

    iget v7, v7, Ls/n;->c:I

    add-int/2addr v1, v7

    add-int/2addr v4, v8

    const/4 v7, 0x0

    invoke-static {v1, v2, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-static {v4, v3, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    const v3, 0xffffff

    and-int/2addr v1, v3

    and-int/2addr v2, v3

    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/high16 v3, 0x1000000

    if-eqz v5, :cond_4c

    or-int/2addr v1, v3

    :cond_4c
    if-eqz v6, :cond_4d

    or-int/2addr v2, v3

    :cond_4d
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lr/d;

    move-result-object v0

    instance-of v1, p1, Lu/p;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    instance-of v0, v0, Lr/h;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lu/e;

    new-instance v1, Lr/h;

    invoke-direct {v1}, Lr/h;-><init>()V

    iput-object v1, v0, Lu/e;->p0:Lr/d;

    iput-boolean v2, v0, Lu/e;->d0:Z

    iget v0, v0, Lu/e;->V:I

    invoke-virtual {v1, v0}, Lr/h;->T(I)V

    :cond_0
    instance-of v0, p1, Lu/c;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lu/c;

    invoke-virtual {v0}, Lu/c;->i()V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lu/e;

    iput-boolean v2, v1, Lu/e;->e0:Z

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lr/d;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iget-object v1, v1, Lr/l;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lr/d;->D()V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    return-void
.end method

.method public final requestLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setConstraintSet(Lu/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lu/n;

    return-void
.end method

.method public setId(I)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    invoke-super {p0, p1}, Landroid/view/View;->setId(I)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v1, p1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOnConstraintsChanged(Lu/o;)V
    .locals 0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lu/g;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iput p1, v0, Lr/e;->D0:I

    const/16 p1, 0x200

    invoke-virtual {v0, p1}, Lr/e;->X(I)Z

    move-result p1

    sput-boolean p1, Lp/d;->p:Z

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
