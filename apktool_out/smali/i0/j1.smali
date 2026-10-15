.class public final Li0/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final a:Lr1/e;

.field public b:Li0/c2;


# direct methods
.method public constructor <init>(Landroid/view/View;Lr1/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li0/j1;->a:Lr1/e;

    sget-object p2, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Li0/l0;->a(Landroid/view/View;)Li0/c2;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, Le/n0;

    invoke-direct {p2, p1}, Le/n0;-><init>(Li0/c2;)V

    invoke-virtual {p2}, Le/n0;->v()Li0/c2;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Li0/j1;->b:Li0/c2;

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static/range {p1 .. p2}, Li0/c2;->g(Landroid/view/View;Landroid/view/WindowInsets;)Li0/c2;

    move-result-object v1

    iput-object v1, v0, Li0/j1;->b:Li0/c2;

    invoke-static/range {p1 .. p2}, Li0/k1;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_0
    invoke-static/range {p1 .. p2}, Li0/c2;->g(Landroid/view/View;Landroid/view/WindowInsets;)Li0/c2;

    move-result-object v9

    iget-object v1, v0, Li0/j1;->b:Li0/c2;

    if-nez v1, :cond_1

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static/range {p1 .. p1}, Li0/l0;->a(Landroid/view/View;)Li0/c2;

    move-result-object v1

    iput-object v1, v0, Li0/j1;->b:Li0/c2;

    :cond_1
    iget-object v1, v0, Li0/j1;->b:Li0/c2;

    if-nez v1, :cond_2

    iput-object v9, v0, Li0/j1;->b:Li0/c2;

    invoke-static/range {p1 .. p2}, Li0/k1;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_2
    invoke-static/range {p1 .. p1}, Li0/k1;->j(Landroid/view/View;)Lr1/e;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, v1, Lr1/e;->a:Landroid/view/WindowInsets;

    invoke-static {v1, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static/range {p1 .. p2}, Li0/k1;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_3
    iget-object v1, v0, Li0/j1;->b:Li0/c2;

    const/4 v3, 0x1

    const/4 v5, 0x0

    :goto_0
    iget-object v4, v9, Li0/c2;->a:Li0/a2;

    const/16 v6, 0x100

    if-gt v3, v6, :cond_5

    invoke-virtual {v4, v3}, Li0/a2;->f(I)Lb0/c;

    move-result-object v4

    iget-object v6, v1, Li0/c2;->a:Li0/a2;

    invoke-virtual {v6, v3}, Li0/a2;->f(I)Lb0/c;

    move-result-object v6

    invoke-virtual {v4, v6}, Lb0/c;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    or-int/2addr v5, v3

    :cond_4
    shl-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    if-nez v5, :cond_6

    invoke-static/range {p1 .. p2}, Li0/k1;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_6
    iget-object v6, v0, Li0/j1;->b:Li0/c2;

    and-int/lit8 v1, v5, 0x8

    if-eqz v1, :cond_8

    const/16 v1, 0x8

    invoke-virtual {v4, v1}, Li0/a2;->f(I)Lb0/c;

    move-result-object v3

    iget v3, v3, Lb0/c;->d:I

    iget-object v11, v6, Li0/c2;->a:Li0/a2;

    invoke-virtual {v11, v1}, Li0/a2;->f(I)Lb0/c;

    move-result-object v1

    iget v1, v1, Lb0/c;->d:I

    if-le v3, v1, :cond_7

    sget-object v1, Li0/k1;->e:Landroid/view/animation/PathInterpolator;

    goto :goto_1

    :cond_7
    sget-object v1, Li0/k1;->f:Lt0/a;

    goto :goto_1

    :cond_8
    sget-object v1, Li0/k1;->g:Landroid/view/animation/DecelerateInterpolator;

    :goto_1
    new-instance v11, Li0/o1;

    const-wide/16 v12, 0xa0

    invoke-direct {v11, v5, v1, v12, v13}, Li0/o1;-><init>(ILandroid/view/animation/Interpolator;J)V

    iget-object v1, v11, Li0/o1;->a:Li0/n1;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Li0/n1;->d(F)V

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iget-object v3, v11, Li0/o1;->a:Li0/n1;

    invoke-virtual {v3}, Li0/n1;->a()J

    move-result-wide v12

    invoke-virtual {v1, v12, v13}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v12

    invoke-virtual {v4, v5}, Li0/a2;->f(I)Lb0/c;

    move-result-object v1

    iget-object v3, v6, Li0/c2;->a:Li0/a2;

    invoke-virtual {v3, v5}, Li0/a2;->f(I)Lb0/c;

    move-result-object v3

    iget v4, v1, Lb0/c;->a:I

    iget v13, v3, Lb0/c;->a:I

    invoke-static {v4, v13}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget v13, v1, Lb0/c;->b:I

    iget v14, v3, Lb0/c;->b:I

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v15

    iget v10, v1, Lb0/c;->c:I

    iget v2, v3, Lb0/c;->c:I

    invoke-static {v10, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    move-object/from16 v16, v12

    iget v12, v1, Lb0/c;->d:I

    move/from16 v17, v5

    iget v5, v3, Lb0/c;->d:I

    move-object/from16 v18, v6

    invoke-static {v12, v5}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-static {v4, v15, v0, v6}, Lb0/c;->b(IIII)Lb0/c;

    move-result-object v0

    iget v1, v1, Lb0/c;->a:I

    iget v3, v3, Lb0/c;->a:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v1, v3, v2, v4}, Lb0/c;->b(IIII)Lb0/c;

    move-result-object v1

    new-instance v10, Li/a0;

    const/4 v2, 0x6

    invoke-direct {v10, v0, v2, v1}, Li/a0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v7, v8, v0}, Li0/k1;->f(Landroid/view/View;Landroid/view/WindowInsets;Z)V

    new-instance v0, Li0/h1;

    move-object v1, v0

    move-object v2, v11

    move-object v3, v9

    move-object/from16 v4, v18

    move/from16 v5, v17

    move-object/from16 v6, p1

    invoke-direct/range {v1 .. v6}, Li0/h1;-><init>(Li0/o1;Li0/c2;Li0/c2;ILandroid/view/View;)V

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v0, Li0/b1;

    const/4 v3, 0x1

    move-object/from16 v2, p0

    invoke-direct {v0, v2, v11, v7, v3}, Li0/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v0, Li0/i1;

    invoke-direct {v0, v7, v11, v10, v1}, Li0/i1;-><init>(Landroid/view/View;Li0/o1;Li/a0;Landroid/animation/ValueAnimator;)V

    invoke-static {v7, v0}, Li0/v;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-object v9, v2, Li0/j1;->b:Li0/c2;

    invoke-static/range {p1 .. p2}, Li0/k1;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    return-object v0

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
