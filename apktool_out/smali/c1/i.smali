.class public final Lc1/i;
.super Lc1/q;
.source "SourceFile"


# static fields
.field public static final z:[Ljava/lang/String;


# instance fields
.field public y:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "android:visibility:visibility"

    const-string v1, "android:visibility:parent"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc1/i;->z:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Lc1/q;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lc1/i;->y:I

    and-int/lit8 v0, p1, -0x4

    if-nez v0, :cond_0

    iput p1, p0, Lc1/i;->y:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only MODE_IN and MODE_OUT flags are allowed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static H(Lc1/x;)V
    .locals 3

    iget-object v0, p0, Lc1/x;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v1, p0, Lc1/x;->a:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "android:visibility:visibility"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lc1/x;->b:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v2, "android:visibility:parent"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const-string p0, "android:visibility:screenLocation"

    invoke-virtual {v1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static J(Lc1/x;Lc1/x;)Lc1/g0;
    .locals 8

    new-instance v0, Lc1/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lc1/g0;->a:Z

    iput-boolean v1, v0, Lc1/g0;->b:Z

    const/4 v2, 0x0

    const/4 v3, -0x1

    const-string v4, "android:visibility:parent"

    const-string v5, "android:visibility:visibility"

    if-eqz p0, :cond_0

    iget-object v6, p0, Lc1/x;->a:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iput v7, v0, Lc1/g0;->c:I

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    iput-object v6, v0, Lc1/g0;->e:Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    iput v3, v0, Lc1/g0;->c:I

    iput-object v2, v0, Lc1/g0;->e:Landroid/view/ViewGroup;

    :goto_0
    if-eqz p1, :cond_1

    iget-object v6, p1, Lc1/x;->a:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v0, Lc1/g0;->d:I

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, v0, Lc1/g0;->f:Landroid/view/ViewGroup;

    goto :goto_1

    :cond_1
    iput v3, v0, Lc1/g0;->d:I

    iput-object v2, v0, Lc1/g0;->f:Landroid/view/ViewGroup;

    :goto_1
    const/4 v2, 0x1

    if-eqz p0, :cond_6

    if-eqz p1, :cond_6

    iget p0, v0, Lc1/g0;->c:I

    iget p1, v0, Lc1/g0;->d:I

    if-ne p0, p1, :cond_2

    iget-object v3, v0, Lc1/g0;->e:Landroid/view/ViewGroup;

    iget-object v4, v0, Lc1/g0;->f:Landroid/view/ViewGroup;

    if-ne v3, v4, :cond_2

    goto :goto_2

    :cond_2
    if-eq p0, p1, :cond_4

    if-nez p0, :cond_3

    iput-boolean v1, v0, Lc1/g0;->b:Z

    iput-boolean v2, v0, Lc1/g0;->a:Z

    goto :goto_2

    :cond_3
    if-nez p1, :cond_8

    iput-boolean v2, v0, Lc1/g0;->b:Z

    iput-boolean v2, v0, Lc1/g0;->a:Z

    goto :goto_2

    :cond_4
    iget-object p0, v0, Lc1/g0;->f:Landroid/view/ViewGroup;

    if-nez p0, :cond_5

    iput-boolean v1, v0, Lc1/g0;->b:Z

    iput-boolean v2, v0, Lc1/g0;->a:Z

    goto :goto_2

    :cond_5
    iget-object p0, v0, Lc1/g0;->e:Landroid/view/ViewGroup;

    if-nez p0, :cond_8

    iput-boolean v2, v0, Lc1/g0;->b:Z

    iput-boolean v2, v0, Lc1/g0;->a:Z

    goto :goto_2

    :cond_6
    if-nez p0, :cond_7

    iget p0, v0, Lc1/g0;->d:I

    if-nez p0, :cond_7

    iput-boolean v2, v0, Lc1/g0;->b:Z

    iput-boolean v2, v0, Lc1/g0;->a:Z

    goto :goto_2

    :cond_7
    if-nez p1, :cond_8

    iget p0, v0, Lc1/g0;->c:I

    if-nez p0, :cond_8

    iput-boolean v1, v0, Lc1/g0;->b:Z

    iput-boolean v2, v0, Lc1/g0;->a:Z

    :cond_8
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final I(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;
    .locals 2

    cmpl-float v0, p2, p3

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lc1/y;->a:Lc1/c0;

    invoke-virtual {v0, p1, p2}, Lc1/z;->i(Landroid/view/View;F)V

    sget-object p2, Lc1/y;->b:Lc1/c;

    const/4 v0, 0x1

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p3, v0, v1

    invoke-static {p1, p2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    new-instance p3, Ly0/n;

    invoke-direct {p3, p1}, Ly0/n;-><init>(Landroid/view/View;)V

    invoke-virtual {p2, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance p3, Lc1/h;

    invoke-direct {p3, p0, v1, p1}, Lc1/h;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0, p3}, Lc1/q;->a(Lc1/p;)V

    return-object p2
.end method

.method public final d(Lc1/x;)V
    .locals 0

    invoke-static {p1}, Lc1/i;->H(Lc1/x;)V

    return-void
.end method

.method public final g(Lc1/x;)V
    .locals 2

    invoke-static {p1}, Lc1/i;->H(Lc1/x;)V

    iget-object v0, p1, Lc1/x;->a:Ljava/util/HashMap;

    sget-object v1, Lc1/y;->a:Lc1/c0;

    iget-object p1, p1, Lc1/x;->b:Landroid/view/View;

    invoke-virtual {v1, p1}, Lc1/z;->h(Landroid/view/View;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-string v1, "android:fade:transitionAlpha"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final k(Landroid/view/ViewGroup;Lc1/x;Lc1/x;)Landroid/animation/Animator;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-static/range {p2 .. p3}, Lc1/i;->J(Lc1/x;Lc1/x;)Lc1/g0;

    move-result-object v4

    iget-boolean v5, v4, Lc1/g0;->a:Z

    if-eqz v5, :cond_7

    iget-object v5, v4, Lc1/g0;->e:Landroid/view/ViewGroup;

    if-nez v5, :cond_0

    iget-object v5, v4, Lc1/g0;->f:Landroid/view/ViewGroup;

    if-eqz v5, :cond_7

    :cond_0
    iget-boolean v5, v4, Lc1/g0;->b:Z

    const-string v7, "android:fade:transitionAlpha"

    const/4 v8, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v5, :cond_6

    iget v1, v0, Lc1/i;->y:I

    and-int/2addr v1, v11

    if-ne v1, v11, :cond_2

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v3, Lc1/x;->b:Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v0, v3, v10}, Lc1/q;->n(Landroid/view/View;Z)Lc1/x;

    move-result-object v4

    invoke-virtual {v0, v3, v10}, Lc1/q;->q(Landroid/view/View;Z)Lc1/x;

    move-result-object v3

    invoke-static {v4, v3}, Lc1/i;->J(Lc1/x;Lc1/x;)Lc1/g0;

    move-result-object v3

    iget-boolean v3, v3, Lc1/g0;->a:Z

    if-eqz v3, :cond_3

    :cond_2
    :goto_0
    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    if-eqz v2, :cond_4

    iget-object v2, v2, Lc1/x;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    goto :goto_1

    :cond_4
    move v2, v8

    :goto_1
    cmpl-float v3, v2, v9

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    move v8, v2

    :goto_2
    invoke-virtual {v0, v1, v8, v9}, Lc1/i;->I(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v6

    :goto_3
    move-object v4, v0

    goto/16 :goto_16

    :cond_6
    iget v4, v4, Lc1/g0;->d:I

    iget v5, v0, Lc1/i;->y:I

    const/4 v12, 0x2

    and-int/2addr v5, v12

    if-eq v5, v12, :cond_8

    :cond_7
    :goto_4
    move-object v4, v0

    goto/16 :goto_15

    :cond_8
    if-nez v2, :cond_9

    goto :goto_4

    :cond_9
    if-eqz v3, :cond_a

    iget-object v3, v3, Lc1/x;->b:Landroid/view/View;

    goto :goto_5

    :cond_a
    const/4 v3, 0x0

    :goto_5
    iget-object v5, v2, Lc1/x;->b:Landroid/view/View;

    const v13, 0x7f080177

    invoke-virtual {v5, v13}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    if-eqz v14, :cond_b

    move-object v0, v2

    move/from16 v19, v4

    move-object/from16 v18, v7

    move v2, v9

    move v10, v11

    const/4 v6, 0x0

    goto/16 :goto_10

    :cond_b
    if-eqz v3, :cond_f

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v14

    if-nez v14, :cond_c

    goto :goto_8

    :cond_c
    const/4 v14, 0x4

    if-ne v4, v14, :cond_d

    goto :goto_6

    :cond_d
    if-ne v5, v3, :cond_e

    :goto_6
    move-object v14, v3

    move v15, v10

    const/4 v3, 0x0

    goto :goto_9

    :cond_e
    move v15, v11

    const/4 v3, 0x0

    :goto_7
    const/4 v14, 0x0

    goto :goto_9

    :cond_f
    :goto_8
    if-eqz v3, :cond_e

    move v15, v10

    goto :goto_7

    :goto_9
    if-eqz v15, :cond_19

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v15

    if-nez v15, :cond_10

    move-object v0, v2

    move/from16 v19, v4

    move-object/from16 v18, v7

    move v2, v9

    move-object v6, v14

    move-object v14, v5

    goto/16 :goto_10

    :cond_10
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v15

    instance-of v15, v15, Landroid/view/View;

    if-eqz v15, :cond_19

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v15

    check-cast v15, Landroid/view/View;

    invoke-virtual {v0, v15, v11}, Lc1/q;->q(Landroid/view/View;Z)Lc1/x;

    move-result-object v6

    invoke-virtual {v0, v15, v11}, Lc1/q;->n(Landroid/view/View;Z)Lc1/x;

    move-result-object v13

    invoke-static {v6, v13}, Lc1/i;->J(Lc1/x;Lc1/x;)Lc1/g0;

    move-result-object v6

    iget-boolean v6, v6, Lc1/g0;->a:Z

    if-nez v6, :cond_18

    sget-boolean v3, Lc1/w;->a:Z

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v15}, Landroid/view/View;->getScrollX()I

    move-result v6

    neg-int v6, v6

    int-to-float v6, v6

    invoke-virtual {v15}, Landroid/view/View;->getScrollY()I

    move-result v13

    neg-int v13, v13

    int-to-float v13, v13

    invoke-virtual {v3, v6, v13}, Landroid/graphics/Matrix;->setTranslate(FF)V

    sget-object v6, Lc1/y;->a:Lc1/c0;

    invoke-virtual {v6, v5, v3}, Lc1/a0;->j(Landroid/view/View;Landroid/graphics/Matrix;)V

    invoke-virtual {v6, v1, v3}, Lc1/a0;->k(Landroid/view/View;Landroid/graphics/Matrix;)V

    new-instance v6, Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v15

    int-to-float v15, v15

    invoke-direct {v6, v8, v8, v13, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v3, v6}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v13, v6, Landroid/graphics/RectF;->left:F

    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    move-result v13

    iget v15, v6, Landroid/graphics/RectF;->top:F

    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    move-result v15

    iget v8, v6, Landroid/graphics/RectF;->right:F

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    iget v12, v6, Landroid/graphics/RectF;->bottom:F

    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    move-result v12

    new-instance v10, Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v10, v9}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v9, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v10, v9}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    sget-boolean v9, Lc1/w;->a:Z

    if-eqz v9, :cond_11

    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v9

    xor-int/2addr v9, v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v16

    goto :goto_a

    :cond_11
    const/4 v9, 0x0

    const/16 v16, 0x0

    :goto_a
    sget-boolean v17, Lc1/w;->b:Z

    if-eqz v17, :cond_13

    if-eqz v9, :cond_13

    if-nez v16, :cond_12

    move/from16 v19, v4

    move-object/from16 v18, v7

    move-object/from16 v16, v14

    const/4 v0, 0x0

    goto/16 :goto_d

    :cond_12
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v16

    move-object/from16 v11, v16

    check-cast v11, Landroid/view/ViewGroup;

    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v16

    move-object/from16 v18, v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v11

    invoke-virtual {v11, v5}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    move-object/from16 v11, v18

    move/from16 v21, v16

    move-object/from16 v16, v14

    move/from16 v14, v21

    goto :goto_b

    :cond_13
    move-object/from16 v16, v14

    const/4 v11, 0x0

    const/4 v14, 0x0

    :goto_b
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v18

    move/from16 v19, v4

    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->round(F)I

    move-result v0

    if-lez v4, :cond_15

    if-lez v0, :cond_15

    move-object/from16 v18, v7

    mul-int v7, v4, v0

    int-to-float v7, v7

    const/high16 v20, 0x49800000    # 1048576.0f

    div-float v7, v20, v7

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v7}, Ljava/lang/Math;->min(FF)F

    move-result v7

    int-to-float v4, v4

    mul-float/2addr v4, v7

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    int-to-float v0, v0

    mul-float/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v2, v6, Landroid/graphics/RectF;->left:F

    neg-float v2, v2

    iget v6, v6, Landroid/graphics/RectF;->top:F

    neg-float v6, v6

    invoke-virtual {v3, v2, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {v3, v7, v7}, Landroid/graphics/Matrix;->postScale(FF)Z

    sget-boolean v2, Lc1/w;->c:Z

    if-eqz v2, :cond_14

    new-instance v2, Landroid/graphics/Picture;

    invoke-direct {v2}, Landroid/graphics/Picture;-><init>()V

    invoke-virtual {v2, v4, v0}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {v2}, Landroid/graphics/Picture;->endRecording()V

    invoke-static {v2}, Landroidx/emoji2/text/b;->e(Landroid/graphics/Picture;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_c

    :cond_14
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    invoke-virtual {v5, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    goto :goto_c

    :cond_15
    move-object/from16 v18, v7

    const/4 v0, 0x0

    :goto_c
    if-eqz v17, :cond_16

    if-eqz v9, :cond_16

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    invoke-virtual {v11, v5, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_16
    :goto_d
    if-eqz v0, :cond_17

    invoke-virtual {v10, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_17
    sub-int v0, v8, v13

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    sub-int v3, v12, v15

    invoke-static {v3, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v10, v0, v2}, Landroid/view/View;->measure(II)V

    invoke-virtual {v10, v13, v15, v8, v12}, Landroid/view/View;->layout(IIII)V

    move-object/from16 v0, p2

    move-object v14, v10

    :goto_e
    move-object/from16 v6, v16

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    goto :goto_10

    :cond_18
    move/from16 v19, v4

    move-object/from16 v18, v7

    move-object/from16 v16, v14

    invoke-virtual {v15}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {v15}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_1a

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    goto :goto_f

    :cond_19
    move/from16 v19, v4

    move-object/from16 v18, v7

    move-object/from16 v16, v14

    :cond_1a
    :goto_f
    move-object/from16 v0, p2

    move-object v14, v3

    goto :goto_e

    :goto_10
    iget-object v0, v0, Lc1/x;->a:Ljava/util/HashMap;

    if-eqz v14, :cond_1e

    if-nez v10, :cond_1b

    const-string v3, "android:visibility:screenLocation"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    const/4 v4, 0x0

    aget v6, v3, v4

    const/4 v7, 0x1

    aget v3, v3, v7

    const/4 v8, 0x2

    new-array v8, v8, [I

    invoke-virtual {v1, v8}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v4, v8, v4

    sub-int/2addr v6, v4

    invoke-virtual {v14}, Landroid/view/View;->getLeft()I

    move-result v4

    sub-int/2addr v6, v4

    invoke-virtual {v14, v6}, Landroid/view/View;->offsetLeftAndRight(I)V

    aget v4, v8, v7

    sub-int/2addr v3, v4

    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v14, v3}, Landroid/view/View;->offsetTopAndBottom(I)V

    new-instance v3, Le/n0;

    invoke-direct {v3, v1}, Le/n0;-><init>(Landroid/view/ViewGroup;)V

    iget-object v3, v3, Le/n0;->c:Ljava/lang/Object;

    check-cast v3, Landroid/view/ViewGroupOverlay;

    invoke-virtual {v3, v14}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    :cond_1b
    sget-object v3, Lc1/y;->a:Lc1/c0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v3, v18

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v9

    const/4 v0, 0x0

    move-object/from16 v4, p0

    goto :goto_11

    :cond_1c
    const/4 v0, 0x0

    move-object/from16 v4, p0

    move v9, v2

    :goto_11
    invoke-virtual {v4, v14, v9, v0}, Lc1/i;->I(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v6

    if-nez v10, :cond_22

    if-nez v6, :cond_1d

    new-instance v0, Le/n0;

    invoke-direct {v0, v1}, Le/n0;-><init>(Landroid/view/ViewGroup;)V

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroupOverlay;

    invoke-virtual {v0, v14}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    goto :goto_16

    :cond_1d
    const v0, 0x7f080177

    invoke-virtual {v5, v0, v14}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v0, Lc1/e0;

    invoke-direct {v0, v4, v1, v14, v5}, Lc1/e0;-><init>(Lc1/i;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v4, v0}, Lc1/q;->a(Lc1/p;)V

    goto :goto_16

    :cond_1e
    move-object/from16 v4, p0

    move-object/from16 v3, v18

    if-eqz v6, :cond_21

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v1

    sget-object v5, Lc1/y;->a:Lc1/c0;

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Lc1/c0;->g(Landroid/view/View;I)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v9

    :goto_12
    const/4 v0, 0x0

    goto :goto_13

    :cond_1f
    move v9, v2

    goto :goto_12

    :goto_13
    invoke-virtual {v4, v6, v9, v0}, Lc1/i;->I(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v0

    if-eqz v0, :cond_20

    new-instance v1, Lc1/f0;

    move/from16 v2, v19

    invoke-direct {v1, v6, v2}, Lc1/f0;-><init>(Landroid/view/View;I)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    invoke-virtual {v4, v1}, Lc1/q;->a(Lc1/p;)V

    goto :goto_14

    :cond_20
    invoke-virtual {v5, v6, v1}, Lc1/c0;->g(Landroid/view/View;I)V

    :goto_14
    move-object v6, v0

    goto :goto_16

    :cond_21
    :goto_15
    const/4 v6, 0x0

    :cond_22
    :goto_16
    return-object v6
.end method

.method public final bridge synthetic p()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc1/i;->z:[Ljava/lang/String;

    return-object v0
.end method

.method public final r(Lc1/x;Lc1/x;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    iget-object v1, p2, Lc1/x;->a:Ljava/util/HashMap;

    const-string v2, "android:visibility:visibility"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, p1, Lc1/x;->a:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Lc1/i;->J(Lc1/x;Lc1/x;)Lc1/g0;

    move-result-object p1

    iget-boolean p2, p1, Lc1/g0;->a:Z

    if-eqz p2, :cond_3

    iget p2, p1, Lc1/g0;->c:I

    if-eqz p2, :cond_2

    iget p1, p1, Lc1/g0;->d:I

    if-nez p1, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    :goto_0
    return v0
.end method
