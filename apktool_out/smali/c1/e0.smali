.class public final Lc1/e0;
.super Lc1/r;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lc1/i;


# direct methods
.method public constructor <init>(Lc1/i;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc1/e0;->d:Lc1/i;

    iput-object p2, p0, Lc1/e0;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lc1/e0;->b:Landroid/view/View;

    iput-object p4, p0, Lc1/e0;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    new-instance v0, Le/n0;

    iget-object v1, p0, Lc1/e0;->a:Landroid/view/ViewGroup;

    invoke-direct {v0, v1}, Le/n0;-><init>(Landroid/view/ViewGroup;)V

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroupOverlay;

    iget-object v1, p0, Lc1/e0;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    return-void
.end method

.method public final d(Lc1/q;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lc1/e0;->c:Landroid/view/View;

    const v2, 0x7f080177

    invoke-virtual {v1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v0, Le/n0;

    iget-object v1, p0, Lc1/e0;->a:Landroid/view/ViewGroup;

    invoke-direct {v0, v1}, Le/n0;-><init>(Landroid/view/ViewGroup;)V

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroupOverlay;

    iget-object v1, p0, Lc1/e0;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Lc1/q;->v(Lc1/p;)V

    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, Lc1/e0;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Le/n0;

    iget-object v2, p0, Lc1/e0;->a:Landroid/view/ViewGroup;

    invoke-direct {v1, v2}, Le/n0;-><init>(Landroid/view/ViewGroup;)V

    iget-object v1, v1, Le/n0;->c:Ljava/lang/Object;

    check-cast v1, Landroid/view/ViewGroupOverlay;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lc1/e0;->d:Lc1/i;

    iget-object v1, v0, Lc1/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    invoke-virtual {v3}, Landroid/animation/Animator;->cancel()V

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lc1/q;->r:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    iget-object v0, v0, Lc1/q;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc1/p;

    invoke-interface {v3}, Lc1/p;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method
