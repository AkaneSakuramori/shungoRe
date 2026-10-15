.class public final Li/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj0/b0;


# instance fields
.field public b:I

.field public final c:Landroid/view/View;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Li/d0;->b:I

    iput-object p1, p0, Li/d0;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Li/d0;->c:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Li/t1;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz v1, :cond_1

    iget-object v2, p0, Li/d0;->d:Ljava/lang/Object;

    check-cast v2, Li/o3;

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {v1, v2, v0}, Li/x;->d(Landroid/graphics/drawable/Drawable;Li/o3;[I)V

    :cond_1
    return-void
.end method

.method public final b(Landroid/util/AttributeSet;I)V
    .locals 8

    iget-object v0, p0, Li/d0;->c:Landroid/view/View;

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Ld/a;->f:[I

    invoke-static {v2, p1, v3, p2}, Le/c;->u(Landroid/content/Context;Landroid/util/AttributeSet;[II)Le/c;

    move-result-object v7

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v4, v7, Le/c;->d:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Landroid/content/res/TypedArray;

    move-object v4, p1

    move v6, p2

    invoke-static/range {v1 .. v6}, Li0/v0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    :try_start_0
    move-object p1, v0

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/4 p2, -0x1

    if-nez p1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v7, v1, p2}, Le/c;->n(II)I

    move-result v1

    if-eq v1, p2, :cond_0

    move-object p1, v0

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v1}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Li/t1;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    const/4 p1, 0x2

    invoke-virtual {v7, p1}, Le/c;->r(I)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v7, p1}, Le/c;->c(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {v1, p1}, Lm0/f;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    :cond_2
    const/4 p1, 0x3

    invoke-virtual {v7, p1}, Le/c;->r(I)Z

    move-result v1

    if-eqz v1, :cond_3

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v7, p1, p2}, Le/c;->k(II)I

    move-result p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Li/t1;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {v0, p1}, Lm0/f;->d(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    invoke-virtual {v7}, Le/c;->v()V

    return-void

    :goto_1
    invoke-virtual {v7}, Le/c;->v()V

    throw p1
.end method

.method public final c(I)V
    .locals 2

    iget-object v0, p0, Li/d0;->c:Landroid/view/View;

    if-eqz p1, :cond_1

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Li/t1;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    check-cast v0, Landroid/widget/ImageView;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    invoke-virtual {p0}, Li/d0;->a()V

    return-void
.end method

.method public final d(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Li/d0;->d:Ljava/lang/Object;

    check-cast v0, Li/o3;

    if-nez v0, :cond_0

    new-instance v0, Li/o3;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li/o3;-><init>(I)V

    iput-object v0, p0, Li/d0;->d:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Li/d0;->d:Ljava/lang/Object;

    check-cast v0, Li/o3;

    iput-object p1, v0, Li/o3;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Li/o3;->b:Z

    invoke-virtual {p0}, Li/d0;->a()V

    return-void
.end method

.method public final e(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, Li/d0;->d:Ljava/lang/Object;

    check-cast v0, Li/o3;

    if-nez v0, :cond_0

    new-instance v0, Li/o3;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li/o3;-><init>(I)V

    iput-object v0, p0, Li/d0;->d:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Li/d0;->d:Ljava/lang/Object;

    check-cast v0, Li/o3;

    iput-object p1, v0, Li/o3;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Li/o3;->a:Z

    invoke-virtual {p0}, Li/d0;->a()V

    return-void
.end method

.method public final j(Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
