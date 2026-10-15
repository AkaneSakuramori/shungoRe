.class public final Li0/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Li0/o1;

.field public final synthetic b:Li0/c2;

.field public final synthetic c:Li0/c2;

.field public final synthetic d:I

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public constructor <init>(Li0/o1;Li0/c2;Li0/c2;ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/h1;->a:Li0/o1;

    iput-object p2, p0, Li0/h1;->b:Li0/c2;

    iput-object p3, p0, Li0/h1;->c:Li0/c2;

    iput p4, p0, Li0/h1;->d:I

    iput-object p5, p0, Li0/h1;->e:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 14

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    iget-object v0, p0, Li0/h1;->a:Li0/o1;

    iget-object v1, v0, Li0/o1;->a:Li0/n1;

    invoke-virtual {v1, p1}, Li0/n1;->d(F)V

    iget-object p1, v0, Li0/o1;->a:Li0/n1;

    invoke-virtual {p1}, Li0/n1;->b()F

    move-result p1

    sget-object v1, Li0/k1;->e:Landroid/view/animation/PathInterpolator;

    new-instance v1, Le/n0;

    iget-object v2, p0, Li0/h1;->b:Li0/c2;

    invoke-direct {v1, v2}, Le/n0;-><init>(Li0/c2;)V

    const/4 v3, 0x1

    :goto_0
    const/16 v4, 0x100

    if-gt v3, v4, :cond_1

    iget v4, p0, Li0/h1;->d:I

    and-int/2addr v4, v3

    if-nez v4, :cond_0

    iget-object v4, v2, Li0/c2;->a:Li0/a2;

    invoke-virtual {v4, v3}, Li0/a2;->f(I)Lb0/c;

    move-result-object v4

    iget-object v5, v1, Le/n0;->c:Ljava/lang/Object;

    check-cast v5, Li0/t1;

    invoke-virtual {v5, v3, v4}, Li0/t1;->c(ILb0/c;)V

    goto :goto_1

    :cond_0
    iget-object v4, v2, Li0/c2;->a:Li0/a2;

    invoke-virtual {v4, v3}, Li0/a2;->f(I)Lb0/c;

    move-result-object v4

    iget-object v5, p0, Li0/h1;->c:Li0/c2;

    iget-object v5, v5, Li0/c2;->a:Li0/a2;

    invoke-virtual {v5, v3}, Li0/a2;->f(I)Lb0/c;

    move-result-object v5

    iget v6, v4, Lb0/c;->a:I

    iget v7, v5, Lb0/c;->a:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v7, p1

    mul-float/2addr v6, v7

    float-to-double v8, v6

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    add-double/2addr v8, v10

    double-to-int v6, v8

    iget v8, v4, Lb0/c;->b:I

    iget v9, v5, Lb0/c;->b:I

    sub-int/2addr v8, v9

    int-to-float v8, v8

    mul-float/2addr v8, v7

    float-to-double v8, v8

    add-double/2addr v8, v10

    double-to-int v8, v8

    iget v9, v4, Lb0/c;->c:I

    iget v12, v5, Lb0/c;->c:I

    sub-int/2addr v9, v12

    int-to-float v9, v9

    mul-float/2addr v9, v7

    float-to-double v12, v9

    add-double/2addr v12, v10

    double-to-int v9, v12

    iget v12, v4, Lb0/c;->d:I

    iget v5, v5, Lb0/c;->d:I

    sub-int/2addr v12, v5

    int-to-float v5, v12

    mul-float/2addr v5, v7

    float-to-double v12, v5

    add-double/2addr v12, v10

    double-to-int v5, v12

    invoke-static {v4, v6, v8, v9, v5}, Li0/c2;->e(Lb0/c;IIII)Lb0/c;

    move-result-object v4

    iget-object v5, v1, Le/n0;->c:Ljava/lang/Object;

    check-cast v5, Li0/t1;

    invoke-virtual {v5, v3, v4}, Li0/t1;->c(ILb0/c;)V

    :goto_1
    shl-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Le/n0;->v()Li0/c2;

    move-result-object p1

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Li0/h1;->e:Landroid/view/View;

    invoke-static {v1, p1, v0}, Li0/k1;->g(Landroid/view/View;Li0/c2;Ljava/util/List;)V

    return-void
.end method
