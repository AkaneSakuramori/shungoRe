.class public Li0/y1;
.super Li0/w1;
.source "SourceFile"


# instance fields
.field public n:Lb0/c;

.field public o:Lb0/c;

.field public p:Lb0/c;


# direct methods
.method public constructor <init>(Li0/c2;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li0/w1;-><init>(Li0/c2;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Li0/y1;->n:Lb0/c;

    iput-object p1, p0, Li0/y1;->o:Lb0/c;

    iput-object p1, p0, Li0/y1;->p:Lb0/c;

    return-void
.end method


# virtual methods
.method public g()Lb0/c;
    .locals 1

    iget-object v0, p0, Li0/y1;->o:Lb0/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Li0/u1;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Landroidx/lifecycle/e0;->z(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lb0/c;->c(Landroid/graphics/Insets;)Lb0/c;

    move-result-object v0

    iput-object v0, p0, Li0/y1;->o:Lb0/c;

    :cond_0
    iget-object v0, p0, Li0/y1;->o:Lb0/c;

    return-object v0
.end method

.method public i()Lb0/c;
    .locals 1

    iget-object v0, p0, Li0/y1;->n:Lb0/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Li0/u1;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Landroidx/lifecycle/e0;->c(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lb0/c;->c(Landroid/graphics/Insets;)Lb0/c;

    move-result-object v0

    iput-object v0, p0, Li0/y1;->n:Lb0/c;

    :cond_0
    iget-object v0, p0, Li0/y1;->n:Lb0/c;

    return-object v0
.end method

.method public k()Lb0/c;
    .locals 1

    iget-object v0, p0, Li0/y1;->p:Lb0/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Li0/u1;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Landroidx/lifecycle/e0;->v(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lb0/c;->c(Landroid/graphics/Insets;)Lb0/c;

    move-result-object v0

    iput-object v0, p0, Li0/y1;->p:Lb0/c;

    :cond_0
    iget-object v0, p0, Li0/y1;->p:Lb0/c;

    return-object v0
.end method

.method public l(IIII)Li0/c2;
    .locals 1

    iget-object v0, p0, Li0/u1;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, Li0/x1;->d(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Li0/c2;->g(Landroid/view/View;Landroid/view/WindowInsets;)Li0/c2;

    move-result-object p1

    return-object p1
.end method

.method public q(Lb0/c;)V
    .locals 0

    return-void
.end method
